package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Employee;
public interface EmpService {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee();
    void deleteAllData();
}

