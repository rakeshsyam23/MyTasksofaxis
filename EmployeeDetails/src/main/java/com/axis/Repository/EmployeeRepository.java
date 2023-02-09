package com.axis.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
