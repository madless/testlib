package com.madless.testlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.madless.mytestlib.TestAndroidClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestAndroidClass.showTestToast(this);
    }
}
