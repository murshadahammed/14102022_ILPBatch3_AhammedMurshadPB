package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int choice;
		char ch;
//		int index = 0 ;
//		Service service= new Service();
		//Product productList[]=new Product[3];
//	    Service.inputProductDetails();
//		Service.displayProductDetails();
		ArrayList<Product>productList=new ArrayList<Product>();
		do
		{
			System.out.println("If you want to Add stock please press 1 \n If you want to Display stock please press 2");
			choice = scanner.nextInt();
			switch(choice)
			{
			case 1:productList.add(Service.createProduct());
//				   productList[index]=Service.createProduct();
//				   index++;
				   break;
			case 2:Service.displayProductDetails(productList);
			       break;
			default : System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue-Y or N");
			scanner.nextLine();
			ch=scanner.next().charAt(0);
		}
		while(ch== 'Y');
		
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
