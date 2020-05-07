package com.example.javaaa.entity.api;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CovidApi {
    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://covid19-brazil-api.now.sh/api/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
