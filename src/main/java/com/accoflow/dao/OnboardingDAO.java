package com.accoflow.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.accoflow.models.onboardee;
import com.accoflow.rowmapper.OnboardeeMapper;

@Repository
public class OnboardingDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
//	public OnboardingDAO(DataSource dataSource)
//    {
//		jdbcTemplate = new JdbcTemplate(dataSource);
//	}
	int questionId;

	
	
	public int updateOnboardee(onboardee obj) {
		// TODO Auto-generated method stub
		switch(obj.getLocation().toLowerCase())
		{
		case "bangalore":obj.setdId(1);obj.setMshmid(1);
			break;
		case "mumbai":obj.setdId(2);obj.setMshmid(3);
			break;
		}
		switch(obj.getDeveloperType().toLowerCase())
		{
		case "fullstack":obj.setMshmid(2);
		}
		String sql="update onboardee set dob='"+obj.getDob()+"', experience="+obj.getExperience()+", d_id="+obj.getdId()+", address='"+obj.getAddress()+"', skills='"+obj.getSkills()+"', onboarding_start_date='"+obj.getOnboardingStartDate()+"', eta='"+obj.getEta()+"', bgc_check_status='"+obj.getBgcCheckStatus()+"', onboarding_status='"+obj.getOnboardingStatus()+"', location='"+obj.getLocation()+"', mshmid="+obj.getMshmid()+", start_date='"+obj.getStartDate()+"', developer_type='"+obj.getDeveloperType()+"', name='"+obj.getName()+"' where onboardee_id="+obj.getOnboardeeId();
        jdbcTemplate.update(sql);
        jdbcTemplate.update("insert into logs_table(onboardee_id,updated_by,updated_fields) values(?,?,?)",obj.getOnboardeeId(),obj.getUpdatedBy(),obj.getUpdatedFields());
        return 1;
		
	}

	public int addOnboardee(onboardee question) {
		// TODO Auto-generated method stub
	
		switch(question.getLocation().toLowerCase())
		{
		case "bangalore":question.setdId(1);question.setMshmid(1);
			break;
		case "mumbai":question.setdId(2);question.setMshmid(3);
			break;
		}
		switch(question.getDeveloperType().toLowerCase())
		{
		case "fullstack":question.setMshmid(2);
		}
		
		
		jdbcTemplate.update("INSERT INTO onboardee (dob,experience,d_id,address,skills,onboarding_start_date,eta,bgc_check_status,onboarding_status,location,mshmid,soft_deleted,start_date,developer_type,name) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",question.getDob(),question.getExperience(),question.getdId(),question.getAddress(),question.getSkills(),question.getOnboardingStartDate(),question.getEta(),question.getBgcCheckStatus(),question.getOnboardingStatus(),question.getLocation(),question.getMshmid(),question.isSoftDeleted(),question.getStartDate(),question.getDeveloperType(),question.getName());
	
		jdbcTemplate.update("update demand set total_demand=total_demand-1 where demand_id="+question.getdId());
		String sql3= "Select onboardee_id from onboardee ORDER BY onboardee_id DESC LIMIT 1";
		int id = (int) jdbcTemplate.queryForObject(sql3, new RowMapper<Object>() {
			 public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				
	            	return rs.getInt("onboardee_id");
			 }
		});
		question.setUpdatedFields("created the onboardee record");
		jdbcTemplate.update("insert into logs_table(onboardee_id,updated_by,updated_fields) values(?,?,?)",id,question.getUpdatedBy(),question.getUpdatedFields());
		
		return 1;
	}
	public int deleteOnboardee(onboardee question) {
		// TODO Auto-generated method stub
	
		String sql = "update onboardee set soft_deleted= "+true+" where onboardee_id="+question.getOnboardeeId();
		jdbcTemplate.update("update demand set total_demand=total_demand+1 where demand_id="+question.getdId());
		jdbcTemplate.update("insert into logs_table(onboardee_id,updated_by,updated_fields) values(?,?,?)",question.getOnboardeeId(),question.getUpdatedBy(),"soft_deleted");
		jdbcTemplate.update(sql);
		
		
		return 1;
	}
	public List<onboardee> getAllOnboards(boolean bo) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM onboardee where onboardee.soft_deleted="+bo;
        return jdbcTemplate.query(sql,new OnboardeeMapper());	
		
	}
	

}