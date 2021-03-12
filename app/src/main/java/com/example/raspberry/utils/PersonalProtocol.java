package com.example.raspberry.utils;

import com.example.raspberry.model.PropertiesLatest;
import com.example.raspberry.model.DeviceInstances;
import com.example.raspberry.model.EquipmentLabel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface PersonalProtocol {
    // 请求头
    String baseUrl = "https://hz.shimge.com/jetlinks/";

    //获取设备列表
    @Headers("X-Access-Token: c06822ab8402d357ecdfe6162bc3d969")
    @GET("device-instance/_query")
    Call<DeviceInstances> getDeviceInstance();

    //获取设备标签
    @Headers("X-Access-Token: c06822ab8402d357ecdfe6162bc3d969")
    @GET("device/instance/{deviceId}/tags")
    Call<EquipmentLabel> getEquipmentLabel(@Path("deviceId") String deviceId);

    //获取设备详情数据
    @Headers("X-Access-Token: c06822ab8402d357ecdfe6162bc3d969")
    @GET("api/v1/device/{id}/properties/_latest")
    Call<PropertiesLatest> getPropertiesLatest(@Path("id") String id);
}
