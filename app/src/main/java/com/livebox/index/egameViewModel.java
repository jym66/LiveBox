package com.livebox.index;

import android.util.Log;

import com.EncryptBean.egameEncryBean;
import com.Service.egameService;
import com.media.DataSource;
import com.media.JZMediaExo;
import com.media.VideoPlayer;
import com.util.BaseUrl;
import com.util.MyApplication;
import com.util.RetrofitManager;

import java.util.LinkedHashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class egameViewModel {
    private VideoPlayer videoPlayer;
    LinkedHashMap Urlmap = new LinkedHashMap();
    LinkedHashMap CdnMap = new LinkedHashMap();
    public  egameViewModel(VideoPlayer videoPlayer){
        this.videoPlayer = videoPlayer;
    }
    public void getResponse(String roomid,int state){
        String param ="{\"0\":{\"module\":\"pgg_live_read_svr\",\"method\":\"get_live_and_profile_info\",\"param\":{\"anchor_id\": "+ roomid + ",\"layout_id\":\"hot\",\"index\":1,\"other_uid\":0}}}";
        String appinfo ="{\"platform\":2,\"terminal_type\":4,\"version_code\":\"0\",\"version_name\":\"0\",\"pvid\":\"1754931200\",\"ssid\":\"9655565312\",\"imei\":\"0\"}";
        RetrofitManager retrofitManager = new RetrofitManager(BaseUrl.egame);
        Call<egameEncryBean> call = retrofitManager.crratereq(egameService.class).getRes(param,appinfo);
        call.enqueue(new Callback<egameEncryBean>() {
            @Override
            public void onResponse(Call<egameEncryBean> call, Response<egameEncryBean> response) {
                List<egameEncryBean.DataBeanX._$0Bean.RetBodyBean.DataBean.VideoInfoBean.StreamInfosBean>streamInfo = response.body().getData().get_$0().getRetBody()
                        .getData().getVideo_info().getStream_infos();
                for (egameEncryBean.DataBeanX._$0Bean.RetBodyBean.DataBean.VideoInfoBean.StreamInfosBean videoInfo:streamInfo) {
                    Urlmap.put(videoInfo.getDesc(),videoInfo.getPlay_url());
                }
                CdnMap.put("线路一","aaa");
                DataSource dataSource = DataSource.getInstance(MyApplication.getContext());
                dataSource.isGet=false;
                dataSource.putUrl(Urlmap);
                dataSource.putCdn(CdnMap);
                videoPlayer.setUp(String.valueOf(streamInfo.get(0).getPlay_url()),Data.title,state, JZMediaExo.class);
                videoPlayer.onStatePreparingChangeUrl();
            }
            @Override
            public void onFailure(Call<egameEncryBean> call, Throwable t) {

            }
        });
    }
}
