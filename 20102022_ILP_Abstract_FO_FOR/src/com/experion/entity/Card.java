package com.experion.entity;

import com.experion.service.AccountCardService;

public  class Card extends Product implements AccountCardService
{
	private String cardNumber;
	private double cardBalance;
	
	public Card(String productName, String cardNumber, double cardBalance) {
		super(productName);
		this.cardNumber = cardNumber;
		this.cardBalance = cardBalance;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public double getCardBalance() {
		return cardBalance;
	}
	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
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
