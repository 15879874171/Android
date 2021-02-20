package com.example.raspberry.ui.notifications;

import android.Manifest;
import android.app.AlertDialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import android.widget.Toast;

import androidx.annotation.NonNull;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import androidx.lifecycle.ViewModelProvider;

import com.example.raspberry.R;
import com.example.raspberry.ui.about_us.About_Us;
import com.example.raspberry.ui.add_one.AddEquipment;
import com.example.raspberry.ui.add_three.AddEquiment3;
import com.example.raspberry.ui.add_two.AddEquiment2;
import com.example.raspberry.ui.equipment.Management;
import com.example.raspberry.ui.feedback.Feedback;
import com.example.raspberry.ui.instructions.Instructions_one;
import com.example.raspberry.ui.instructions.Instructions_three;
import com.example.raspberry.ui.instructions.Instructions_two;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import static android.content.ContentValues.TAG;

public class NotificationsFragment extends Fragment implements View.OnClickListener {

    private AlertDialog alert = null;
    private AlertDialog.Builder builder = null;
    private Intent in = null;

    //电话号码
    String tel = "4008883868";

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);

        ImageView icon = root.findViewById(R.id.title_icon);

//        Picasso.get().load(R.mipmap.ic_launcher_round).into(icon);

        //设置点击事件
        baseId(root);

        //安卓6.0以后需要动态获取权限
        int permission = ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE);
        //判断有没有权限
        if(permission != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.CALL_PHONE},0);
        }

        return root;
    }

    public void baseId(@NotNull View root){
        ConstraintLayout cons4 = root.findViewById(R.id.equipment);
        ConstraintLayout cons = root.findViewById(R.id.instructions);
        ConstraintLayout cons2 = root.findViewById(R.id.feedback);
        ConstraintLayout cons3 = root.findViewById(R.id.about_us);
        ConstraintLayout cons5 = root.findViewById(R.id.phone);

        cons.setOnClickListener(this);
        cons2.setOnClickListener(this);
        cons3.setOnClickListener(this);
        cons4.setOnClickListener(this);
        cons5.setOnClickListener(this);
    }

    //所有点击事件
    @Override
    public void onClick(@NotNull View v) {
        switch (v.getId()){
            //设备共享管理
            case R.id.equipment:
                in = null;
                in = new Intent(getActivity(), Management.class);
                startActivity(in);
                break;
            //使用说明
            case R.id.instructions:
                final String[] str = new String[]{"回水器","新界水泵","智能锁"};
                in = null;
                alert = null;
                builder = new AlertDialog.Builder(getActivity());
                alert= builder.setTitle("请选择类型:")
                        .setItems(str, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                switch (str[which]){
                                    case "回水器":
                                        in = new Intent(getActivity(), Instructions_one.class);
                                        break;
                                    case "新界水泵":
                                        in = new Intent(getActivity(), Instructions_two.class);
                                        break;
                                    case "智能锁":
                                        in = new Intent(getActivity(), Instructions_three.class);
                                        break;
                                }
                                startActivity(in);
                            }
                        }).create();
                alert.show();
                break;
            //意见反馈
            case R.id.feedback:
                in = null;
                in = new Intent(getActivity(), Feedback.class);
                startActivity(in);
                break;
            //关于我们
            case R.id.about_us:
                in = null;
                in = new Intent(getActivity(), About_Us.class);
                startActivity(in);
                break;
            //售后热线
            case R.id.phone:
                in = null;
                alert = null;
                builder = new AlertDialog.Builder(getActivity());
                alert = builder.setTitle("拨打电话")
                        .setMessage("确定要拨打售后热线：4008883868？")
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getActivity(), "已取消拨打", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("确定", (dialog, which) -> {
                            in = new Intent();
                            //设置拨打电话的动作
                            in.setAction(Intent.ACTION_CALL);
                            //设置拨打电话号码
                            in.setData(Uri.parse("tel:" + tel));
                            startActivity(in);
                        }).create();
                alert.show();
                break;
        }

    }

    //处理授权申请回调
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        System.out.println("进入授权");
        switch (requestCode){
            case 0:
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(getActivity(), "拨打电话授权成功", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), "拨打电话授权失败", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    //使用圆形图片方法Picasso
//    public void CircularImage(View root){
//
//        ImageView icon = root.findViewById(R.id.title_icon);
//
//        Picasso.get().load(R.mipmap.ic_launcher_round).transform(new Transformation() {
//            @Override
//            public Bitmap transform(Bitmap source) {
//                source = create(source);
//                source.recycle();
//                return source;
//            }
//
//            @Override
//            public String key() {
//                Log.d(TAG, "key() called");
//                return "key";
//            }
//        }).into(icon);
//
//    }

    //圆形图片
    public static Bitmap create(@NotNull Bitmap source){
        int len = source.getWidth() < source.getHeight() ? source.getWidth() : source.getHeight();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap tar = Bitmap.createBitmap(len, len, Bitmap.Config.ARGB_8888);
        Canvas can = new Canvas(tar);
        can.drawCircle(len / 2, len / 2, len / 2,paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        can.drawBitmap(source, 0 , 0, paint);
        return tar;
    }
}