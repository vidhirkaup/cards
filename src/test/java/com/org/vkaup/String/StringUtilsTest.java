package com.org.vkaup.String;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    private StringUtils stringUtils;

    @Before
    public void setUp() throws Exception {
        stringUtils = new StringUtils();
    }

    @After
    public void tearDown() throws Exception {
    }

    // 15. Write a function that returns the string "something" joined with a space " " and the given argument a.
    @Test
    public void when_is_better_than_nothing_then_something_is_better_than_nothing(){
        assertEquals("something is better than nothing", stringUtils.giveMeSomething("is better than nothing"));
    }
}