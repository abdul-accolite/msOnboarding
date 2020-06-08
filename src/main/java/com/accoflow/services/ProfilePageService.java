package com.accoflow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accoflow.dao.ProfilePageDAO;
import com.accoflow.models.EmployeeActivity;

@Service
public class ProfilePageService {
	
	@Autowired
	ProfilePageDAO profilePageDAO;
	
	public EmployeeActivity getEmployeeDetails(int id)
	{
		return profilePageDAO.getEmployeeDetails(id);
	}

}
