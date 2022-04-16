package com.m2ke.covidstat;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CovidService {
    @Headers({
            "X-RapidAPI-Host: covid-193.p.rapidapi.com",
            "X-RapidAPI-Key: 9c54ddcd44msh84c70965ac6612bp16a4b0jsn04b71e1cab52"
    })
    @GET("history")
    Call<CovidAPI> covidInfo(@Query("country") String country, @Query("day") String day);
}
