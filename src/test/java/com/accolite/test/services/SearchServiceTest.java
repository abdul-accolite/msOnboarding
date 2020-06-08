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

import com.accoflow.dao.SearchDAO;
import com.accoflow.models.onboardee;
import com.accoflow.services.SearchService;

public class SearchServiceTest {

	@InjectMocks
	SearchService empService;
	@Mock
	SearchDAO empDao;
	@Before
	public void beforeEmployeeService() {
		MockitoAnnotations.initMocks(this);
    }
	@Test
	public void welcome() {
		
	
		onboardee o = new onboardee();
		List<String> list = new ArrayList<>();
		List<onboardee> lis = new ArrayList<>();
		
	
when(empDao.getOnboardee(list)).thenReturn(lis);
		
		Assert.assertEquals(empService.getOnboardees(list), lis);
		
	}
}
