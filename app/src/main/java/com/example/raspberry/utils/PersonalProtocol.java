package com.example.raspberry.utils;

import com.example.raspberry.model.DeviceBind;
import com.example.raspberry.model.DeviceUpdata;
import com.example.raspberry.model.PropertiesLatest;
import com.example.raspberry.model.DeviceInstances;
import com.example.raspberry.model.EquipmentTags;
import com.example.raspberry.model.PropertiesUnit;

import java.lang.reflect.Array;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
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
    Call<EquipmentTags> getEquipmentTags(@Path("deviceId") String deviceId);

    //获取设备详情数据
    @Headers("X-Access-Token: c06822ab8402d357ecdfe6162bc3d969")
    @GET("api/v1/device/{id}/properties/_latest")
    Call<PropertiesLatest> getPropertiesLatest(@Path("id") String id);

    //获取设备详情数据
    @Headers("X-Access-Token: c06822ab8402d357ecdfe6162bc3d969")
    @GET("device/instance/{id}/detail")
    Call<PropertiesUnit> getPropertiesUnit(@Path("id") String id);


//    {"id":"1300619296023646208","name":"ID没啥用","username":"ohN7N4jatMxekMBwydUk4Iho9CH8","status":1,"createTime":1598926779125}

//    78f214c18228df858925de65dfd2566a
    //设备绑定
    @Headers("X-Access-Token: c06822ab8402d357ecdfe6162bc3d969")
    @POST("tenant/{tenantId}/assets/_bind")
    @FormUrlEncoded
    Call<DeviceBind> addDeviceBind(@Path("tenantId") String tenantId, @FieldMap Map<String, Object> map);

    //设备解绑
    @Headers("X-Access-Token: c06822ab8402d357ecdfe6162bc3d969")
    @POST("tenant/{tenantId}/assets/_unbind")
    @FormUrlEncoded
    Call<DeviceBind> DeviceUnbind(@Path("tenantId") String tenantId, @FieldMap Map<String, Object> map);

    //删除设备标签
    @Headers("X-Access-Token: c06822ab8402d357ecdfe6162bc3d969")
    @DELETE("device/instance/{id}/tag/{tagsId}")
    Call<DeviceBind> DeleteTags(@Path("id") String id, @Path("tagsId") String tagsId);

    //nb设备功能修改
    @Headers("X-Access-Token: c06822ab8402d357ecdfe6162bc3d969")
    @POST("device/instance/{id}/message")
    @FormUrlEncoded
    Call<DeviceUpdata> updataDevice(@Path("id") String id, @FieldMap Map<String, Object> map);

}
