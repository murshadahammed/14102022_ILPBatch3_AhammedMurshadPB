package com.experion.assignment;

import java.util.Scanner;

public class Q14_SumOf8InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int sum=8;
		int arr[]=new int[20];
		System.out.println("Enter the limit ");  
		 int n=scanner.nextInt();
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{     
			arr[i]=scanner.nextInt();
		}
		for(int i=0; i<n; i++)  
		{     
			int first = arr[i]; for (int j = i + 1; j <n; j++) 
			{
				int second = arr[j]; 
				if ((first + second) == sum)
				{
					System.out.println("The pairs with a sum of 8 are "+first +","+ second); 
					} 
				}
			}
		}

	}

