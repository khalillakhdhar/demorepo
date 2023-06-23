package com.repo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.repo.repositories.EmployeeRepository;

@SpringBootTest
class DemoApplicationTests {
	Validation validation;
	@Mock 
	EmployeeRepository empRepo;
	@BeforeEach
	void init()
	{
		validation=new Validation();
	}

	@Test
	void validateChaine()
	{
		assertTrue(validation.verifEmpty(" "));
	}
	@Test
	void validatePass()
	{
		assertTrue(validation.validatePass("AZERTYuser"));
	}
	
	@Test
	void validateRepo()
	{
		assertTrue(empRepo.findByEmailAndPassword("khalil@test.com","user").getEmail().length()>0);
	}

}
