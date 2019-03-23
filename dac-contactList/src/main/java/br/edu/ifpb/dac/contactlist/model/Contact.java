package br.edu.ifpb.dac.contactlist.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact implements Serializable{
    @Id
    @GeneratedValue
    private long id;
    private String name; 
    private String email;
    private String phone;
    private LocalDate birthday;

    public Contact() {
    }
    
    public Contact(long id, String name, String email, String phone, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
    }

    public static Contact empty() {
        return new Contact(-1,"","", "", null);
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
