package com.mlb;

/**
 * Joseph E Powell
 * CIS315
 * Practice Exam II
 * 
 * @jpowelliv
 */

public class ConfigurationError extends Exception{
	@Override
	public String getMessage() {
		return "Contact your Admin.";
	}

}
