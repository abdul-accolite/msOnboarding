package com.accoflow.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.accoflow.models.EmployeeCheck;
import com.accoflow.models.appUser;
import com.accoflow.rowmapper.UserMapper;

@Repository
public class EmployeeDAO {
	@Autowired
   JdbcTemplate jdbcTemplate;
   
//   public EmployeeDAO(DataSource datasource) {
//	   jdbcTemplate= new JdbcTemplate(datasource);
//   }
   public EmployeeCheck addEmployee(appUser emp){
	       EmployeeCheck empcheck=new EmployeeCheck();
	      String sqlQuery="select * from app_user where app_user.email='"+emp.getEmail()+"'";
	      List<appUser> listAnswers = jdbcTemplate.query(sqlQuery,new UserMapper());
          if(!listAnswers.isEmpty()) {
               int empId=listAnswers.get(0).getUserId();
               String empName = listAnswers.get(0).getFullName();
        	     empcheck.setEmpid(empId);
        	     empcheck.setName(empName);
        	     empcheck.setIsnewEmployee(false);
               return empcheck;
          }
	      String sql="insert into app_user(full_name,email,profilepic,id_token,designation,permissions) values('"+emp.getFullName()+"','"+emp.getEmail()+"','"+emp.getProfilepic()+"','"+emp.getIdToken()+"','"+emp.getDesignation()+"','"+emp.getPermissions()+"')";
	      jdbcTemplate.update(sql);
	      
	      List<appUser> listAnswers1 = jdbcTemplate.query(sqlQuery, new UserMapper());
	      empcheck.setEmpid(listAnswers1.get(0).getUserId());
	      
 	     
 	     empcheck.setName(listAnswers.get(0).getFullName());
	      empcheck.setIsnewEmployee(true);
	      return empcheck;
   }
}
