package com.example.digitssuman.firstlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.digitssuman.firstlib.LogUtils;
import com.example.digitssuman.secondlib.Second;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Second();
    }
}
