package com.accoflow.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.accoflow.models.DeveloperType;
import com.accoflow.models.Location;
import com.accoflow.models.Skills;
import com.accoflow.models.msManagerPie;
import com.accoflow.rowmapper.CountLocationMapper;
import com.accoflow.rowmapper.FetchManagerBar;

@Repository
public class AnalyticsDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	

	
//	public AnalyticsDAO(DataSource dataSource) {
//
//		jdbcTemplate = new JdbcTemplate(dataSource);
//
//	}
	@SuppressWarnings("unchecked")
	public Location getLocationPie()
	{
		String sql = "select count(onboardee_id) from onboardee where location='bangalore' and soft_deleted=false";
		String sql2 = "select count(onboardee_id) from onboardee where location='mumbai' and soft_deleted=false";
		
		int bang = (int)jdbcTemplate.queryForObject(sql, new CountLocationMapper());
		int mumb =  (int)jdbcTemplate.queryForObject(sql2, new CountLocationMapper());
		Location obj = new Location();
		obj.setBangalore(bang);
		obj.setMumbai(mumb);
		return obj;
	} 
	
	
	
//	//skills and demand graph
//	
	@SuppressWarnings("unchecked")
	public Skills getSkillsBar()
	{
		
		int java,angular,react,js;
		String sql,sql2,sql3,sql4;
		sql = "select count(onboardee_id) from onboardee where skills like '%java%'  and soft_deleted=false ";
		 sql2 = "select count(onboardee_id) from onboardee where skills  like '%angular%' and soft_deleted=false  ";
		 sql3 = "select count(onboardee_id) from onboardee where skills  like '%react%' and soft_deleted=false  ";
		 sql4 = "select count(onboardee_id) from onboardee where skills  like '%js%' and soft_deleted=false  ";
		  java=(int)jdbcTemplate.queryForObject(sql, new CountLocationMapper());
			 angular=(int)jdbcTemplate.queryForObject(sql2, new CountLocationMapper());
			 react=(int)jdbcTemplate.queryForObject(sql3, new CountLocationMapper());
			 js=(int)jdbcTemplate.queryForObject(sql4, new CountLocationMapper());
		return new Skills(java,angular,react,js);
	} 
	
	
	@SuppressWarnings("unchecked")
	public DeveloperType getSkillsPie()
	{
		DeveloperType dt = new DeveloperType();
		String sql = "select count(onboardee_id) from onboardee where developer_type='backend' and soft_deleted=false ";
		String sql2 = "select count(onboardee_id) from onboardee where developer_type='frontend' and soft_deleted=false ";
		String sql3= "select count(onboardee_id) from onboardee where developer_type='fullstack' and soft_deleted=false ";
		int back = (int)jdbcTemplate.queryForObject(sql, new CountLocationMapper());
		
		int front =  (int)jdbcTemplate.queryForObject(sql2, new CountLocationMapper());
		
		int full =   (int)jdbcTemplate.queryForObject(sql3, new CountLocationMapper());
		dt.setBackend(back);
		dt.setFrontend(front);
		dt.setFullstack(full);
		return dt;
	} 
	
	
	//hiring manager
		
		
		
		
		@SuppressWarnings("unchecked")
		public msManagerPie getManagerPie()
		{
			System.out.println("working3");
			msManagerPie hm = new msManagerPie();
			String sql = "select count(onboardee_id) from onboardee where mshmid="+1+"  and soft_deleted=false ";
			String sql2 = "select count(onboardee_id) from onboardee where mshmid="+2+"  and soft_deleted=false ";
			String sql3 = "select count(onboardee_id) from onboardee where mshmid="+3+"  and soft_deleted=false ";
			int m1 = (int)jdbcTemplate.queryForObject(sql, new CountLocationMapper());
			int m2 =  (int)jdbcTemplate.queryForObject(sql2, new CountLocationMapper());
			int m3 =  (int)jdbcTemplate.queryForObject(sql3, new CountLocationMapper());
			 sql = "select full_name from ms_hiring_manager where mshmid="+1;
			  sql2 = "select full_name from ms_hiring_manager where mshmid="+2;
			  sql3 = "select full_name from ms_hiring_manager where mshmid="+3;
			  String name1 =  (String)jdbcTemplate.queryForObject(sql, new FetchManagerBar());
			  String name2 =  (String)jdbcTemplate.queryForObject(sql2, new FetchManagerBar());
			  String name3 =  (String)jdbcTemplate.queryForObject(sql3, new FetchManagerBar());
			hm.setPercentage1(m1);
			hm.setPercentage2(m2);
			hm.setPercentage3(m3);
			hm.setManager1(name1);
			hm.setManager2(name2);
			hm.setManager3(name3);
			
			return hm;
		}
}
