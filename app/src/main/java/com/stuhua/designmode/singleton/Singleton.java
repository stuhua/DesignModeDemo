package com.stuhua.designmode.singleton;

import android.util.Log;


/**
 * Created by llh on 2016/10/25.
 * 饿汉式
 */

public class Singleton {
    public static final String TAG = "Singleton:";
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    public void showMsg() {
        Log.d(TAG, "hello world");
    }
}
