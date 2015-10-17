package com.example.gazheng.activityfragment;

import android.app.Activity;

import android.app.FragmentTransaction;
import android.os.Bundle;

import android.view.Window;


import com.example.staticfragment.FragmentDyna;

/**
 * Created by gazheng on 2015/10/17.
 */
public class DynaActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dyna);
        FragmentTransaction ft=getFragmentManager().beginTransaction();
        ft.replace(R.id.placeholder,new FragmentDyna());
        ft.commit();

    }
}
