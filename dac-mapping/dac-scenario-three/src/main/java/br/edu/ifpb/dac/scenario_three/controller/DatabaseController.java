package br.edu.ifpb.dac.scenario_three.controller;

import br.edu.ifpb.dac.scenario_three.infra.DbManager;
import javax.inject.Named;

/**
 *
 * @author Rodger
 */
@Named
public class DatabaseController {

    public void create() {
        DbManager loader = new DbManager();
        loader.createDb();
    }
}
