package com.livebox.index;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.control.Control;
import com.media.DataSource;
import com.media.VideoPlayer;
import com.util.MyApplication;

import java.util.LinkedHashMap;
import java.util.Objects;

import cn.jzvd.Jzvd;

public class Main2Activity extends AppCompatActivity {
    DataSource dataSource = DataSource.getInstance(MyApplication.getContext());
    private VideoPlayer videoPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        videoPlayer  = findViewById(R.id.jz_video);
        Control control = new Control(videoPlayer);
        LinkedHashMap map = new LinkedHashMap();
        Data.title = getIntent().getStringExtra("title");
        if (Objects.equals(getIntent().getStringExtra("tv"), "bilibili")){
            Data.roomid= getIntent().getStringExtra("rid");
            map.clear();
            map.put("qn",null);
            map.put("cid",getIntent().getStringExtra("rid"));
            control.manage(Jzvd.SCREEN_NORMAL,true,map);
        }
        if (Objects.equals(getIntent().getStringExtra("tv"), "douyu")){
            Data.roomid= getIntent().getStringExtra("rid");
            map.clear();
            map.put("roomid",getIntent().getStringExtra("rid"));
            map.put("cdn",null);
            map.put("rate",null);
            control.manage(Jzvd.SCREEN_NORMAL,true,map);
        }
        if (Objects.equals(getIntent().getStringExtra("tv"), "egame")){
            Data.roomid= getIntent().getStringExtra("rid");
            map.clear();
            map.put("roomid",getIntent().getStringExtra("rid"));
            control.manage(Jzvd.SCREEN_NORMAL,true,map);
        }


    }
    @Override
    public void onBackPressed() {

        if (Jzvd.backPress()) {
            return;
        }
        super.onBackPressed();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Jzvd.releaseAllVideos();
//        videoPlayer.onStatePause();
        Log.e("TAG", "onPause" );
    }
    protected void onRestart() {
        Log.e("TAG", "onRestart: " );
        super.onRestart();
        videoPlayer.startVideo();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Jzvd.releaseAllVideos();
        dataSource.currentCdnIndex = 0;
        dataSource.currentUrlIndex = 0;
//        重置状态要不然斗鱼 bilibili没法切换清晰度
        dataSource.isGet=true;
    }
}
