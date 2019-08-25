package com.sapient.coding.league.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.coding.league.service.StandingsService;
import com.sapient.coding.league.vo.Standings;

@RestController
public class StandingsController {
	
	@Autowired
	StandingsService service;
	
	@RequestMapping("/standings/{id}")
	public Standings getEmployees(@PathVariable int id) {
		return service.getStandingsByTeam(id);
	}

}
