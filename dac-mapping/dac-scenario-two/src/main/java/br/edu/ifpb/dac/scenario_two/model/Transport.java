/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.scenario_two.model;

import java.io.Serializable;
import java.lang.annotation.Target;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Rodger
 */
@Entity
@Table(name = "transport")
@IdClass(TransportPrimaryKey.class)
public class Transport implements Serializable {

    @Id
    @Column(name = "load_id", insertable = false, updatable = false)
    private int load_id;
//    @Id
//    @Column(name = "product_id", insertable = false, updatable = false)
//    private int product_id;
    @Id
    @Column(name = "ship_id", insertable = false, updatable = false)
    private int ship_id;

    @OneToOne
    @JoinColumn(name = "load_id")
    private Load load;

  
//    @OneToMany
//    @JoinTable(
//            name = "product_id",
//            inverseJoinColumns = @JoinColumn(name = "id")
//    )
//    private List<Product> product;

    @OneToOne
    @JoinColumn(name = "ship_id")
    private Ship ship;

    @Temporal(TemporalType.DATE)
    private Date date;
    private long value;

    public Transport() {
    }

    public Transport(Load load, List<Product> product, Ship ship, Date date, long value) {
        this.load = load;
//        this.product = product;
        this.ship = ship;
        this.date = date;
        this.value = value;
    }

    public Load getLoad() {
        return load;
    }

    public void setLoad(Load load) {
        this.load = load;
    }
//
//    public List<Product> getProduct() {
//        return product;
//    }
//
//    public void setProduct(List<Product> product) {
//        this.product = product;
//    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

}
