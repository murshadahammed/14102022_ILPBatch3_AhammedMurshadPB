package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
import com.experion.entity.Product;

public class ProductUtility {
	public static void main(String[] args) {
		
	/*	Account account =new Account ("Womens Savings Account","ACC24421",10000);
		AccountService accountService =new AccountService();
		accountService.depositCash(account,20000);
		accountService.depositCash(account,545460,"WSA233565");
		accountService.depositCash(account,"kdj2212",42420);
		*/
		Product product =null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Account 2.Card 3.Loan");
		int choice = scanner.nextInt();
		if(choice==1)
		{
			product=new Account ("Womens Savings Account","ACC24421",10000 );
		}
		else if(choice==2)
		{
			product=new Card("Master Card","MC3421",10000 );
		}
		else if(choice==3)
		{
			product=new Loan("Home Loan","Loan4421",10000 );
		}
		product.checkProductValidity();
	}
		}
