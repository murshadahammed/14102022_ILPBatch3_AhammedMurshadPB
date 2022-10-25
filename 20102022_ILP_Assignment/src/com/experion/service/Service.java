package com.experion.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.AccountType;
import com.experion.entity.Accounts;
import com.experion.entity.BankService;
import com.experion.entity.Customer;


public class Service {
	
	public static Customer createAccounts(String AccountType)
	{
		 
		Scanner scanner = new Scanner(System.in);
		String customerName = null;
		String customerId = null;
		char ch;
		
		System.out.println("***** Accounts Available ****");
		System.out.println("1.Savings Max Account");
		System.out.println("2.Current Account");
		System.out.println("3.Loan Account");
		System.out.println("Enter Your Choice");
		int choice = scanner.nextInt();
		Customer customer =null;
		do 
		{
			
		switch (choice)
		{
		case 1:ArrayList<BankService>bankService = new ArrayList<BankService>();
			   bankService.add(new BankService("Cash Deposit"));
			   bankService.add(new BankService("ATM Withdrawl"));
			   bankService.add(new BankService("Online Banking"));
			   //for showing the services available for the particular account
			   
			    ArrayList<AccountType>accountType1 = new ArrayList<AccountType>();
			   	accountType1.add(new AccountType ("Saving Max Account"));
			   	
			   	System.out.println("Enter The Customer Code");
			    customerId=scanner.nextLine();
				System.out.println("Enter The Customer Name");
			    customerName=scanner.nextLine();
				System.out.println("Savings Max Account created for" + customerName);
				System.out.println("Account is active");
				customer = new Accounts(customerId,customerName,accountType1,bankService,1000);
				break;
		case 2:  ArrayList<AccountType>accountType2 = new ArrayList<AccountType>();
				accountType2.add(new AccountType ("Current Account"));
				
				ArrayList<BankService>bankService2 = new ArrayList<BankService>();
				bankService2.add(new BankService("Cash Deposit"));
				bankService2.add(new BankService("ATM Withdrawl"));
				bankService2.add(new BankService("Online Banking"));
				bankService2.add(new BankService("Mobile Banking"));
				
				System.out.println("Enter The Customer Code");
				customerId=scanner.nextLine();
				System.out.println("Enter The Customer Name");
				customerName=scanner.nextLine();
				System.out.println("Current Account created for" + customerName);
				System.out.println("Account is active");
				customer = new Accounts(customerId,customerName,accountType2,bankService2,1000);
				break;
		case 3:   ArrayList<AccountType>accountType3 = new ArrayList<AccountType>();
	   			  accountType3.add(new AccountType ("Loan Account"));
			
	   			ArrayList<BankService>bankService3 = new ArrayList<BankService>();
				bankService3.add(new BankService("Cash Deposit"));
				bankService3.add(new BankService("Checque Deposit"));
			
				System.out.println("Enter The Customer Code");
				customerId=scanner.nextLine();
				System.out.println("Enter The Customer Name");
				customerName=scanner.nextLine();
				System.out.println("Loan Account created for" + customerName);
				System.out.println("Account is active");
				customer = new Accounts(customerId,customerName,accountType3,bankService3,1000);
				break;
		default:System.out.println("Invalid input");
		}
			System.out.println("Do you want to continue :y/n?");
			ch=scanner.next().charAt(0);
		}
		while(ch == 'y');
		return customer;
	}



	
	public static void manageAccounts(ArrayList<Customer> customerList) 
	{
	   
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Customer Id ");
		String customerId = scanner.nextLine();
		
		for (Customer customer : customerList) {
			if (customer.getCustomerId().compareTo(customerId)==0) 
			{
				System.out.println(customer.getCustomerName() + " has the following Accounts")
				Accounts accounts =(Accounts)customer;
				 if(customer instanceof Accounts)
					{
				System.out.println(accounts.getAccountType());
			}

		System.out.println("Product Code" + "	" + "Product Name" + "	" + "ProductType" + "Account/Card");
		
//		for (Customer product : productList)
//		{
//			if(product instanceof Accounts)
//			{
//				account=(Accounts)product;
//				System.out.println(account.getCustomerId() + "	" + account.getCustomerName()  + "	" + account.getAccountType() + "	" + );
//				
//				
//				System.out.println("The list of service are given below :");
//				for(BankService bankService : account.getBankService())
//				{
//					
//					System.out.println(bankService.getServiceName());
//				}
//				}
//		}
//		
//			
	}

}
