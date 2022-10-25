package com.experion.entity;

import com.experion.service.AccountCardService;

public  class Account extends Product implements AccountCardService{
	
	private String accountNumber;
	private double accountBalance;
	public Account(String productName, String accountNumber, double accountBalance) {
		super(productName);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public void checkBalance() {
		
		System.out.println("checking Balance initiated");
		
	}
	
	public void cashWithdraw() {
		
		System.out.println("checking Withdraw initiated");
	}

	@Override
	public void checkProductValidity() {
		// TODO Auto-generated method stub
		
	}
	}
	
	
