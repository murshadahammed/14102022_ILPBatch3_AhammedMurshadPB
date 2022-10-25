package com.experion.basicProgramming;

import java.util.Scanner;

public class DayofWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int ch;
		System.out.println("Enter the day number");
		ch = scanner.nextInt();
		switch(ch)
		{
		case 1 : System.out.println(ch + " is sunday");
				 break;
		case 2 : System.out.println(ch + " is monday");
				 break;
		case 3 : System.out.println(ch + " is tuesday");
		 		 break;
		case 4 : System.out.println(ch + " is wednessday");
				 break;
		case 5 : System.out.println(ch + "is thursday");
				 break;
		case 6 : System.out.println(ch + "is friday");
		         break;
		case 7 : System.out.println(ch + "is saturday");
		         break;
		default :  System.out.println( "invalid input");
		}
	}

}
