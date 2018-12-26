package com.xuhuawei.eventpassdemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean isTouch=false;
        Log.v("xhw","*** dispatchTouchEvent-Activity-isTouch:"+isTouch);
         isTouch=super.dispatchTouchEvent(ev);
        return isTouch;
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean isTouch=true;
         isTouch=super.onTouchEvent(event);
        Log.v("xhw","*** onTouchEvent-Activity-isTouch:"+isTouch);
        return isTouch;
    }
}
