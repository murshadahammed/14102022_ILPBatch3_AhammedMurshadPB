package com.experion.assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q8_SumOfSeries3 {

	private static final DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
	
		int limit;
		double denominator,sum=0;
		double factorial;
		
		System.out.println("Enter the limit:");
		limit = scanner.nextInt();
		
		for(int i=1;i<=limit;i++)
		{
			
			factorial = facto(i);
			denominator = Math.pow(i*i, i)+factorial;
			
			sum = sum + (i/denominator);
		}
		System.out.println("Sum of the series = "+sum);
		
	}
	
	public static double facto(double n) {
		
		double factorial=1;
		for(int i=1;i<=n;i++)
			factorial = factorial*i;
//		System.out.println(factorial);
		return factorial;
	}

}
