package com.example.lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("shamal", "onCreate");
        System.out.println("helloWorld");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("shamal", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("shamal", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("shamal", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("shamal", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("shamal", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("shamal", "onDestroy");
    }

}