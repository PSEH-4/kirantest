package com.sapient.coding.league.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sapient.coding.league.vo.Standings;


@Repository
public class StandingsRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Standings getStandingsByTeam(int teamId) {
		String query = "select t.id team_id, t.name team_name,c.name country_name,t.won won,t.lose lose from team t, country c where t.country_id=c.id and t.id=?";
		Standings standings = jdbcTemplate.queryForObject(
		    query, new Object[] { teamId }, (rs, rNo) -> {
		    	Standings std = new Standings();
		        std.setTeamId(rs.getInt("TEAM_ID"));
		        std.setTeamName(rs.getString("TEAM_NAME"));
		        std.setCountryName(rs.getString("COUNTRY_NAME"));
		        std.setMatchesWon(rs.getInt("WON"));
		        std.setMatcheslose(rs.getInt("LOSE"));
		        return std;
		    });
		return standings;
	}

}
