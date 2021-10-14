package com.acme;
/**
 * Joseph Powell IV
 * @author jpowelliv
 * Employee Salaries
 * 20200310 CIS315
 */

public class SalariedEmployee extends Employee {
	private long annualSalary;
	
	public SalariedEmployee(int badge, String fName, String lName, Department department) {
		super(badge, fName, lName, department);
	}
	
	public SalariedEmployee(int badge, String fName, String lName, Department department, long salary) {
		super(badge, fName, lName, department);
		this.annualSalary = salary;
	}
	
	public long getAnnualSalary() {
		return annualSalary;
	}
	
	public long setAnnualSalary(long salary) {
		return salary;
	}
	
	public String toString() {
		return "Yo salary is = " + annualSalary;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		SalariedEmployee other = (SalariedEmployee) obj;
		return (this.getDepartment().equals(other.getDepartment()) && this.annualSalary == other.annualSalary);

	}
}
	
