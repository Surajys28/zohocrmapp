package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Contact;

public interface ContactService {

	public void saveContact(Contact contact) ;

	public List<Contact> getAllContacts();

	public Contact getContactById(long id);

}