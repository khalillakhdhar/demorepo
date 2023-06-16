package com.repo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	Validation validation;
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
	
}
