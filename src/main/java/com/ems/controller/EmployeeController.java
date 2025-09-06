package com.ems.controller;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    private List<Employee> getAllemployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping
    private Employee create(@RequestBody Employee employee){
        return employeeService.insertEmployee(employee);
    }


}

