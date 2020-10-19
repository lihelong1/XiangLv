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
    @Column(name = "tourist_ID")
    private String Tourist_ID;

    @Column(name = "tourist_name")
    private String Tourist_name;

    @Column(name = "tourist_sexy")
    private String Tourist_sexy;

    @Column(name = "tourist_born_time")
    private Date Tourist_born_time;

    @Column(name = "tourist_mobile")
    private String Tourist_mobile;

    @Column(name = "tourist_checkstate")
    private String Tourist_checkstate;

    @Column(name = "tourist_state")
    private String Tourist_state;

    @Column(name = "tourist_idcard")
    private String Tourist_idcard;

    @Column(name = "tourist_create_time")
    private Date Tourist_create_time;

    @Column(name = "tourist_nickname")
    private String Tourist_nickname;

    @Column(name = "tourist_uname")
    private String Tourist_uname;

    @Column(name = "tourist_password")
    private String Tourist_password;

    @Column(name = "tourist_qq")
    private String Tourist_qq;

    @Column(name = "tourist_wechat")
    private String Tourist_wechat;

    public String getTourist_ID() {
        return Tourist_ID;
    }

    public void setTourist_ID(String tourist_ID) {
        Tourist_ID = tourist_ID;
    }

    public String getTourist_name() {
        return Tourist_name;
    }

    public void setTourist_name(String tourist_name) {
        Tourist_name = tourist_name;
    }

    public String getTourist_sexy() {
        return Tourist_sexy;
    }

    public void setTourist_sexy(String tourist_sexy) {
        Tourist_sexy = tourist_sexy;
    }

    public Date getTourist_born_time() {
        return Tourist_born_time;
    }

    public void setTourist_born_time(Date tourist_born_time) {
        Tourist_born_time = tourist_born_time;
    }

    public String getTourist_mobile() {
        return Tourist_mobile;
    }

    public void setTourist_mobile(String tourist_mobile) {
        Tourist_mobile = tourist_mobile;
    }

    public String getTourist_checkstate() {
        return Tourist_checkstate;
    }

    public void setTourist_checkstate(String tourist_checkstate) {
        Tourist_checkstate = tourist_checkstate;
    }

    public String getTourist_state() {
        return Tourist_state;
    }

    public void setTourist_state(String tourist_state) {
        Tourist_state = tourist_state;
    }

    public String getTourist_idcard() {
        return Tourist_idcard;
    }

    public void setTourist_idcard(String tourist_idcard) {
        Tourist_idcard = tourist_idcard;
    }

    public Date getTourist_create_time() {
        return Tourist_create_time;
    }

    public void setTourist_create_time(Date tourist_create_time) {
        Tourist_create_time = tourist_create_time;
    }

    public String getTourist_nickname() {
        return Tourist_nickname;
    }

    public void setTourist_nickname(String tourist_nickname) {
        Tourist_nickname = tourist_nickname;
    }

    public String getTourist_uname() {
        return Tourist_uname;
    }

    public void setTourist_uname(String tourist_uname) {
        Tourist_uname = tourist_uname;
    }

    public String getTourist_password() {
        return Tourist_password;
    }

    public void setTourist_password(String tourist_password) {
        Tourist_password = tourist_password;
    }

    public String getTourist_qq() {
        return Tourist_qq;
    }

    public void setTourist_qq(String tourist_qq) {
        Tourist_qq = tourist_qq;
    }

    public String getTourist_wechat() {
        return Tourist_wechat;
    }

    public void setTourist_wechat(String tourist_wechat) {
        Tourist_wechat = tourist_wechat;
    }
}



