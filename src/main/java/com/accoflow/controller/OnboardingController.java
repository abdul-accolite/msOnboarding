package com.accoflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accoflow.models.logsTable;
import com.accoflow.models.onboardee;
import com.accoflow.services.OnboardingService;

@RestController
@RequestMapping("/onboard")
public class OnboardingController {

	@Autowired
	OnboardingService qs;
	
	@GetMapping("/getAll/{bo}")
	public List<onboardee> getAllOnboards(@PathVariable boolean bo)
	{
		System.out.println("api get all hit with value "+bo);
		return qs.getAllOnboards(bo);
	} 
	
	
	@PostMapping(value="/add",produces="application/json")
	public int addOnboardee(@RequestBody onboardee onboard){
		System.out.println("add onboardee");
		return qs.addOnboardee(onboard);
		 
		
	}
	
	@PostMapping(value="/update",produces="application/json")
	public int updateOnboardee(@RequestBody onboardee onboard){
		return qs.updateOnboardee(onboard);
	}
	@PostMapping(value="/delete",produces="application/json")
	public int deleteOnboardee(@RequestBody onboardee onboard ){
		return qs.deleteOnboardee(onboard);
	}
	
}
