package com.project.ny.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ny.model.common.NyTimesParent;
import com.project.ny.service.NyTimesService;

@RestController
public class NyTimesController {
	
	@Autowired
	private NyTimesService nyTimesService;
	
	@RequestMapping(value="nytimes/topstories/science", produces = MediaType.APPLICATION_JSON_VALUE)
	public NyTimesParent getTopStoriesForScience() {
		return nyTimesService.getTopStoriesOnScience();
	}

}
