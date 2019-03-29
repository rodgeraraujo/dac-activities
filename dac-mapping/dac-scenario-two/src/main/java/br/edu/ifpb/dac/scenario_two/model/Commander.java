package br.edu.ifpb.dac.scenario_two.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Rodger
 */
@Entity
@Table(name = "commander_data")
public class Commander implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String country;

    @OneToMany(mappedBy = "commander", cascade = CascadeType.ALL)
    private List<Ship> ships;

    public Commander() {
    }

    public Commander(int id, String name, String country, List<Ship> ships) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.ships = ships;
    }
    
    public Commander(String name, String country) {
        this.name = name;
        this.country = country;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }

}
