package br.edu.ifpb.dac.sessionbeans.model;

import br.edu.ifpb.dac.sessionbeans.model.CPF;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Member implements Serializable {
    private int id;
    private String name;
    private LocalDate birthday;
    private CPF cpf = new CPF("");

    public Member() {
    }

    public Member(int id, String name, LocalDate birthday, CPF cpf) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.cpf = cpf;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;
        Member member = (Member) o;
        return getId() == member.getId() &&
                getName().equals(member.getName()) &&
                getBirthday().equals(member.getBirthday()) &&
                getCpf().equals(member.getCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBirthday(), getCpf());
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", cpf=" + cpf +
                '}';
    }
}
