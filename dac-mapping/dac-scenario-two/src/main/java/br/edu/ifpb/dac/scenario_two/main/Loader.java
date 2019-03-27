/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.scenario_two.main;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Rodger
 */
public class Loader {

    /*THIS CLASS MAIN IS ONLY FOR TEST, WITHOUT START SERVER*/
    public static void main(String[] args) {
        EntityManager em = Persistence
                .createEntityManagerFactory("databases")
                .createEntityManager();

        em.getTransaction().begin();
        em.getTransaction().commit();

        System.out.println("Finish");
    }
}
