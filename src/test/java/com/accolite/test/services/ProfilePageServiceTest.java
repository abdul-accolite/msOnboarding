package com.accolite.test.services;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.accoflow.dao.ProfilePageDAO;
import com.accoflow.models.EmployeeActivity;
import com.accoflow.models.logsTable;
import com.accoflow.services.ProfilePageService;

public class ProfilePageServiceTest {

	@InjectMocks
	ProfilePageService ansController;
	@Mock
	ProfilePageDAO ansService;
	
	
	 
	@Before
	public void beforeEmployeeService() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void getEmployeeDetails()
	{
		
		EmployeeActivity em = new EmployeeActivity();
		List<logsTable> l = new ArrayList<logsTable>();
		
		
		
		int val =5;
		when(ansService.getEmployeeDetails(val)).thenReturn(em);
		
		Assert.assertEquals(ansController.getEmployeeDetails(val), em);
	}
}
