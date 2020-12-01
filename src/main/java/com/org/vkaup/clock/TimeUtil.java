package com.org.vkaup.clock;

public class TimeUtil {

    // Write a function that takes an integer minutes and converts it to seconds
    public int convert(int mins) throws IllegalArgumentException, ArithmeticException {
        if (mins < 0) {
            throw new IllegalArgumentException(String.format("invalid minutes supplied: (%d)", mins));
        }

        long sec = (long) mins * 60;
        if (sec > Integer.MAX_VALUE) {
            throw new ArithmeticException(String.format("overflow in minutes to seconds conversion: convert(%d)", mins));
        }
        return (int) sec;
    }

}
