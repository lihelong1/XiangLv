package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "t_association_tb")
public class Association_tb {

    @Id
    @Column(name = "atb_id")
    private int atb_id;

    @Column(name = "Atb_pvs_id")
    private int Atb_pvs_id;

    @Column(name = "Atb_bns_id")
    private int Atb_bns_id;

    @Column(name = "Atb_food_id")
    private int Atb_food_id;

    @Column(name = "Atb_tb_type")
    private String Atb_tb_type;


    public int getAtb_id() {
        return atb_id;
    }

    public void setAtb_id(int atb_id) {
        this.atb_id = atb_id;
    }

    public int getAtb_pvs_id() {
        return Atb_pvs_id;
    }

    public void setAtb_pvs_id(int atb_pvs_id) {
        Atb_pvs_id = atb_pvs_id;
    }

    public int getAtb_bns_id() {
        return Atb_bns_id;
    }

    public void setAtb_bns_id(int atb_bns_id) {
        Atb_bns_id = atb_bns_id;
    }

    public int getAtb_food_id() {
        return Atb_food_id;
    }

    public void setAtb_food_id(int atb_food_id) {
        Atb_food_id = atb_food_id;
    }

    public String getAtb_tb_type() {
        return Atb_tb_type;
    }

    public void setAtb_tb_type(String atb_tb_type) {
        Atb_tb_type = atb_tb_type;
    }

    @Override
    public String toString() {
        return "Association_tb{" +
                "atb_id=" + atb_id +
                ", Atb_pvs_id=" + Atb_pvs_id +
                ", Atb_bns_id=" + Atb_bns_id +
                ", Atb_food_id=" + Atb_food_id +
                ", Atb_tb_type='" + Atb_tb_type + '\'' +
                '}';
    }
}
