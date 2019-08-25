package com.sapient.coding.league.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.coding.league.repository.StandingsRepository;
import com.sapient.coding.league.service.StandingsService;
import com.sapient.coding.league.vo.Standings;

@Service
public class StandingServiceImpl implements StandingsService{
	
	@Autowired
	StandingsRepository repository;

	@Override
	public Standings getStandingsByTeam(Integer teamId) {
		return repository.getStandingsByTeam(teamId);
	}

}
