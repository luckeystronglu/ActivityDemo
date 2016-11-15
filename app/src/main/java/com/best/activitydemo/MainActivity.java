package com.best.activitydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        Log.d("print", "Activity onCreate: ");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.d("print", "Activity onStart: ");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("print", "Activity onResume: ");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.d("print", "Activity onDestroy: ");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d("print", "Activity onPause: ");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("print", "Activity onStop: ");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d("print", "Activity onRestart: ");
        super.onRestart();
    }
}
