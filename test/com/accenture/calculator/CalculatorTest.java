package com.accenture.calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.accenture.calculator.Calculator;

public class CalculatorTest {

	private Calculator calculator;

	@BeforeClass
	public void setup() {
		calculator = new Calculator();
	}

	@Test
	public void testAdd() {
		Integer result = calculator.add(3, 2);
		Assert.assertEquals(result, new Integer(5));
		// Assert.fail();
	}

	@Test
	public void testSubstract() {
		/**
		 * Implement this method
		 */
	}

	@Test
	public void testMultiply() {
		/**
		 * Implement this method
		 */
	}

	@Test
	public void testDivide() {
		/**
		 * Implement this method
		 */
	}

	@Test
	public void testPower() {
		/**
		 * Implement this method
		 */
	}

	@Test
	public void testAverage() {
		/**
		 * Implement this method
		 */
	}

	@Test
	public void testMinimum() {
		/**
		 * Implement this method
		 */

	}

	@Test
	public void testMaximum() {
		/**
		 * Implement this method
		 */
	}

	@Test
	public void testMod() {
		/**
		 * Implement this method
		 */
	}
}
