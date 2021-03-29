package com.example.raspberry.utils;

import com.example.raspberry.model.PropertiesLatest;
import com.example.raspberry.model.DeviceInstances;
import com.example.raspberry.model.EquipmentTags;
import com.example.raspberry.model.PropertiesUnit;

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
    public Call<EquipmentTags> getEquipmentTags(String deviceId){
        person = myRetro.create(PersonalProtocol.class);
        Call<EquipmentTags> call = person.getEquipmentTags(deviceId);
        return call;
    }

    //获取nb设备详情数据
    public Call<PropertiesLatest> getPropertiesLatest(String id){
        person = myRetro.create(PersonalProtocol.class);
        Call<PropertiesLatest> call = person.getPropertiesLatest(id);
        return call;
    }

    //获取设备属性单位
    public Call<PropertiesUnit> getPropertiesUnit(String id){
        person = myRetro.create(PersonalProtocol.class);
        Call<PropertiesUnit> call = person.getPropertiesUnit(id);
        return call;
    }

}
