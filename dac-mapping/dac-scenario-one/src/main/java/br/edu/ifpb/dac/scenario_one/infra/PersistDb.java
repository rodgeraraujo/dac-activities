package br.edu.ifpb.dac.scenario_one.infra;

import br.edu.ifpb.dac.scenario_one.db.IsDbExist;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class PersistDb {
    private EntityManager em = Persistence
            .createEntityManagerFactory("MAPPING_PU")
            .createEntityManager();

    public void createDb() {
        // create database if not exists (change db info, this works with MySQL)
//        IsDbExist isDbExist = new IsDbExist();
//        isDbExist.createDb("dac_scenario_one");
      
        em.getTransaction().begin();
        em.getTransaction().commit();

        System.out.println("<< FINISH >>");

    }

}
