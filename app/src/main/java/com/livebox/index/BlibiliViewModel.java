package com.livebox.index;


import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.EncryptBean.BibiliEncryBean;
import com.Service.BlibiliService;
import com.media.JZMediaExo;
import com.media.VideoPlayer;
import com.util.BaseUrl;
import com.util.MyApplication;
import com.util.RetrofitManager;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import com.media.DataSource;
public class BlibiliViewModel {
    private VideoPlayer videoPlayer;
    private LinkedHashMap Urlmap = new LinkedHashMap();
    private LinkedHashMap CdnMap = new LinkedHashMap();
    private DataSource dataSource;
    public BlibiliViewModel(VideoPlayer videoPlayer){
        this.videoPlayer = videoPlayer;
        dataSource = DataSource.getInstance(MyApplication.getContext());
    }
    public void GetResponse(String cid,String qn,int state){
        if (qn.equals("null")) {
            qn = "4";
        }
        HashMap<String,String> params =new HashMap<>();
        params.put("appkey","1d8b6e7d45233436");
        params.put("build","5431000");
        params.put("device","android");
        params.put("mobi_app","android");
        params.put("platform","android");
        params.put("ts", String.valueOf(System.currentTimeMillis()/1000));
        params.put("qn", qn);
//        Log.e("QN",qn );
        RetrofitManager retrofitManager = new RetrofitManager(BaseUrl.BiliBliBaseUrl);
        Call<BibiliEncryBean> call = retrofitManager.crratereq(BlibiliService.class).getBlibiliRes(cid, params);
        call.enqueue(new Callback<BibiliEncryBean>() {
            @Override
            public void onResponse(Call<BibiliEncryBean> call, Response<BibiliEncryBean> response) {
                List<BibiliEncryBean.DataBean.QualityDescriptionBean> rate =  response.body().getData().getQuality_description();
                for (BibiliEncryBean.DataBean.QualityDescriptionBean data: rate) {
                    Urlmap.put(data.getDesc(),data.getQn());
                }
                dataSource.putUrl(Urlmap);
                String url = response.body().getData().getDurl().get(0).getUrl();
                CdnMap.put("线路一","1");
                dataSource.putCdn(CdnMap);
                videoPlayer.setUp(url,Data.title,state, JZMediaExo.class);
                videoPlayer.onStatePreparingChangeUrl();
            }
            @Override
            public void onFailure(Call<BibiliEncryBean> call, Throwable t) {

            }
        });

    }
}
