package com.example.demo.www.chap5;

import static org.junit.jupiter.api.Assertions.*;
import static java.util.Arrays.asList;
import org.junit.jupiter.api.Test;

class BuildingStreamServiceTest {
	
	BuildingStreamService bs = new BuildingStreamService();
	
	@Test
	void testMyOf() {
		assertTrue(asList("Java 8", "Lambdas", "In", "Action").equals(bs.myOf()));
	}

	@Test
	void testMySum() {
		assertEquals(41, bs.mySum());
	}

	@Test
	void testMyIterator() {
		assertTrue(asList().equals(bs.myIterator()));
	}

	@Test
	void testMyFinonacci() {
		assertTrue(asList().equals(bs.myFibonacci()));
	}

	@Test
	void testMyFinonacci2() {
		assertTrue(asList().equals(bs.myFibonacci2()));
	}

}
