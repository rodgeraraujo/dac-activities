package br.edu.ifpb.dac.scenario_two.infra;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DbManager {

    private EntityManager em = Persistence
            .createEntityManagerFactory("MAPPING_PU")
            .createEntityManager();

    public void createDb() {

        // verify if DB exists
//        IsDbExist isDbExist = new IsDbExist();
//        isDbExist.createDb("dac_scenario_three");

        em.getTransaction().begin();
        em.getTransaction().commit();
        
        System.out.println("<< FINISH >>");

    }

}
