package com.laba.solvd.db.service;

import com.laba.solvd.db.dao.ContactMapperImpl;
import com.laba.solvd.db.dao.ContactRepositoryImpl;
import com.laba.solvd.db.dao.Interfaces.ContactRepository;
import com.laba.solvd.db.model.Contact;
import com.laba.solvd.db.service.Interfaces.ContactService;

import java.util.List;

public class ContactServiceImpl implements ContactService {
    private ContactRepository contactRepository;

    public ContactServiceImpl() {
        this.contactRepository = new ContactRepositoryImpl();
        //this.contactRepository=new ContactMapperImpl();
    }

    @Override
    public Contact create(Contact contact) {
        contact.setId(null);
        contactRepository.create(contact);
        return contact;
    }

    @Override
    public List<Contact> getAll() {
        return contactRepository.getAll();
    }
}
