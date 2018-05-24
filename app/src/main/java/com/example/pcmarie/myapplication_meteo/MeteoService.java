package com.example.pcmarie.myapplication_meteo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MeteoService {

    public static final String BASEURL = "https://www.prevision-meteo.ch/services/json/";

    @GET("{ville}")
    Call<Meteo> getVille(@Path("ville") String ville);


}
