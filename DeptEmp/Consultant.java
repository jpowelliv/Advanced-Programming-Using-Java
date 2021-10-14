package com.acme;
/**
 * Joseph E Powell IV
 * CIS 315
 * deptemp
 */

public class Consultant extends Employee {
	private long hourlyRate;
	
	public Consultant(int badge, String fName, String lName, Department department) {
		super(badge, fName, lName, department);
	}
	
	public Consultant(int badge, String fName, String lName, Department department, long rate) {
		super(badge, fName, lName, department);
		this.hourlyRate = rate;
	}
	
	public long getHourlyRate() {
		return hourlyRate;
	}
	
	public long setHourlyRate(long rate) {
		return rate;
	}
	
	public String toString() {
		return "Yo hourly rate = " + hourlyRate;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Consultant)) {
			return false;
		}
		Consultant other = (Consultant) obj;
		return this.hourlyRate == other.hourlyRate;
	}
	
}
