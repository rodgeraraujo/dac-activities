package br.edu.ifpb.dac.scenario_one.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Rodger
 */
@Entity
@IdClass(PairPrimayKey.class)
@Table(name = "pair")
class Pair implements Serializable {

    @Id
    @Column(name = "id_actor1", insertable = false, updatable = false)
    private int id_actor1;
    @Id
    @Column(name = "id_actor2", insertable = false, updatable = false)
    private int id_actor2;
    @Id
    @Column(name = "id_film", insertable = false, updatable = false)
    private int id_film;

    @ManyToOne
    @JoinColumn(name = "id_actor1")
    private Actor actor1;
    @ManyToOne
    @JoinColumn(name = "id_actor2")
    private Actor actor2;
    @ManyToOne
    @JoinColumn(name = "id_film")
    private Film film;

    public Pair() {
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

    public int getId_film() {
        return id_film;
    }

    public void setId_film(int id_film) {
        this.id_film = id_film;
    }

    public Actor getActor1() {
        return actor1;
    }

    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public Actor getActor2() {
        return actor2;
    }

    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id_actor1;
        hash = 17 * hash + this.id_actor2;
        hash = 17 * hash + this.id_film;
        hash = 17 * hash + Objects.hashCode(this.actor1);
        hash = 17 * hash + Objects.hashCode(this.actor2);
        hash = 17 * hash + Objects.hashCode(this.film);
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
        final Pair other = (Pair) obj;
        if (this.id_actor1 != other.id_actor1) {
            return false;
        }
        if (this.id_actor2 != other.id_actor2) {
            return false;
        }
        if (this.id_film != other.id_film) {
            return false;
        }
        if (!Objects.equals(this.actor1, other.actor1)) {
            return false;
        }
        if (!Objects.equals(this.actor2, other.actor2)) {
            return false;
        }
        if (!Objects.equals(this.film, other.film)) {
            return false;
        }
        return true;
    }

}
