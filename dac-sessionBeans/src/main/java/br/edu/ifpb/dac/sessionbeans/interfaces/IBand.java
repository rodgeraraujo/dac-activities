package br.edu.ifpb.dac.sessionBeans.interfaces;

import br.edu.ifpb.dac.sessionBeans.model.Band;

import java.util.List;

public interface IBand {

    boolean saveBand (Band band);
    boolean deleteBand (int id);
    boolean updateBand (Band band);
    List<Band> allBands ();

}
