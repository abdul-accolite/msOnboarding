package com.accoflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accoflow.models.DeveloperType;
import com.accoflow.models.Location;
import com.accoflow.models.Skills;
import com.accoflow.models.msManagerPie;
import com.accoflow.services.AnalyticsService;

@RestController
@RequestMapping("/analytics")
public class AnalyticsController {

	@Autowired
	AnalyticsService qs;
	
	//location graphs
	@GetMapping("/location/pie")
	public Location getLocationPie()
	{
		return qs.getLocationPie();
	} 
	
	
	//skills and demand graph
	@GetMapping("/skills/bar")
	public Skills getSkillsBar()
	{
		return qs.getSkillsBar();
	} 
	
	@GetMapping("/skills/pie")
	public DeveloperType getSkillsPie()
	{
		return qs.getSkillsPie();
	} 
	
	
	//hiring manager
		
		
		@GetMapping("/manager/pie")
		public msManagerPie getManagerPie()
		{
			System.out.println("working");
			return qs.getManagerPie();
		} 
	
}
