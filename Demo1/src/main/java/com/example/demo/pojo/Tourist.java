package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "t_tourist")
public class Tourist {

    @Id
    @Column(name = "trs_ID")
    private String Trs_ID;

    @Column(name = "trs_name")
    private String Trs_name;

    @Column(name = "trs_sexy")
    private String Trs_sexy;

    @Column(name = "trs_born_time")
    private Date Trs_born_time;

    @Column(name = "trs_mobile")
    private String Trs_mobile;

    @Column(name = "trs_checkstate")
    private String Trs_checkstate;

    @Column(name = "trs_state")
    private String Trs_state;

    @Column(name = "trs_idcard")
    private String Trs_idcard;

    @Column(name = "trs_create_time")
    private Date Trs_create_time;

    @Column(name = "trs_nickname")
    private String Trs_nickname;

    @Column(name = "trs_uname")
    private String Trs_uname;

    @Column(name = "trs_password")
    private String Trs_password;

    @Column(name = "trs_qq")
    private String Trs_qq;

    @Column(name = "trs_wechat")
    private String Trs_wechat;

    public String getTrs_ID() {
        return Trs_ID;
    }

    public void setTrs_ID(String trs_ID) {
        this.Trs_ID = trs_ID;
    }

    public String getTrs_name() {
        return Trs_name;
    }

    public void setTrs_name(String trs_name) {
        this.Trs_name = trs_name;
    }

    public String getTrs_sexy() {
        return Trs_sexy;
    }

    public void setTrs_sexy(String trs_sexy) {
        this.Trs_sexy = trs_sexy;
    }

    public Date getTrs_born_time() {
        return Trs_born_time;
    }

    public void setTrs_born_time(Date trs_born_time) {
        this.Trs_born_time = trs_born_time;
    }

    public String getTrs_mobile() {
        return Trs_mobile;
    }

    public void setTrs_mobile(String trs_mobile) {
        this.Trs_mobile = trs_mobile;
    }

    public String getTrs_checkstate() {
        return Trs_checkstate;
    }

    public void setTrs_checkstate(String trs_checkstate) {
        this.Trs_checkstate = trs_checkstate;
    }

    public String getTrs_state() {
        return Trs_state;
    }

    public void setTrs_state(String trs_state) {
        this.Trs_state = trs_state;
    }

    public String getTrs_idcard() {
        return Trs_idcard;
    }

    public void setTrs_idcard(String trs_idcard) {
        this.Trs_idcard = trs_idcard;
    }

    public Date getTrs_create_time() {
        return Trs_create_time;
    }

    public void setTrs_create_time(Date trs_create_time) {
        this.Trs_create_time = trs_create_time;
    }

    public String getTrs_nickname() {
        return Trs_nickname;
    }

    public void setTrs_nickname(String trs_nickname) {
        this.Trs_nickname = trs_nickname;
    }

    public String getTrs_uname() {
        return Trs_uname;
    }

    public void setTrs_uname(String trs_uname) {
        this.Trs_uname = trs_uname;
    }

    public String getTrs_password() {
        return Trs_password;
    }

    public void setTrs_password(String trs_password) {
        this.Trs_password = trs_password;
    }

    public String getTrs_qq() {
        return Trs_qq;
    }

    public void setTrs_qq(String trs_qq) {
        this.Trs_qq = trs_qq;
    }

    public String getTrs_wechat() {
        return Trs_wechat;
    }

    public void setTrs_wechat(String trs_wechat) {
        this.Trs_wechat = trs_wechat;
    }
}
