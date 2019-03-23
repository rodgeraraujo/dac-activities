package br.edu.ifpb.dac.contactlist.controller;

import br.edu.ifpb.dac.contactlist.model.Contact;
import infra.ManagerContact;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ContactController {
    
    private EntityManager em = Persistence
                .createEntityManagerFactory("contactList")
                .createEntityManager();
    
    public boolean saveContact(Contact contact) {
        ManagerContact mc = new ManagerContact(em);
        mc.save(contact);
        return true;
    }
    
    public Contact searchContactByName(String name) {
        ManagerContact mc = new ManagerContact(em);
        Contact contact = mc.search(name);
        return contact;
    }
    
    public Contact updateContact(int id,Contact c) {
        ManagerContact mc = new ManagerContact(em);
        Contact contact = mc.update(id, c);
        return contact;
    }
    
    public Contact remove(long id){
        ManagerContact mc = new ManagerContact(em);
        Contact contact = mc.remove(id);
        return contact;
    }
    
    public List<Contact> listAllContacts() {
        ManagerContact mc = new ManagerContact(em);
        return mc.listAll();
    }
    
    public List<Contact> listContactsOrderByName(){
        ManagerContact mc = new ManagerContact(em);
        return mc.listOrderByName();
    }
    
    public List<Contact> listContactsGroup(String letter){
        ManagerContact mc = new ManagerContact(em);
        return mc.listGroup(letter);
    }
}
