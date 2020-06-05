package com.utsav0209.stringCalculator;

import static org.junit.Assert.assertEquals;;

import org.junit.Test;

public class StringCalculatorTest {
    
    @Test
    public void testAdd() {
        assertEquals(0, StringCalculator.add(""));
    }

}