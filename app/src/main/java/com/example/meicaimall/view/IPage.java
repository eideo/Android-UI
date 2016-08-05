package com.example.meicaimall.view;

import android.app.Activity;

/**
 * Created by Administrator on 2016/8/3.
 * IPage
 */
public abstract interface IPage {
    public abstract String generateRef();

    public abstract String getDefaultPageName();

    public abstract Activity getPageActivity();

    public abstract String getPageName();

    public abstract String getRef();

    public abstract void hideLoading();

    public abstract void showLoading();

    public abstract void showNoCancelableLoading();

    public abstract void showToastSafe(String paramString);

}
