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

import com.wei.android.lib.colorview.R;
import com.wei.android.lib.colorview.helper.ColorViewHelper;

/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorView extends View {

    private ColorViewHelper<View> mColorViewHelper;

    public ColorView(Context context) {
        super(context);
        init(null);
    }

    public ColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ColorView);

        mColorViewHelper = new ColorViewHelper<View>(
                this, typedArray,
                R.styleable.ColorView_backgroundColorNormal,
                R.styleable.ColorView_backgroundColorPressed,
                R.styleable.ColorView_backgroundColorSelected,
                R.styleable.ColorView_backgroundColorChecked,
                R.styleable.ColorView_backgroundColorUnable,
                R.styleable.ColorView_backgroundDrawableNormal,
                R.styleable.ColorView_backgroundDrawablePressed,
                R.styleable.ColorView_backgroundDrawableSelected,
                R.styleable.ColorView_backgroundDrawableChecked,
                R.styleable.ColorView_backgroundDrawableUnable,
                R.styleable.ColorView_borderColorNormal,
                R.styleable.ColorView_borderColorPressed,
                R.styleable.ColorView_borderColorSelected,
                R.styleable.ColorView_borderColorChecked,
                R.styleable.ColorView_borderColorUnable,
                R.styleable.ColorView_borderWidth,
                R.styleable.ColorView_borderDashGap,
                R.styleable.ColorView_borderDashWidth,
                R.styleable.ColorView_cornerRadius,
                R.styleable.ColorView_cornerRadiusTopLeft,
                R.styleable.ColorView_cornerRadiusTopRight,
                R.styleable.ColorView_cornerRadiusBottomLeft,
                R.styleable.ColorView_cornerRadiusBottomRight
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
