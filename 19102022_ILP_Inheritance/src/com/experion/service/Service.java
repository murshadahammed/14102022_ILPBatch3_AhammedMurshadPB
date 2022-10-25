package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Accounts;
import com.experion.entity.BankService;
import com.experion.entity.Card;
import com.experion.entity.Product;

public class Service {

	public static Product createProduct(String productType)
	{
		ArrayList<BankService>bankService = new ArrayList<BankService>();
		bankService.add(new BankService("SOB100","Online Banking"));
		bankService.add(new BankService("SOB101","Mobile Banking"));
		bankService.add(new BankService("SOB102","Cash Deposit"));
		Product product=null;
		if (productType.compareTo("Cards")==0)
		{
			product= new Card("PRDMC100","Master Card","Cards","Master");
		}
		else if (productType.compareTo("Accounts")==0)
		{
			product = new Accounts("PRDWSA100","Womens Savings Account","Cards","Savings",bankService);
		}
		return product;
	}
	public static void displayProductDetails(ArrayList<Product> productList) 
	{
		Card card=null;
	    Accounts account=null;
		
		System.out.println("Product Code" + "	" + "Product Name" + "	" + "ProductType" + "Account/Card");
		
		for (Product product : productList)
		{
			if (product instanceof Card)
			{
				card=(Card)product;
			System.out.println(card.getProductCode() + "	" + card.getProductName()  + "	" + card.getPrductType() + "	" + card.getCardType());
			}
			else if(product instanceof Accounts)
			{
				account=(Accounts)product;
				System.out.println(account.getProductCode() + "	" + account.getProductName()  + "	" + account.getPrductType() + "	" + account.getAccountType());
				
				System.out.println("The list of service are given below :");
				for(BankService bankService : account.getBankService())
				{
					
					System.out.println(bankService.getServiceName());
				}
				}
		}
		
			
	}

}
