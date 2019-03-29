package br.edu.ifpb.dac.sessionbeans.interfaces;

import br.edu.ifpb.dac.sessionbeans.model.Band;

import java.util.List;

public interface IBand {

    boolean saveBand (Band band);
    boolean deleteBand (int id);
    boolean updateBand (Band band);
    List<Band> allBands ();

}
