package com.acme;

/**
 * Joseph Powell IV
 *  @author jpowelliv
 * CIS315
 * Department-Employee
 * 20200310
 */

public  abstract class Employee {
	private int badgeNumber;
	private String firstName;
	private String lastName;
	private Department department;
	
	public Employee(int badge, String fName, String lName, Department department) {
		this.badgeNumber = badge;
		firstName = fName;
		lastName = lName;
		this.department = department;
	}
	
	public int getBadgeNumber() {
		return badgeNumber;
	}
	
	public int setBadgeNumber(int badgeNumber) {
		return badgeNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String setFirstName(String name) {
		return name;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String setLastName(String name) {
		return name;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public Department setDepartment(Department d) {
		return d;
	}
	
	public boolean equals;
	
	
	public String toString() {
		return "Person badgeNumber=" + badgeNumber + ",firstName=" + firstName + ",lastName=" + lastName 
					+ ",Department=" + department;
	}
	
	public int compareTo (Employee a) {
		if (this.badgeNumber > a.badgeNumber) {
			return -1;
		} else if (this.badgeNumber < a.badgeNumber) {
			return 1;
		}
		return 0;
	}
}

