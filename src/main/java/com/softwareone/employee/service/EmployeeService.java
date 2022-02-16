package com.softwareone.employee.service;

import com.softwareone.employee.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EmployeeService {
    List<Employee> findAllEmployees();
    Employee updateEmployee(Employee employee);
    void deleteEmployeeById(Long id);
    Employee addEmployee(Employee employee);
    Employee findEmployeeById(Long id);
}
