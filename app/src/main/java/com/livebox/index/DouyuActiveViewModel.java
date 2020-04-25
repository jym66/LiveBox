package com.livebox.index;

import android.util.Log;

import com.EncryptBean.DouyuEncryptBean;
import com.Service.DouyuService;
import com.bumptech.glide.Glide;
import com.douyu.lib.http.getSign;
import com.media.DataSource;
import com.media.JZMediaExo;
import com.media.VideoPlayer;
import com.util.BaseUrl;
import com.util.MyApplication;
import com.util.RetrofitManager;
import com.util.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DouyuActiveViewModel {
    private VideoPlayer videoPlayer;
    LinkedHashMap Urlmap = new LinkedHashMap();
    LinkedHashMap CdnMap = new LinkedHashMap();
    public DouyuActiveViewModel(VideoPlayer videoPlayer){
        this.videoPlayer=videoPlayer;
    }
    public void GetResponse(String roomid,String cdn,String rate,int state){
        long time = System.currentTimeMillis()/1000;
        if (cdn=="null"){
            cdn = "";
        }
        if (rate=="null"){
            rate="0";
        }

        getSign getSign = new getSign();
        List<String> sign = getSign.getCsign(time,roomid,rate,cdn);
        HashMap<String,String> params = new HashMap<>();
        params.put("cdn",cdn);
        params.put("client_sys","android");
        params.put("cptl","0101");
        params.put("csign",sign.get(1));
        params.put("rate",rate);
        params.put("token","");
        params.put("txdw","0");

        RetrofitManager retrofitManager = new RetrofitManager(BaseUrl.DouyuBaseUrl);
        Call<DouyuEncryptBean> call =retrofitManager.crratereq(DouyuService.class).getDouyuRes(sign.get(3),time, util.getDouYuUserDevice(BaseUrl.uuid),roomid,params);

        call.enqueue(new Callback<DouyuEncryptBean>() {
            @Override
            public void onResponse(Call<DouyuEncryptBean> call, Response<DouyuEncryptBean> response) {
//                Log.e("111", String.valueOf(response.body().getError()));
                List<DouyuEncryptBean.DataBean.RateSettingBean> rate = response.body().getData().getRateSetting();
                List<DouyuEncryptBean.DataBean.CdnsWithNameBean> Cdn = response.body().getData().getCdnsWithName();
                for (DouyuEncryptBean.DataBean.RateSettingBean data:rate) {
                    Urlmap.put(String.valueOf(data.getName()), data.getRate());
                }
                for (DouyuEncryptBean.DataBean.CdnsWithNameBean cdn: Cdn){
                    CdnMap.put(cdn.getName(),cdn.getCdn());
                }
                String Rtmp_url = response.body().getData().getRtmp_url();
                String getRtmp_live = response.body().getData().getRtmp_live();
                DataSource dataSource = DataSource.getInstance(MyApplication.getContext());
                dataSource.putUrl(Urlmap);
                dataSource.putCdn(CdnMap);
                videoPlayer.setUp(Rtmp_url+"/"+getRtmp_live,Data.title,state, JZMediaExo.class);

                videoPlayer.onStatePreparingChangeUrl();
            }

            @Override
            public void onFailure(Call<DouyuEncryptBean> call, Throwable t) {
                util.Toast.shouToast(MyApplication.getContext(),"主播已下播");
                return;
            }
        });
    }

}

