package com.accoflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accoflow.models.EmployeeActivity;
import com.accoflow.services.ProfilePageService;

@RestController
@RequestMapping("/profile")
public class ProfilePageController {
	
	@Autowired
	ProfilePageService profilePageService; 
	
	@GetMapping("/{id}")
	public EmployeeActivity getEmployeeDetails(@PathVariable int id)
	{
		return profilePageService.getEmployeeDetails(id);
	}

}
