package com.accoflow.test.mapper;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import java.sql.ResultSet;
import java.sql.SQLException;
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

import com.accoflow.models.onboardee;
import com.accoflow.rowmapper.OnboardeeMapper;

@RunWith(MockitoJUnitRunner.class)
public class OnboardeeMapperTest {

	@InjectMocks
	OnboardeeMapper homeDAO;
	
	@Mock
	 JdbcTemplate jdbcTemplate;
	
	@Before
	public void beforeEmployeeService() {
		MockitoAnnotations.initMocks(this);
	}
	@SuppressWarnings("unchecked")
	@Test
	public void mapRow() {
		
	}
}
