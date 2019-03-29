package br.edu.ifpb.dac.sessionbeans.controller;

import br.edu.ifpb.dac.sessionbeans.infra.BandImpl;
import br.edu.ifpb.dac.sessionbeans.interfaces.IBand;
import br.edu.ifpb.dac.sessionbeans.model.Band;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class BandController implements Serializable{
    
    @EJB
    private BandImpl bandImpl;
    private Band band = new Band();

    public String save() {
        this.bandImpl.saveBand(
            this.band                
        );
        System.out.println("Save a new band");
        return null;
    }
    
    public String update() {
        this.bandImpl.updateBand(this.band);
        this.band = new Band();
        return null;
    }
    
    public void update(Band band) {
        this.band = band;
    }
    
    public String delete(Band band) {
        boolean delete = this.bandImpl.deleteBand(band.getId());
        return null;
    }
    
    public List<Band> allBands() {
        return this.bandImpl.allBands();
    }
    
    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }
    
    
   
}
