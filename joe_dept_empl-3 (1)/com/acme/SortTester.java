package com.acme;

/**
 * Joseph Powell IV
 * @author jpowelliv
 * Test Sorter
 * 20200310 CIS315
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortTester {

	public static void main(String[] args) {
		List<Department> depts = readDepartmentsFromFile("depts.txt");
		List<Employee> company = new ArrayList<>();
		
		try {
			addFromFile(company, "employees.tab", depts);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Collections.sort(company);
		
		for (Employee e : company) {
			System.out.println(e);
		}

	}
	
	private static void addFromFile(List<Employee> co, String fname, List<Department> departments) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fname));
		boolean salaried = true;
		while (br.ready()) {
			String line = br.readLine();
			//System.out.println(line);
			String[] fields = line.split("\t");
			//System.out.println(fields[5]);
			int id = Integer.parseInt(fields[2]);
			int pay = Integer.parseInt(fields[3]);
			int index = Integer.parseInt(fields[5]);
			if (salaried) {
				co.add(new SalariedEmployee(id, fields[0], fields[1], departments.get(index), pay));
			} else {
				co.add(new Consultant(id, fields[0], fields[1], departments.get(index), pay));
			}
			salaried = !salaried;
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

}
