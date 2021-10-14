package com.acme;
/**
 * Joseph Powell IV
 * @author jpowelliv
 * Test Consultants 
 * 20200310 CIS315
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConsultantTC {
	@Test
	void testRates() throws Exception {
		// positive test: they should be equal
		Department dept1 = new Department("R&D", 12);
		Consultant c1 = new Consultant(123, "Joe", "Blow", dept1, 10000);
		
		Consultant c2 = new Consultant(345, "Larry", "Smith", dept1, 10000);
		
		// they should not be the same object...
		assertFalse(c1 == c2);
		
		// but they should be "equal"
		assertTrue(c1.equals(c2));
	}
	
	@Test
	void testUnequalRates() throws Exception {
		// negative test: they should NOT be equal
		Department dept1 = new Department("R&D", 12);
		Consultant c1 = new Consultant(123, "Joe", "Blow", dept1, 10000);
		
		Consultant c2 = new Consultant(345, "Larry", "Smith", dept1, 20000);
		
		// they should not be the same object...
		assertFalse(c1 == c2);
		
		// and they should NOT be "equal"
		assertFalse(c1.equals(c2));
	}
}
