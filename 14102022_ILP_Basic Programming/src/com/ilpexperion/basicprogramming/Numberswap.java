package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class Numberswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int firstnumber;
		int secondnumber;
		int temp;
		System.out.println("Enter the firstnumber");
		firstnumber = scanner.nextInt();
		System.out.println("Enter the secondnumber");
		secondnumber = scanner.nextInt();
		System.out.println("output before swapping :");
		System.out.println("firstnumber =" +firstnumber);
		System.out.println("secondnumber=" +secondnumber);
		
		temp = firstnumber;
		firstnumber = secondnumber;
		secondnumber=temp;
		System.out.println("output after swapping :");
		System.out.println("firstnumber =" +firstnumber);
		System.out.println("secondnumber =" +secondnumber);
		
		
		
		

	}

}
