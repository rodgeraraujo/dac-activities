package br.edu.ifpb.dac.sessionBeans.model;

import java.io.Serializable;

public class CPF implements Serializable {
    private String number;

    public CPF() {
        this("");
    }

    public CPF(String number) {
        this.number = number;
    }

    public String number() {
        // * number: 12345678901
        return this.number;
    }

    public String formatted() {
        // * number formatted: 123.456.789-01
        return this.number.substring(0, 3) + "."
                + this.number.substring(3, 6) + "."
                + this.number.substring(6, 9) + "-"
                + this.number.substring(9, 11);
    }

    public boolean isValid() {
        return this.number.length() == 11;
    }
}
