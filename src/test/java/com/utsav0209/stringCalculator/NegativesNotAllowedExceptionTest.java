package com.utsav0209.stringCalculator;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class NegativesNotAllowedExceptionTest {
    
    private String inputString;
    private String expectedString;
    private static String exceptionMessagePrefix = "negatives not allowed";

    public NegativesNotAllowedExceptionTest(String inputString , String expectedString){
        this.inputString = inputString;
        this.expectedString = expectedString;
    }

    @Parameterized.Parameters
    public static List<Object[]> testCasesList() {
        return Arrays.asList(new Object[][] {
            { "-1", exceptionMessagePrefix + " " + "-1" },
            { "-1,2", exceptionMessagePrefix + " " + "-1" },
            { "1,-2,3", exceptionMessagePrefix + " " + "-2" },
            { "1,-2,-3", exceptionMessagePrefix + " " + "[-2, -3]" },
            { "//_\n1_-2_-3", exceptionMessagePrefix + " " + "[-2, -3]" },
            { "//;\n1;-2\n-3,4", exceptionMessagePrefix + " " + "[-2, -3]" },
        });
    }

    @Test(expected = NegativesNotAllowedException.class)
    public void testNegtiveNumbers() throws NegativesNotAllowedException{
        StringCalculator.add(inputString);
    }

    @Test
    public void testNegtiveNumbersExceptionMessage() {
        try {
            StringCalculator.add(inputString);
        } catch(NegativesNotAllowedException e){
            assertEquals(expectedString, e.getMessage());
        }
    }

}