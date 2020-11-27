package com.org.vkaup.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTest {
	
	FizzBuzz fizzBuzz;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		fizzBuzz = new FizzBuzz();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_x3_1() {
		assertEquals(fizzBuzz.eval(3), "Fizz");
	}
	
	@Test
	public void test_x3_2() {
		assertEquals(fizzBuzz.eval(6), "Fizz");
	}
	
	@Test
	public void test_x3_3() {
		assertEquals(fizzBuzz.eval(9), "Fizz");
	}
	
	@Test
	public void test_x3_4() {
		assertEquals(fizzBuzz.eval(12), "Fizz");
	}
	
	@Test
	public void test_x3_5() {
		assertEquals(fizzBuzz.eval(15), "FizzBuzz");
	}
	
	
	@Test
	public void test_x5_1() {
		assertEquals(fizzBuzz.eval(5), "Buzz");
	}
	
	@Test
	public void test_x5_2() {
		assertEquals(fizzBuzz.eval(10), "Buzz");
	}
	
	@Test
	public void test_x5_3() {
		assertEquals(fizzBuzz.eval(15), "FizzBuzz");
	}
	
	@Test
	public void test_x2_1() {
		assertEquals(fizzBuzz.eval(2), "2");
	}
	
	@Test
	public void test_x7_2() {
		assertEquals(fizzBuzz.eval(14), "14");
	}

}
