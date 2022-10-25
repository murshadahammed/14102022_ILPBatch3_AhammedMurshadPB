package com.experion.entity;

public class Customer {
	private String customerCode;
	private String customerName;
	public Customer(String customerCode, String customerName) {
		super();
		this.customerCode = customerCode;
		this.customerName = customerName;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Customer [customerCode=" + customerCode + ", customerName=" + customerName + "]";
	}
	
}
