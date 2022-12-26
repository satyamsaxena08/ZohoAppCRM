package com.zoho.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.Entities.Contact;
import com.zoho.Entities.Lead;
import com.zoho.Service.ContactService;
import com.zoho.Service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value ="/create" ,method = RequestMethod.GET)
	public String viewCreate () {
		return "view_create" ;
	}
	
	@RequestMapping(value = "/saveLeads" , method = RequestMethod.POST)
	public String saveLead (Lead lead , Model model) {
		leadService.saveOneLead (lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id, Model model) {
		Lead lead = leadService.getLeadById (id);
		
		Contact contact=new Contact ();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactService.saveContact(contact);
		
		leadService.deleteById(id);
		
		
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		
		return "contactList";
	}
	@RequestMapping("/list")
	public String listLeads(Model model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		
		return "list_leads";
		
	}
	@RequestMapping("/leadInfo")
	public String leadinfo(@RequestParam("id") long id, Model model) {
		Lead lead = leadService.getLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info" ;
	}
	
}










