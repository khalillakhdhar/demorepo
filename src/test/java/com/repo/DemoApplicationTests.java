package com.repo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	CasTest cas;
@BeforeEach
void init()
{
	cas=new CasTest();
	
}
	
	@Test
	void contextLoads() {
	}
	@Test
	void testPaire()
	{
		assertTrue(cas.testPaire(7));
	}

}
