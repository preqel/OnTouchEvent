package com.ontouch.demo2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.appcompat.widget.AppCompatTextView;

/**
 * Author: preqel
 * Created on: 2019-09-01.
 * Description:
 */
public class CView extends AppCompatTextView {


    public CView(Context context) {
        super(context);
    }

    public CView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }
}
