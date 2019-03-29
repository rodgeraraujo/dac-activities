package br.edu.ifpb.dac.contactlist.infra;

import br.edu.ifpb.dac.contactlist.model.Contact;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author fernanda
 */
public class ManagerContact {
    EntityManager em = Persistence
        .createEntityManagerFactory("contactList")
        .createEntityManager();

    public ManagerContact() {
    }
    
    
    public ManagerContact(EntityManager em) {
        this.em = em;
    }
    
    public boolean save(Contact contact) {
        if(!em.getTransaction().isActive())
            em.getTransaction().begin();
        
        em.persist(contact);
        em.getTransaction().commit();
        return true;
    }
    
    public Contact find(String phone) {
        try{
            if(!em.getTransaction().isActive())
            em.getTransaction().begin();
            
            String sql = "SELECT c FROM contact_data c WHERE c.phone = :phone";
            
            Contact contact = em.createQuery(sql, Contact.class)
                    .setParameter("phone", phone)
                    .getSingleResult();

            em.getTransaction().commit();
            return contact;
        } catch(NoResultException e) {
            return null;
        }
    }
    
    public List<Contact> search(String search) {
        try {
            String sql = " SELECT c FROM Contact c where UPPER(c.name) LIKE UPPER(:name)";
            
            TypedQuery<Contact> query = em.createQuery(sql, Contact.class);
            query.setParameter("name", search+"%");
            List<Contact> resultList = query.getResultList();
            return resultList;
        } catch (NoResultException ex) {
            return null;

        }
    }
    
    public boolean update(Contact c) {
        if(!em.getTransaction().isActive())
            em.getTransaction().begin();
        if (c == null) {
            return false;
        }
        em.merge(c);
        em.getTransaction().commit();
        return false;
    }
    
    public boolean remove(Contact c){
        em.getTransaction().begin();
        if (c != null) {
            em.remove(c);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }
    
    public List<Contact> listAll() {
        String sql = "SELECT c FROM Contact c";
        TypedQuery<Contact> query = em.createQuery(sql, Contact.class);
        List<Contact> resultList = query.getResultList();
        return resultList;
    }
    
    public List<Contact> listOrderByName(){
        String sql = "SELECT c FROM Contact c ORDER BY c.name";
        TypedQuery<Contact> query = em.createQuery(sql, Contact.class);
        return query.getResultList();
    }
    
    public List<Contact> listGroup(String letter){
        String sql = "SELECT c FROM Contact c WHERE name = '" + letter + "%' ORDER BY c.name";
        TypedQuery<Contact> query = em.createQuery(sql, Contact.class);
        return query.getResultList();
    }
}
