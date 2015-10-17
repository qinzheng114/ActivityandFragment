package com.example.staticfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gazheng.activityfragment.DynaActivity;
import com.example.gazheng.activityfragment.MainActivity;
import com.example.gazheng.activityfragment.R;

/**
 * Created by gazheng on 2015/10/16.
 */
public class Fragmentstatic extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_static,container);
        view.findViewById(R.id.btn_Dynamically).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), DynaActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
