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
        assertEquals(300, timeUtil.convert(5));
    }

    @Test(expected = ArithmeticException.class)
    public void when_max_mins_then_expect_exception() {
        timeUtil.convert(Integer.MAX_VALUE);
    }

    @Test (expected = IllegalArgumentException.class)
    public void when_neg_mins_then_expect_exception() {
        timeUtil.convert(-1);
    }
}