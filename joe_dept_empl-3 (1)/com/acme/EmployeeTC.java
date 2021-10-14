package com.acme;

/**
 * Joseph Powell IV
 * @author jpowelliv
 * Test Employee
 * 20200310 CIS315
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTC {
	public static void main(String[] args) {
		ArrayList<Department> depts = readDepartmentsFromFile("depts.txt");
		displayDepartments(depts);

		ArrayList<Employee> company = new ArrayList<>();
		populateEmployeeArray(company, depts);
		
		// Display everyone's pay w/o referring to the subclasses (i.e., using Employee only)
		for (Employee e : company) {
			System.out.println(e);
		}
		
		// Display all departments that are equal to this one:
		Department d1 = new Department("Research", 112);
		//Department d2 = new Department("Research", 12);
		for (Department d : depts) {
			if (d1.equals(d)) {
				System.out.println(d);
			}
		}
		//if (d1 == d1{
			//System.out.println("equal");
		//} else {
			//System.out.println("not")
		
		// Display all departments that are equal to this one:
		Department d2 = new Department("Accounting", 50);
		for (Department d : depts) {
			if (d2.equals(d)) {
				System.out.println(d);
			}
		}		
	}
	
	private static void displayDepartments(ArrayList<Department> list) {
		// Display the list to standard error (NOT standard output)
		for (Department d : list) {
			System.err.println(d);
		}
	}
	
	private static ArrayList<Department> readDepartmentsFromFile(String filename) {
		ArrayList<Department> list = new ArrayList<>();
		File file = new File(filename);
		
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNext()) {
				String dept = sc.next();
				int building = sc.nextInt();
				list.add(new Department(dept, building));
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("Department file not found: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		
		return list;
	}
	
	public static void populateEmployeeArray(ArrayList<Employee> array, 
			ArrayList<Department> departments) {
		SalariedEmployee exec = new SalariedEmployee(100, "Steve", "Jobs", 
				departments.get(0), 100000000);
		SalariedEmployee architect = new SalariedEmployee(200, "Bill", "Joy", 
				departments.get(1), 30000000);
		SalariedEmployee engineer = new SalariedEmployee(300, "James", 
				"Gosling", departments.get(2), 30000000);
		Consultant consultant = new Consultant(1100, "Craig", "McClanahan", 
				departments.get(3), 25000);
		SalariedEmployee accountant = new SalariedEmployee(400, "Kevin", 
				"Malone", departments.get(4), 5156700);
		
		array.add(exec);
		array.add(architect);
		array.add(engineer);
		array.add(consultant);
		array.add(accountant);
	}
}
