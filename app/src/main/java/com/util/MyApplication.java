package com.util;

import android.app.Application;
import android.content.Context;

import com.hookpms.ServiceManagerWraper;


public class MyApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }
    public static Context getContext(){
        return context;
    }
}
