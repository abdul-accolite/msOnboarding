package com.accoflow.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CountLocationMapper implements RowMapper {


	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		int q = rs.getInt("count(onboardee_id)");
		return q;
	}
}
