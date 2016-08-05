package com.example.meicaimall.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.meicaimall.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/8/4.
 */
public class SplashScreenActivity extends BaseActivity {

    @BindView(R.id.tv_version_num)
    TextView tvVersionNum;

    @Override
    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);

        setContentView(R.layout.activity_splash_screen);
        ButterKnife.bind(this);
    }

    @Override
    public String getRef() {
        return null;
    }
}
