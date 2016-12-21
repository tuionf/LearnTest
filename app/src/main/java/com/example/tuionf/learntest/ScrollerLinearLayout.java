package com.example.tuionf.learntest;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.Scroller;

/**
 * Created by tuionf on 2016/12/21.
 */

public class ScrollerLinearLayout extends LinearLayout {

    private final Scroller mScroller;

    public ScrollerLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        mScroller = new Scroller(context);
    }

    public void startScroll(){
        mScroller.startScroll(getScrollX(),getScrollY(),-50,-50);
        invalidate();
    }

    @Override
    public void computeScroll() {
        if(mScroller.computeScrollOffset()){
            scrollTo(mScroller.getCurrX(), mScroller.getCurrY());
            invalidate();
        }

    }
}
