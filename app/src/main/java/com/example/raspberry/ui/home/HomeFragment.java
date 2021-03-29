package com.example.raspberry.ui.home;

import android.app.AlertDialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.raspberry.R;
import com.example.raspberry.model.DeviceBind;
import com.example.raspberry.model.PropertiesLatest;
import com.example.raspberry.model.DeviceInstances;
import com.example.raspberry.model.EquipmentTags;
import com.example.raspberry.ui.HBS.Hbs;
import com.example.raspberry.ui.about_us.About_Us;
import com.example.raspberry.ui.add_one.AddEquipment;
import com.example.raspberry.ui.add_three.AddEquiment3;
import com.example.raspberry.ui.add_two.AddEquiment2;
import com.example.raspberry.ui.controlpanel.ControlPanel;
import com.example.raspberry.ui.equipment.Management;
import com.example.raspberry.ui.feedback.Feedback;
import com.example.raspberry.ui.instructions.Instructions_one;
import com.example.raspberry.ui.instructions.Instructions_three;
import com.example.raspberry.ui.instructions.Instructions_two;
import com.example.raspberry.ui.shimge.Shimge;
import com.example.raspberry.utils.GetDeviceInformation;
import com.example.raspberry.utils.OperatingEquipment;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeFragment extends Fragment implements View.OnClickListener {

    private AlertDialog alert = null;
    private AlertDialog.Builder builder = null;
    private Intent in = null;
    private ConstraintLayout constraintLayout;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        View mode = inflater.inflate(R.layout.list_mode, container, false);

        //设置点击事件
        baseId(root);

//        constraintLayout = root.findViewById(R.id.list_mode);
//        constraintLayout.addView(mode);
//        initData();



//        requestHttp();
//        deviceLabel();
//        deviceDetails();
//        addBind();
//        updataDevice();

        return root;
    }

    //设置点击所需实例
    public void baseId(@NotNull View root){
        ImageView img = root.findViewById(R.id.device_icon1);
        ImageView img2 = root.findViewById(R.id.device_icon2);
        ImageView img3 = root.findViewById(R.id.device_icon3);
        LinearLayout device = root.findViewById(R.id.device_add);

        img.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        device.setOnClickListener(this);
    }

    //所有点击事件
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //回水器
            case R.id.device_icon1:
                in = new Intent(getActivity(), Shimge.class);
                startActivity(in);
                break;
            //水泵
            case R.id.device_icon2:
                in = new Intent(getActivity(), Hbs.class);
                startActivity(in);
                break;
            //电子锁
            case R.id.device_icon3:
                in = new Intent(getActivity(), ControlPanel.class);
                startActivity(in);
                break;
            //添加设备
            case R.id.device_add:
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
                break;
        }
    }

    private void initData(){
        LinearLayout linearLayout = new LinearLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        ImageView image = new ImageView(getContext());
        ImageView image2 = new ImageView(getContext());
        ImageView image3 = new ImageView(getContext());
        TextView textView = new TextView(getContext());
        TextView textView2 = new TextView(getContext());
        image.setImageResource(R.mipmap.dianzisuo);
        image2.setImageResource(R.mipmap.fenxiang);
        image3.setImageResource(R.mipmap.online);
        textView.setText("电子锁");
        textView2.setText("在线");
        linearLayout2.addView(image);
        linearLayout2.addView(image2);
        relativeLayout.addView(image3);
        relativeLayout.addView(textView);
        relativeLayout.addView(textView2);
        linearLayout.addView(linearLayout2, 160, 125);
        linearLayout.addView(relativeLayout,160, 125);
        constraintLayout.addView(linearLayout);
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
        Call<EquipmentTags> call = new GetDeviceInformation().getEquipmentTags(id);
        call.enqueue(new Callback<EquipmentTags>() {
            @Override
            public void onResponse(Call<EquipmentTags> call, Response<EquipmentTags> response) {
                System.out.println("请求成功");
                System.out.println(response.body().getResult());
            }

            @Override
            public void onFailure(Call<EquipmentTags> call, Throwable t) {
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

    public void addBind(){
        String tenantId = "78f214c18228df858925de65dfd2566a";
        Map<String, Object> map = new HashMap<>();
        String[] arr = new String[]{"863808044424747"};
        map.put("userId", "1300619296023646208");
        map.put("assetType", "device");
        map.put("allPermission", true);
        map.put("assetIdList", arr);
        Call<DeviceBind> call = new OperatingEquipment().addDeviceBind(tenantId, map);
        call.enqueue(new Callback<DeviceBind>() {
            @Override
            public void onResponse(Call<DeviceBind> call, Response<DeviceBind> response) {
                System.out.println("请求成功");
                System.out.println(response);
            }

            @Override
            public void onFailure(Call<DeviceBind> call, Throwable t) {
                System.out.println("请求失败");
                System.out.println(t);
            }
        });
    }

    public void updataDevice(){
        String id = "863808044493155";
        Map<String, Object> map = new HashMap<>();
        Map<String, Integer> propertis = new HashMap<>();
        propertis.put("PumpPressureRange", 30);
        Map<String, Object> bool = new HashMap<>();
        bool.put("async", false);

        map.put("messageType", "WRITE_PROPERTY");
        map.put("properties", propertis);    //{"PumpPressureRange": 30}
        map.put("messageId", 63);
        map.put("headers", bool);            //{"async": false}
        Call<DeviceBind> call = new OperatingEquipment().addDeviceBind(id, map);
        call.enqueue(new Callback<DeviceBind>() {
            @Override
            public void onResponse(Call<DeviceBind> call, Response<DeviceBind> response) {
                System.out.println("请求成功");
                System.out.println(response);
            }

            @Override
            public void onFailure(Call<DeviceBind> call, Throwable t) {
                System.out.println("请求失败");
                System.out.println(t);
            }
        });
    }

}