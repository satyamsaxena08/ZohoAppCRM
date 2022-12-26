package com.zoho.Service;

import java.util.List;

import com.zoho.Entities.Contact;

public interface ContactService {
	
	public void saveContact(Contact con);

	public List<Contact> getAllContacts();

	public Contact getContactById(long id);
}
