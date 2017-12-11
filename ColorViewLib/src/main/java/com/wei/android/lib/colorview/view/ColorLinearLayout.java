package com.wei.android.lib.colorview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.wei.android.lib.colorview.R;
import com.wei.android.lib.colorview.helper.ColorViewHelper;

/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorLinearLayout extends LinearLayout {

    private ColorViewHelper<View> mColorViewHelper;

    public ColorLinearLayout(Context context) {
        super(context);
        init(null);
    }

    public ColorLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ColorLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ColorLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ColorLinearLayout);

        mColorViewHelper = new ColorViewHelper<View>(
                this, typedArray,
                R.styleable.ColorLinearLayout_backgroundColorNormal,
                R.styleable.ColorLinearLayout_backgroundColorPressed,
                R.styleable.ColorLinearLayout_backgroundColorSelected,
                R.styleable.ColorLinearLayout_backgroundColorChecked,
                R.styleable.ColorLinearLayout_backgroundColorUnable,
                R.styleable.ColorLinearLayout_backgroundDrawableNormal,
                R.styleable.ColorLinearLayout_backgroundDrawablePressed,
                R.styleable.ColorLinearLayout_backgroundDrawableSelected,
                R.styleable.ColorLinearLayout_backgroundDrawableChecked,
                R.styleable.ColorLinearLayout_backgroundDrawableUnable,
                R.styleable.ColorLinearLayout_borderColorNormal,
                R.styleable.ColorLinearLayout_borderColorPressed,
                R.styleable.ColorLinearLayout_borderColorSelected,
                R.styleable.ColorLinearLayout_borderColorChecked,
                R.styleable.ColorLinearLayout_borderColorUnable,
                R.styleable.ColorLinearLayout_borderWidth,
                R.styleable.ColorLinearLayout_borderDashGap,
                R.styleable.ColorLinearLayout_borderDashWidth,
                R.styleable.ColorLinearLayout_cornerRadius,
                R.styleable.ColorLinearLayout_cornerRadiusTopLeft,
                R.styleable.ColorLinearLayout_cornerRadiusTopRight,
                R.styleable.ColorLinearLayout_cornerRadiusBottomLeft,
                R.styleable.ColorLinearLayout_cornerRadiusBottomRight
        );

        typedArray.recycle();
    }

    public ColorViewHelper getColorViewHelper() {
        return mColorViewHelper;
    }

    @Deprecated
    @Override
    public void setBackground(Drawable background) {
        super.setBackground(background);
    }

    @Deprecated
    @Override
    public void setBackgroundColor(@ColorInt int color) {
        super.setBackgroundColor(color);
    }

    @Deprecated
    @Override
    public void setBackgroundResource(@DrawableRes int resid) {
        super.setBackgroundResource(resid);
    }
}
