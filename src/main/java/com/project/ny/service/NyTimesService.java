package com.project.ny.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import com.project.ny.aggregrator.NyTimesAggregrator;
import com.project.ny.model.common.NyTimesParent;
import com.project.ny.service.module.science.ScienceService;

@Service
public class NyTimesService {
	
	private ScienceService scienceService;
	
	@Autowired
	private NyTimesAggregrator nyTimesAggregrator;
	
	public NyTimesParent getTopStoriesOnScience() {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<>(headers);
		return nyTimesAggregrator.getTopStoriesOnScience(entity);
		//scienceService.getScienceNews();
	}

}
