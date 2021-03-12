package com.example.raspberry.utils;

import com.example.raspberry.model.PropertiesLatest;
import com.example.raspberry.model.DeviceInstances;
import com.example.raspberry.model.EquipmentLabel;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GetDeviceInformation {

    private PersonalProtocol person;
    private Retrofit myRetro = new Retrofit.Builder().baseUrl(person.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
            .build();

    //获取首页设备列表
    public Call<DeviceInstances> getDeviceInstances(){
        person = myRetro.create(PersonalProtocol.class);
        Call<DeviceInstances> call = person.getDeviceInstance();
        return call;
    }

    //获取设备标签
    public Call<EquipmentLabel> getEquipmentLabel(String deviceId){
        person = myRetro.create(PersonalProtocol.class);
        Call<EquipmentLabel> call = person.getEquipmentLabel(deviceId);
        return call;
    }

    //获取nb设备详情数据
    public Call<PropertiesLatest> getPropertiesLatest(String id){
        person = myRetro.create(PersonalProtocol.class);
        Call<PropertiesLatest> call = person.getPropertiesLatest(id);
        return call;
    }

}
