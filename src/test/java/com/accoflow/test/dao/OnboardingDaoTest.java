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

import com.accoflow.dao.OnboardingDAO;
import com.accoflow.models.onboardee;


@RunWith(MockitoJUnitRunner.class)
public class OnboardingDaoTest {
	@InjectMocks
	 OnboardingDAO homeDAO;
	
	@Mock
	 JdbcTemplate jdbcTemplate;
	
	@Before
	public void beforeEmployeeService() {
		MockitoAnnotations.initMocks(this);
	}
	@SuppressWarnings("unchecked")
	@Test
	public void getAllOnboards() {
		onboardee q = new onboardee();
		List<onboardee> list = new ArrayList<>();
		list.add(q);
		when(jdbcTemplate.query(anyString(),any(RowMapper.class))).thenReturn(list);
		Assert.assertEquals(homeDAO.getAllOnboards(false),list);
	}
//	@SuppressWarnings("unchecked")
//	@Test
//	public void updateOnboardee() {
//		int val=1;
//		onboardee q = new onboardee();
//		when(jdbcTemplate.update(anyString())).thenReturn(val);
//		when(jdbcTemplate.update(anyString())).thenReturn(val);
//		Assert.assertEquals(homeDAO.updateOnboardee(q),val);
//	}
//	@SuppressWarnings("unchecked")
//	@Test
//	public void addOnboardee() {
//		onboardee q = new onboardee();
//		int val=1;
//		List<onboardee> list = new ArrayList<>();
//		list.add(q);
//		when(jdbcTemplate.update(anyString())).thenReturn(val);
//		when(jdbcTemplate.update(anyString())).thenReturn(val);
//		when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(val);
//		when(jdbcTemplate.update(anyString())).thenReturn(val);
//		Assert.assertEquals(homeDAO.addOnboardee(q),val);
//	}
	@SuppressWarnings("unchecked")
	@Test
	public void deleteOnboardee() {
		onboardee q = new onboardee();
		List<onboardee> list = new ArrayList<>();
		list.add(q);
		int val=1;
		when(jdbcTemplate.update(anyString())).thenReturn(val);
		when(jdbcTemplate.update(anyString())).thenReturn(val);
		when(jdbcTemplate.update(anyString())).thenReturn(val);
		Assert.assertEquals(homeDAO.deleteOnboardee(q),val);
	}
}
