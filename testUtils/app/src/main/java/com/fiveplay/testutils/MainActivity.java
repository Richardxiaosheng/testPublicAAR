package com.fiveplay.testutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.fiveplay.library.MyTestUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyTestUtils.test(this,"2eedwdewqwqe");
    }
}
