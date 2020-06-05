package com.utsav0209.stringCalculator;

import java.util.Scanner;

/**
 * App class for StringCalulator package
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print("Enter string for addition: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();

        input = input.replace("\\n", "\n");

        StringCalculator stringCalculator = new StringCalculator();

        int sum;
		try {
			sum = stringCalculator.add(input);
            System.out.println("Sum: " + sum);
		} catch (NegativesNotAllowedException e) {
            System.out.println(e.getMessage());
		}

    }
}
