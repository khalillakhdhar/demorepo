package com.repo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repo.entities.Employee;

import jakarta.validation.Valid;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService; 
	@GetMapping
	public List<Employee> getEmployees()
	{
		return employeeService.getAllEmployee();
	}
@PostMapping
public Employee CreateOne(@RequestBody @Valid Employee employee)
{
return employeeService.createOneEmployee(employee);	

}
@GetMapping("/{id}")
public Employee getOneEmployee(@PathVariable long id)
{
return employeeService.findUserById(id);	
}
@DeleteMapping("/{id}")
public void deleteOne(@PathVariable long id)
{
employeeService.deleteEmployee(id);	
}
@PostMapping("/auth")
public Employee auth(@RequestBody  Employee employee)
{
return employeeService.AuthEmployee(employee.getEmail(), employee.getPassword());	
}
}
