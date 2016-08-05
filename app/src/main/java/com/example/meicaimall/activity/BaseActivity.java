package com.example.meicaimall.activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

import com.example.meicaimall.view.IPage;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/8/3.
 * BaseActivity
 */
@EActivity
public abstract class BaseActivity extends FragmentActivity implements IPage {

    public static Activity currentActivity;
    public static Object currentPage;
    //    protected AddCart_Collect_Dialog addCart_collect_dialog;
//    AnalysisEngine analysisEngine;
    protected BaseActivity instance;
    //    protected LoadData_changeView_Dialog loadingViewDialog;
    private SystemBarTintManager mTintManager;
//    PageRouter pageRouter;
//    @Extra
//    protected String ref;

    public static int dip2px(Context paramContext, float paramFloat) {
        return 0;
    }

    @TargetApi(17)
    public static boolean isActivityDestroyed(Activity paramActivity) {
        return false;
    }

    public static int px2dip(Context paramContext, float paramFloat) {
        return 0;
    }

    private void restartApplication() {
    }

    protected BigDecimal add(String paramString1, String paramString2) {
        return null;
    }

    public int dip2px(float paramFloat) {
        return 0;
    }

    public BigDecimal divide(String paramString1, String paramString2) {
        return null;
    }

    @UiThread
    void error() {
    }

    @UiThread
    void error(String paramString) {
    }

    @UiThread
    void fail() {
    }

    public String generateRef() {
        return null;
    }

    public String getDefaultPageName() {
        return null;
    }

    public Activity getPageActivity() {
        return this;
    }

    public String getPageName() {
        return null;
    }

//    public String getRef() {
//        return this.ref;
//    }

    @UiThread
    public void hideDetailDateLoading() {
    }

    @UiThread
    public void hideLoading() {
    }

    @TargetApi(17)
    protected boolean isValidContext(Activity paramActivity) {
        return false;
    }

    public void jump2OtherPage(Intent paramIntent) {
    }

    public void jump2OtherPageForResult(Intent paramIntent, int paramInt) {
    }

    public void leftRespond() {
    }

    protected BigDecimal multiply(String paramString1, String paramString2) {
        return null;
    }

    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onResume() {
        super.onResume();
    }

    public int px2dip(float paramFloat) {
        return 0;
    }

    public void rightRespond() {
    }

    public void setLoadFail(String paramString, TextView paramTextView) {
    }

    public void setRightName(String paramString, TextView paramTextView) {
    }

    @TargetApi(21)
    public void setStatusColor(int paramInt) {
    }

    @UiThread
    protected void showDetailDateLoading() {
    }

    @UiThread
    public void showLoading() {
    }

    @UiThread
    public void showLongToast(String paramString) {
    }

    @UiThread
    public void showNoCancelableLoading() {
    }

    @UiThread
    public void showShortToast(String paramString) {
    }

    public void showToastSafe(String paramString) {
    }

    protected BigDecimal subtract(String paramString1, String paramString2) {
        return null;
    }

    protected void uploadPageTrace() {
    }
}
