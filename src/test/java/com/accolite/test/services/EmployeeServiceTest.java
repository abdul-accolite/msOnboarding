package com.accolite.test.services;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.accoflow.dao.EmployeeDAO;
import com.accoflow.models.EmployeeCheck;
import com.accoflow.models.appUser;
import com.accoflow.services.EmployeeService;

public class EmployeeServiceTest {

	@InjectMocks
	EmployeeService empService;
	@Mock
	EmployeeDAO empDao;
	
	
	 
	@Before
	public void beforeEmployeeService() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void addEmployee() {
		
		EmployeeCheck emp = new EmployeeCheck();
		
		
		
		appUser em = new appUser();
		
		
		when(empDao.addEmployee(em)).thenReturn(emp);
		
		Assert.assertEquals(empService.addEmployee(em), emp);
		
	}
}
