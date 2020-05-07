package com.example.javaaa.entity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public final class CovidResponse {
    public CovidData[] getData() {
        return data;
    }

    @SerializedName("data")
    @Expose
    private CovidData[] data;

    CovidResponse(CovidData[] data) {
        this.data = data;
    }
}
