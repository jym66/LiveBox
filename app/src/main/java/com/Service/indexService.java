package com.Service;




import com.EncryptBean.bilibiliIndex;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;

import retrofit2.http.POST;
import retrofit2.http.Path;

import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface indexService {
    @GET("gapi/rkc/directory/mixList/0_0/{page}")
    Call<ResponseBody> getRes(@Path("page") int pages);
    @GET("api/v1/live")
    Call<ResponseBody>getIndexDate(@QueryMap Map<String, String> paramas);
    @GET("room/v1/room/get_user_recommend")
    Call<ResponseBody> getBlibiliIndex(@Query("page") int page);
    @FormUrlEncoded
    @POST("cgi-bin/pgg_async_fcgi")
    Call<ResponseBody>getEgameIndex(@Query("_=") String time, @Field("param") String param,@Field("app_info") String app);
}
