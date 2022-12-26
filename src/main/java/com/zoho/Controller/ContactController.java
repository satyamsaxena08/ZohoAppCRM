package com.zoho.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.Entities.Billing;
import com.zoho.Entities.Contact;
import com.zoho.Service.BillingService;
import com.zoho.Service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/listContact")
	public String getAllcontacts(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "contactList";
	}
	
	
	@RequestMapping("/createBill")
	public String createBill(@RequestParam("id") long id,Model model) {
		Contact contact =contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return "generate_bill" ;
	}
	
	@RequestMapping("/saveBill")
	public String saveBill(Billing bill, Model model) {
		billingService.generateBill(bill);
		
		
		List<Billing> bills = billingService.getBills();
		model.addAttribute("bills", bills);
		return "generate_bill";
	}
	@RequestMapping("/listBill")
	public String getAllBills (Model model) {
		
		List<Billing> bills = billingService.getBills();
		model.addAttribute("bills", bills);
		return "list_bills";
	}
	
}







