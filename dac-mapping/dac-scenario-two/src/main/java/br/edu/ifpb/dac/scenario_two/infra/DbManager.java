package br.edu.ifpb.dac.scenario_two.infra;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DbManager {

    private EntityManager em = Persistence
            .createEntityManagerFactory("databases")
            .createEntityManager();

    public void createDb() {

        em.getTransaction().begin();
        em.getTransaction().commit();
        
        System.out.println("<< FINISH >>");

    }

}
