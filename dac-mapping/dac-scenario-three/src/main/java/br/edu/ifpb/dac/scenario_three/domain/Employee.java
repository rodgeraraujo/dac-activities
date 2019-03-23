package br.edu.ifpb.dac.scenario_three.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Rodger
 */
@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String rg;
    private String cpf;
    private String office;
    private float salary;

    public Employee() {
    }

    public Employee(int id, String rg, String cpf, String office, float salary) {
        this.id = id;
        this.rg = rg;
        this.cpf = cpf;
        this.office = office;
        this.salary = salary;
    }

    public Employee(String rg, String cpf, String office, float salary) {
        this.rg = rg;
        this.cpf = cpf;
        this.office = office;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

}
