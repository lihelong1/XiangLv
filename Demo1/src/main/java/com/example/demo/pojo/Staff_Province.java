package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="t_staff_province")
public class Staff_Province {

    @Id
    @Column(name = "t_staff_province_id")
    private int t_staff_province_id;

    @Column(name = "t_staff_province_staff_id")
    private int Atb_pvs_id;

    @Column(name = "t_staff_province_province_id")
    private int t_staff_province_province_id;


    
    public int getT_staff_province_id() {
        return t_staff_province_id;
    }

    public void setT_staff_province_id(int t_staff_province_id) {
        this.t_staff_province_id = t_staff_province_id;
    }

    public int getAtb_pvs_id() {
        return Atb_pvs_id;
    }

    public void setAtb_pvs_id(int atb_pvs_id) {
        Atb_pvs_id = atb_pvs_id;
    }

    public int getT_staff_province_province_id() {
        return t_staff_province_province_id;
    }

    public void setT_staff_province_province_id(int t_staff_province_province_id) {
        this.t_staff_province_province_id = t_staff_province_province_id;
    }

    @Override
    public String toString() {
        return "Staff_province{" +
                "t_staff_province_id=" + t_staff_province_id +
                ", Atb_pvs_id=" + Atb_pvs_id +
                ", t_staff_province_province_id=" + t_staff_province_province_id +
                '}';
    }
}
