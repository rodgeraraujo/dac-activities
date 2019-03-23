package br.edu.ifpb.dac.scenario_one.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Rodger
 */
@Entity
@Table(name = "actor")
public class Actor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private char gender;
    private String nationality;
    
    @ManyToMany
    @JoinTable(
            inverseJoinColumns = @JoinColumn(name = "actor"),
            joinColumns = @JoinColumn(name = "film")
    )
    private List<Film> films;

    public Actor() {
    }

    public Actor(int id, String name, char gender,
            String nationality, List<Film> films) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.films = films;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

}
