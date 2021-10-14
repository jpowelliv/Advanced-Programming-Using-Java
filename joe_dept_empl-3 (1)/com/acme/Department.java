package com.acme;
/**
 * Joseph Powell IV
 * @author jpowelliv
 * Department
 * 20200310 CIS315
 */

public class Department {
	private String name;
	private int buildingNumber;
	
	public Department(String name, int num) {
		this.buildingNumber = num;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String setName(String nm) {
		return nm;
	}
	
	public int getBuildingNumber() {
		return buildingNumber;
	}
	
	public int setBuildingNumber(int num) {
		return num;
	}
@Override
	public String toString() {
		return name + " " + buildingNumber;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Department)) {
			return false;
		}
		Department other = (Department) obj;
		return (this. buildingNumber == other. buildingNumber
				&& this.name.equals(other.name));
	}

//	public boolean equals(Object obj) {
//		
//		Department other = (Department) obj;
//		
//		return (this.name.equals(other.name) && this.buildingNumber == other.buildingNumber);
//	}
	
//		Department other = (Deparmtnet) obj;
//		return (this.name.equals(other.name)
//		&& this.buildingNumber == other.buildingNumber);
		//return true;
	}
	//return (this.buildingNumber == other.buildingNumber);
	//return (this.name == other.name);
	//if its one of the 8 primitives use == if not; it is an object then use =
