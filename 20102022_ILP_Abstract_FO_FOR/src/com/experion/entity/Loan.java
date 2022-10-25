package com.experion.entity;

import com.experion.service.LoanService;

public  class Loan extends Product implements  LoanService
{
	private String LoanNumber;
	private double LoanBalance;
	public Loan(String productName, String loanNumber, double loanBalance) {
		super(productName);
		LoanNumber = loanNumber;
		LoanBalance = loanBalance;
	}
	public String getLoanNumber() {
		return LoanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		LoanNumber = loanNumber;
	}
	public double getLoanBalance() {
		return LoanBalance;
	}
	public void setLoanBalance(double loanBalance) {
		LoanBalance = loanBalance;
	}
	@Override
public void checkDueDate() {
		
		System.out.println("checking Due Date initiated");
		
	}
	
	public void loanApproval() {
		
		System.out.println("Loan Approved");
			}
	@Override
	public void checkProductValidity() {
		// TODO Auto-generated method stub
		
	}
	
	
}