package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "t_score")
public class Score {
    @Id
    @Column(name = "score_ID")
    private int score_ID;

    @Column(name = "Score_tourist_ID")
    private int Score_tourist_ID;

    @Column(name = "Score_cmt_ID")
    private int Score_cmt_ID;

    @Column(name = "Score_cmt_type")
    private String Score_cmt_type;

    @Column(name = "Score_Sev_score")
    private float Score_Sev_score;

    @Column(name = "Score_cmt_score")
    private float Score_cmt_score;

    @Column(name = "score_time")
    private Date score_time;


    public int getScore_ID() {
        return score_ID;
    }

    public void setScore_ID(int score_ID) {
        this.score_ID = score_ID;
    }

    public int getScore_tourist_ID() {
        return Score_tourist_ID;
    }

    public void setScore_tourist_ID(int score_tourist_ID) {
        Score_tourist_ID = score_tourist_ID;
    }

    public int getScore_cmt_ID() {
        return Score_cmt_ID;
    }

    public void setScore_cmt_ID(int score_cmt_ID) {
        Score_cmt_ID = score_cmt_ID;
    }

    public String getScore_cmt_type() {
        return Score_cmt_type;
    }

    public void setScore_cmt_type(String score_cmt_type) {
        Score_cmt_type = score_cmt_type;
    }

    public float getScore_Sev_score() {
        return Score_Sev_score;
    }

    public void setScore_Sev_score(float score_Sev_score) {
        Score_Sev_score = score_Sev_score;
    }

    public float getScore_cmt_score() {
        return Score_cmt_score;
    }

    public void setScore_cmt_score(float score_cmt_score) {
        Score_cmt_score = score_cmt_score;
    }

    public Date getScore_time() {
        return score_time;
    }

    public void setScore_time(Date score_time) {
        this.score_time = score_time;
    }

    @Override
    public String toString() {
        return "Score{" +
                "score_ID=" + score_ID +
                ", Score_tourist_ID=" + Score_tourist_ID +
                ", Score_cmt_ID=" + Score_cmt_ID +
                ", Score_cmt_type='" + Score_cmt_type + '\'' +
                ", Score_Sev_score=" + Score_Sev_score +
                ", Score_cmt_score=" + Score_cmt_score +
                ", score_time=" + score_time +
                '}';
    }
}
