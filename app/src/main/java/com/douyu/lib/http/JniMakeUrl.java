package com.douyu.lib.http;


import android.content.Context;

public class JniMakeUrl {

    /* renamed from: a */
    private static final String f31a = "ZC_JAVA_N_JniLive";

    /* renamed from: b */
    private static boolean f32b = false;

    /* renamed from: c */
    private static boolean f33c = false;

    public JniMakeUrl() {
        m48b();
    }

    /* renamed from: b */
    private static void m48b() {
        if (!f33c) {
            System.loadLibrary("ppp");
            f33c = true;
        }
    }

    private native String native_authcodeDecode(Context context, String str, String str2);

    private native String native_authcodeEncode(Context context, String str, String str2);

    private native String native_getCodeE(Context context);

    private native String native_getSDKE(Context context);

    private native String[] native_getVideoAuth(Context context, int i, long j, String str);

    private native String native_makeUrl(Context context, String str, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, int i, int i2);

    private native String native_newmakeUrl(Context context, String str, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, int i, int i2);

    private native String native_sdk_version();

    /* renamed from: a */
    public String sdkVersion() {
        return native_sdk_version();
    }

    /* renamed from: a */
    public String mo4084a(Context context) {
        return native_getCodeE(context);
    }

    /* renamed from: a */
    public String mo4086a(Context context, String str, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, int i, int i2) {
        return native_makeUrl(context, str, strArr, strArr2, strArr3, strArr4, i, i2);
    }

    /* renamed from: a */
    public String mo4085a(Context context, String str, String str2) {
        return native_authcodeDecode(context, str, str2);
    }

    /* renamed from: b */
    public String mo4088b(Context context) {
        return native_getSDKE(context);
    }

    /* renamed from: a */
    public String[] getVideoAuth(Context context, int i, long j, String str) {
        return native_getVideoAuth(context, i, j, str);
    }

    /* renamed from: b */
    public String newmakeUrl(Context context, String str, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, int i, int i2) {
        return native_newmakeUrl(context, str, strArr, strArr2, strArr3, strArr4, i, i2);
    }

    /* renamed from: b */
    public String mo4089b(Context context, String str, String str2) {
        return native_authcodeEncode(context, str, str2);
    }
}