package com.kartik.gestures;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    private GestureDetectorCompat gdc;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        gdc = new GestureDetectorCompat(this, this);
        gdc.setOnDoubleTapListener(this);

    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        tv.setText("Single Tap");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        tv.setText("Double Tap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        tv.setText("Double Tap");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        tv.setText("Moving Down");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        tv.setText("Pressing");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        tv.setText("Single Touch");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        tv.setText("Scrolling");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        tv.setText("Long Press");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        tv.setText("Flinging");
        return true;
    }
    public boolean onTouchEvent(MotionEvent event) {
        gdc.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
