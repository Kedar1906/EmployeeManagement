package com.ems.service;

import com.ems.model.Employee;
import com.ems.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo){
            this.repo =repo;
    }

    public List<Employee> getAllEmployee(){
        return repo.findAll();
    }

    public Employee insertEmployee(Employee employee){
        return repo.save(employee);
    }
}
