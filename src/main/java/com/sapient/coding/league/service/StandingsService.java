package com.sapient.coding.league.service;

import com.sapient.coding.league.vo.Standings;

public interface StandingsService {
	
	Standings getStandingsByTeam(Integer teamId);

}
