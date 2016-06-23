package com.example.demo.adobeanalyticdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.adobe.mobile.Analytics;
import com.adobe.mobile.Config;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Config.setContext(this);
        Analytics.trackState(MainActivity.class.getSimpleName(), null);
    }
}
