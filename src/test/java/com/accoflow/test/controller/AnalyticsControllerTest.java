package com.accoflow.test.controller;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.accoflow.controller.AnalyticsController;
import com.accoflow.models.DeveloperType;
import com.accoflow.models.Location;
import com.accoflow.models.Skills;
import com.accoflow.models.msManagerPie;
import com.accoflow.services.AnalyticsService;

public class AnalyticsControllerTest {

	@InjectMocks
	AnalyticsController ansController;
	@Mock
	AnalyticsService ansService;
	
	
	 
	@Before
	public void beforeEmployeeService() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void getLocationPie()
	{
		
		Location em = new Location();
		em.setBangalore(5);
		em.setMumbai(6);
		em.getBangalore();
		em.getMumbai();
		
		when(ansService.getLocationPie()).thenReturn(em);
		
		Assert.assertEquals(ansController.getLocationPie(), em);
	}
	@Test
	public void getSkillsBar()
	{
		Skills em = new Skills();
		new Skills(1,1,1,1);
		em.setAngular(1);
		em.setJava(1);
		em.setJs(1);
		em.setReact(3);
		em.getAngular();
		em.getJava();
		em.getJs();
		em.getReact();
		
		when(ansService.getSkillsBar()).thenReturn(em);
		
		Assert.assertEquals(ansController.getSkillsBar(), em);
	}
	@Test
	public void getSkillsPie()
	{
		DeveloperType em = new DeveloperType();
		em.setBackend(1);
		em.setFrontend(1);
		em.setFullstack(1);
		em.getBackend();
		em.getFrontend();
		em.getFullstack();
		
		when(ansService.getSkillsPie()).thenReturn(em);
		
		Assert.assertEquals(ansController.getSkillsPie(), em);
	}
	@Test
	public void getManagerPie()
	{
		msManagerPie em = new msManagerPie();
		em.setManager1("abdul");
		em.setManager2("subhan");
		em.setManager3("shikeb");
		em.setPercentage1(3);
		em.setPercentage2(3);
		em.setPercentage3(3);
		em.getManager1();
		
		em.getManager2();
		em.getManager3();
		em.getPercentage1();
		em.getPercentage2();
		em.getPercentage3();
		when(ansService.getManagerPie()).thenReturn(em);
		
		Assert.assertEquals(ansController.getManagerPie(), em);
	}
	
}
