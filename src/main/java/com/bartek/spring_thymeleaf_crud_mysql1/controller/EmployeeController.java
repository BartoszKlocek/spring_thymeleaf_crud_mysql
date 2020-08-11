package com.bartek.spring_thymeleaf_crud_mysql1.controller;

import com.bartek.spring_thymeleaf_crud_mysql1.model.Employee;
import com.bartek.spring_thymeleaf_crud_mysql1.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeServiceImpl employeeService;

    @Autowired
    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        model.addAttribute("newEmployee", new Employee());
        return "employees";
    }

    @PostMapping("/add-employee")
    public String addEmployee(@ModelAttribute Employee employee){
        employeeService.addEmployee(employee);
        return "redirect:/employees";
    }
}
