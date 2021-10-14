package com.acme;
/**
 * Joseph Powell IV
 * @author jpowelliv
 * Test Department
 * 20200310 CIS315
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class DepartmentTC {
	
	@Test
	void testEquals() throws Exception {
		// positive test: they should be equal
		Department d1 = new Department("R&D", 12);
		
		Department d2 = new Department("R&D", 12);
		
		// they should not be the same object...
		assertFalse(d1 == d2);
		
		// but they should be "equal"
		assertEquals(d1, d2);
	}

	@Test
	void testBuildingNumbers() throws Exception {
		// negative test: numbers not equal
		Department d1 = new Department("R&D", 12);
		
		Department d2 = new Department("R&D", 13);
		
		// they should not be the same object...
		assertFalse(d1 == d2);
		
		// and they should NOT be "equal"
		assertNotEquals(d1, d2);
	}
	
	@Test
	void testNames() throws Exception {
		// negative test: names not equal
		Department d1 = new Department("RnD", 12);
		
		Department d2 = new Department("R&D", 12);
		
		// they should not be the same object...
		assertFalse(d1 == d2);
		
		// and they should NOT be "equal"
		assertNotEquals(d1, d2);
	}
}
