package com.example.bookingimplementation.apiservice;

import com.example.bookingimplementation.Consts;
import com.example.bookingimplementation.apiservice.request.AuthRequest;
import com.example.bookingimplementation.apiservice.response.AuthResponse;
import com.example.bookingimplementation.apiservice.response.HaltsResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api {

    @POST(Consts.ENDPOINT_LOGIN)
    Call<AuthResponse> login(@Body AuthRequest loginRequest);

    @GET(Consts.ENDPOINT_BUS_STOPS)
    Call<HaltsResponse> halts();
}
