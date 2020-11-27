package com.org.vkaup.fizzbuzz;

/**
 * Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
 * For numbers which are multiples of both three and five return 'FizzBuzz'.
 * For numbers that are neither, return the input number.
 */
public class FizzBuzz {
	
	public String eval(Integer input) {
		String result;
		
		if(input %3 == 0 && input %5 == 0) {
			result = "FizzBuzz";
		} else if(input % 3 == 0) {
			result = "Fizz";
		} else if(input % 5 == 0 ) {
			result = "Buzz";
		} else {
			result = String.valueOf(input);
		}
		
		return result;
	}
}
