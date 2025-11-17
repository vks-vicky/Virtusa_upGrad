package com.java.employ.dao;

import com.java.employ.model.Employ;

import java.util.List;

public interface EmployDao {
    List<Employ> showEmployDao();
    String addEmployDao(Employ employ);
    String removeEmployDao(int employ_id);
    Employ searchEmployDao(int employ_id);
    String  updateEmployDao(Employ employUpdate);
}
