package com.mlb;

/**
 * Joseph E Powell
 * CIS315
 * Practice Exam II
 */

import java.util.Comparator;

public class TradeComparator implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		return o1.getPosition().compareTo(o2.getPosition());
	}
	

}
