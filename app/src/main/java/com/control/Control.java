package com.control;

import android.util.Log;

import com.livebox.index.BlibiliViewModel;
import com.livebox.index.Data;
import com.livebox.index.DouyuActiveViewModel;
import com.livebox.index.egameViewModel;
import com.media.VideoPlayer;
import com.media.DataSource;
import com.util.MyApplication;

import java.util.LinkedHashMap;
// 此处flag 表示是否是第一次调用


//调度器
//在 main2active  new一个对象 会自动 调用响应的解析直播源方法
public class Control {
    private DataSource dataSource = DataSource.getInstance(MyApplication.getContext());
    private VideoPlayer videoPlayer;
    public Control(VideoPlayer videoPlayer){
        this.videoPlayer = videoPlayer;
    }
    public void manage(int state, boolean flag, LinkedHashMap map){
//        如果是第一次调用直接在map里取数据
        if (Data.tv.equals("douyu")){
            String roomId = String.valueOf(map.get("roomid"));
            String cdn1 = String.valueOf(map.get("cdn"));
            String rate1 = String.valueOf(map.get("rate"));
            getDouYu(videoPlayer,roomId,cdn1,rate1,state,flag);
        }
        if (Data.tv.equals("bilibili")){
            String cid = String.valueOf(map.get("cid"));
            String qn = String.valueOf(map.get("qn"));
            getBilibili(videoPlayer,cid,qn,state,flag);
        }
        if (Data.tv.equals("egame")){
            String roomId = String.valueOf(map.get("roomid"));
            Log.e("TAG", roomId );
            getEgame(videoPlayer,roomId,state,flag);
        }
    }

     private void getDouYu(VideoPlayer videoPlayer, String roomid, String cdn, String rate, int state, boolean flag){
//        如果不是第一次调用直接去DataSource去取数据
        if (!flag){
            roomid = Data.roomid;
            cdn = String.valueOf(dataSource.CdnMap.get(dataSource.getCdnKeyFromDataSource(dataSource.getCurrentCdnIndex())));
            rate = String.valueOf(dataSource.urlsMap.get(dataSource.getKeyFromDataSource(dataSource.getCurrentUrlIndex())));
        }
        DouyuActiveViewModel douyuActiveViewModel = new DouyuActiveViewModel(videoPlayer);
        douyuActiveViewModel.GetResponse(roomid,cdn,rate,state);
    }
    private void getBilibili(VideoPlayer videoPlayer, String cid, String qn, int state, boolean flag){
        if (!flag){
            cid = Data.roomid;
            qn = String.valueOf(dataSource.urlsMap.get(dataSource.getKeyFromDataSource(dataSource.getCurrentUrlIndex())));
        }
        BlibiliViewModel blibiliViewModel = new BlibiliViewModel(videoPlayer);
        blibiliViewModel.GetResponse(cid,qn,state);
    }
    private void getEgame(VideoPlayer videoPlayer,String roomid, int state,boolean flag){
        if (!flag){
            roomid =Data.roomid;
        }
        egameViewModel egameViewModel = new egameViewModel(videoPlayer);
        egameViewModel.getResponse(roomid,state);
    }
}
