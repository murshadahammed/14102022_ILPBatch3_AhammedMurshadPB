package com.experion.entity;

import java.util.Scanner;

public class Product {

	String productCode;
	String productName;
	String productDescription;
	double productPrice;
	String openDate;
	String validityDate;
	String expiryDate;
	boolean active;

	public void inputProductDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code");
		productCode = scanner.nextLine();
		System.out.println("Enter Product Name");
		productName = scanner.nextLine();
		System.out.println("Enter Product Description");
		productDescription = scanner.nextLine();
		System.out.println("Enter Product Price");
		productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product OpenDate");
		openDate = scanner.nextLine();
		System.out.println("Enter Product ValidityDate");
		validityDate = scanner.nextLine();
		System.out.println("Enter Product ExpiryDate");
		expiryDate = scanner.nextLine();
		System.out.println("Enter Product Active");
		active = scanner.nextBoolean();

	}

	public void displayProductDetails() {
		System.out.println("Product Code" + "Product Name" + "	" + "Product Description" + "	" + "Product Price"
				+ "Open Date" + "Validity Date" + "Expiry Date" + "Active");
		System.out.println(productCode + "	" + productName + " 	" + productDescription + " 	" + productPrice
				+ " 	" + openDate + " 	" + validityDate + "	" + expiryDate + "" + active);

	}

}
