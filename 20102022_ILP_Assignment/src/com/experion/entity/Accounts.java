package com.experion.entity;

import java.util.ArrayList;


public class Accounts extends Customer {
	ArrayList<AccountType>accountType=new ArrayList<AccountType>();
	ArrayList<BankService>bankService=new ArrayList<BankService>();
	private int Balance;
	public Accounts(String customerId, String customerName, ArrayList<AccountType> accountType,
			ArrayList<BankService> bankService, int balance) {
		super(customerId, customerName);
		this.accountType = accountType;
		this.bankService = bankService;
		Balance = balance;
	}
	public ArrayList<AccountType> getAccountType() {
		return accountType;
	}
	public void setAccountType(ArrayList<AccountType> accountType) {
		this.accountType = accountType;
	}
	public ArrayList<BankService> getBankService() {
		return bankService;
	}
	public void setBankService(ArrayList<BankService> bankService) {
		this.bankService = bankService;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	
}
