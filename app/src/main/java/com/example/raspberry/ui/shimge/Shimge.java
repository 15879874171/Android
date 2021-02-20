package com.example.raspberry.ui.shimge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.raspberry.R;

public class Shimge extends AppCompatActivity implements View.OnClickListener {

    TranslateAnimation tran = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shimge);

        swiperBtn();
    }

    public void swiperBtn(){
        ImageView img = findViewById(R.id.btn_left);
        ImageView img2 = findViewById(R.id.btn_right);

        img.setOnClickListener(this);
        img2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        LinearLayout linear = findViewById(R.id.swiper);
        switch (v.getId()){
            case R.id.btn_left:
                tran = new TranslateAnimation(Animation.ABSOLUTE,0,Animation.ABSOLUTE,-50,
                Animation.ABSOLUTE,0,Animation.ABSOLUTE,0);
                break;
        }
        //设置动画执行时间
        tran.setDuration(500);
        //设置动画重复次数
        tran.setRepeatCount(0);
        //设置动画结束移动不会回弹
        tran.setFillAfter(true);
        tran.setFillEnabled(true);
        //启动动画
        linear.startAnimation(tran);
    }
}