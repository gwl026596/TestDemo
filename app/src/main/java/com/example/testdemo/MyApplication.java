package com.example.testdemo;

import android.app.Application;

import com.growingio.android.sdk.autotrack.CdpAutotrackConfiguration;
import com.growingio.android.sdk.autotrack.GrowingAutotracker;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        GrowingAutotracker.startWithConfiguration(this,
                new CdpAutotrackConfiguration("bfbb9ccbd64c2232", "growing.d80871b41ef40518")
                        .setDataCollectionServerHost("http://106.75.81.105:8080/")
                        .setDataSourceId("aa87ed9f71c2edf9")
                        .setDebugEnabled(true));
    }
}
