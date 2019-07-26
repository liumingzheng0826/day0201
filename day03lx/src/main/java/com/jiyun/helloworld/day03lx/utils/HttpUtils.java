package com.jiyun.helloworld.day03lx.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by ASAS on 2019/7/26.
 */

public class HttpUtils {
    public static boolean isNetworkAvailable(Context context) {
        if (context != null) {
            //获取网络状态
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo info = cm.getActiveNetworkInfo();
            if (info != null) {
                return info.isAvailable();
            }
        }
        return false;
    }
}
