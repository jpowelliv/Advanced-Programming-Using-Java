package com.acme;

/**
 * Joseph Powell IV
 * @author jpowelliv
 * Test Employee's Salaries
 * 20200310 CIS315
 */


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalariedEmployeeTC {

	@Test
	void testEquals() throws Exception {
		// positive test: they should be equal
		Department dept1 = new Department("R&D", 12);
		SalariedEmployee e1 = new SalariedEmployee(123, "Joe", "Blow", dept1, 10000);
		
		SalariedEmployee e2 = new SalariedEmployee(345, "Larry", "Smith", dept1, 10000);
		
		// they should not be the same object...
		assertFalse(e1 == e2);
		
		// but they should be "equal"
		assertTrue(e1.equals(e2));
	}
	
	@Test
	void testDifferentDepts() throws Exception {
		// negative test: they should NOT be equal
		Department dept1 = new Department("R&D", 12);
		Department dept2 = new Department("R&D", 13);
		SalariedEmployee e1 = new SalariedEmployee(123, "Joe", "Blow", dept1, 10000);
		
		SalariedEmployee e2 = new SalariedEmployee(345, "Larry", "Smith", dept2, 10000);
		
		// they should not be the same object...
		assertFalse(e1 == e2);
		
		// but they NOT should be "equal"
		assertFalse(e1.equals(e2));
	}
	
	@Test
	void testDifferentSalaries() throws Exception {
		// negative test: they should NOT be equal
		Department dept1 = new Department("R&D", 12);
		SalariedEmployee e1 = new SalariedEmployee(123, "Joe", "Blow", dept1, 10000);
		
		SalariedEmployee e2 = new SalariedEmployee(345, "Larry", "Smith", dept1, 20000);
		
		// they should not be the same object...
		assertFalse(e1 == e2);
		
		// but they NOT should be "equal"
		assertFalse(e1.equals(e2));
	}

}
