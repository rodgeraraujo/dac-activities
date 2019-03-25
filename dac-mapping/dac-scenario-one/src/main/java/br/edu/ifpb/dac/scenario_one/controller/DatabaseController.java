/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.scenario_one.controller;

import br.edu.ifpb.dac.scenario_one.infra.PersistDb;
import javax.inject.Named;

/**
 *
 * @author Rodger
 */
@Named
public class DatabaseController {
    
    public void create() {
        PersistDb loader = new PersistDb();
        loader.createDb();     
    }
}
