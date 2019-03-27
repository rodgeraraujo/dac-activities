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
@IdClass(RatingPrimaryKey.class)
@Table(name = "rating")
class Rating implements Serializable {

    @Id
    @Column(name = "id_film", insertable = false, updatable = false)
    private int id_film;

    @Id
    @Column(name = "id_event", insertable = false, updatable = false)
    private int id_event;

    private int rating;

    @JoinColumn(name = "id_film")
    @ManyToOne
    private Film film;

    @JoinColumn(name = "id_event")
    @ManyToOne
    private Event event;

    public Rating() {
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.id_film;
        hash = 79 * hash + this.id_event;
        hash = 79 * hash + this.rating;
        hash = 79 * hash + Objects.hashCode(this.film);
        hash = 79 * hash + Objects.hashCode(this.event);
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
        final Rating other = (Rating) obj;
        if (this.id_film != other.id_film) {
            return false;
        }
        if (this.id_event != other.id_event) {
            return false;
        }
        if (this.rating != other.rating) {
            return false;
        }
        if (!Objects.equals(this.film, other.film)) {
            return false;
        }
        if (!Objects.equals(this.event, other.event)) {
            return false;
        }
        return true;
    }

}
