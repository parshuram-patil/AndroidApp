package com.example.psp.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

public class CustomViewPager extends ViewPager {

    public CustomViewPager(Context context) {
        super(context);
        //setMyScroller();
    }

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        //setMyScroller();
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        //System.out.println("\n\n ***** XXX onInterceptTouchEvent **** \n\n");
        // Never allow swiping to switch between pages
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // Never allow swiping to switch between pages
        //System.out.println("\n\n ***** XXX onTouchEvent **** \n\n");
        return false;
    }

    //down one is added for smooth scrolling

    /*private void setMyScroller() {
        try {
            Class<?> viewpager = ViewPager.class;
            Field scroller = viewpager.getDeclaredField("mScroller");
            scroller.setAccessible(true);
            scroller.set(this, new MyScroller(getContext()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class MyScroller extends Scroller {
        public MyScroller(Context context) {
            super(context, new DecelerateInterpolator());
        }

        @Override
        public void startScroll(int startX, int startY, int dx, int dy, int duration) {
            super.startScroll(startX, startY, dx, dy, 350 *//*1 secs*//*);
        }
    }*/
}
