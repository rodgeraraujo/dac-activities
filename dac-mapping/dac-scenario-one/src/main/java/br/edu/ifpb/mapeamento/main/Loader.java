package br.edu.ifpb.mapeamento.main;

import br.edu.ifpb.dac.scenario_three.db.IsDbExist;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Loader {

    public static void main(String[] args) {
        
        // create database if not exists (change db info, this works with MySQL)
        IsDbExist isDbExist = new IsDbExist();
        isDbExist.createDb("dac_scenario_one");

        EntityManager em = Persistence
                .createEntityManagerFactory("MAPPING_PU")
                .createEntityManager();

        em.getTransaction().begin();
        em.getTransaction().commit();

        System.out.println("Finish");

    }

}
