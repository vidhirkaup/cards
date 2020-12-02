package com.org.vkaup.numbers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    private Numbers numbers;

    @Before
    public void setUp() throws Exception {
        numbers = new Numbers();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void when_pos1_pos2_then_pos3() {
        assertEquals(3, numbers.sum(1, 2));
    }

    @Test
    public void when_neg5_neg7_then_neg12() {
        assertEquals(-12, numbers.sum(-5, -7));
    }

    @Test
    public void when_pos8_neg4_then_pos4() {
        assertEquals(4, numbers.sum(8, -4));
    }

    @Test
    public void when_min_max_then_neg1() {
        assertEquals(-1, numbers.sum(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void when_min_neg10_then_exception() {
        numbers.sum(Integer.MIN_VALUE, -10);
    }

    @Test(expected = ArithmeticException.class)
    public void when_max_pos10_then_exception() {
        numbers.sum(Integer.MAX_VALUE, 10);
    }

    @Test
    public void when_x_eq_y_then_true() {
        assertTrue(numbers.compare(10, 10));
    }

    @Test
    public void when_x_gt_y_then_false() {
        assertFalse(numbers.compare(10, 5));
    }

    @Test
    public void when_x_lt_y_then_false() {
        assertFalse(numbers.compare(-10, 0/0));
    }

}