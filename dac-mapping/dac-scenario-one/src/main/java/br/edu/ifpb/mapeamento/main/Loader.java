package br.edu.ifpb.mapeamento.main;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class Loader {
    @PersistenceContext(unitName = "database")
    private static EntityManager em;
    
    public Loader(EntityManager em){
        this.em = em;
    }

    public static void main(String[] args) {
        
        Loader.em = Persistence
            .createEntityManagerFactory("database")
            .createEntityManager();

        em.getTransaction().begin();
        em.getTransaction().commit();

        System.out.println("Finish");

    }

}
