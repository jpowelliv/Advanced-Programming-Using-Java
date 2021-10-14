package com.mlb;

/**
 * Joseph E Powell
 * CIS315
 * Practice Exam II
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class League {
	private String name;
	private Map<String, Team> teams;
	
	public League(String name) {
		this.name = name;
		teams = new HashMap<>();
	}
	
	public boolean add(Team t) {
		teams.put(t.getName(), t);
		return true;
	}
	
	public Team getTeam(String name) {
		return teams.get(name);
	}
	
	public Set<String> getTeamNames() {
		return teams.keySet();
	}
	
	@Override
	public String toString() {
		return teams.keySet().toString();
	}
}
