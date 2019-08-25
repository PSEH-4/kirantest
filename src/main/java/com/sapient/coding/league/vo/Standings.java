package com.sapient.coding.league.vo;

public class Standings {
	
	private int teamId;
	private String teamName;
	private String countryName;
	private int matchesWon;
	private int matcheslose;
	private int totalMatches;
	
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getMatchesWon() {
		return matchesWon;
	}
	public void setMatchesWon(int matchesWon) {
		this.matchesWon = matchesWon;
	}
	public int getMatcheslose() {
		return matcheslose;
	}
	public void setMatcheslose(int matcheslose) {
		this.matcheslose = matcheslose;
	}
	public int getTotalMatches() {
		return totalMatches;
	}
	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}
	
	

}
