package com.accoflow.test.dao;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

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

import com.accoflow.dao.AnalyticsDAO;
import com.accoflow.models.DeveloperType;
import com.accoflow.models.Location;
import com.accoflow.models.Skills;
import com.accoflow.models.msManagerPie;
@RunWith(MockitoJUnitRunner.class)
public class AnalyticsDaoTest {
	@InjectMocks
	AnalyticsDAO homeDAO;
		
		@Mock
		 JdbcTemplate jdbcTemplate;
		
		@Before
		public void beforeEmployeeService() {
			MockitoAnnotations.initMocks(this);
		}
		@SuppressWarnings("unchecked")
		@Test
		public void getLocationPie() {
			int val=1;
			Location obj = new Location();
			when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(val);
			when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(val);
			Assert.assertEquals(homeDAO.getLocationPie(),obj);
		}

		@SuppressWarnings("unchecked")
		@Test
		public void getSkillsBar() {
			int val=1;
			Skills obj = new Skills();
			when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(val);
			when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(val);
			when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(val);
			when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(val);
			Assert.assertEquals(homeDAO.getSkillsBar(),obj);
		}
		@SuppressWarnings("unchecked")
		@Test
		public void getSkillsPie() {
			int val=1;
			DeveloperType dt = new DeveloperType();
			when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(anyInt());
			when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(anyInt());
			when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(anyInt());
			Assert.assertEquals(homeDAO.getSkillsPie(),dt);
		}
		@SuppressWarnings("unchecked")
		@Test
		public void getManagerPie() {
			int val=1;
			msManagerPie dt = new msManagerPie();
			when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(new Object());
			when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(new Object());
			when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(new Object());
			when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(new Object());
			when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(new Object());
			when(jdbcTemplate.queryForObject(anyString(),any(RowMapper.class))).thenReturn(new Object());
			Assert.assertEquals(homeDAO.getManagerPie(),dt);
		}
		

}
