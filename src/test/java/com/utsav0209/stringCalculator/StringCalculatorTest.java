package com.utsav0209.stringCalculator;

import java.util.Collection;
import java.util.Arrays;

import org.junit.Test;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class StringCalculatorTest {
    
    private String inputString;
    private int expectedInteger;
    private String testCaseExplaination;


    public StringCalculatorTest(String inputString, int expectedInteger, String testCaseExplaination){
        this.inputString = inputString;
        this.expectedInteger = expectedInteger;
        this.testCaseExplaination = testCaseExplaination;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
          { "", 0 , "Empty string should return zero"},
          { "1", 1, "String with single number should return number itself"},
          { "1,2", 3, "String with two numbers seperated by comma should return sum of two numbers"},
          { "1,2,3", 6, "String with n+1 numbers seperated by n commas should return sum of n+1 numbers"},
          { "//;\n1;2;3", 6, "String with custom delimeter specified between // and '\\n' at the start of the input is accepted" },
          { "//_\n1_2_3", 6, "String with custom delimeter specified between // and '\\n' at the start of the input is accepted" },
        });
    }


    @Test
    public void testAdd() {
        assertEquals(testCaseExplaination, expectedInteger, StringCalculator.add(inputString));
    }

}