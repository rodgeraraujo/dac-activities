package br.edu.ifpb.dac.contactlist.controller;

import br.edu.ifpb.dac.contactlist.model.Contact;
import br.edu.ifpb.dac.contactlist.infra.ManagerContact;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
//import javax.inject.Named;


@ManagedBean(name = "contactCtrl")
@RequestScoped
public class ContactController implements Serializable {
    
    private Contact contact = new Contact();
    
    private int id;
    private String name; 
    private LocalDate birthday;
    private String email;
    private String phone;
    
    private List<Contact> contacts = new ArrayList<>();
    
    ManagerContact mConact = new ManagerContact();
    
    FacesContext context = FacesContext.getCurrentInstance();
    
    
    public String saveContact() {
               
//        contact = new Contact(this.name, this.email, this.phone, LocalDate.now());
        
//        if (this.mConact.find(this.phone) == null) {
            this.contact.setBirthday(LocalDate.now());
            System.out.println(this.contact.toString());
            this.mConact.save(this.contact);
            context.addMessage(null, new FacesMessage("Success: Contact registed successfuly."));
            return null;
//        }
//        
//        this.contact = new Contact();
//        context.addMessage(null, new FacesMessage("Error: Phone alread in use."));    
//        return null;
    }
    
//    public Contact searchContactByName(String name) {
//        ManagerContact mConact = new ManagerContact(em);
//        Contact contact = mConact.search(name);
//        return contact;
//    }
//    
    public String updateContact(int id) {
        System.out.println("User id:" + id);
        
//        contact = new Contact(id, name, email, phone, birthday);
        System.out.println("User info:" + contact.toString());
//        Contact c = this.mConact.update(id, this.contact);
        Contact c = this.mConact.update(id, this.contact);
        context.addMessage(null, new FacesMessage("Success: Contact updated successfuly."));
        return null;
    }
    
    public String remove(Contact c){       
        if (mConact.remove(c)) {
            context.addMessage(null, new FacesMessage("Success: Contact deleted."));
            listAllContacts();
            return null;
        }
        context.addMessage(null, new FacesMessage("Failed: Contact dont removed."));
        listAllContacts();
        return null;
    }
   
    public List<Contact> listAllContacts() {
        return this.mConact.listAll();
    }
//    
//    public List<Contact> listContactsOrderByName(){
//        ManagerContact mConact = new ManagerContact(em);
//        return mConact.listOrderByName();
//    }
//    
//    public List<Contact> listContactsGroup(String letter){
//        ManagerContact mConact = new ManagerContact(em);
//        return mConact.listGroup(letter);
//    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    

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
