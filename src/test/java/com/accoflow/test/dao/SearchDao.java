package com.accoflow.test.dao;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.accoflow.dao.SearchDAO;
import com.accoflow.models.onboardee;

@RunWith(MockitoJUnitRunner.class)
public class SearchDao {

	@InjectMocks
	SearchDAO homeDAO;
	
	@Mock
	 JdbcTemplate jdbcTemplate;
	
	@Before
	public void beforeEmployeeService() {
		MockitoAnnotations.initMocks(this);
	}
	@SuppressWarnings("unchecked")
	@Test
	public void getOnboardee() {
		onboardee q = new onboardee();
		List<onboardee> onboar = new ArrayList<>();
		List<onboardee> c = new ArrayList<>();
		onboar.add(q);
		List<String> list = new ArrayList<>();
		list.add("hemant");
		onboar.addAll(c);
		list.add("hemant");//com.accoflow.models.onboardee@6b0c2d26
		when(jdbcTemplate.query(anyString(),new Object[] {anyString()},any(RowMapper.class))).thenReturn(list);
		Assert.assertEquals(homeDAO.getOnboardee(list),onboar);
	}
}
