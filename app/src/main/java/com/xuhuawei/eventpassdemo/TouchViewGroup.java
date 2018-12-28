package com.xuhuawei.eventpassdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by mac on 2018/12/26.
 */

public class TouchViewGroup extends LinearLayout {
    public TouchViewGroup(Context context) {
        super(context);
    }

    public TouchViewGroup(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchViewGroup(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean isTouch=false;
        Log.v("xhw","### dispatchTouchEvent-TouchViewGroup-isTouch:"+isTouch);
         isTouch=super.dispatchTouchEvent(ev);
        return isTouch;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean isTouch=true;
        Log.v("xhw","### onInterceptTouchEvent-TouchViewGroup-isTouch:"+true);
        isTouch=super.onInterceptTouchEvent(ev);
        return isTouch;

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean isTouch=true;
        Log.v("xhw","### onTouchEvent-TouchViewGroup-isTouch:"+true);
         isTouch=super.onTouchEvent(event);
        return isTouch;
    }



}
