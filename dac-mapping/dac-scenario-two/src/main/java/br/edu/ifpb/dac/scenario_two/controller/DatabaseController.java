package br.edu.ifpb.dac.scenario_two.controller;

import br.edu.ifpb.dac.scenario_two.infra.DbManager;
import java.text.ParseException;
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

    public void create() throws ParseException {
        DbManager loader = new DbManager();
        loader.createDb();
        f.addMessage(null, new FacesMessage("Dados persitidos com sucesso!! Verifique o banco de dados! :)"));
    }
}
