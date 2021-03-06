package com.tungphan.designpatternsample.creational.singleton;

import android.util.Log;

/**
 * Created by TungPhan on 1/2/18.
 */

public class SingletonSynchronize {

    private final String TAG = SingletonSynchronize.class.getSimpleName();
    private static SingletonSynchronize instance;

    private SingletonSynchronize() {

    }

    public static synchronized SingletonSynchronize getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronize();
        }
        return instance;
    }

    public void doSomething() {
        Log.e(TAG, "doSomething");
    }

}
