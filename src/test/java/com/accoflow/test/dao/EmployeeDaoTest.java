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

import com.accoflow.dao.EmployeeDAO;
import com.accoflow.models.EmployeeCheck;
import com.accoflow.models.appUser;
import com.accoflow.models.onboardee;
@RunWith(MockitoJUnitRunner.class)
public class EmployeeDaoTest {
	@InjectMocks
	EmployeeDAO homeDAO;
	
	@Mock
	 JdbcTemplate jdbcTemplate;
	
	@Before
	public void beforeEmployeeService() {
		MockitoAnnotations.initMocks(this);
	}
	@SuppressWarnings("unchecked")
	@Test
	public void addEmployee() {
		onboardee q = new onboardee();
		appUser emp = new appUser();
		List<appUser> list = new ArrayList<>();
		EmployeeCheck empcheck=new EmployeeCheck();
		//list.add(q);
		int val=1;
		when(jdbcTemplate.query(anyString(),any(RowMapper.class))).thenReturn(list);
		when(jdbcTemplate.update(anyString())).thenReturn(val);
		when(jdbcTemplate.query(anyString(),any(RowMapper.class))).thenReturn(list);
		Assert.assertEquals(homeDAO.addEmployee(emp),empcheck);
	}
}
