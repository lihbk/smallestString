package com.example.smallestString;

import junitparams.JUnitParamsRunner;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
class SmallestStringTest {

    @ParameterizedTest
    @CsvSource({
            "this is a test string, tist, t stri",
            "geeksforgeeks, ork, ksfor"
    })
    void testSmallestString(String input, String pattern, String result) {
        String smallesString = SmallestString.findSmallestSubstring(input, pattern);

        assertEquals(smallesString, result);
    }

}
