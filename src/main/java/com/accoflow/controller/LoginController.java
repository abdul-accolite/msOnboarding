package com.accoflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accoflow.models.EmployeeCheck;
import com.accoflow.models.appUser;
import com.accoflow.services.EmployeeService;

@RestController
@RequestMapping("/home")
public class LoginController {
  @Autowired
  private EmployeeService empserv;
  @PostMapping(value="/addEmployee",produces="application/json")
  public EmployeeCheck addEmployee(@RequestBody appUser employeeobj){
	return empserv.addEmployee(employeeobj); 
  }
}
