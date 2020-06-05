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
        
        String[] numbersArray = numbers.split(",");
        
        if(numbersArray.length == 1){
            return Integer.parseInt(numbersArray[0]);
        }

        int sum = 0;
        sum = Integer.parseInt(numbersArray[0]) + Integer.parseInt(numbersArray[1]);

        return sum;
    }
}