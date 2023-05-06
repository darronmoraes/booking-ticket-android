package com.example.bookingimplementation.apiservice.response;

import com.example.bookingimplementation.models.Passenger;
import com.google.gson.annotations.SerializedName;

public class AuthResponse {

    @SerializedName("message")
    private String message;
    @SerializedName("status")
    private String status;
    @SerializedName("user")
    private Passenger user;

    public AuthResponse(String message, String status, Passenger user) {
        this.message = message;
        this.status = status;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Passenger getUser() {
        return user;
    }

    public void setUser(Passenger user) {
        this.user = user;
    }
}
