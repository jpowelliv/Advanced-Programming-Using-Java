package com.mlb;

/**
 * Joseph E Powell
 * CIS315
 * Practice Exam II
 */

import java.util.HashMap;
import java.util.Map;

public class Player implements Comparable<Player>{
	private String first;
	private String last;
	private String position;
	private Map<String, Double> stats;

	public Player(String first, String last, String pos) {
		this.first = first;
		this.last = last;
		this.position = pos;
		stats = new HashMap<>();
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Map<String, Double> getStats() {
		return stats;
	}

	public void setStats(Map<String, Double> stats) {
		this.stats = stats;
	}
	
	@Override
	public String toString() {
		return first + " " + last + " (" + position + ") " + stats;
	}

	@Override
	public int compareTo(Player o) {
		String name = this.last + first;
		
		String otherName = o.last + o.first;
		return name.compareTo(otherName);
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}
