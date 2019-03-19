package br.edu.ifpb.dac.sessionBeans.manager;

import br.edu.ifpb.dac.sessionBeans.interfaces.IRecommended;
import br.edu.ifpb.dac.sessionBeans.model.Band;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Remote;
import javax.ejb.Singleton;

@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
@Lock(LockType.WRITE)
@Remote(IRecommended.class)
public class ManagerRecommended implements IRecommended {
    private List<Band> recommendeds = new CopyOnWriteArrayList<>();

    @Override
    public boolean addBand(Band band) {
        return false;
    }

    @Override
    public boolean removeBan(Band band) {
        return false;
    }

    @Override
    public boolean updateBand(Band band) {
        return false;
    }

    @Override
    public List<Band> listRecommended() {
        return null;
    }

}
