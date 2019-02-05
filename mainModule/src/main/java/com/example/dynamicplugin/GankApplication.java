package com.example.dynamicplugin;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by jacob on 2019/1/30.
 */

public class GankApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }
}
