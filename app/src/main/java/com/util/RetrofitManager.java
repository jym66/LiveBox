package com.util;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {
    private static RetrofitManager retrofitManager;
    private Retrofit mRetrofit;
    public RetrofitManager(String url){
        initRetrofit(url);
    }
    public RetrofitManager(){

    }
    public static synchronized RetrofitManager getInstance(){
        if (retrofitManager == null){
            retrofitManager = new RetrofitManager();
        }
        return retrofitManager;
    }
    private void initRetrofit(String url){
        mRetrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public <T> T crratereq(Class<T> reqServer){
        return mRetrofit.create(reqServer);
    }
}
