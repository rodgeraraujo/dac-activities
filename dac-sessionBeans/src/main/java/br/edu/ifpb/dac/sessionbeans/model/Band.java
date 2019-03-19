package br.edu.ifpb.dac.sessionBeans.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Band implements Serializable {
    private int id;
    private String originPlace;
    private String name;
    private List<Member> members;

    public Band() {
    }

    public Band(int id, String originPlace, String name, List<Member> members) {
        this.id = id;
        this.originPlace = originPlace;
        this.name = name;
        this.members = members;
    }

    public Band(int id, String originPlace, String name) {
        this.id = id;
        this.originPlace = originPlace;
        this.name = name;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Band)) return false;
        Band band = (Band) o;
        return getId() == band.getId() &&
                getOriginPlace().equals(band.getOriginPlace()) &&
                getName().equals(band.getName()) &&
                getMembers().equals(band.getMembers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getOriginPlace(), getName(), getMembers());
    }

    @Override
    public String toString() {
        return "Band{" +
                "id=" + id +
                ", originPlace='" + originPlace + '\'' +
                ", name='" + name + '\'' +
                ", members=" + members +
                '}';
    }
}
