package com.experion.basicProgramming;

import java.util.Scanner;

public class Vowelvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char ch;
		System.out.println("Enter the character");
		ch = scanner.next().charAt(0);
		switch(ch)
		{
		case 'a' : System.out.println(ch + "is a vowel");
				 break;
		case 'e' : System.out.println(ch + "is a vowel");
				 break;
		case 'i' : System.out.println(ch + "is a vowel");
		 		 break;
		case 'o' : System.out.println(ch + "is a vowel");
				 break;
		case 'u' : System.out.println(ch + "is a vowel");
				 break;
		default : System.out.println(ch + " is not a vowel");
		}

	}

}
