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

import com.accoflow.dao.OnboardingDAO;
import com.accoflow.models.onboardee;
import com.accoflow.services.OnboardingService;

public class OnboardingServiceTest {
	@InjectMocks
	OnboardingService ansController;
	@Mock
	OnboardingDAO ansService;
	
	
	 
	@Before
	public void beforeEmployeeService() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void addOnboardee()
	{
		
		onboardee bo = new onboardee();
		
int val=5;
		
		when(ansService.addOnboardee(bo)).thenReturn(val);
		
		Assert.assertEquals(ansController.addOnboardee(bo), val);
	}
	
	@Test
	public void updateOnboardee()
	{
		
		onboardee bo = new onboardee();
		
		
		
int val=5;
		
		when(ansService.updateOnboardee(bo)).thenReturn(val);
		
		Assert.assertEquals(ansController.updateOnboardee(bo), val);
	}
	
	@Test
	public void deleteOnboardee()
	{
		
		onboardee bo = new onboardee();
		
		
		
int val=5;
		
		when(ansService.deleteOnboardee(bo)).thenReturn(val);
		
		Assert.assertEquals(ansController.deleteOnboardee(bo), val);
	}
	@Test
	public void getAllOnboards()
	{
		
		onboardee bo = new onboardee();
		List<onboardee> list = new ArrayList<onboardee>();
		list.add(bo);
		
		
		boolean b = true;
int val=5;
		
		when(ansService.getAllOnboards(b)).thenReturn(list);
		
		Assert.assertEquals(ansController.getAllOnboards(b), list);
	}
}
