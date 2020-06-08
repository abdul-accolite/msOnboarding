package com.accoflow.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.accoflow.models.onboardee;

public class OnboardeeMapper implements RowMapper<onboardee>{

	 @Override
     public onboardee mapRow(ResultSet rs, int rowNum) throws SQLException {
     	onboardee q = new onboardee();
     	q.setOnboardeeId(rs.getInt("onboardee_id"));
     	q.setName(rs.getString("name"));
     	q.setDob(rs.getString("dob"));
     	q.setExperience(rs.getInt("experience"));
     	q.setdId(rs.getInt("d_id"));
     	q.setAddress(rs.getString("address"));
     	q.setSkills(rs.getString("skills"));
     	q.setOnboardingStartDate(rs.getString("onboarding_start_date"));
     	q.setEta(rs.getString("eta"));
     	q.setBgcCheckStatus(rs.getString("bgc_check_status"));
     	q.setOnboardingStatus(rs.getString("onboarding_status"));
     	q.setLocation(rs.getString("location"));
     	q.setMshmid(rs.getInt("mshmid"));
     	q.setSoftDeleted(rs.getBoolean("soft_deleted"));
     	q.setDeveloperType(rs.getString("developer_type"));
         return q;
     }

	
}
