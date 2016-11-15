package com.best.activitydemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lenovo on 2016/11/15.
 */
public class ContentFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("print", "Fragment onCreateView: ");
        View view = inflater.inflate(R.layout.contentfragment,container,false);
        
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("print", "Fragment onCreate: ");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        Log.d("print", "Fragment onAttach: ");
        super.onAttach(activity);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d("print", "Fragment onActivityCreated: ");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onResume() {
        Log.d("print", "Fragment onResume: ");
        super.onResume();
    }

    @Override
    public void onStart() {
        Log.d("print", "Fragment onStart: ");
        super.onStart();
    }

    @Override
    public void onPause() {
        Log.d("print", "Fragment onPause: ");
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        Log.d("print", "Fragment onDestroyView: ");
        super.onDestroyView();
    }

    @Override
    public void onStop() {
        Log.d("print", "Fragment onStop: ");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.d("print", "Fragment onDestroy: ");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("print", "Fragment onDetach: ");
        super.onDetach();
    }
}
