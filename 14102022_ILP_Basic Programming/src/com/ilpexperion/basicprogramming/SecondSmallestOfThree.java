package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SecondSmallestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
		int firstnumber;
		int secondnumber;
		int thirdnumber;
		int secondsmallest;
		System.out.println("Enter the firstnumber");
		firstnumber = scanner.nextInt();
		System.out.println("Enter the secondnumber");
		secondnumber = scanner.nextInt();
		System.out.println("Enter the thirdnumber");
		thirdnumber = scanner.nextInt();
		
		if((firstnumber < secondnumber)&&(firstnumber < thirdnumber))
		{
			if(secondnumber < thirdnumber)
				System.out.println(secondnumber + " is second smallest");
			else
				System.out.println(thirdnumber + " is second smallest");
				}
		else if((secondnumber < thirdnumber)&&(secondnumber < firstnumber))
		{
			if(thirdnumber < firstnumber)
				System.out.println(thirdnumber + " is second smallest");
			else
				System.out.println(firstnumber + " is second smallest");
		}
		else
			if(firstnumber < secondnumber)
				System.out.println(firstnumber + " is second smallest");
			else
				System.out.println(secondnumber + " is second smallest");
    }
}	
				
		
