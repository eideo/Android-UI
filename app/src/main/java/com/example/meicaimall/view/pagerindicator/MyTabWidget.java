package com.example.meicaimall.view.pagerindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.meicaimall.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/4.
 * 自定义底部tab按钮
 */
public class MyTabWidget extends LinearLayout {
    private static final String TAG = "MyTabWidget";
    private int[] mDrawableIds = new int[]{R.mipmap.listpage_icon_home_pressed,
            R.mipmap.listpage_icon_detail_formal, R.mipmap.listpage_icon_recommend_formal,
            R.mipmap.listpage_icon_cart_formal, R.mipmap.listpage_icon_person_formal};
    private CharSequence[] mLabels; //底部文字数组
    private CharSequence tab_name;
    private OnTabSelectedListener mTabListener;
    // 存放底部菜单的各个文字CheckedTextView
    private List<CheckedTextView> mCheckedList = new ArrayList<>();
    // 存放底部菜单每项View
    private List<View> mViewList = new ArrayList<>();
    // 存放指示点
    private List<TextView> mIndicateImgs = new ArrayList<>();

    public MyTabWidget(Context context) {
        super(context, null);
    }

    public MyTabWidget(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public MyTabWidget(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.TabWidget, defStyleAttr, 0);
        // 读取xml中，各个tab使用的文字
        mLabels = a.getTextArray(R.styleable.TabWidget_bottom_labels);
//        tab_name = a.getText(R.styleable.TabWidget_tab_name);
        // mIcons = ()a.getTextArray(R.styleable.TabWidget_tab_icon);
        // mIcons = a.getDrawable( R.styleable.TabWidget_tab_icon);
        // Bitmap mIconBitmap = drawable.getBitmap();
        // images = context.getResources().getIntArray(
        // R.array.userinformationimages);
        Log.i(TAG, "mLabels.siza = " + mLabels.length);
        if (null == mLabels || mLabels.length <= 0) {
            try {
                throw new Exception("异常提醒");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                Log.i(TAG, MyTabWidget.class.getSimpleName() + "类名");
            }
            a.recycle();
            return;
        }
        a.recycle();
        // 初始化控件
        init(context);
    }


    private void init(final Context context) {
        this.setOrientation(LinearLayout.HORIZONTAL);
        // this.setBackgroundResource(R.drawable.index_bottom_bar);
        this.setBackgroundResource(R.color.white);
        this.setPadding(0, 1, 0, 0);
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT);
        params.weight = 1.0f;
        params.gravity = Gravity.CENTER;
        int size = mLabels.length;
//        if (tab_name.equals(getResources().getString(R.string.tab_phone))) {
//            // mDrawableIds = new int[] { R.drawable.bg_home_yellow_gray,
//            // R.drawable.bg_category, R.drawable.bg_cart,
//            // R.drawable.bg_setting };
//            // mDrawableIds =
//            // getResources().getIntArray(R.array.tab_phone_icons);
//            mDrawableIds = new int[] { R.drawable.phone_call,
//                    R.drawable.phone_recent, R.drawable.phone_list_o1_b1,
//                    R.drawable.phone_money, R.drawable.phone_charge };
//        }
        for (int i = 0; i < size; i++) {
            final int index = i;
            // 每个tab对应的layout
            final View view = inflater.inflate(R.layout.tab_item, null);
            final CheckedTextView itemName = (CheckedTextView) view
                    .findViewById(R.id.item_name);
            itemName.setCompoundDrawablesWithIntrinsicBounds(null, context
                    .getResources().getDrawable(mDrawableIds[i]), null, null);
            itemName.setText(mLabels[i]);
            // 指示点ImageView，如有版本更新需要显示
//            final TextView indicateImg = (TextView) view
//                    .findViewById(R.id.indicate_img);

            this.addView(view, params);
            // BadgeView badgeView =new BadgeView(context, itemName);
            // badgeView.setText("5");
            // badgeView.setPadding(10, 0, 0, 0);
            // badgeView.show();

            // CheckedTextView设置索引作为tag，以便后续更改颜色、图片等
            itemName.setTag(index);
            // 将CheckedTextView添加到list中，便于操作
            mCheckedList.add(itemName);
            // 将指示图片加到list，便于控制显示隐藏
//            mIndicateImgs.add(indicateImg);
            // 将各个tab的View添加到list
            mViewList.add(view);
            view.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    // 设置底部图片和文字的显示
                    setTabsDisplay(context, index);
                    if (null != mTabListener) {
                        // tab项被选中的回调事件
                        mTabListener.onTabSelected(index);
                    }
                }
            });

            // 初始化 底部菜单选中状态,默认第一个选中
            if (i == 0) {
                itemName.setChecked(true);
                itemName.setTextColor(getResources().getColor(R.color.main_tab_pressed));
                // view.setBackgroundColor(Color.rgb(240, 241, 242));
            } else {
                itemName.setChecked(false);
                itemName.setTextColor(getResources().getColor(R.color.main_tab_normal));
                // view.setBackgroundColor(Color.rgb(250, 250, 250));
            }

        }
    }

    /**
     * 设置指示点的显示
     */
//    public void setIndicateDisplay(Context context, String shoppingNumber,
//                                   boolean visible) {
//        int size = mIndicateImgs.size();
//        // 设置显示位置
//        final int position = 2;
//        if (size <= position) {
//            return;
//        }
//        TextView indicateImg = mIndicateImgs.get(position);
//        indicateImg.setVisibility(visible ? View.VISIBLE : View.GONE);
//        indicateImg.setText(shoppingNumber);
//    }
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthSpecMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSpecSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightSpecMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSpecSize = MeasureSpec.getSize(heightMeasureSpec);

        if (widthSpecMode != MeasureSpec.EXACTLY) {
            widthSpecSize = 0;
        }
        if (heightSpecMode != MeasureSpec.EXACTLY) {
            heightSpecSize = 0;
        }
        if (widthSpecMode == MeasureSpec.UNSPECIFIED
                || heightSpecMode == MeasureSpec.UNSPECIFIED) {
        }
        // 控件的最大高度，就是下边tab的背景最大高度
        int width;
        int height;
        width = Math.max(getMeasuredWidth(), widthSpecSize);
        height = getResources().getDimensionPixelSize(R.dimen.go_market_height);
        // height =
        // Math.max(this.getBackground().getIntrinsicHeight(),heightSpecSize);
        setMeasuredDimension(width, height);
    }

    /**
     * 设置底部tab选中变化
     *
     * @param context
     * @param index
     */
    public void setTabsDisplay(Context context, int index) {
        int size = mCheckedList.size();
        for (int i = 0; i < size; i++) {
            CheckedTextView checkedTextView = mCheckedList.get(i);
            if ((Integer) (checkedTextView.getTag()) == index) {
                Log.i(TAG, mLabels[index] + " is selected...");
                checkedTextView.setChecked(true);
                checkedTextView.setTextColor(getResources().getColor(
                        R.color.main_tab_pressed));
                // mViewList.get(i).setBackgroundColor(Color.rgb(240, 241,
                // 242));
            } else {
                checkedTextView.setChecked(false);
                checkedTextView.setTextColor(getResources().getColor(
                        R.color.main_tab_normal));
                // mViewList.get(i).setBackgroundColor(Color.rgb(250, 250,
                // 250));
            }
        }
    }

    public void setOnTabSelectedListener(OnTabSelectedListener paramOnTabSelectedListener) {
        this.mTabListener = paramOnTabSelectedListener;
    }


    public static abstract interface OnTabSelectedListener {
        void onTabSelected(int paramInt);
    }
}
