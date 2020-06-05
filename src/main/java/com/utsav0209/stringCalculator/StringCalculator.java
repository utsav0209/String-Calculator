package com.utsav0209.stringCalculator;

public class StringCalculator {
     /**
     * 
     * @param numbers numbers passed as string for addition 
     * @return sum of the numbers
     */

    public static int add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        
        return Integer.parseInt(numbers);
    }
}