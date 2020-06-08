package com.accoflow.test.controller;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.accoflow.controller.TokenClass;
import com.accoflow.models.Question;
import com.accoflow.models.onboardee;
import com.accoflow.services.SearchService;

public class TokenClassTest {

	@InjectMocks
	TokenClass empService;
	@Mock
	SearchService empDao;

	 
	@Before
	public void beforeEmployeeService() {
		MockitoAnnotations.initMocks(this);
	}
	
	  @Test
	  public void generateToken() {
	  
	  int val=0;
	  onboardee o = new onboardee();
		List<onboardee> list = new ArrayList<>();
		list.add(o);
	  
	  when(empDao.getOnboardees(any())).thenReturn(list);
	  Assert.assertEquals(empService.generateToken("sdfonq"), val);
	  
	  }
	 
	@Test
	public void welcome() {
		
		int val=0;
		onboardee o = new onboardee();
		List<onboardee> list = new ArrayList<>();
		list.add(o);
		
		
		Question q = new Question();
		q.setQ("blah");
		q.getQ();
		// when(empDao.generateToken("sdfonq")).thenReturn(list);
		Assert.assertEquals(empService.welcome(q), list);
		
	}
	
	
}
