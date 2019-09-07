package com.ontouch.demo2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Author: preqel
 * Created on: 2019-09-01.
 * Description:
 */
public class BViewGroup extends LinearLayout {


    public BViewGroup(Context context) {
        super(context);
    }

    public BViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            return true;
        }
        return super.onInterceptTouchEvent(ev);
    }



}
