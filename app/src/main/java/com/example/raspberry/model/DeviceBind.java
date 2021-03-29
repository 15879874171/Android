package com.example.raspberry.model;

import com.google.gson.annotations.SerializedName;

public class DeviceBind {

    /**
     * result : 1
     * status : 200
     * code : success
     */

    @SerializedName("result")
    private Integer result;
    @SerializedName("status")
    private Integer status;
    @SerializedName("code")
    private String code;

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
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
