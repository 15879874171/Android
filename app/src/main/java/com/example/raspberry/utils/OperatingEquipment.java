package com.example.raspberry.utils;

import com.example.raspberry.model.DeviceBind;
import com.example.raspberry.model.DeviceInstances;

import java.lang.reflect.Array;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class OperatingEquipment {
    private PersonalProtocol person;
    private Retrofit myRetro = new Retrofit.Builder().baseUrl(person.baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    //设备绑定
    public Call<DeviceBind> addDeviceBind(String tenantId, Map<String, Object> map){
        person = myRetro.create(PersonalProtocol.class);
        Call<DeviceBind> call = person.addDeviceBind(tenantId, map);
        return call;
    }

    //设备解除绑定
    public Call<DeviceBind> DeviceUnbind(String tenantId, Map<String, Object> map){
        person = myRetro.create(PersonalProtocol.class);
        Call<DeviceBind> call = person.DeviceUnbind(tenantId, map);
        return call;
    }

    //nb设备功能修改
    public Call<DeviceBind> updataDevice(String id, Map<String, Object> map){
        person = myRetro.create(PersonalProtocol.class);
        Call<DeviceBind> call = person.DeviceUnbind(id, map);
        return call;
    }

}
