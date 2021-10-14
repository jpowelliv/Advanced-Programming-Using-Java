package com.mlb;

/**
 * Joseph E Powell
 * CIS315
 * Practice Exam II
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
	private String name;
	private List<Player> members;
	
	public Team(String name) {
		this.name = name;
		this.members = new ArrayList<>();
	}
	
	public Team(String name, Player[] players) {
		this(name);
//		this.name = name;
//		this.members = new ArrayList<>();
		
		for (Player p : players) {
			members.add(p);
		}
	}
	
	public void displayTeam(boolean sort) {
		if (sort) {
			Collections.sort(members, new TradeComparator());
			for(Player p : members) {
				System.out.println(p);
			}
		} else {
			for(Player p : members) {
				System.out.println(p);
			}

			}
		}
	
	public int getTeamSize() {
		return members.size();
	}
	
	public String getName() {
		return name;
	}
	
	public void addPlayer(Player p) {
		members.add(p);
	}
	


}
