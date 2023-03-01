package com.calculator;

import org.junit.Before;
import org.junit.Test;

public class Test_1 {
	@Before
	public void setUp() throws Exception {
		Main calculator  = new Main();
	}

	@Test
	public final void testSUM() {
		Main calculator  = new Main();
		int result = calculator.SUM(8,3);
		equals(result);
	}
	
	@Test
	public final void testSubtract() {
		Main calculator  = new Main();
		int difference = calculator.Subtract(8,3);
		equals(difference);
	}
	
	@Test
	public final void testmultiply() {
		Main calculator  = new Main();
		int multiply = calculator.Multiply(8,3);
		equals(multiply);
	}
	
	@Test
	public final void testdivide() {
		Main calculator  = new Main();
	float division = calculator.Division(8,3);
		equals(division);
	}
}