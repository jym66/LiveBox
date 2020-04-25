package com.media;

import android.content.Context;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class DataSource {
    public static final String URL_KEY_DEFAULT = "自动";
    public int currentUrlIndex;
    public int currentCdnIndex;
//    是否需要通过请求的方式切换清晰度 默认需要
    public boolean isGet =true ;

    public LinkedHashMap urlsMap = new LinkedHashMap();
    public LinkedHashMap CdnMap = new LinkedHashMap();
    public String title = "";
    public HashMap<String, String> headerMap = new HashMap<>();
    private volatile static DataSource dataSource = null;
    DataSource (Context context) {}

    public static DataSource getInstance(Context context) {
        if (dataSource == null) {
            synchronized (DataSource.class) {
                if (dataSource == null) {
                    dataSource = new DataSource(context);
                }
            }
        }
        return dataSource;

    }

    void setCurrentUrlIndex(int index){
        this.currentUrlIndex =index;
    }
    void setCurrentCdnIndex(int index){
        this.currentCdnIndex=index;
    }
    public int getCurrentUrlIndex(){
        return this.currentUrlIndex;
    }
    public int getCurrentCdnIndex(){
        return this.currentCdnIndex;
    }
    public void putUrl(LinkedHashMap urlsMap) {
        this.urlsMap.clear();
        this.urlsMap.putAll(urlsMap);;
//        currentUrlIndex = 0;
    }
    public void putCdn(LinkedHashMap CdnMap){
        this.CdnMap.clear();
        this.CdnMap.putAll(CdnMap);
//        currentCdnIndex = 0;
    }
    public String getKeyFromDataSource(int index) {
        int currentIndex = 0;
        for (Object key : urlsMap.keySet()) {
            if (currentIndex == index) {
                return key.toString();
            }
            currentIndex++;
        }
        return null;
    }
    public String getCdnKeyFromDataSource(int index) {
        int currentIndex = 0;
        for (Object key : CdnMap.keySet()) {
            if (currentIndex == index) {
                return key.toString();
            }
            currentIndex++;
        }
        return null;
    }
    int getUrlMapSize(){
        return urlsMap.size();
    }
}
