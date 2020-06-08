package com.accoflow.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.accoflow.models.appUser;
import com.accoflow.models.onboardee;

public class UserMapper  implements RowMapper<appUser>{

	
	     
         @Override
         public appUser mapRow(ResultSet rs, int rowNum) throws SQLException {
         	appUser q = new appUser();
         	q.setUserId(rs.getInt("user_id"));
         	q.setDesignation(rs.getString("designation"));
         	q.setEmail(rs.getString("email"));
         	q.setPermissions(rs.getString("permissions"));
         	q.setFullName(rs.getString("full_name"));
         	q.setProfilepic(rs.getString("profilepic"));
         	q.setIdToken(rs.getString("id_token"));
         	return q;
         
  
     }
}
