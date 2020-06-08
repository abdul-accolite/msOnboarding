package com.accoflow.test.controller;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.accoflow.controller.LoginController;

import com.accoflow.models.EmployeeCheck;
import com.accoflow.models.appUser;
import com.accoflow.services.EmployeeService;

public class LoginControllerTest {


	@InjectMocks
	LoginController empService;
	@Mock
	EmployeeService empDao;
	
	
	 
	@Before
	public void beforeEmployeeService() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void addEmployee() {
		
		EmployeeCheck emp = new EmployeeCheck();
		emp.setEmpid(5);
		emp.setIsnewEmployee(false);
		emp.setName("blah");
		emp.getEmpid();
		emp.getName();
		emp.isIsnewEmployee();
		
		
		appUser em = new appUser();
		em.setDesignation("blah");
		em.setEmail("blah");
		em.setFullName("blah");
		em.setIdToken("blah");
		em.setPermissions("blah");
		em.setProfilepic("blah");
		em.setUserId(1);
		em.getDesignation();
		em.getEmail();
		em.getFullName();
		em.getIdToken();
		em.getPermissions();
		em.getProfilepic();
		
		em.getUserId();
		
		when(empDao.addEmployee(em)).thenReturn(emp);
		
		Assert.assertEquals(empService.addEmployee(em), emp);
		
	}
}
