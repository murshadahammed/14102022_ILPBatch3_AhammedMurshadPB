package com.experion.basicProgramming;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String productNames[] = new String[5];
		System.out.println("enter the firstproduct");
		productNames[0] = scanner.nextLine();
		System.out.println("enter the secondproduct");
		productNames[1] = scanner.nextLine();
		System.out.println("enter the thirdproduct");
		productNames[2] = scanner.nextLine();
		System.out.println("enter the fourthproduct");
		productNames[3] = scanner.nextLine();
		System.out.println("enter the fifthproduct");
		productNames[4] = scanner.nextLine(); 
		
		System.out.println("1:"+  productNames[0]);
		System.out.println("2:" + productNames[1]);
		System.out.println("3:" + productNames[2]);
		System.out.println("4:" + productNames[3]);
		System.out.println("5:" + productNames[4]);
		
		
	}

}
