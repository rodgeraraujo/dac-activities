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
    
    public Contact find(String email) {
        try{
            if(!em.getTransaction().isActive())
            em.getTransaction().begin();
            
            String sql = "SELECT c FROM Contact c WHERE c.phone = :email";
            
            Contact contact = em.createQuery(sql, Contact.class)
                    .setParameter("email", email)
                    .getSingleResult();

            em.getTransaction().commit();
            return contact;
        } catch(NoResultException e) {
            return null;
        }
    }
    
//    public Contact search(String name) {
//        em.getTransaction().begin();
//        Contact c = em.find(Contact.class, name);
//        if (c != null){
//            em.getTransaction().commit();
//            return  c;
//        }
//        return Contact.empty();
//    }
//    
    public Contact update(int id,Contact c) {
        Contact find = em.find(Contact.class,id);
        if (find == null) {
            return Contact.empty();
        }
        find = c;
        find.setId(id);

        return em.merge(find);
    }
    
    public Contact remove(int id){
        if(!em.getTransaction().isActive())
            em.getTransaction().begin();
        
        Contact c = em.find(Contact.class, id);
        if (c != null) {
            em.remove(c);
            return c;
        }
        return Contact.empty();
    }
    
    public List<Contact> listAll() {
        String sql = "SELECT c FROM Contact c";
        TypedQuery<Contact> query = em.createQuery(sql, Contact.class);
        List<Contact> resultList = query.getResultList();
        return resultList;
    }
    
//    public List<Contact> listOrderByName(){
//        String sql = "SELECT c FROM Contact c ORDER BY c.name";
//        TypedQuery<Contact> query = em.createQuery(sql, Contact.class);
//        return query.getResultList();
//    }
//    
//    public List<Contact> listGroup(String letter){
//        String sql = "SELECT c FROM Contact c WHERE name = '" + letter + "%' ORDER BY c.name";
//        TypedQuery<Contact> query = em.createQuery(sql, Contact.class);
//        return query.getResultList();
//    }
}
