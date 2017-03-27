package com.zhoujian.task.service;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import android.util.Log;

/**
 * Created by zhoujian on 2017/3/23.
 */

public class MyService extends Service
{

    public static final String TAG = "MyService";

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent,  int flags, int startId)
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Log.i(TAG, "5秒后run()方法执行了！");
            }
        }).start();

       AlarmManager alarmManager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        //5秒的时间
        int  time = 1000*5;

        //获取系统开机至今所经历的毫秒
        long startTime = SystemClock.elapsedRealtime()+time;

        Intent in  = new Intent(this,MyService.class);

        PendingIntent pendingIntent = PendingIntent.getService(this,0,in,0);

        alarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP,startTime,pendingIntent);

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
