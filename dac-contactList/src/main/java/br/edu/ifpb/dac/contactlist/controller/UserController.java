/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.contactlist.controller;

import br.edu.ifpb.dac.contactlist.infra.ManagerUser;
import br.edu.ifpb.dac.contactlist.model.User;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.transaction.SystemException;

/**
 *
 * Created by rodger on Mar 24, 2019 6:02:50 PM
 */
@Named("user")
@RequestScoped
public class UserController {
    
    ManagerUser mu = new ManagerUser();
    private User user = new User();
    private String name;
    private String username;
    private String password;
    private String email;
    
    FacesContext context = FacesContext.getCurrentInstance();
    
    public void saveUser() throws SystemException {
        this.user = new User(email, name, username, password);
        
        this.mu.save(this.user);
        
        context.addMessage(null, new FacesMessage("Success: User registed successfuly."));
        
        this.user = new User(); 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

}
