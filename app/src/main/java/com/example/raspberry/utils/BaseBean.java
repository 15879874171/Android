package com.example.raspberry.utils;

public class BaseBean<T> {

    //返回状态码
    private int status;

    //返回信息
    private String desc;

    //需要的数据
    private T data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
