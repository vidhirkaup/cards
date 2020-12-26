package com.org.vkaup.String;

public class StringUtils {

    // 15. Write a function that returns the string "something" joined with a space " " and the given argument a.
    public String giveMeSomething(String input) {
        return new StringBuilder("something ").append(input).toString();
    }
}
