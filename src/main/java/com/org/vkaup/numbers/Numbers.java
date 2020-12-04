package com.org.vkaup.numbers;

public class Numbers {

    // Returns the sum of 2 int
    public int sum(int x, int y) throws ArithmeticException {
        long s = (long) x + (long) y;
        if (s < Integer.MIN_VALUE || s > Integer.MAX_VALUE) {
            throw new ArithmeticException(String.format("overflow in addition: (%d) + (%d)", x, y));
        }
        return (int) s;
    }

    // Create a function that returns true when x is equal to y; otherwise return false
    public boolean compare(int x, int y) {
        return x == y;
    }

    // Create a function that takes a number as an argument, increments the number by +1 and returns the result.
    public int next(int x) {
        return x + 1;
    }

    // Create a function that takes voltage and current and returns the calculated power.
    public int power(int x, int y) throws IllegalArgumentException {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException(String.format("input cannot be negative: (%d, %d)", x, y));
        }
        return x * y;
    }

    // Find the Perimeter of a Rectangle
    public int findPerimeter(int x, int y) {
        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException(String.format("input cannot be negative: (%d, %d)", x, y));
        }
        return 2 * (x + y);
    }

}
