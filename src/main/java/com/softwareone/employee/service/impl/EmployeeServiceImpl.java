package com.softwareone.employee.service.impl;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.softwareone.employee.controller.EmployeeController;
import com.softwareone.employee.model.Employee;
import com.softwareone.employee.model.Language;
import com.softwareone.employee.model.Skills;
import com.softwareone.employee.repo.EmployeeRepo;
import com.softwareone.employee.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import tech.getarrays.employeemanager.exception.UserNotFoundException;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.*;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo employeeRepo;

    // private final EmployeeRepo employeeRepo;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        // employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

   public Employee findEmployeeById(Long id) {
       return employeeRepo.findById(id).get();
       //.orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
   }

    public void deleteEmployeeById(Long id){
        employeeRepo.deleteById(id);
    }

}
