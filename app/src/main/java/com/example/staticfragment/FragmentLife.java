package com.example.staticfragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gazheng.activityfragment.R;

/**
 * Created by gazheng on 2015/10/17.
 */
public class FragmentLife extends Fragment {
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i("fragment","onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("fragment", "onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_life,container,false);
        return  view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("fragment","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("fragment","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("fragment","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("fragment", "onPause");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("fragment","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("fragment","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("fragment", "onDetach");
    }
}
