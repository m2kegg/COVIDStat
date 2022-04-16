package com.m2ke.covidstat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://covid-193.p.rapidapi.com/")
                .build();
        CovidService covidService = retrofit.create(CovidService.class);
        Call<CovidAPI> call = covidService.covidInfo("usa", "2020-06-02");
        call.enqueue(new Callback<CovidAPI>() {
            @Override
            public void onResponse(Call<CovidAPI> call, Response<CovidAPI> response) {
                CovidAPI data = response.body();
                List<com.m2ke.covidstat.Response> responses = data.getResponse();
                StringBuilder stringBuilder = new StringBuilder();
                for (com.m2ke.covidstat.Response resp:
                     responses) {
                    stringBuilder.append(resp.toString() + "\n");
                }
                Log.d("RES", stringBuilder.toString());
            }

            @Override
            public void onFailure(Call<CovidAPI> call, Throwable t) {

            }
        });
    }
}