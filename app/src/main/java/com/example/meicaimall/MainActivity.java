package com.example.meicaimall;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.ViewStub;
import android.widget.FrameLayout;

import com.example.meicaimall.activity.BaseActivity;
import com.example.meicaimall.fragment.MainFragment;
import com.example.meicaimall.fragment.MyStoreFragmentNew;
import com.example.meicaimall.fragment.ShopCartFragmentNew;
import com.example.meicaimall.view.pagerindicator.MyTabWidget;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements MyTabWidget.OnTabSelectedListener {

    @BindView(R.id.viewstub_main_load)
    ViewStub viewstubMainLoad;
    @BindView(R.id.center_layout)
    FrameLayout centerLayout;
    @BindView(R.id.tab_widget)
    MyTabWidget mTabWidget;

    FragmentManager mFragmentManager;
    int mIndex;
    MainFragment mMainFragment;
    MyStoreFragmentNew mMyStoreFragment;
    ShopCartFragmentNew mShopCatFragment;

    @Override
    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initview();
    }

    private void initview() {


    }

    @Override
    public String getRef() {
        return null;
    }

    @Override
    public void onTabSelected(int paramInt) {

    }


//    private AppUpdateEngine appUpdateEngine;
//    private String class1Id;
//    Context context;
//    @RestService
//    IAppUpdateService iAppUpdateService;
//    private BadgeView mBadgeView;
//    private long mExitTime;
//    FragmentManager mFragmentManager;
//    int mIndex;
//    MainFragment mMainFragment;
//    MyStoreFragmentNew mMyStoreFragment;
//    ShopCartFragmentNew mShopCatFragment;
//    @ViewById(2131493001)
//    MyTabWidget mTabWidget;
//    private BadgeView mineRedDot;
//    GoodFragment morderFragment;
//    @Bean
//    NetUtils netUtils;
//    NoLoginFragment noLoginFragment;
//    @RestService
//    IPayCenter payCenter;
//    private ProgressDialog progressDialog;
//    @Pref
//    UserPrefs_ userPrefs;
//    @ViewById
//    ViewStub viewstub_main_load;
//
//    private void downloadFail() {}
//
//    private void hideFragments(FragmentTransaction paramFragmentTransaction) {}
//
//    private void initAppUpdateEngine() {}
//
//    private void initEventbus() {}
//
//    private void initRedDot() {}
//
//    private void loadDebtInfo() {}
//
//    public void checkUpdateResult(boolean paramBoolean) {}
//
//    public GoodFragment getMorderFragment()
//    {
//        return this.morderFragment;
//    }
//
//    public BadgeView getmBadgeView()
//    {
//        return this.mBadgeView;
//    }
//
//    public MyTabWidget getmTabWidget()
//    {
//        return this.mTabWidget;
//    }
//
//    public void hideCheckUpdateLoading() {}
//
//    @AfterViews
//    void init() {}
//
//    public void isUpdate(int paramInt) {}
//
//    protected void onDestroy() {}
//
//    public void onEventMainThread(DebtNotifyEvent paramDebtNotifyEvent) {}
//
//    public void onEventMainThread(DownloadPersentEvent paramDownloadPersentEvent) {}
//
//    public void onEventMainThread(GoHomePageEvent paramGoHomePageEvent) {}
//
//    public void onEventMainThread(InvalideUtokenEvent paramInvalideUtokenEvent) {}
//
//    public void onEventMainThread(LocationEvent paramLocationEvent) {}
//
//    public void onEventMainThread(LoginEvent paramLoginEvent) {}
//
//    public void onEventMainThread(LogoutEvent paramLogoutEvent) {}
//
//    public void onEventMainThread(MainLoadDataDoneEvent paramMainLoadDataDoneEvent) {}
//
//    public void onEventMainThread(PriceChangeEvent paramPriceChangeEvent) {}
//
//    public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
//    {
//        return false;
//    }
//
//    protected void onRestoreInstanceState(Bundle paramBundle) {}
//
//    public void onResume() {}
//
//    protected void onSaveInstanceState(Bundle paramBundle) {}
//
//    public void onTabSelected(int paramInt) {}
}
