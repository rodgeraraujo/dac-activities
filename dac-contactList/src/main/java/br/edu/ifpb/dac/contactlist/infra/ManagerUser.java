/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.contactlist.infra;

import br.edu.ifpb.dac.contactlist.model.User;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.transaction.SystemException;


/**
 *
 * Created by rodger on Mar 24, 2019 6:04:12 PM
 */
public class ManagerUser {
    
    EntityManager em = Persistence
        .createEntityManagerFactory("contactList")
        .createEntityManager();

    public ManagerUser(EntityManager em) {
        this.em = em;
    }

    public ManagerUser() {
        
    }
    
    public boolean save(User user) throws SystemException {      
        
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        return true;
    }

}
