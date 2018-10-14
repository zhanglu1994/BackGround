package com.zhangl.background;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangl.background.backgroundlibrary.BackgroundLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        BackgroundLibrary.inject(this);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
}
