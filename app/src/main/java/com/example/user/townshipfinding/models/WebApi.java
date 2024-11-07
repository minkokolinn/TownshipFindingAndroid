package com.example.user.townshipfinding.models;

import com.example.user.townshipfinding.models.City;

import java.security.Key;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface WebApi {
    @POST("http://zln.webstarterz.com/tztest/locationapi.php")
    Call<City> getCity(@Query("session_token") String key);
}
