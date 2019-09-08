package com.ontouch.demo1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;

/**
 * Author: preqel
 * Created on: 2019-09-08.
 * Description:
 */
public class CustomListView extends ListView {

    public CustomListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomListView(Context context) {
        super(context);
    }


    private int mLastX, mLastY;

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        int x = (int) ev.getX();
        int y = (int) ev.getY();
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN: {
                getParent().requestDisallowInterceptTouchEvent(true);
                break;
            }
                case MotionEvent.ACTION_MOVE:{
                    int deltax = x - mLastX;
                    int deltay = y - mLastY;
                    if(Math.abs(deltax) > Math.abs(deltay) ){
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    break;

                }

            case MotionEvent.ACTION_UP:
                break;

        }

        return super.dispatchTouchEvent(ev);
    }
}
