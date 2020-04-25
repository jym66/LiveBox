package com.Service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import com.EncryptBean.BibiliEncryBean;

import java.util.Map;

public interface BlibiliService {

//    @Headers({"channel:bili","device:android","mobi_app:android","platform:android","play_type:0","ptype:0","statistics:{\"appId\":1,\"platform\":3,\"version\":\"5.57.2\",\"abtest\":\"\"}"})
    @GET("xlive/app-room/v1/playUrl/playUrl")
    Call <BibiliEncryBean> getBlibiliRes(@Query("cid") String cid, @QueryMap Map<String, String> paramas);
}
