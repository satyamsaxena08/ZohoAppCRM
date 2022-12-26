package com.zoho.Service;

import java.util.List;

import com.zoho.Entities.Billing;

public interface BillingService {
	
	public void generateBill(Billing bill);

	public List<Billing> getBills();
}
