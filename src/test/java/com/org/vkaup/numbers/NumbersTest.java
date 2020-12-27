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

    // 1. Returns the sum of 2 int
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

    // 3. Create a function that returns true when x is equal to y; otherwise return false.
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
        assertFalse(numbers.compare(-10, 10));
    }

    // 4. Create a function that takes a number as an argument, increments the number by +1 and returns the result.
    @Test
    public void when_x_eq_10_then_11() {
        assertEquals(11, numbers.next(10));
    }

    @Test
    public void when_x_eq_0_then_1() {
        assertEquals(1, numbers.next(0));
    }

    @Test
    public void when_x_neg5_then_neg4() {
        assertEquals(-4, numbers.next(-5));
    }

    // 5. Create a function that takes voltage and current and returns the calculated power.
    @Test
    public void when_x_230_y_10_then_2300() {
        assertEquals(2300, numbers.power(230, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_x_neg_y_10_then_exception() {
        numbers.power(-10, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_x_230_y_neg_then_exception() {
        numbers.power(230, -10);
    }

    // 7. Find the Perimeter of a Rectangle
    @Test
    public void when_x_10_y_5_then_30() {
        assertEquals(30, numbers.findPerimeter(10, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_x_0_then_exception() {
        numbers.findPerimeter(0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_x_neg10_then_exception() {
        numbers.findPerimeter(-10, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_y_0_then_exception() {
        numbers.findPerimeter(10, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_y_neg10_then_exception() {
        numbers.findPerimeter(0, -10);
    }

    // 8. Are the Numbers Equal?
    @Test
    public void when_x_5_y_5_then_equal() {
        assertTrue(numbers.isEqual(5, 5));
    }

    @Test
    public void when_x_10_y_45_then_not_equal() {
        assertFalse(numbers.compare(10, 45));
    }

    @Test
    public void when_x_neg10_y_neg10_then_equal() {
        assertTrue(numbers.compare(-10, -10));
    }

    @Test
    public void when_x_neg10_y_neg56_then_not_equal() {
        assertFalse(numbers.compare(-10, -56));
    }

    // 9. Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
    @Test
    public void when_x_5_y_10_then_next_14() {
        assertEquals(14, numbers.nextEdge(5, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_x_neg10_then_next_exception() {
        numbers.nextEdge(-10, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_y_neg5_then_next_exception() {
        numbers.nextEdge(10, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_x_0_then_next_exception() {
        numbers.nextEdge(0, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_y_0_then_next_exception() {
        numbers.nextEdge(10, 0);
    }

    // 10. Write a function that takes the base and height of a triangle and return its area.
    @Test
    public void when_base_5_height_10_then_area_25() {
        assertEquals(25, numbers.triArea(5, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_base_0_then_exception(){
        numbers.triArea(0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_base_neg_then_exception(){
        numbers.triArea(-5, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_height_0_then_exception() {
        numbers.triArea(10, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_height_neg_then_exception() {
        numbers.triArea(10, -10);
    }

    // 11. Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero, otherwise return false.
    @Test
    public void when_x_neg_then_true() {
        assertTrue(numbers.lessThanOrEqualToZero(-10));
    }

    @Test
    public void when_x_0_then_true() {
        assertTrue(numbers.lessThanOrEqualToZero(0));
    }

    @Test
    public void when_x_pos_then_false() {
        assertFalse(numbers.lessThanOrEqualToZero(10));
    }

    // 13. There is a single operator in Java, capable of providing the remainder of a division operation. Two numbers are passed as parameters. The first parameter divided by the second parameter will have a remainder, possibly zero. Return that value.
    @Test
    public void when_x_1_y_3_then_1() {
        assertEquals(1, numbers.remainder(1, 3));
    }

    @Test
    public void when_x_3_y_4_then_3() {
        assertEquals(3, numbers.remainder(3, 4));
    }

    @Test
    public void when_x_0_y_0_then_0() {
        assertEquals(0, numbers.remainder(5, 5));
    }

//    14. Create a function that takes the number of wins, draws and losses and calculates the number of points a football team has obtained so far.
    @Test
    public void when_3_wins_4_draws_1_loss_then_points_13() {
        assertEquals(13, numbers.calcPoints(3, 4, 2));
    }

    @Test
    public void when_5_wins_0_draws_2_loss_then_points_15() {
        assertEquals(15, numbers.calcPoints(5, 0, 2));
    }

    @Test
    public void when_0_wins_0_draws_1_loss_then_points_15() {
        assertEquals(0, numbers.calcPoints(0, 0, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_neg_wins_then_exception() {
        numbers.calcPoints(-1, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_neg_draws_then_exception() {
        numbers.calcPoints(0, -1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_neg_loss_then_exception() {
        numbers.calcPoints(0, 0, -1);
    }

    // ??. Java has a logical operator &&. The && operator takes two boolean values, and returns true if both values are true.
    @Test
    public void when_x_T_y_T_then_T() {
        assertTrue(numbers.and(true, true));
    }

    @Test
    public void when_x_T_y_F_then_F() {
        assertFalse(numbers.and(true, false));
    }

    @Test
    public void when_x_F_y_T_then_F() {
        assertFalse(numbers.and(false, true));
    }

    @Test
    public void when_x_F_y_F_then_F() {
        assertFalse(numbers.and(false, false));
    }

    // 16. Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.
    @Test
    public void when_60_and_20_then_true() {
        assertTrue(numbers.sumLessThan100(60, 20));
    }
    @Test
    public void when_60_and_40_then_true() {
        assertFalse(numbers.sumLessThan100(60, 40));
    }
    @Test
    public void when_60_and_60_then_false() {
        assertFalse(numbers.sumLessThan100(60, 60));
    }


}
