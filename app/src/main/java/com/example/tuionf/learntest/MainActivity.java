package com.example.tuionf.learntest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ScrollerLinearLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLayout = (ScrollerLinearLayout) findViewById(R.id.layout);
    }

    public void start(View v){
        mLayout.startScroll();
    }
}
