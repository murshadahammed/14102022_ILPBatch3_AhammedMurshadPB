package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int choice;
		String ch;
		int index = 0;
//		Service service= new Service();
		Product productList[]=new Product[3];
//	    Service.inputProductDetails();
//		Service.displayProductDetails();
		do
		{
			System.out.println("If you want to Add stock please press 1 \n If you want to Display stock please press 2");
			choice = scanner.nextInt();
			switch(choice)
			{
			case 1:productList[index]=Service.createProduct;
				   break;
			case 2:Service.displayProductDetails();
			       break;
			default : System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue-Yes or No");
			ch=scanner.nextLine();
		}
		
		while(ch=="Yes");
		
//		System.out.println("Enter The Product Code :");
//		String productCode= scanner.nextLine();
//		productOne.setProductCode(productCode);
//		System.out.println("The productDescription is:" + productOne.getProductCode());
//		
//		
//		
//		System.out.println("Enter The Product Description :");
//		String productDescription= scanner.nextLine();
//		productOne.setProductDescription (productDescription);
//		System.out.println("The productDescription is:" + productOne.getProductDescription());
//		
		

	}
	}
