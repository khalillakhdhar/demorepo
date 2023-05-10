package com.repo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repo.entities.Employee;
import com.repo.repositories.EmployeeRepository;

@Service // rendre la classe injectable

public class EmployeeService implements EmployeeInterface {
// appel de la repository
	@Autowired
	EmployeeRepository employeeRepository; // appel de la repo de user avec un couplage lache entre deux injectable 
	
	public List<Employee> getAllEmployee()
	{
		return employeeRepository.findAll();
	}
	
	public Employee createOneEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	public Employee findUserById(long id)
	{
		return employeeRepository.findById(id).get();
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}
	
	//
}
