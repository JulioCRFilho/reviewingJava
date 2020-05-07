package com.example.javaaa.entity.api;

import com.example.javaaa.entity.model.CovidResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface CovidService {
    @GET("report/v1")
    Observable<CovidResponse> covidList();
}
