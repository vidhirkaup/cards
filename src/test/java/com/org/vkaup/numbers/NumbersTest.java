package com.org.vkaup.numbers;

import junit.framework.TestCase;
import org.junit.Test;

public class NumbersTest extends TestCase {

    Numbers numbers;

    public void setUp() throws Exception {
        super.setUp();
        numbers = new Numbers();
    }

    public void tearDown() throws Exception {
    }

    public void testSum_with_pos_1_2() {
        assertEquals(3, numbers.sum(1,2));
    }
    public void testSum_with_neg_5_7() {
        assertEquals(-12, numbers.sum(-5,-7));
    }
    public void testSum_with_mix_8_4() {
        assertEquals(4, numbers.sum(8,-4));
    }
    public void testSum_with_mix_max_min() {
        assertEquals(-1, numbers.sum(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
    @Test(expected = ArithmeticException.class)
    public void testSum_with_exception() {
        numbers.sum(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}