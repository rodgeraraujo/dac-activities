package br.edu.ifpb.dac.scenario_three.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Rodger
 */
@Entity
public class Repair implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private float value;
    @Temporal(TemporalType.DATE)
    private Date realizedIn;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Employee employee;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Workshop workshop;

    public Repair() {
    }

    public Repair(int id, float value, Date realizedIn, Employee employee, Workshop workshop) {
        this.id = id;
        this.value = value;
        this.realizedIn = realizedIn;
        this.employee = employee;
        this.workshop = workshop;
    }
    
    public Repair(float value, Date realizedIn, Employee employee, Workshop workshop) {
        this.value = value;
        this.realizedIn = realizedIn;
        this.employee = employee;
        this.workshop = workshop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Date getRealizedIn() {
        return realizedIn;
    }

    public void setRealizedIn(Date realizedIn) {
        this.realizedIn = realizedIn;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Workshop getWorkshop() {
        return workshop;
    }

    public void setWorkshop(Workshop workshop) {
        this.workshop = workshop;
    }

}
