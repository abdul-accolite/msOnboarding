package com.accoflow.test.dao;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
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

import com.accoflow.dao.ProfilePageDAO;
import com.accoflow.models.EmployeeActivity;
import com.accoflow.models.logsTable;

@RunWith(MockitoJUnitRunner.class)
public class ProfilePageDao {

	@InjectMocks
	ProfilePageDAO homeDAO;
	
	@Mock
	 JdbcTemplate jdbcTemplate;
	
	@Before
	public void beforeEmployeeService() {
		MockitoAnnotations.initMocks(this);
	}
	@SuppressWarnings("unchecked")
	@Test
	public void getEmployeeDetails() {
		EmployeeActivity emp = new EmployeeActivity();
		emp.setEmail("string");
		List<logsTable> rl = new ArrayList<>();
		logsTable l = new logsTable();
		l.setOnboardeeName("string");
		rl.add(l);
		int val=1;
		when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(emp);
		when(jdbcTemplate.query(anyString(),any(RowMapper.class))).thenReturn(rl);
		Assert.assertEquals(homeDAO.getEmployeeDetails(val),emp);
	}
}
