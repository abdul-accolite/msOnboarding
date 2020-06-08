package com.accolite.test.services;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.accoflow.dao.AnalyticsDAO;
import com.accoflow.models.DeveloperType;
import com.accoflow.models.Location;
import com.accoflow.models.Skills;
import com.accoflow.models.msManagerPie;
import com.accoflow.services.AnalyticsService;

public class AnalyticsServiceTest {

	@InjectMocks
	AnalyticsService ansController;
	@Mock
	AnalyticsDAO ansService;
	@Before
	public void beforeEmployeeService() {
		MockitoAnnotations.initMocks(this);
    }
		
	@Test
	public void getLocationPie()
	{
		
		Location em = new Location();
		
		
		when(ansService.getLocationPie()).thenReturn(em);
		
		Assert.assertEquals(ansController.getLocationPie(), em);
	}
	@Test
	public void getSkillsBar()
	{
		Skills em = new Skills();
		
		
		
		when(ansService.getSkillsBar()).thenReturn(em);
		
		Assert.assertEquals(ansController.getSkillsBar(), em);
	}
	@Test
	public void getSkillsPie()
	{
		DeveloperType em = new DeveloperType();
		
		
		when(ansService.getSkillsPie()).thenReturn(em);
		
		Assert.assertEquals(ansController.getSkillsPie(), em);
	}
	@Test
	public void getManagerPie()
	{
		msManagerPie em = new msManagerPie();
		
		when(ansService.getManagerPie()).thenReturn(em);
		
		Assert.assertEquals(ansController.getManagerPie(), em);
	}
	
}
