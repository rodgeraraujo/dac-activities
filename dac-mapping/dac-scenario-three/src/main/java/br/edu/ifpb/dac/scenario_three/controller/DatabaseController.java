package br.edu.ifpb.dac.scenario_three.controller;

import br.edu.ifpb.dac.scenario_three.domain.Repair;
import br.edu.ifpb.dac.scenario_three.infra.DbManager;
import java.util.List;
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
        DbManager loader = new DbManager();
        loader.createDb();
        f.addMessage(null, new FacesMessage("Operaçao realizada com sucesso!! :)"));
    }
}
