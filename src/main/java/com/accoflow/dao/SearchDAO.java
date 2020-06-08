package com.accoflow.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.accoflow.models.onboardee;
import com.accoflow.rowmapper.OnboardeeMapper;

@Repository
public class SearchDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	
//	public SearchDAO(DataSource dataSource) {
//
//		jdbcTemplate = new JdbcTemplate(dataSource);
//
//	}

public List<onboardee> getOnboardee(List<String> tokens) {
		
		List<onboardee>list=new ArrayList<>();
		for(String token:tokens) {
		String sql = "Select * from onboardee where name like ?";
          List<onboardee>q=jdbcTemplate.query(sql, new String[] { "%" + token+ "%" },new OnboardeeMapper());
          list.addAll(q);
		}
	    return list; 
	}

}
