package com.org.vkaup.clock;

public class TimeUtil {

    // Write a function that takes an integer minutes and converts it to seconds
    public int convertMinsToSeconds(int mins) throws IllegalArgumentException, ArithmeticException {
        if (mins < 0) {
            throw new IllegalArgumentException(String.format("invalid minutes supplied: (%d)", mins));
        }

        long sec = (long) mins * 60;
        if (sec > Integer.MAX_VALUE) {
            throw new ArithmeticException(String.format("overflow in minutes to seconds conversion: convert(%d)", mins));
        }
        return (int) sec;
    }

    // Convert Hours into Seconds
    public int convertHoursToSeconds(int hours) throws IllegalArgumentException {
        if (hours < 0) {
            throw new IllegalArgumentException(String.format("invalid hours: (%d)", hours));
        }

        long sec = (long) (hours * 60 * 60);
        if (sec > Integer.MAX_VALUE || sec < 0) {
            throw new ArithmeticException(String.format("overflow in hours to seconds conversion: convert(%d)", hours));
        }

        return (int) sec;
    }
}
