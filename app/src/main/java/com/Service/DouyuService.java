package com.Service;

import com.EncryptBean.DouyuEncryptBean;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface DouyuService {
//    @Headers("aid:androidhd1")
//    @GET("lapi/live/appGetPlayer/stream/{roomid}")
//    Call<DouyuEncryptBean> getCall(@Header("auth") String auth, @Header("time") Long time, @Header("User-Device") String UserDevice, @Path("roomid") String roomid, @Query("cdn") String cdn, @Query("client_sys") String client_sys, @Query("cptl") String cptl, @Query("csign") String csign, @Query("rate") String rate, @Query("token") String token, @Query("txdw") String txdw);
    @Headers("aid:androidhd1")
    @GET("lapi/live/appGetPlayer/stream/{roomid}")
    Call<DouyuEncryptBean> getDouyuRes(@Header("auth") String auth, @Header("time") Long time, @Header("User-Device") String UserDevice, @Path("roomid") String roomid, @QueryMap Map<String, String> paramas);

}