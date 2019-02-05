package com.example.videomodule;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

/**
 * Created by jacob on 2019/1/29.
 */

public class VideoPlugin {
    public static void testLocalBroadcastReceiver(Context context) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("LOCAL_ACTION"));
    }
}
