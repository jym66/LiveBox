package com.Service;

import com.EncryptBean.egameEncryBean;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface egameService {
    @FormUrlEncoded
    @POST("cgi-bin/pgg_async_fcgi")
    Call<egameEncryBean> getRes(@Field("param") String params,@Field("app_info") String app_info);
}
