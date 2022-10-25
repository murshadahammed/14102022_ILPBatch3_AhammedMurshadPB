package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class ServiceClass {
	
	public void inputProductDetails() {
		Scanner scanner = new Scanner(System.in);
		Product product = new Product();
		   	
		System.out.println("Enter Product Code");
	    String productCode = scanner.nextLine();
		System.out.println("Enter Product Name");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Description");
		String productDescription = scanner.nextLine();
		System.out.println("Enter Product Price");
		Double productPrice = scanner.nextDouble();
		System.out.println("Enter Product OpenDate");
		String openDate = scanner.nextLine();
		System.out.println("Enter Product ValidityDate");
		String validityDate = scanner.nextLine();
		System.out.println("Enter Product ExpiryDate");
		String expiryDate = scanner.nextLine();
		System.out.println("Enter Product Active");
		Boolean active = scanner.nextBoolean();
		
		
		product.setProductCode(productCode);
		product.setProductName(productName);
		product.setProductDescription(productDescription);
		product.setProductPrice(0);
		product.setOpenDate(openDate);
		product.setValidityDate(validityDate);
		product.setExpiryDate(expiryDate);
		product.setActive(true);

	}
	

	public void displayProductDetails() {
		System.out.println("Product Code" + "Product Name" + "	" + "Product Description" + "	" + "Product Price"
				+ "Open Date" + "Validity Date" + "Expiry Date" + "Active");
		System.out.println(ProductCode() + "	" + ProductName() + " 	" + ProductDescription + " 	" + ProductPrice
				+ " 	" + OpenDate + " 	" + ValidityDate + "	" + ExpiryDate + "" + Active);

	}

}

}
