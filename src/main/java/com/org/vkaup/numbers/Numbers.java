package com.org.vkaup.numbers;

public class Numbers {

    // Returns the sum of 2 int
    public int sum(int x, int y) {
        long s = (long) x + (long) y;
        if (s < Integer.MIN_VALUE || s > Integer.MAX_VALUE) {
            throw new ArithmeticException(String.format("overflow in addition: (%d) + (%d)", x, y));
        }
        return (int) s;
    }

}
