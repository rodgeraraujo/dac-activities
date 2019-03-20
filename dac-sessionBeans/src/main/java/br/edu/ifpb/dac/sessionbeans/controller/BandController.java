package br.edu.ifpb.dac.sessionbeans.controller;

import br.edu.ifpb.dac.sessionBeans.interfaces.IBand;
import br.edu.ifpb.dac.sessionBeans.model.Band;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class BandController implements Serializable{
    
    @EJB
    private IBand bandI;
    private Band band = new Band();

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }
    
    public List<Band> allBands() {
        return this.bandI.allBands();
    }
    
    public String save() {
        this.bandI.saveBand(
            this.band                
        );
        System.out.println("Save a new band");
        return null;
    }
    
    public String update() {
        this.bandI.updateBand(this.band);
        this.band = new Band();
        return null;
    }
    
    public void update(Band band) {
        this.band = band;
    }
    
    public String delete(Band band) {
        boolean delete = this.bandI.deleteBand(band.getId());
        return null;
    }
}
