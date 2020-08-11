package com.bartek.spring_thymeleaf_crud_mysql1.service;

import com.bartek.spring_thymeleaf_crud_mysql1.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {


    List<Employee> getAllEmployees();

    Optional<Employee> findEmployeeById(long id);

    void addEmployee(Employee employee);


}
