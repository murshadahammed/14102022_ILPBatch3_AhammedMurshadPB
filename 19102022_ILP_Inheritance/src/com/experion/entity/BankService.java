package com.experion.entity;

public class BankService {
	private String serviceCode;
	private String serviceName;
	public BankService(String serviceCode, String serviceName) {
		super();
		this.serviceCode = serviceCode;
		this.serviceName = serviceName;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	
	}
	
	
