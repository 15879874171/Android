package com.example.raspberry.ui.home;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.raspberry.R;
import com.example.raspberry.ui.HBS.Hbs;
import com.example.raspberry.ui.add_one.AddEquipment;
import com.example.raspberry.ui.add_three.AddEquiment3;
import com.example.raspberry.ui.add_two.AddEquiment2;
import com.example.raspberry.ui.controlpanel.ControlPanel;
import com.example.raspberry.ui.shimge.Shimge;

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
        LinearLayout device = root.findViewById(R.id.device_two);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        requestHttp();

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
        RequestQueue mque = Volley.newRequestQueue(getContext());
        StringRequest str = new StringRequest("https://www.baidu.com",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("TAG", response);
                    }
                }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.e("TAG", error.getMessage(), error);
                }
        });
    }

}