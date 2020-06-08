package com.accoflow.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.accoflow.models.EmployeeActivity;
import com.accoflow.models.logsTable;

@Repository
public class ProfilePageDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
//	public ProfilePageDAO(DataSource dataSource)
//    {
//		jdbcTemplate = new JdbcTemplate(dataSource);
//	}
    
	@SuppressWarnings("unchecked")
	public EmployeeActivity getEmployeeDetails(int id)
	{
		
		String sql = "Select full_name,profilepic,email,designation,permissions from app_user where user_id="+id;
		EmployeeActivity emp = (EmployeeActivity) jdbcTemplate.queryForObject(sql, new RowMapper()
		{
			@Override
            public EmployeeActivity mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeActivity emp = new EmployeeActivity();
				emp.setEmail(rs.getString("email"));
				emp.setName(rs.getString("full_name"));
				emp.setProfilepic(rs.getString("profilepic"));
				emp.setDesignation(rs.getString("designation"));
				emp.setPermissions(rs.getString("permissions"));
				return emp;
			}
			
		});
	 
		sql = "select name,updated_by,updated_fields from logs_table inner join app_user,onboardee where logs_table.updated_by=app_user.full_name and logs_table.onboardee_id=onboardee.onboardee_id and app_user.user_id="+id;
		List<logsTable> rl = new ArrayList<logsTable>(); 
		rl = jdbcTemplate.query(sql, new RowMapper<logsTable>() {
		     
            @Override
            public logsTable mapRow(ResultSet rs, int rowNum) throws SQLException {
            	logsTable q = new logsTable();

            	q.setOnboardeeName(rs.getString("name"));
            	q.setUpdatedBy(rs.getString("updated_by"));
            	q.setUpdatedFields(rs.getString("updated_fields"));
                return q;
            }
     
        });	
		emp.setRecentLogs(rl);
		return emp;
	}






	
}
