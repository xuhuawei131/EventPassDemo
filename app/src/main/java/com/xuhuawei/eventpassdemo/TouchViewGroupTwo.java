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

public class TouchViewGroupTwo extends LinearLayout {
    public TouchViewGroupTwo(Context context) {
        super(context);
    }

    public TouchViewGroupTwo(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchViewGroupTwo(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean isTouch=false;
        Log.v("xhw","### dispatchTouchEvent-TouchViewGroupTwo-isTouch:"+isTouch);
        isTouch=super.dispatchTouchEvent(ev);
         return isTouch;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean isTouch=true;
        Log.v("xhw","### onInterceptTouchEvent-TouchViewGroupTwo-isTouch:"+isTouch);
         isTouch=super.onInterceptTouchEvent(ev);
       return isTouch;

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean isTouch=true;
        Log.v("xhw","### onTouchEvent-TouchViewGroupTwo-isTouch:"+isTouch);
        isTouch=super.onTouchEvent(event);
        return isTouch;
    }



}
