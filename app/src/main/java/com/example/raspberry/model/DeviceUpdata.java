package com.example.raspberry.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DeviceUpdata {

    /**
     * result : []
     * status : 200
     * code : success
     */

    @SerializedName("result")
    private List<?> result;
    @SerializedName("status")
    private Integer status;
    @SerializedName("code")
    private String code;

    public List<?> getResult() {
        return result;
    }

    public void setResult(List<?> result) {
        this.result = result;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
