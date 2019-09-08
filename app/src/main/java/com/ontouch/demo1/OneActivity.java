package com.ontouch.demo1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.ontouch.R;


/**
 * Author: preqel
 * Created on: 2019-09-01.
 * Description:  滑动 冲突
 */
public class OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        CustomViewPager viewPager = findViewById(R.id.vp_main);
        viewPager.setAdapter(new MyPagerAdapter(this));
    }
}

