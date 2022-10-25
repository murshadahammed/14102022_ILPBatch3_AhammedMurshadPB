package com.experion.assignment;

import java.util.Scanner;

public class Q2_NumberOrdering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int fourthNumber;
		int firstLargest=0;
		int secondLargest=0;
		int thirdLargest=0;
		int fourthLargest=0;
		System.out.println("Enter the firstnumber");
		firstNumber = scanner.nextInt();
		System.out.println("Enter the secondnumber");
		secondNumber= scanner.nextInt();
		System.out.println("Enter the thirdnumber");
		thirdNumber = scanner.nextInt();
		System.out.println("Enter the fourthnumber");
		fourthNumber = scanner.nextInt();
		 
		if((firstNumber>secondNumber)&&(firstNumber>thirdNumber)&&(firstNumber>fourthNumber)) 
		{
			firstLargest=firstNumber;
			if((secondNumber>thirdNumber)&&(secondNumber>fourthNumber))
			{
				secondLargest=secondNumber;
				if(thirdNumber>fourthNumber)
					{
						thirdLargest=thirdNumber;
						fourthLargest=fourthNumber;
					}
					else
					{
						thirdLargest=fourthNumber;
						fourthLargest=thirdNumber;
					}
			}
			else if(thirdNumber>fourthNumber)
			{
				secondLargest=thirdNumber;
				if(secondNumber>fourthNumber)
				{
				thirdLargest=secondNumber;
				fourthLargest=fourthNumber;
				}
				else
				{
					thirdLargest=fourthNumber;
					fourthLargest=secondNumber;
				}
			}
			else
			{
				secondLargest=fourthNumber;
				if(secondNumber>thirdNumber)
				{
				thirdLargest=secondNumber;
				fourthLargest=thirdNumber;
				}
				else
				{
					thirdLargest=thirdNumber;
					fourthLargest=secondNumber;
				}
				
			}
				
		}
		if((secondNumber>firstNumber)&&(secondNumber>thirdNumber)&&(secondNumber>fourthNumber)) 
		{
			firstLargest=secondNumber;
			if((firstNumber>thirdNumber)&&(firstNumber>fourthNumber))
			{
				secondLargest=firstNumber;
				if(thirdNumber>fourthNumber)
					{
						thirdLargest=thirdNumber;
						fourthLargest=fourthNumber;
					}
					else
					{
						thirdLargest=fourthNumber;
						fourthLargest=thirdNumber;
					}
			}
			else if(thirdNumber>fourthNumber)
			{
				secondLargest=thirdNumber;
				if(firstNumber>fourthNumber)
				{
				thirdLargest=firstNumber;
				fourthLargest=fourthNumber;
				}
				else
				{
					thirdLargest=fourthNumber;
					fourthLargest=firstNumber;
				}
			}
			else
			{
				secondLargest=fourthNumber;
				if(firstNumber>thirdNumber)
				{
				thirdLargest=firstNumber;
				fourthLargest=thirdNumber;
				}
				else
				{
					thirdLargest=thirdNumber;
					fourthLargest=firstNumber;
				}
				
			}
				
			}
			if((thirdNumber>firstNumber)&&(thirdNumber>secondNumber)&&(thirdNumber>fourthNumber)) 
			{
				firstLargest=thirdNumber;
				if((firstNumber>secondNumber)&&(firstNumber>fourthNumber))
				{
					secondLargest=firstNumber;
					if(secondNumber>fourthNumber)
						{
							thirdLargest=secondNumber;
							fourthLargest=fourthNumber;
						}
						else
						{
							thirdLargest=fourthNumber;
							fourthLargest=secondNumber;
						}
				}
				else if(secondNumber>fourthNumber)
				{
					secondLargest=secondNumber;
					if(firstNumber>fourthNumber)
					{
					thirdLargest=firstNumber;
					fourthLargest=fourthNumber;
					}
					else
					{
						thirdLargest=fourthNumber;
						fourthLargest=firstNumber;
					}
				}
				else
				{
					secondLargest=fourthNumber;
					if(firstNumber>secondNumber)
					{
					thirdLargest=firstNumber;
					fourthLargest=secondNumber;
					}
					else
					{
						thirdLargest=secondNumber;
						fourthLargest=firstNumber;
					}
					
				}
					
				}
				if((fourthNumber>firstNumber)&&(fourthNumber>secondNumber)&&(fourthNumber>thirdNumber)) 
				{
					firstLargest=fourthNumber;
					if((firstNumber>secondNumber)&&(firstNumber>thirdNumber))
					{
						secondLargest=firstNumber;
						if(secondNumber>thirdNumber)
							{
								thirdLargest=secondNumber;
								fourthLargest=thirdNumber;
							}
							else
							{
								thirdLargest=thirdNumber;
								fourthLargest=secondNumber;
							}
					}
					else if(secondNumber>thirdNumber)
					{
						secondLargest=secondNumber;
						if(firstNumber>thirdNumber)
						{
						thirdLargest=firstNumber;
						fourthLargest=thirdNumber;
						}
						else
						{
							thirdLargest=thirdNumber;
							fourthLargest=firstNumber;
						}
					}
					else
					{
						secondLargest=thirdNumber;
						if(firstNumber>secondNumber)
						{
						thirdLargest=firstNumber;
						fourthLargest=secondNumber;
						}
						else
						{
							thirdLargest=secondNumber;
							fourthLargest=firstNumber;
						}
						
					}
						
					}
			
			System.out.println("Given number in ascending order is :" + fourthLargest + "," + thirdLargest + "," + secondLargest + "," + firstLargest);
			System.out.println("Given number in descending order is :" + firstLargest + "," + secondLargest + "," + thirdLargest + "," + fourthLargest);
		}	
}
			
	
	
