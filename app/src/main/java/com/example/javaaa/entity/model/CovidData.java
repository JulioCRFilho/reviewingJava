package com.example.javaaa.entity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CovidData {
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getSuspects() {
        return suspects;
    }

    public void setSuspects(int suspects) {
        this.suspects = suspects;
    }

    public int getRefuses() {
        return refuses;
    }

    public void setRefuses(int refuses) {
        this.refuses = refuses;
    }

    public boolean isBroadcast() {
        return broadcast;
    }

    public void setBroadcast(boolean broadcast) {
        this.broadcast = broadcast;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @SerializedName("uid")
    @Expose
    private int uid;
    @SerializedName("uf")
    @Expose
    private String uf;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("cases")
    @Expose
    private int cases;
    @SerializedName("deaths")
    @Expose
    private int deaths;
    @SerializedName("suspects")
    @Expose
    private int suspects;
    @SerializedName("refuses")
    @Expose
    private int refuses;
    @SerializedName("broadcast")
    @Expose
    private boolean broadcast;
    @SerializedName("comments")
    @Expose
    private String comments;
    @SerializedName("datetime")
    @Expose
    private String datetime;

    CovidData(int uid, String uf, String state, int cases, int deaths, int suspects, int refuses, boolean broadcast, String comments, String datetime) {
        this.uid = uid;
        this.uf = uf;
        this.state = state;
        this.cases = cases;
        this.deaths = deaths;
        this.suspects = suspects;
        this.refuses = refuses;
        this.broadcast = broadcast;
        this.comments = comments;
        this.datetime = datetime;
    }
}