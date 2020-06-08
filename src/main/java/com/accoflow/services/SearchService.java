package com.accoflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accoflow.dao.SearchDAO;
import com.accoflow.models.onboardee;

@Service
public class SearchService {

	@Autowired
	SearchDAO searchDAO;

	
	public List<onboardee> getOnboardees(List<String> token) {
		return searchDAO.getOnboardee(token);
	}
	

}
