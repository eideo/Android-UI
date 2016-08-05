package com.example.meicaimall.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.meicaimall.MainActivity;
import com.example.meicaimall.R;
import com.example.meicaimall.utils.CommonUtils;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/8/4.
 * WelcomeActivity
 */
public class WelcomeActivity extends BaseActivity {

    @BindView(R.id.viewPager_lib)
    ViewPager mViewPager;
    @BindView(R.id.indicatorGroup_lib)
    LinearLayout mLayout;

    private ArrayList<ImageView> views;
    private int[] imgIds = {R.mipmap.guide_2, R.mipmap.guide_3, R.mipmap.guide_4};


    @Override
    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
        CommonUtils.changeSystemBar(this, 0);
        initViewPager();
    }

    private void initViewPager() {
        views = new ArrayList<>();
        for (int images : imgIds) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(images);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            views.add(imageView);
        }
        // 设置数据
        mViewPager.setAdapter(new MyPagerAdapter());
        mViewPager.setFocusable(true);

        mViewPager.setOffscreenPageLimit(3);
        // 设置监听
        mViewPager.addOnPageChangeListener(new MyOnPageChangeListener());

    }


    @Override
    public String getRef() {
        return null;
    }

    class MyPagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return imgIds.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(views.get(position));
            return views.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(views.get(position));
        }
    }


    class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            if (position == views.size() - 1) {
                mViewPager.getChildAt(position).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "点击按钮", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
//                       finish();
                    }
                });
            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }

//    @AfterViews
//    void onInit() {
//        initViewPager();
//    }
}
