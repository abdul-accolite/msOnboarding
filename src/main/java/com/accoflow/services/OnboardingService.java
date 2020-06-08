package com.accoflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accoflow.dao.OnboardingDAO;
import com.accoflow.models.logsTable;
import com.accoflow.models.onboardee;

@Service
public class OnboardingService {

	@Autowired
	OnboardingDAO dao;
	
	public List<onboardee> getAllOnboards(boolean bo){
		return dao.getAllOnboards(bo);
	}
		public int addOnboardee(onboardee question) {
		return dao.addOnboardee(question);
		
	}
		
	
	public int  updateOnboardee(onboardee obj) {
		return dao.updateOnboardee(obj);
		
	}
	public int  deleteOnboardee(onboardee question) {
		return dao.deleteOnboardee(question);
		
	}
}
