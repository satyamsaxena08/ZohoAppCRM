package com.zoho.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.Entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
