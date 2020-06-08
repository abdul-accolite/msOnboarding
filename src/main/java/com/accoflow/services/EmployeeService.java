package com.accoflow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accoflow.dao.EmployeeDAO;
import com.accoflow.models.EmployeeCheck;
import com.accoflow.models.appUser;

@Service
public class EmployeeService {
   @Autowired
   EmployeeDAO empdao;
   public EmployeeCheck addEmployee(appUser emp) {
	   return empdao.addEmployee(emp);   
   }
   
}
