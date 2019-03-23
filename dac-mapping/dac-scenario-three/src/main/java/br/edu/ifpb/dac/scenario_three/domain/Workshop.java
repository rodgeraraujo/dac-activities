package br.edu.ifpb.dac.scenario_three.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Rodger
 */
@Entity
public class Workshop implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Embedded
    private Address address;
    private float balance;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> employees = new ArrayList<>();
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Repair> repairs = new ArrayList<>();

    public Workshop() {
        this.repairs = new ArrayList<>();
    }

    public Workshop(int id, Address address, float balance,
            List<Employee> employees, List<Repair> repairs) {
        this.id = id;
        this.address = address;
        this.balance = balance;
        this.employees = employees;
        this.repairs = repairs;
    }

    public Workshop(Address a, float f) {
        this.address = a;
        this.balance = f;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address location) {
        this.address = location;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Repair> getRepairs() {
        return repairs;
    }

    public void setRepairs(List<Repair> repairs) {
        this.repairs = repairs;
    }

}
