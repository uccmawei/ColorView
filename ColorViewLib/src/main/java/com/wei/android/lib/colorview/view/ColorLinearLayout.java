package com.wei.android.lib.colorview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.wei.android.lib.colorview.R;
import com.wei.android.lib.colorview.helper.ColorViewHelper;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

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

        mColorViewHelper = new ColorViewHelper<View>(this,
                typedArray,

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

                R.styleable.ColorLinearLayout_gradientOrientationNormal,
                R.styleable.ColorLinearLayout_gradientOrientationPressed,
                R.styleable.ColorLinearLayout_gradientOrientationSelected,
                R.styleable.ColorLinearLayout_gradientOrientationChecked,
                R.styleable.ColorLinearLayout_gradientOrientationUnable,

                R.styleable.ColorLinearLayout_gradientCenterXNormal,
                R.styleable.ColorLinearLayout_gradientCenterXPressed,
                R.styleable.ColorLinearLayout_gradientCenterXSelected,
                R.styleable.ColorLinearLayout_gradientCenterXChecked,
                R.styleable.ColorLinearLayout_gradientCenterXUnable,

                R.styleable.ColorLinearLayout_gradientCenterYNormal,
                R.styleable.ColorLinearLayout_gradientCenterYPressed,
                R.styleable.ColorLinearLayout_gradientCenterYSelected,
                R.styleable.ColorLinearLayout_gradientCenterYChecked,
                R.styleable.ColorLinearLayout_gradientCenterYUnable,

                R.styleable.ColorLinearLayout_gradientStartColorNormal,
                R.styleable.ColorLinearLayout_gradientStartColorPressed,
                R.styleable.ColorLinearLayout_gradientStartColorSelected,
                R.styleable.ColorLinearLayout_gradientStartColorChecked,
                R.styleable.ColorLinearLayout_gradientStartColorUnable,

                R.styleable.ColorLinearLayout_gradientCenterColorNormal,
                R.styleable.ColorLinearLayout_gradientCenterColorPressed,
                R.styleable.ColorLinearLayout_gradientCenterColorSelected,
                R.styleable.ColorLinearLayout_gradientCenterColorChecked,
                R.styleable.ColorLinearLayout_gradientCenterColorUnable,

                R.styleable.ColorLinearLayout_gradientEndColorNormal,
                R.styleable.ColorLinearLayout_gradientEndColorPressed,
                R.styleable.ColorLinearLayout_gradientEndColorSelected,
                R.styleable.ColorLinearLayout_gradientEndColorChecked,
                R.styleable.ColorLinearLayout_gradientEndColorUnable,

                R.styleable.ColorLinearLayout_gradientRadiusNormal,
                R.styleable.ColorLinearLayout_gradientRadiusPressed,
                R.styleable.ColorLinearLayout_gradientRadiusSelected,
                R.styleable.ColorLinearLayout_gradientRadiusChecked,
                R.styleable.ColorLinearLayout_gradientRadiusUnable,

                R.styleable.ColorLinearLayout_gradientTypeNormal,
                R.styleable.ColorLinearLayout_gradientTypePressed,
                R.styleable.ColorLinearLayout_gradientTypeSelected,
                R.styleable.ColorLinearLayout_gradientTypeChecked,
                R.styleable.ColorLinearLayout_gradientTypeUnable,

                R.styleable.ColorLinearLayout_cornerRadiusNormal,
                R.styleable.ColorLinearLayout_cornerRadiusPressed,
                R.styleable.ColorLinearLayout_cornerRadiusSelected,
                R.styleable.ColorLinearLayout_cornerRadiusChecked,
                R.styleable.ColorLinearLayout_cornerRadiusUnable,

                R.styleable.ColorLinearLayout_cornerRadiusTopLeftNormal,
                R.styleable.ColorLinearLayout_cornerRadiusTopLeftPressed,
                R.styleable.ColorLinearLayout_cornerRadiusTopLeftSelected,
                R.styleable.ColorLinearLayout_cornerRadiusTopLeftChecked,
                R.styleable.ColorLinearLayout_cornerRadiusTopLeftUnable,

                R.styleable.ColorLinearLayout_cornerRadiusTopRightNormal,
                R.styleable.ColorLinearLayout_cornerRadiusTopRightPressed,
                R.styleable.ColorLinearLayout_cornerRadiusTopRightSelected,
                R.styleable.ColorLinearLayout_cornerRadiusTopRightChecked,
                R.styleable.ColorLinearLayout_cornerRadiusTopRightUnable,

                R.styleable.ColorLinearLayout_cornerRadiusBottomLeftNormal,
                R.styleable.ColorLinearLayout_cornerRadiusBottomLeftPressed,
                R.styleable.ColorLinearLayout_cornerRadiusBottomLeftSelected,
                R.styleable.ColorLinearLayout_cornerRadiusBottomLeftChecked,
                R.styleable.ColorLinearLayout_cornerRadiusBottomLeftUnable,

                R.styleable.ColorLinearLayout_cornerRadiusBottomRightNormal,
                R.styleable.ColorLinearLayout_cornerRadiusBottomRightPressed,
                R.styleable.ColorLinearLayout_cornerRadiusBottomRightSelected,
                R.styleable.ColorLinearLayout_cornerRadiusBottomRightChecked,
                R.styleable.ColorLinearLayout_cornerRadiusBottomRightUnable,

                R.styleable.ColorLinearLayout_borderWidthNormal,
                R.styleable.ColorLinearLayout_borderWidthPressed,
                R.styleable.ColorLinearLayout_borderWidthSelected,
                R.styleable.ColorLinearLayout_borderWidthChecked,
                R.styleable.ColorLinearLayout_borderWidthUnable,

                R.styleable.ColorLinearLayout_borderDashWidthNormal,
                R.styleable.ColorLinearLayout_borderDashWidthPressed,
                R.styleable.ColorLinearLayout_borderDashWidthSelected,
                R.styleable.ColorLinearLayout_borderDashWidthChecked,
                R.styleable.ColorLinearLayout_borderDashWidthUnable,

                R.styleable.ColorLinearLayout_borderDashGapNormal,
                R.styleable.ColorLinearLayout_borderDashGapPressed,
                R.styleable.ColorLinearLayout_borderDashGapSelected,
                R.styleable.ColorLinearLayout_borderDashGapChecked,
                R.styleable.ColorLinearLayout_borderDashGapUnable,

                R.styleable.ColorLinearLayout_borderColorNormal,
                R.styleable.ColorLinearLayout_borderColorPressed,
                R.styleable.ColorLinearLayout_borderColorSelected,
                R.styleable.ColorLinearLayout_borderColorChecked,
                R.styleable.ColorLinearLayout_borderColorUnable,

                R.styleable.ColorLinearLayout_backgroundTintPressed);

        typedArray.recycle();
    }

    public ColorViewHelper getColorHelper() {
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
    public void setBackgroundResource(@DrawableRes int resId) {
        super.setBackgroundResource(resId);
    }
}
