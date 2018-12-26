package com.xuhuawei.eventpassdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by mac on 2018/12/26.
 */

public class TouchTextView extends TextView {

    public TouchTextView(Context context) {
        super(context);
    }

    public TouchTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
//        boolean isTouch=true;
        Log.v("xhw","+++ dispatchTouchEvent-TouchTextView-isTouch:"+true);
        boolean isTouch=super.dispatchTouchEvent(ev);
        return isTouch;
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        boolean isTouch=true;
        Log.v("xhw","+++ onTouchEvent-TouchTextView-isTouch:"+true);
        boolean isTouch=super.onTouchEvent(event);
       return isTouch;
    }
}
