package com.androidtutorialpoint.googlemapsdistancecalculator;

import com.androidtutorialpoint.googlemapsdistancecalculator.POJO.Example;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by AhMeD on 17/10/16.
 */
public interface RetrofitMaps {
    @GET("api/directions/json?key=AIzaSyC22GfkHu9FdgT9SwdCWMwKX1a4aohGifM&language=ar")
    Call<Example> getDistanceDuration(@Query("origin") String origin, @Query("destination") String destination, @Query("mode") String mode);
}
