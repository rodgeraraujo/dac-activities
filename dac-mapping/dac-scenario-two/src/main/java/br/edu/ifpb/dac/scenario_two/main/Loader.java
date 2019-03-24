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

    public static void main(String[] args) {
        // create database if not exists (change db info, this works with MySQL)
        IsDbExist isDbExist = new IsDbExist();
        isDbExist.createDb("dac_scenario_two");

        EntityManager em = Persistence
                .createEntityManagerFactory("MAPPING_PU")
                .createEntityManager();

        em.getTransaction().begin();
        em.getTransaction().commit();

        System.out.println("Finish");
    }
}
