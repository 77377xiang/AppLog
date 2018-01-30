package com.demo.logproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.log.library.log.LogManager;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "onCreate_vVV");
        LogManager.v(TAG, "onCreate_v");
        LogManager.d(TAG, "onCreate_d");
        LogManager.w(TAG, "onCreate_w");
        LogManager.i(TAG, "onCreate_i");
        LogManager.e(TAG, "onCreate_e");

        //  打开错错误测试
       // textView.setText("shasha");
    }

}
