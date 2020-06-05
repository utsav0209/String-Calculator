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

        int sum = 0;
        String delimeter = ",|\n";
                
        if(numbers.startsWith("//")){
            String[] splitInput = numbers.split("\n", 2);
            
            String newDelimeter = splitInput[0].substring(2);
            delimeter += "|" + newDelimeter;
            
            numbers = splitInput[1];
        }
        
        String[] numbersArray = numbers.split(delimeter);

        for(String number : numbersArray){
            sum += Integer.parseInt(number);
        }

        return sum;
    }
}