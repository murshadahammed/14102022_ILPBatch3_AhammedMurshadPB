package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Product>productList=new ArrayList<Product>();
		int choice;
		char ch;
		do
		{
			System.out.println("1. Add card Products");
			System.out.println("2. Add account Products");
			System.out.println("3. Display Products");
			choice = scanner.nextInt();
			switch(choice)
			{
			case 1:productList.add(Service.createProduct("Cards"));
				   break;
			case 2:productList.add(Service.createProduct("Accounts"));
			       break;
			case 3:Service.displayProductDetails(productList);
			       break;
			default : System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue-Y or N");
			scanner.nextLine();
		    ch=scanner.next().charAt(0);
		}
		while(ch== 'Y');
		

	}

}
