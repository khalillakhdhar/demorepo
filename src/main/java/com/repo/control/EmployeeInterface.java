package com.repo.control;

import java.util.List;

import com.repo.entities.Employee;

public interface EmployeeInterface {
	public List<Employee> getAllEmployee();
	public Employee createOneEmployee(Employee employee);
	public Employee findUserById(long id);
	public void deleteEmployee(long id);
	
}
