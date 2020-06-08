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

import com.accoflow.controller.OnboardingController;
import com.accoflow.models.onboardee;
import com.accoflow.services.OnboardingService;

public class OnboardingControllerTest {

	@InjectMocks
	OnboardingController ansController;
	@Mock
	OnboardingService ansService;
	
	
	 
	@Before
	public void beforeEmployeeService() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void addOnboardee()
	{
		
		onboardee bo = new onboardee();
		bo.getAddress();
		bo.getBgcCheckStatus();
		bo.getDeveloperType();
		bo.getdId();
		bo.getDob();
		bo.getEta();
		bo.getExperience();
		bo.getLocation();
		bo.getMshmid();
		bo.getName();
		bo.getOnboardeeId();
		bo.getOnboardingStartDate();
		bo.getOnboardingStatus();
		bo.getSkills();
		bo.getStartDate();
		bo.getUpdatedBy();
		bo.getUpdatedFields();
		bo.setAddress("blah");
		bo.setBgcCheckStatus("blah");
		bo.setDeveloperType("blah");
		bo.setdId(3);
		bo.setDob("blah");
		bo.setEta("blah");
		bo.setExperience(3);
		bo.setLocation("blah");
		bo.setMshmid(1);
		bo.setName("blah");
		bo.setOnboardeeId(2);
		bo.setOnboardingStartDate("blah");
		bo.setOnboardingStatus("blah");
		bo.setSkills("blah");
		bo.setSoftDeleted(true);
		bo.setStartDate("blah");
		bo.setUpdatedBy("blah");
		bo.setUpdatedFields("blah");
		bo.isSoftDeleted();
		
		
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
