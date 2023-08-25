package com.training.api;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.training.api.controller.EmployeeController;

@SpringBootTest
class ApiApplicationTests {
	
	@Autowired
	private EmployeeController eC;
	
	@Test
	void contextLoads() {
		
		assertThat(eC).isNotNull(); // verifie que le controller a bien ete cree
	}

}
