package com.accoflow.test.controller;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.accoflow.controller.ProfilePageController;
import com.accoflow.models.EmployeeActivity;
import com.accoflow.models.logsTable;
import com.accoflow.services.ProfilePageService;

public class ProfilePageControllerTest {

	@InjectMocks
	ProfilePageController ansController;
	@Mock
	ProfilePageService ansService;
	
	
	 
	@Before
	public void beforeEmployeeService() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void getEmployeeDetails()
	{
		
		EmployeeActivity em = new EmployeeActivity();
		List<logsTable> l = new ArrayList<logsTable>();
		
		em.setDesignation("blah");
		em.setEmail("blah");
		em.setName("blah");
		em.setPermissions("blah");
		em.setProfilepic("blah");
		em.setRecentLogs(l);
		em.getDesignation();
		em.getEmail();
		em.getName();
		em.getPermissions();
		em.getProfilepic();
		em.getRecentLogs();
		
		int val =5;
		when(ansService.getEmployeeDetails(val)).thenReturn(em);
		
		Assert.assertEquals(ansController.getEmployeeDetails(val), em);
	}
}
