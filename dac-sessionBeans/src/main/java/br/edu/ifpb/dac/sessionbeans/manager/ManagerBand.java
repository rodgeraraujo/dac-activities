package br.edu.ifpb.dac.sessionbeans.manager;

import br.edu.ifpb.dac.sessionbeans.interfaces.IBand;
import br.edu.ifpb.dac.sessionbeans.model.Band;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManagerBand implements IBand {
    private List<Band> bands = new ArrayList<>();

    @Override
    public boolean saveBand(Band band) {
        this.bands.add(band);
        return false;
    }

    @Override
    public boolean deleteBand(int id) {
        this.bands.remove(id);
        return false;
    }

    @Override
    public boolean updateBand(Band band) {
        this.bands.remove(band.getId());
        this.bands.add(band);
        return false;
    }

    @Override
    public List<Band> allBands() {
        return Collections.unmodifiableList(this.bands);
    }
}
