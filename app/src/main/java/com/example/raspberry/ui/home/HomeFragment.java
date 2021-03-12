package com.example.raspberry.ui.home;

import android.app.AlertDialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.raspberry.R;
import com.example.raspberry.model.PropertiesLatest;
import com.example.raspberry.model.DeviceInstances;
import com.example.raspberry.model.EquipmentLabel;
import com.example.raspberry.ui.HBS.Hbs;
import com.example.raspberry.ui.add_one.AddEquipment;
import com.example.raspberry.ui.add_three.AddEquiment3;
import com.example.raspberry.ui.add_two.AddEquiment2;
import com.example.raspberry.ui.controlpanel.ControlPanel;
import com.example.raspberry.ui.shimge.Shimge;
import com.example.raspberry.utils.GetDeviceInformation;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeFragment extends Fragment {

    private AlertDialog alert = null;
    private AlertDialog.Builder builder = null;
    private Intent in = null;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        ImageView img = root.findViewById(R.id.device_icon1);
        ImageView img2 = root.findViewById(R.id.device_icon2);
        ImageView img3 = root.findViewById(R.id.device_icon3);
        LinearLayout device = root.findViewById(R.id.device_add);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

//        requestHttp();
//        deviceLabel();
        deviceDetails();
        //点击图片跳转页面
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(), ControlPanel.class);
                startActivity(it);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(), Hbs.class);
                startActivity(it);
            }
        });

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(), Shimge.class);
                startActivity(it);
            }
        });

        //点击添加设备
        device.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] str = new String[]{"回水器","新界水泵","智能锁"};
                builder = new AlertDialog.Builder(getActivity());
                alert = builder.setIcon(R.mipmap.ic_launcher)
                        .setTitle("请选择要添加的产品类型")
                        .setItems(str, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                switch (str[which]){
                                    case "回水器":
                                        in = new Intent(getActivity(), AddEquipment.class);
                                        break;
                                    case "新界水泵":
                                        in = new Intent(getActivity(), AddEquiment2.class);
                                        break;
                                    case "智能锁":
                                        in = new Intent(getActivity(), AddEquiment3.class);
                                        break;
                                }
                                startActivity(in);
                            }
                        }).create();
                alert.show();
            }
        });

        return root;
    }

    public void requestHttp(){
        Call<DeviceInstances> call = new GetDeviceInformation().getDeviceInstances();
        call.enqueue(new Callback<DeviceInstances>() {
            @Override
            public void onResponse(Call<DeviceInstances> call, Response<DeviceInstances> response) {
                System.out.println("请求内容");
                System.out.println(response.body().getResult().getTotal());
                List<DeviceInstances.Result.Data> arr = response.body().getResult().getData();
                for (int i = 0; i < arr.size(); i++) {
                    System.out.println(arr.get(i).toString());
                }
            }

            @Override
            public void onFailure(Call<DeviceInstances> call, Throwable t) {
                System.out.println("请求失败");
                System.out.println(t);
            }
        });
    }

    public void deviceLabel(){
        String id = "863808044493155";
        Call<EquipmentLabel> call = new GetDeviceInformation().getEquipmentLabel(id);
        call.enqueue(new Callback<EquipmentLabel>() {
            @Override
            public void onResponse(Call<EquipmentLabel> call, Response<EquipmentLabel> response) {
                System.out.println("请求成功");
                System.out.println(response.body().getResult());
            }

            @Override
            public void onFailure(Call<EquipmentLabel> call, Throwable t) {
                System.out.println("请求失败");
                System.out.println(t);
            }
        });
    }

    public void deviceDetails(){
        String id = "863808044493155";
        Call<PropertiesLatest> call = new GetDeviceInformation().getPropertiesLatest(id);
        call.enqueue(new Callback<PropertiesLatest>() {
            @Override
            public void onResponse(Call<PropertiesLatest> call, Response<PropertiesLatest> response) {
                System.out.println("请求成功");
                System.out.println(response.body().getResult());
            }

            @Override
            public void onFailure(Call<PropertiesLatest> call, Throwable t) {
                System.out.println("请求失败");
                System.out.println(t);
            }
        });
    }
}