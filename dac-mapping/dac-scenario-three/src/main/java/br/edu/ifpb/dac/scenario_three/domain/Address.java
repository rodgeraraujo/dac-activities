package br.edu.ifpb.dac.scenario_three.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Rodger
 */
@Embeddable
public class Address implements Serializable {

    private String street;
    private String district;
    private String city;

    public Address() {
    }

    public Address(String street, String district, String city) {
        this.street = street;
        this.district = district;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
}
