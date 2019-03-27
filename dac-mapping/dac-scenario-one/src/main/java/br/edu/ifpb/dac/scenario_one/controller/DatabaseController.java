/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.scenario_one.controller;

import br.edu.ifpb.dac.scenario_one.infra.PersistDb;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Rodger
 */
@Named
@RequestScoped
public class DatabaseController {
    FacesContext f = FacesContext.getCurrentInstance();

    public void create() {
        PersistDb loader = new PersistDb();
        loader.createDb();
        f.addMessage(null, new FacesMessage("Base de dados criada com sucesso!! :)"));
    }
}
