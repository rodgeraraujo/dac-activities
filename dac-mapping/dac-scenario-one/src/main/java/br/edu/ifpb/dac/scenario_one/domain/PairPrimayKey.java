package br.edu.ifpb.dac.scenario_one.domain;

import java.io.Serializable;

/**
 *
 * @author Rodger
 */
public class PairPrimayKey implements Serializable {

    private int id_actor1;
    private int id_actor2;
    private int id_film;
    

    public PairPrimayKey() {
    }

    public int getId_actor1() {
        return id_actor1;
    }

    public void setId_actor1(int id_actor1) {
        this.id_actor1 = id_actor1;
    }

    public int getId_actor2() {
        return id_actor2;
    }

    public void setId_actor2(int id_actor2) {
        this.id_actor2 = id_actor2;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.id_actor1;
        hash = 61 * hash + this.id_actor2;
        hash = 61 * hash + this.id_film;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PairPrimayKey other = (PairPrimayKey) obj;
        if (this.id_actor1 != other.id_actor1) {
            return false;
        }
        if (this.id_actor2 != other.id_actor2) {
            return false;
        }
        if (this.id_film != other.id_film) {
            return false;
        }
        return true;
    }
    
    
}
