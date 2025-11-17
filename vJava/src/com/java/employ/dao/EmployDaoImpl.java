package com.java.employ.dao;

import com.java.employ.model.Employ;

import java.util.ArrayList;
import java.util.List;

public class EmployDaoImpl implements EmployDao {

    static List<Employ> employList;

    static {
        employList = new ArrayList<>();
    }

    @Override
    public List<Employ> showEmployDao(){
        return employList;
    }

    @Override
    public String addEmployDao(Employ employ){
        employList.add(employ);
        return "Employ "+ employ.getEmploy_id() +" added successfully";
    }

    @Override
    public String removeEmployDao(int employ_id){
        Employ employFound = searchEmployDao(employ_id);
        if(employFound != null){
            employList.remove(employFound);
            return "Employ removed successfully.";
        }
        return "Employ Record Not Found.";
    }

    @Override
    public Employ searchEmployDao(int employ_id){
        Employ employFound = employList.stream().filter(employ -> employ.getEmploy_id() == employ_id).findFirst().orElse(null);

        // Without Lambda expressions
//        Employ employFound  = new Employ();
//        for(Employ employ:employList){
//            if(employ.getEmploy_id() == employ_id){
//                employFound = employ;
//                break;
//            }
//        }

        return employFound;
    }

    @Override
    public String updateEmployDao(Employ employUpdate){
        Employ employFound = searchEmployDao(employUpdate.getEmploy_id());
        if(employFound != null){
            employFound.setName(employUpdate.getName());
            employFound.setGender(employUpdate.getGender());
            employFound.setDept(employUpdate.getDept());
            employFound.setDesig(employUpdate.getDesig());
            employFound.setBasic(employUpdate.getBasic());
            return "Employ Record Updated successfully.";
        }
        return "Employ Record Not Found.";
    }

}
