package com.example.bookingimplementation.apiservice.response;

import androidx.dynamicanimation.animation.SpringAnimation;

import com.example.bookingimplementation.models.Halts;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HaltsResponse {

    @SerializedName("results")
    private List<Halts> halts;
    @SerializedName("status")
    private Integer status;
    @SerializedName("success")
    private Boolean success;

    public List<Halts> getHalts() {
        return halts;
    }

    public void setHalts(List<Halts> halts) {
        this.halts = halts;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
