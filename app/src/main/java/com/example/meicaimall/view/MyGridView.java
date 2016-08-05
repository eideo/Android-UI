package com.example.meicaimall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.GridView;

/**
 * Created by Administrator on 2016/8/4.
 * MyGridView
 */
public class MyGridView extends GridView {
    private boolean haveScrollbar = true;

    public MyGridView(Context context) {
        super(context);

    }

    public MyGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyGridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_MOVE) {
            // 禁止GridView滑动
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }

    /**
     * 设置是否有ScrollBar，当要在ScollView中显示时，应当设置为false。 默认为 true
     *
     * @param haveScrollbar
     */
    public void setHaveScrollbar(boolean haveScrollbar) {
        this.haveScrollbar = haveScrollbar;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        if (haveScrollbar) {
            int expandSpec = MeasureSpec.makeMeasureSpec(
                    Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
            super.onMeasure(widthMeasureSpec, expandSpec);
//        } else {
//            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//        }
    }

}
