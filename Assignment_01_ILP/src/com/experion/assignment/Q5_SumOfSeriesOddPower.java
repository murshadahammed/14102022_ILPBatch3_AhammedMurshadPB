package com.experion.assignment;

import java.util.Scanner;
import java.lang.Math;

public class Q5_SumOfSeriesOddPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum=0;
		int limit,position=1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit of the sum of series: ");
		limit = scanner.nextInt();
		
		for(int i=1;i<=limit;i+=2)
		{
			if(position%2==0)
				sum=sum-Math.pow(i,position);
			else
				sum=sum+Math.pow(i,position);
			position++;
		}
		System.out.println("Sum of the series = "+sum);
		
	}

}
