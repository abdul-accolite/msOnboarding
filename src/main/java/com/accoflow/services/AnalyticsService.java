package com.accoflow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accoflow.dao.AnalyticsDAO;
import com.accoflow.models.DeveloperType;
import com.accoflow.models.Location;
import com.accoflow.models.Skills;
import com.accoflow.models.msManagerPie;

@Service
public class AnalyticsService {

	@Autowired
	AnalyticsDAO dao;
	public Location getLocationPie()
	{
		return dao.getLocationPie();
	} 
	
	
	
	//skills and demand graph
	
	public Skills getSkillsBar()
	{
		return dao.getSkillsBar();
	} 
	
	
	public DeveloperType getSkillsPie()
	{
		return dao.getSkillsPie();
	} 
	
	
	public msManagerPie getManagerPie()
		{
			System.out.println("working2");
			return dao.getManagerPie();
		}
}
