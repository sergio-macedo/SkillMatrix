package com.softwareone.employee.repo;

import com.softwareone.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long > {
//    Optional<Employee> findEmployeeById(Long id);

}
