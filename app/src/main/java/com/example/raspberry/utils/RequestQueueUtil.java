package com.example.raspberry.utils;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class RequestQueueUtil {

    private static RequestQueue request;

    public static RequestQueue getRequestQueue(Context context){
        if(request == null){
            synchronized (RequestQueue.class){
                if(request == null){
                    request = Volley.newRequestQueue(context);
                }
            }
        }
        return request;
    }

}
