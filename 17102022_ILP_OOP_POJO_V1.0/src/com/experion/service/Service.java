package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	static Product product = null;
	public static Product createProduct;
	public static void createProduct()
	{
		Scanner scanner = new Scanner(System.in);
		   	
		System.out.println("Enter Product Code");
	    String productCode = scanner.nextLine();
		System.out.println("Enter Product Name");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Description");
		String productDescription = scanner.nextLine();
		System.out.println("Enter Product Price");
		Double productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product OpenDate");
		String openDate = scanner.nextLine();
		System.out.println("Enter Product ValidityDate");
		String validityDate = scanner.nextLine();
		System.out.println("Enter Product ExpiryDate");
		String expiryDate = scanner.nextLine();
		System.out.println("Enter Product Active");
		boolean active = scanner.nextBoolean();
		
		
		product.setProductCode(productCode);
		product.setProductName(productName);
		product.setProductDescription(productDescription);
		product.setProductPrice(productPrice);
		product.setOpenDate(openDate);
		product.setExpiryDate(expiryDate);
		product.setValidityDate(validityDate);
		product.setActive(active);
		
	}

	public static void displayProductDetails() {

		System.out.println("Product Name " + "		" + "Product Description" + "		" + "Product Price"
				+ "			" + "Open Date" + "		" + "Expiry Date" + "" + "Active");
		System.out.println(product.getProductName() + "				" + product.getProductDescription() + "				" + product.getProductPrice()
				+ "		" + product.getOpenDate() + "		" + product.getExpiryDate()+"      "+ product.isActive());

	}
}

