package com.experion.assignment;

import java.util.Scanner;

public class Q1_DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int firstLargest;
		int secondLargest;
		int thirdLargest;
		System.out.println("Enter the firstnumber");
		firstNumber = scanner.nextInt();
		System.out.println("Enter the secondnumber");
		secondNumber= scanner.nextInt();
		System.out.println("Enter the thirdnumber");
		thirdNumber = scanner.nextInt();
		 
		if((firstNumber>secondNumber)&&(firstNumber>thirdNumber)) 
		{
			firstLargest=firstNumber;
			if(secondNumber>thirdNumber)
			{
				secondLargest=secondNumber;
				thirdLargest=thirdNumber;
			}
			else
			{
				secondLargest=thirdNumber;
				thirdLargest=secondNumber;
			}
		}
		else if((secondNumber>firstNumber)&&(secondNumber>thirdNumber)) 
		{
			firstLargest=secondNumber;
			if(firstNumber>thirdNumber)
			{
				secondLargest=firstNumber;
				thirdLargest=thirdNumber;
			}
			else
			{
				secondLargest=thirdNumber;
				thirdLargest=firstNumber;
			}
		}	
		else
		{
			firstLargest=thirdNumber;
			if(firstNumber>secondNumber)
			{
				secondLargest=firstNumber;
				thirdLargest=secondNumber;
			}
			else
			{
				secondLargest=secondNumber;
				thirdLargest=firstNumber;
			}
		}
		System.out.println("Given number in descending order is :" + firstLargest + "," + secondLargest + "," + thirdLargest);
		 
	}

}
