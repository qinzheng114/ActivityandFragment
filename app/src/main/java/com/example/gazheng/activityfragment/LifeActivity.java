package com.example.gazheng.activityfragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

/**
 * Created by gazheng on 2015/10/17.
 */
public class LifeActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);
        Log.i("TAG","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG", "onStart is running");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG", "onResume is running");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG", "onPause is running");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "onStop is running");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "onDestroy is running");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG", "onRestart is running");
    }

}
