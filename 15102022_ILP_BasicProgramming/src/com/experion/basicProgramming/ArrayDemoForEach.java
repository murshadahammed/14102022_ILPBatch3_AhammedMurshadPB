package com.experion.basicProgramming;

import java.util.Scanner;

public class ArrayDemoForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in);
				String productNames[] = new String[5];
				
				System.out.println("Enter the 5 product ");
				for(int index=0; index < 5; index++)
				{
					productNames[index] = scanner.nextLine();
				}
				for(String productName : productNames)
				{
					System.out.println(productName + "   " + productName.length());
				}
	}

}
