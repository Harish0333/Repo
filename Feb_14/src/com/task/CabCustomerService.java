package com.task;

import java.util.ArrayList;

public class CabCustomerService 
{
	private ArrayList<CabCustomer> customers=new ArrayList<>();
	
	public void addCabCustomer(CabCustomer cust)
	{
		customers.add(cust);
	}
	
	public boolean isFirstCustomer(CabCustomer cust)
	{
		for(CabCustomer existingCustomer : customers)
		{
			if(existingCustomer.getPhone().equals(cust.getPhone()))
			{
				return false;
			}
		}
		return true;
	}
	
	public double calculateBill(CabCustomer customer)
	{
		if(isFirstCustomer(customer))
		{
			return 0;
		}
		else
		{
			if(customer.getDistance()<=4)
			{
				return 80;
			}
			else
			{
				return 80+(customer.getDistance()-4)*6;
			}
		}
	}
	public String printBill(CabCustomer customer)
	{
		double bill=calculateBill(customer);
		return customer.getCustomerName()+" Please pay your bill of Rs."+bill;
	}
}
