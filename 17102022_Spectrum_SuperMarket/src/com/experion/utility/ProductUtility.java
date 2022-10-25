package com.experion.utility;

import java.util.Scanner;

import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Service service = new Service();
		int choice;
		String ch;
		System.out.println("If you want to Add stock please press 1 \n If you want to Display stock please press 2");
		choice = scanner.nextInt();
		do
		{
			switch(choice)
			{
			case 1:service.stockUpdation();
				   break;
			case 2:service.stockDisplay();
			       break;
			default : System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue-Yes or No");
			ch=scanner.nextLine();
		}
		
		while(ch=="Yes");
		 
		}
		
		

}
	