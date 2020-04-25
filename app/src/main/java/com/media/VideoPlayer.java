package com.media;

import android.content.Context;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.control.Control;
import com.livebox.index.Data;
import com.livebox.index.DouyuActiveViewModel;
import com.livebox.index.Main2Activity;
import com.livebox.index.R;
import com.util.MyApplication;
import com.util.util;


import java.util.LinkedHashMap;

import cn.jzvd.JZDataSource;
import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;


public class VideoPlayer extends JzvdStd {
    private PopupWindow CdnPopupWindow;
    public   TextView cdn;
    public   TextView clarity1;
    private ImageView refresh;
    private DataSource dataSource = DataSource.getInstance(getApplicationContext());
    DouyuActiveViewModel mainActiveViewModel = new DouyuActiveViewModel(this);
    public ImageView cover;
    private Control control = new Control(this);
    public VideoPlayer(Context context) {
        super(context);
    }

    public VideoPlayer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    public void init(Context context) {
        super.init(context);
        refresh = findViewById(R.id.refresh);
        cdn = findViewById(R.id.cdn);
        clarity1 = findViewById(R.id.clarity1);
        clarity1.setOnClickListener(this);
        refresh.setOnClickListener(this);
        cdn.setOnClickListener(this);


    }
    @Override
    public int getLayoutId() {
        return R.layout.jz_layout_std;
    }
    @Override
    public void onStateNormal() {
        super.onStateNormal();
    }

    @Override
    public void onStatePreparing() {
        super.onStatePreparing();
    }

    public void onStatePreparingPlaying() {
        super.onStatePreparingPlaying();


    }

    public void onStatePreparingChangeUrl() {
        super.onStatePreparingChangeUrl();

    }

    @Override
    public void onStatePlaying() {
        super.onStatePlaying();

        clarity1.setText(dataSource.getKeyFromDataSource(dataSource.getCurrentUrlIndex()));
        cdn.setText(dataSource.getCdnKeyFromDataSource(dataSource.getCurrentCdnIndex()));
        if (dataSource.CdnMap.size() == 1){
            cdn.setVisibility(GONE);
//            util.Toast.shouToast(MyApplication.getContext(),"当前没有线路切换哦！！");
//            return;
        }
//        cover.setVisibility(GONE);
    }

    @Override
    public void onStatePause() {
        super.onStatePause();
    }

    @Override
    public void onStateError() {
        super.onStateError();
    }

    @Override
    public void onStateAutoComplete() {
        super.onStateAutoComplete();
    }
    @Override
    public void gotoScreenFullscreen() {
        super.gotoScreenFullscreen();

    }
    @Override
    public void setScreenNormal() {
        super.setScreenNormal();
//        clarity.setVisibility(View.VISIBLE);
    }
    @Override
    public void setScreenFullscreen() {
        super.setScreenFullscreen();
//        if (jzDataSource.urlsMap.size() == 1) {
//            clarity.setVisibility(View.VISIBLE);
//        }

    }
    @Override
    public void showProgressDialog(float deltaX, String seekTime, long seekTimePosition, String totalTime, long totalTimeDuration) {
        if (mProgressDialog == null) {
            return;
        }
    }
    public void setUp(String url, String title, int screen, Class mediaInterfaceClass) {
        setUp(new JZDataSource(url, title), screen, mediaInterfaceClass);
    }
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.clarity1){
            if (dataSource.getUrlMapSize() == 1) {
                util.Toast.shouToast(MyApplication.getContext(),"当前只有一个清晰度哦！");
                return;
            }
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            final LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.jz_layout_clarity, null);

            OnClickListener onClickListener  = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (int j = 0; j < layout.getChildCount(); j++) {//设置点击之后的颜色
                        if (j == (int)v.getTag()) {
                            Jzvd.releaseAllVideos();
                            ((TextView) layout.getChildAt(j)).setTextColor(Color.parseColor("#fff85959"));
                            clarity1.setText(((TextView) layout.getChildAt(j)).getText());
                            dataSource.setCurrentUrlIndex(j);
                            if (dataSource.isGet){
                                control.manage(screen,false,new LinkedHashMap());
                            }else{
                                setUp(String.valueOf(dataSource.urlsMap.get(dataSource.getKeyFromDataSource(dataSource.getCurrentUrlIndex()))),Data.title,state,JZMediaExo.class);
                                onStatePreparingChangeUrl();
                            }


                        } else {
                            ((TextView) layout.getChildAt(j)).setTextColor(Color.parseColor("#ffffff"));
                        }
                    }
//                    if (clarityPopWindow != null) {
//                        clarityPopWindow.dismiss();
////                        cancelDismissControlViewTimer();
//                    }
                }
            };
            for (int k = 0; k < dataSource.urlsMap.size(); k++){
                String key = dataSource.getKeyFromDataSource(k);
                TextView clarityItem = (TextView) View.inflate(getContext(), R.layout.jz_layout_clarity_item, null);
                clarityItem.setText(key);
                clarityItem.setTag(k);
                layout.addView(clarityItem,k);
                clarityItem.setOnClickListener(onClickListener);
            }
            clarityPopWindow = new PopupWindow(layout, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, true);
            clarityPopWindow.setContentView(layout);
            clarityPopWindow.setFocusable(true);
            clarityPopWindow.setTouchable(true);
            clarityPopWindow.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            clarityPopWindow.setOutsideTouchable(true);
            layout.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
            clarityPopWindow.showAsDropDown(clarity1);
            int offsetX = clarity1.getMeasuredWidth() / 3;
            int offsetY = clarity1.getMeasuredHeight() / 3;
            ((TextView) layout.getChildAt(dataSource.getCurrentUrlIndex())).setTextColor(Color.parseColor("#fff85959"));
            clarityPopWindow.update(clarity1, -offsetX, -offsetY, Math.round(layout.getMeasuredWidth() * 2), layout.getMeasuredHeight());
        }
        if (i == R.id.refresh){
            Jzvd.releaseAllVideos();
            control.manage(screen,false,new LinkedHashMap());
        }
        if (i == R.id.cdn){
            if (dataSource.CdnMap.size() == 1){
//                util.Toast.shouToast(MyApplication.getContext(),"当前没有线路切换哦！！");
                return;
            }

            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            final LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.jz_layout_clarity, null);
            OnClickListener onClickListener  = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (int j = 0; j < layout.getChildCount(); j++) {//设置点击之后的颜色
                        if (j == (int)v.getTag()) {
                            Jzvd.releaseAllVideos();
                            ((TextView) layout.getChildAt(j)).setTextColor(Color.parseColor("#fff85959"));
                            cdn.setText(((TextView) layout.getChildAt(j)).getText());
                            dataSource.setCurrentCdnIndex(j);
                            if (dataSource.isGet){
                                control.manage(screen,false,new LinkedHashMap());
                            }
//                            cancelDismissControlViewTimer();
//                            if (screen == SCREEN_FULLSCREEN){
//                                gotoScreenFullscreen();
////                                setScreenFullscreen();
//                            }


                        } else {
                            ((TextView) layout.getChildAt(j)).setTextColor(Color.parseColor("#ffffff"));
                        }
                    }
                    if (CdnPopupWindow != null) {
                        CdnPopupWindow.dismiss();
//                        cancelDismissControlViewTimer();
                    }
                }
            };
//            inflate()的作用就是将一个用xml定义的布局文件查找出来，注意与findViewById()的区别，inflate是加载一个布局文件，
//            而findViewById则是从布局文件中查找一个控件。

            for ( int j =0 ; j <dataSource.CdnMap.size();j++){
                TextView clarityItem = (TextView) View.inflate(getContext(), R.layout.jz_layout_clarity_item, null);
                clarityItem.setText(dataSource.getCdnKeyFromDataSource(j));
                clarityItem.setTag(j);
                layout.addView(clarityItem,j);
                clarityItem.setOnClickListener(onClickListener);
            }


            CdnPopupWindow = new PopupWindow(layout, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, true);
            CdnPopupWindow.setContentView(layout);
            CdnPopupWindow.setFocusable(true);
            CdnPopupWindow.setTouchable(true);
            CdnPopupWindow.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            CdnPopupWindow.setOutsideTouchable(true);
            layout.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
            CdnPopupWindow.showAsDropDown(cdn);
            int offsetX = cdn.getMeasuredWidth() / 3;
            int offsetY = cdn.getMeasuredHeight() / 3;
            Log.e(TAG, String.valueOf(dataSource.getCurrentCdnIndex()));
            ((TextView) layout.getChildAt(dataSource.getCurrentCdnIndex())).setTextColor(Color.parseColor("#fff85959"));

            CdnPopupWindow.update(cdn, -offsetX, -offsetY, Math.round(layout.getMeasuredWidth() * 2), layout.getMeasuredHeight());
//            util.Toast.shouToast(MyApplication.getContext(),"你点击了切换线路！");
        }

        super.onClick(v);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        mChangePosition=false;
        return super.onTouch(v, event);
    }

    @Override
    public void changeUrl(JZDataSource jzDataSource, long seekToInAdvance) {
//        super.changeUrl(jzDataSource, seekToInAdvance);

    }



    @Override
    public void startDismissControlViewTimer() {
//        super.startDismissControlViewTimer();
//        cancelDismissControlViewTimer();
//        DISMISS_CONTROL_VIEW_TIMER = new Timer();
//        mDismissControlViewTimerTask = new DismissControlViewTimerTask();
//        DISMISS_CONTROL_VIEW_TIMER.schedule(mDismissControlViewTimerTask, 5000);
    }

}
