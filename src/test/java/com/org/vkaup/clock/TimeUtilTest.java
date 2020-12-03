package com.org.vkaup.clock;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeUtilTest {

    TimeUtil timeUtil;

    @Before
    public void setUp() throws Exception {
        timeUtil = new TimeUtil();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void when_5min_then_300sec() {
        assertEquals(300, timeUtil.convertMinsToSeconds(5));
    }

    @Test(expected = ArithmeticException.class)
    public void when_max_mins_then_expect_exception() {
        timeUtil.convertMinsToSeconds(Integer.MAX_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_neg_mins_then_expect_exception() {
        timeUtil.convertMinsToSeconds(-1);
    }

    @Test
    public void when_2hours_then_7200() {
        assertEquals(7200, timeUtil.convertHoursToSeconds(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_neg_hours_then_exception() {
        timeUtil.convertHoursToSeconds(-2);
    }

    @Test(expected = ArithmeticException.class)
    public void when_max_hours_then_exception() {
        timeUtil.convertHoursToSeconds(Integer.MAX_VALUE);
    }
}