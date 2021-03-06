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
    public int findPerimeter(int x, int y) throws IllegalArgumentException {
        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException(String.format("input cannot be negative: (%d, %d)", x, y));
        }
        return 2 * (x + y);
    }

    // Are the Numbers Equal?
    public boolean isEqual(int x, int y) {
        boolean result = false;
        if (x == y) {
            result = true;
        }
        return result;
    }

    // Maximum Edge of a Triangle
    public int nextEdge(int x, int y) throws IllegalArgumentException {
        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException(String.format("input cannot be negative: (%d, %d)", x, y));
        }
        return (x + y) - 1;
    }

    // 10. Write a function that takes the base and height of a triangle and return its area.
    public int triArea(int base, int height) throws IllegalArgumentException {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException(String.format("input has to be positive: (%d, %d)", base, height));
        }
        return (base * height) / 2;
    }

    // 11. Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero, otherwise return false.
    public boolean lessThanOrEqualToZero(int x) {
        return (x <= 0 ? true : false);
    }

    // 13. There is a single operator in Java, capable of providing the remainder of a division operation. Two numbers are passed as parameters. The first parameter divided by the second parameter will have a remainder, possibly zero. Return that value.
    public int remainder(int x, int y) {
        return x % y;
    }

    // 14. Create a function that takes the number of wins, draws and losses and calculates the number of points a football team has obtained so far.
    //    - wins get 3 points
    //    - draws get 1 point
    //    - losses get 0 points
    public int calcPoints(int wins, int draws, int losses) throws IllegalArgumentException {
        if (wins < 0 || draws < 0 || losses < 0) {
            throw new IllegalArgumentException(String.format("need positive inputs only: (%d, %d, %d)", wins, draws, losses));
        }
        return (wins * 3) + (draws * 1);
    }

    // 16. Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.
    public boolean sumLessThan100(int x, int y) {
        return (x + y < 100) ? true : false;
    }

    // 17. The Farm Problem
    public int countLegs(int chickens, int cows, int pigs) throws IllegalArgumentException {
        return (chickens > 0 ? chickens * 2 : 0) + (cows > 0 ? cows * 4 : 0 ) + (pigs > 0 ? pigs * 4 : 0);
    }

    // ??. Java has a logical operator &&. The && operator takes two boolean values, and returns true if both values are true.
    public boolean and(boolean x, boolean y) {
        return x && y;
    }
}
