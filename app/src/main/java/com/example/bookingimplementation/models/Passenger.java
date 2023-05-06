package com.example.bookingimplementation.models;

import com.google.gson.annotations.SerializedName;

public class Passenger {

    @SerializedName("email")
    private String email;
    @SerializedName("token")
    private String token;
    @SerializedName("userId")
    private Integer userId;

    public Passenger(String email, String token, Integer userId) {
        this.email = email;
        this.token = token;
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
