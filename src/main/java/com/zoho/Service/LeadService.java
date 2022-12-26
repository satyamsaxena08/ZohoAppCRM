package com.zoho.Service;

import java.util.List;

import com.zoho.Entities.Lead;

public interface LeadService {

public	void saveOneLead(Lead lead);

public	Lead getLeadById(long id);

public void deleteById(long id);

public List<Lead> getAllLeads();

}
