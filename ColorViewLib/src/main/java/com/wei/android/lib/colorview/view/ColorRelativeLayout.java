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
import android.widget.RelativeLayout;

import com.wei.android.lib.colorview.R;
import com.wei.android.lib.colorview.helper.ColorViewHelper;

/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorRelativeLayout extends RelativeLayout {

    private ColorViewHelper<View> mColorViewHelper;

    public ColorRelativeLayout(Context context) {
        super(context);
        init(null);
    }

    public ColorRelativeLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ColorRelativeLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ColorRelativeLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ColorRelativeLayout);

        mColorViewHelper = new ColorViewHelper<View>(
                this, typedArray,
                R.styleable.ColorRelativeLayout_backgroundColorNormal,
                R.styleable.ColorRelativeLayout_backgroundColorPressed,
                R.styleable.ColorRelativeLayout_backgroundColorSelected,
                R.styleable.ColorRelativeLayout_backgroundColorChecked,
                R.styleable.ColorRelativeLayout_backgroundColorUnable,
                R.styleable.ColorRelativeLayout_backgroundDrawableNormal,
                R.styleable.ColorRelativeLayout_backgroundDrawablePressed,
                R.styleable.ColorRelativeLayout_backgroundDrawableSelected,
                R.styleable.ColorRelativeLayout_backgroundDrawableChecked,
                R.styleable.ColorRelativeLayout_backgroundDrawableUnable,
                R.styleable.ColorRelativeLayout_borderColorNormal,
                R.styleable.ColorRelativeLayout_borderColorPressed,
                R.styleable.ColorRelativeLayout_borderColorSelected,
                R.styleable.ColorRelativeLayout_borderColorChecked,
                R.styleable.ColorRelativeLayout_borderColorUnable,
                R.styleable.ColorRelativeLayout_borderWidth,
                R.styleable.ColorRelativeLayout_borderDashGap,
                R.styleable.ColorRelativeLayout_borderDashWidth,
                R.styleable.ColorRelativeLayout_cornerRadius,
                R.styleable.ColorRelativeLayout_cornerRadiusTopLeft,
                R.styleable.ColorRelativeLayout_cornerRadiusTopRight,
                R.styleable.ColorRelativeLayout_cornerRadiusBottomLeft,
                R.styleable.ColorRelativeLayout_cornerRadiusBottomRight
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
