package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class EvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number = scanner.nextInt();
		if(number==0)
		{
			 System.out.println("number is zero");
		}
		else if(number%2==0)
		 {
				System.out.println(number + " is even number");
		 }
		 else
		 {
				System.out.println(number + " is odd");
		 }
	}

}
