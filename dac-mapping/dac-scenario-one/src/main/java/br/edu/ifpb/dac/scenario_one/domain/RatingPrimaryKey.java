package br.edu.ifpb.dac.scenario_one.domain;

import java.io.Serializable;

/**
 *
 * @author Rodger
 */
public class RatingPrimaryKey implements Serializable {

    private int id_film;
    private int id_event;

    public RatingPrimaryKey() {
    }

    public int getId_film() {
        return id_film;
    }

    public void setId_film(int id_film) {
        this.id_film = id_film;
    }

    public int getId_event() {
        return id_event;
    }

    public void setId_event(int id_event) {
        this.id_event = id_event;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id_film;
        hash = 97 * hash + this.id_event;
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
        final RatingPrimaryKey other = (RatingPrimaryKey) obj;
        if (this.id_film != other.id_film) {
            return false;
        }
        if (this.id_event != other.id_event) {
            return false;
        }
        return true;
    }

}
