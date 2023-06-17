package com.repo.control;

import java.util.List;

import com.repo.entities.Employee;

public interface EmployeeInterface {
	public List<Employee> getAllEmployee();
	public Employee createOneEmployee(Employee employee);
	public Employee findUserById(long id);
	public Employee AuthEmployee(String email,String password);
	public void deleteEmployee(long id);
	
}
