package com.DailyCodeBuffer.Code_demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.DailyCodeBuffer.Code_demo.entity.Department;
import com.DailyCodeBuffer.Code_demo.entity.Department.DepartmentBuilder;
import com.DailyCodeBuffer.Code_demo.repository.DepartmentRepository;

@SpringBootTest
class DepartmentServiceTest {
	
	@Autowired
	private DepartmentService departmentService;
	
	@MockBean
	private DepartmentRepository departmnetRepository;

	@BeforeEach
	void setUp() {
		Department department=Department.builder().departmentName("IT")
				.departmentAddress("Ahmedabad")
				.departmentCode("IT-06")
				.departmentId(1L)
				.build();
		
		Mockito.when(departmnetRepository.findByDepartmentNameIgnoreCase("IT")).thenReturn(department);
	}
	
	@Test
	public void whenValidDepartmentName_thenDepartmentShouldFound() {
		String departmentName="IT";
		Department found = 
				departmentService.fetchDepartmentByName(departmentName);
		
		assertEquals(departmentName,found.getDepartmentName());
	}

}
