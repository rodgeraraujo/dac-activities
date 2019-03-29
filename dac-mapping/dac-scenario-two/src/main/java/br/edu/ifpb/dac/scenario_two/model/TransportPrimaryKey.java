package br.edu.ifpb.dac.scenario_two.model;

import java.io.Serializable;

/**
 *
 * @author Rodger
 */
public class TransportPrimaryKey implements Serializable {

    private int load_id;
    private int product_id;
    private int ship_id;

    public TransportPrimaryKey() {
    }

    public int getLoad_id() {
        return load_id;
    }

    public void setLoad_id(int load_id) {
        this.load_id = load_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getShip_id() {
        return ship_id;
    }

    public void setShip_id(int ship_id) {
        this.ship_id = ship_id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.load_id;
        hash = 89 * hash + this.product_id;
        hash = 89 * hash + this.ship_id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TransportPrimaryKey other = (TransportPrimaryKey) obj;
        if (this.load_id != other.load_id) {
            return false;
        }
        if (this.product_id != other.product_id) {
            return false;
        }
        if (this.ship_id != other.ship_id) {
            return false;
        }
        return true;
    }

    

   

}
