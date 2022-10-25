package com.experion.assignment;

import java.util.Scanner;

public class Q3_SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int position=1;
		int limit=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit of the series :");
		limit= scanner.nextInt();
		
		for(int i=1;i<=limit;i=i+2)
		{
			if(position%2==0)
			{
				sum=sum-i;
			}
			else
				sum=sum+i;
			position++;
		}
		System.out.println("sum of the series is : " + sum);

	}

}
