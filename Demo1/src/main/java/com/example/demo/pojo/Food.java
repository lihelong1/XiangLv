package com.example.demo.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_food")
public class Food {

    @Id
    @Column(name = "food_ID")
    private String food_id;

    @Column(name = "food_name")
    private String food_name;

    @Column(name = "food_brief_intro")
    private String food_brief_intro;

    @Column(name = "food_detailed_intro")
    private String food_detailed_intro;

    @Column(name = "food_price")
    private String food_price;

    @Column(name = "food_discount")
    private String food_discount;

    @Column(name = "food_score")
    private String food_score;

    @Column(name = "food_click")
    private String food_click;

    @Column(name = "food_category")
    private String food_category;

    @Column(name = "food_image_url")
    private String food_image_url;

    @Column(name = "food_state")
    private String food_state;

    public String getFood_id() {
        return food_id;
    }

    public void setFood_id(String food_id) {
        this.food_id = food_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_brief_intro() {
        return food_brief_intro;
    }

    public void setFood_brief_intro(String food_brief_intro) {
        this.food_brief_intro = food_brief_intro;
    }

    public String getFood_detailed_intro() {
        return food_detailed_intro;
    }

    public void setFood_detailed_intro(String food_detailed_intro) {
        this.food_detailed_intro = food_detailed_intro;
    }

    public String getFood_price() {
        return food_price;
    }

    public void setFood_price(String food_price) {
        this.food_price = food_price;
    }

    public String getFood_discount() {
        return food_discount;
    }

    public void setFood_discount(String food_discount) {
        this.food_discount = food_discount;
    }

    public String getFood_score() {
        return food_score;
    }

    public void setFood_score(String food_score) {
        this.food_score = food_score;
    }

    public String getFood_click() {
        return food_click;
    }

    public void setFood_click(String food_click) {
        this.food_click = food_click;
    }

    public String getFood_category() {
        return food_category;
    }

    public void setFood_category(String food_category) {
        this.food_category = food_category;
    }

    public String getFood_image_url() {
        return food_image_url;
    }

    public void setFood_image_url(String food_image_url) {
        this.food_image_url = food_image_url;
    }

    public String getFood_state() {
        return food_state;
    }

    public void setFood_state(String food_state) {
        this.food_state = food_state;
    }
}
