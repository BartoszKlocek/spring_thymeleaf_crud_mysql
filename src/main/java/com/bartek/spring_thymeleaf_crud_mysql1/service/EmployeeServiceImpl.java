package com.bartek.spring_thymeleaf_crud_mysql1.service;

import com.bartek.spring_thymeleaf_crud_mysql1.model.Employee;
import com.bartek.spring_thymeleaf_crud_mysql1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

}
