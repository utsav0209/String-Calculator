package com.utsav0209.stringCalculator;

import java.util.ArrayList;

public class StringCalculator {

    private static String exceptionMessagePrefix = "negatives not allowed";
    private int callsCount = 0;

     /**
     * 
     * @param numbers numbers passed as string for addition 
     * @return sum of the numbers
     */
    public int add(String numbers) throws NegativesNotAllowedException{
        
        callsCount++;

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
        ArrayList<Integer> negativeNumbers = new ArrayList<Integer>();
        int tempNum;

        for(String number : numbersArray){
            tempNum = Integer.parseInt(number);
            if(tempNum < 0){
                negativeNumbers.add(tempNum);
            }
            sum += tempNum;
        }

        if(negativeNumbers.size() > 0){
            throw new NegativesNotAllowedException(exceptionMessagePrefix + " " + negativeNumbers.toString());
        }

        return sum;
    }

    public int getCallsCount() {
        return callsCount;
    }
}