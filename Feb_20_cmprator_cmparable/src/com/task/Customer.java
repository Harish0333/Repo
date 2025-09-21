package com.task;

public class Customer 
{
	
	private Integer customerNumber;
	private String customerName;
	private Double customerBill;
	
	
	protected Integer getCustomerNumber() {
		return customerNumber;
	}


	protected String getCustomerName() {
		return customerName;
	}

	protected Double getCustomerBill() {
		return customerBill;
	}


	public Customer(Integer customerNumber, String customerName, Double customerBill) 
	{
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}


	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}

}
