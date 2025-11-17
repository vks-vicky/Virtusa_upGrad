package com.java.employ.bal;

import com.java.employ.dao.EmployDao;
import com.java.employ.dao.EmployDaoImpl;
import com.java.employ.exception.EmployException;
import com.java.employ.model.Employ;

import java.util.List;

public class EmployBal {

    static StringBuilder sb;
    static EmployDao employDao;

    static {
        sb = new StringBuilder();
        employDao = new EmployDaoImpl();
    }

    public List<Employ> showEmployBal(){
        return employDao.showEmployDao();
    }

    public String addEmployBal(Employ employ) throws EmployException {
        if(validateEmploy(employ)==true){
            return employDao.addEmployDao(employ);
        }
        throw new EmployException(sb.toString());
    }

    public boolean validateEmploy(Employ employ) {
        boolean isValid = true;
        if(employ.getEmploy_id() <=0){
            isValid = false;
            sb.append("Employ ID is Invalid. It cannot be Negative or Zero...\n");
        }
        if(employ.getName().length()<5){
            isValid = false;
            sb.append("Employ Name is shorter than 5 characters...\n");
        }
        if(employ.getDept().length()<3){
            isValid = false;
            sb.append("Employ Dept is shorter than 3 characters...\n");
        }
        if(employ.getBasic() < 20000 ||  employ.getBasic() > 90000){
            isValid = false;
            sb.append("Basic must be between 20k and 90k...\n");
        }

        return isValid;
    }

}
