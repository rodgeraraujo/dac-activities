/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.scenario_two.main;

import br.edu.ifpb.dac.scenario_two.model.Commander;
import br.edu.ifpb.dac.scenario_two.model.Load;
import br.edu.ifpb.dac.scenario_two.model.Product;
import br.edu.ifpb.dac.scenario_two.model.Ship;
import br.edu.ifpb.dac.scenario_two.model.Transport;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Rodger
 */
public class Loader {

    /*THIS CLASS MAIN IS ONLY FOR TEST, WITHOUT START SERVER*/
    public static void main(String[] args) throws ParseException {
        EntityManager em = Persistence
                .createEntityManagerFactory("databases")
                .createEntityManager();

        String string = "October 23, 2019";
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        Date date = format.parse(string);

        Commander jackSparrow = new Commander("Jack Sparrow", "Cajacity");     
        
        Ship perolaNegra = new Ship("Perola Negra", 1000l, "Cajacity");
        perolaNegra.setCommander(jackSparrow);

        Load loadCajacityToJampa = new Load("Cajazeiras", "Joao Pessoa");
        
        List<Product> frutas = new ArrayList<>();
        
        Product manga = new Product("Manga", "Fruta");
        Product goiaba = new Product("Goiaba", "Fruta");
        frutas.add(manga);
        frutas.add(goiaba);
                   
        Transport transport = new Transport();
        transport.setShip(perolaNegra);
        transport.setLoad(loadCajacityToJampa);
        transport.setProduct(frutas);
        transport.getDate();
        transport.setDate(date);
        transport.setValue(2500l);
        
        em.getTransaction().begin(); 
        em.persist(jackSparrow);
        em.persist(perolaNegra);
        em.persist(loadCajacityToJampa);
        em.persist(frutas);
        em.persist(transport);
        em.getTransaction().commit();
        
        System.out.println("Finish");
    }
}
