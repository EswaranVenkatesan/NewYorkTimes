package com.project.ny.aggregrator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.ny.model.common.NyTimesParent;

@Service
public class NyTimesAggregrator {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public NyTimesParent getTopStoriesOnScience(HttpEntity<String> entity) {
		
		String getNyTimesUrl = "https://api.nytimes.com/svc/topstories/v2/science.json?api-key=ReKVomqpIt3C1o0vaYtIXaOLV7apgPlw";
		ResponseEntity<NyTimesParent> newsOnScienceResponse = restTemplate.exchange(getNyTimesUrl, HttpMethod.GET, entity, NyTimesParent.class);
		
		return newsOnScienceResponse.getBody();
	}

}
