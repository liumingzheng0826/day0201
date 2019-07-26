package com.jiyun.helloworld.day03lx.app;

import android.app.Application;

/**
 * Created by ASAS on 2019/7/26.
 */

public class MyApp extends Application {
    private static MyApp myApp;

    @Override
    public void onCreate() {
        super.onCreate();
        myApp = this;
    }

    public static MyApp getInstance() {
        return myApp;
    }
}
