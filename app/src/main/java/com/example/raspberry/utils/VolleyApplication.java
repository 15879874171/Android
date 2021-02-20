package com.example.raspberry.utils;

import android.app.Application;

import com.android.volley.RequestQueue;

public class VolleyApplication extends Application {

    public static RequestQueue request;

    @Override
    public void onCreate() {
        super.onCreate();
        request = RequestQueueUtil.getRequestQueue(this);
    }
}
