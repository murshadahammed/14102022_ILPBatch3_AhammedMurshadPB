package com.experion.service;

import com.experion.entity.Account;

public class AccountService {
	public void depositCash(Account account,double amount)
	{
		System.out.println("depositing Money Over Counter");
	}
	public void depositCash(Account account,String chequeNumber,double amount)
	{
		System.out.println("depositing Money via cheque");
	}
	public void depositCash(Account account,double amount,String upiCode)
	{
		System.out.println("depositing Money via Online Transfer");
	}

		
			
}
