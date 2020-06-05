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

        String delimeter = ",|\n";
        
        String[] numbersArray = numbers.split(delimeter);
        int sum = 0;

        for(String number : numbersArray){
            sum += Integer.parseInt(number);
        }

        return sum;
    }
}