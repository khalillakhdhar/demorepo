package com.repo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repo.entities.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
Employee findByEmailAndPassword(String email,String password);	
}
