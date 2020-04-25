package com.douyu.lib.http;

import android.content.Context;

import com.util.BaseUrl;
import com.util.MyApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class getSign {
    private final JniMakeUrl jniMakeUrl = new JniMakeUrl();
    private static String getHeaderAuth(String time, JniMakeUrl jniMakeUrl , Context c, String csign, String roomid, String rate, String cdn) {
        String[] strArr2 = {"aid", "cdn", "client_sys", "cptl", "csign", "rate", "time","token","txdw"};
        String[] strArr3 = {"androidhd1",cdn,"android","0101",csign,rate, time,"","0"};
        return jniMakeUrl.newmakeUrl(c, "lapi/live/appGetPlayer/stream/"+ roomid +"?", strArr2, strArr3, null, null, 3, 1);
    }
    public List<String> getCsign(Long time,String roomid,String rate,String cdn){
        String[] signs = jniMakeUrl.getVideoAuth(MyApplication.getContext(), Integer.parseInt(roomid),time , BaseUrl.uuid);
        String Auth = getHeaderAuth(String.valueOf(time),jniMakeUrl,MyApplication.getContext(),signs[1],roomid,rate,cdn);
        List<String> sign = new ArrayList<>(Arrays.asList(signs));
        sign.add(Auth);
        return sign;
    }
}
