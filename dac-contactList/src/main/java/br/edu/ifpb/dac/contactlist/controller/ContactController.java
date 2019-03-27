package br.edu.ifpb.dac.contactlist.controller;

import br.edu.ifpb.dac.contactlist.model.Contact;
import br.edu.ifpb.dac.contactlist.infra.ManagerContact;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;


@Named("contact")
@RequestScoped
public class ContactController implements Serializable {
    
    private Contact contact = new Contact();
    
    private int id;
    private String name; 
    private LocalDate birthday;
    private String email;
    private String phone;
    
    FacesContext context = FacesContext.getCurrentInstance();

    ManagerContact mc = new ManagerContact();
    
    
    public String saveContact() {
        contact = new Contact(name, email, phone, LocalDate.now());
        
        if (this.mc.find(email) == null) {
            this.mc.save(contact);
            context.addMessage(null, new FacesMessage("Success: Contact registed successfuly."));
            return null;
        }
        
        context.addMessage(null, new FacesMessage("Error: Email or Phone alread in use."));    
        return null;
    }
    
//    public Contact searchContactByName(String name) {
//        ManagerContact mc = new ManagerContact(em);
//        Contact contact = mc.search(name);
//        return contact;
//    }
//    
//    public Contact updateContact(int id,Contact c) {
//        ManagerContact mc = new ManagerContact(em);
//        Contact contact = mc.update(id, c);
//        return contact;
//    }
//    
//    public Contact remove(long id){
//        ManagerContact mc = new ManagerContact(em);
//        Contact contact = mc.remove(id);
//        return contact;
//    }
//    
    public List<Contact> listAllContacts() {
        return this.mc.listAll();
    }
//    
//    public List<Contact> listContactsOrderByName(){
//        ManagerContact mc = new ManagerContact(em);
//        return mc.listOrderByName();
//    }
//    
//    public List<Contact> listContactsGroup(String letter){
//        ManagerContact mc = new ManagerContact(em);
//        return mc.listGroup(letter);
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    
}
