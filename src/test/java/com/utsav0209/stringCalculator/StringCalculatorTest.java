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


    public StringCalculatorTest(String inputString, int expectedInteger){
        this.inputString = inputString;
        this.expectedInteger = expectedInteger;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
       return Arrays.asList(new Object[][] {
          { "", 0 },
          { "1", 1 },
          { "1,2", 3}
       });
    }


    @Test
    public void testAdd() {
        assertEquals(expectedInteger, StringCalculator.add(inputString));
    }

}