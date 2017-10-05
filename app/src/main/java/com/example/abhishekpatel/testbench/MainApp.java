package com.example.abhishekpatel.testbench;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by abhishekpatel on 2017-08-18.
 */

public class MainApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
