package br.edu.ifpb.dac.sessionBeans.interfaces;

import br.edu.ifpb.dac.sessionBeans.model.Band;

import java.util.List;

public interface IRecommended {

    boolean addBand (Band band);
    boolean removeBan (Band band);
    boolean updateBand (Band band);
    List<Band> listRecommended ();

}
