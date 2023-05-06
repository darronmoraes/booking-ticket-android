package com.example.bookingimplementation.apiservice.request;

import com.google.gson.annotations.SerializedName;

public class AuthRequest {

    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;
    @SerializedName("ip-address")
    private String ipAddress;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
