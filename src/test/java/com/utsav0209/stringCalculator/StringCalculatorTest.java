package com.utsav0209.stringCalculator;

import java.util.Arrays;
import java.util.List;

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
    public static List<Object[]> testCasesList() {
        return Arrays.asList(new Object[][] {
          { "", 0 , "Empty string should return zero"},
          { "1", 1, "String with single number should return number itself"},
          { "1,2", 3, "String with two numbers seperated by comma should return sum of two numbers"},
          { "1,2,3", 6, "String with n+1 numbers seperated by n commas should return sum of n+1 numbers"},
          { "//;\n1;2;3", 6, "String with custom delimiter specified between // and '\\n' at the start of the input should be accepted" },
          { "//_\n1_2_3", 6, "String with custom delimiter specified between // and '\\n' at the start of the input should be accepted" },
          { "//_\n1_2,3\n4", 10, "String with custom delimiter input should also support default delimiters" }
        });
    }


    @Test
    public void testAdd() {
        try{
            assertEquals(testCaseExplaination, expectedInteger, StringCalculator.add(inputString));
        } catch(NegativesNotAllowedException e){
        }
    }

}