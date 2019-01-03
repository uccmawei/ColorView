package com.wei.android.lib.colorview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.wei.android.lib.colorview.R;
import com.wei.android.lib.colorview.helper.ColorViewHelper;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorFrameLayout extends FrameLayout {

    private ColorViewHelper<View> mColorViewHelper;

    public ColorFrameLayout(@NonNull Context context) {
        super(context);
        init(null);
    }

    public ColorFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ColorFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ColorFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ColorFrameLayout);

        mColorViewHelper = new ColorViewHelper<View>(this,
                typedArray,

                R.styleable.ColorFrameLayout_backgroundColorNormal,
                R.styleable.ColorFrameLayout_backgroundColorPressed,
                R.styleable.ColorFrameLayout_backgroundColorSelected,
                R.styleable.ColorFrameLayout_backgroundColorChecked,
                R.styleable.ColorFrameLayout_backgroundColorUnable,

                R.styleable.ColorFrameLayout_backgroundDrawableNormal,
                R.styleable.ColorFrameLayout_backgroundDrawablePressed,
                R.styleable.ColorFrameLayout_backgroundDrawableSelected,
                R.styleable.ColorFrameLayout_backgroundDrawableChecked,
                R.styleable.ColorFrameLayout_backgroundDrawableUnable,

                R.styleable.ColorFrameLayout_gradientOrientationNormal,
                R.styleable.ColorFrameLayout_gradientOrientationPressed,
                R.styleable.ColorFrameLayout_gradientOrientationSelected,
                R.styleable.ColorFrameLayout_gradientOrientationChecked,
                R.styleable.ColorFrameLayout_gradientOrientationUnable,

                R.styleable.ColorFrameLayout_gradientCenterXNormal,
                R.styleable.ColorFrameLayout_gradientCenterXPressed,
                R.styleable.ColorFrameLayout_gradientCenterXSelected,
                R.styleable.ColorFrameLayout_gradientCenterXChecked,
                R.styleable.ColorFrameLayout_gradientCenterXUnable,

                R.styleable.ColorFrameLayout_gradientCenterYNormal,
                R.styleable.ColorFrameLayout_gradientCenterYPressed,
                R.styleable.ColorFrameLayout_gradientCenterYSelected,
                R.styleable.ColorFrameLayout_gradientCenterYChecked,
                R.styleable.ColorFrameLayout_gradientCenterYUnable,

                R.styleable.ColorFrameLayout_gradientStartColorNormal,
                R.styleable.ColorFrameLayout_gradientStartColorPressed,
                R.styleable.ColorFrameLayout_gradientStartColorSelected,
                R.styleable.ColorFrameLayout_gradientStartColorChecked,
                R.styleable.ColorFrameLayout_gradientStartColorUnable,

                R.styleable.ColorFrameLayout_gradientCenterColorNormal,
                R.styleable.ColorFrameLayout_gradientCenterColorPressed,
                R.styleable.ColorFrameLayout_gradientCenterColorSelected,
                R.styleable.ColorFrameLayout_gradientCenterColorChecked,
                R.styleable.ColorFrameLayout_gradientCenterColorUnable,

                R.styleable.ColorFrameLayout_gradientEndColorNormal,
                R.styleable.ColorFrameLayout_gradientEndColorPressed,
                R.styleable.ColorFrameLayout_gradientEndColorSelected,
                R.styleable.ColorFrameLayout_gradientEndColorChecked,
                R.styleable.ColorFrameLayout_gradientEndColorUnable,

                R.styleable.ColorFrameLayout_gradientRadiusNormal,
                R.styleable.ColorFrameLayout_gradientRadiusPressed,
                R.styleable.ColorFrameLayout_gradientRadiusSelected,
                R.styleable.ColorFrameLayout_gradientRadiusChecked,
                R.styleable.ColorFrameLayout_gradientRadiusUnable,

                R.styleable.ColorFrameLayout_gradientTypeNormal,
                R.styleable.ColorFrameLayout_gradientTypePressed,
                R.styleable.ColorFrameLayout_gradientTypeSelected,
                R.styleable.ColorFrameLayout_gradientTypeChecked,
                R.styleable.ColorFrameLayout_gradientTypeUnable,

                R.styleable.ColorFrameLayout_cornerRadiusNormal,
                R.styleable.ColorFrameLayout_cornerRadiusPressed,
                R.styleable.ColorFrameLayout_cornerRadiusSelected,
                R.styleable.ColorFrameLayout_cornerRadiusChecked,
                R.styleable.ColorFrameLayout_cornerRadiusUnable,

                R.styleable.ColorFrameLayout_cornerRadiusTopLeftNormal,
                R.styleable.ColorFrameLayout_cornerRadiusTopLeftPressed,
                R.styleable.ColorFrameLayout_cornerRadiusTopLeftSelected,
                R.styleable.ColorFrameLayout_cornerRadiusTopLeftChecked,
                R.styleable.ColorFrameLayout_cornerRadiusTopLeftUnable,

                R.styleable.ColorFrameLayout_cornerRadiusTopRightNormal,
                R.styleable.ColorFrameLayout_cornerRadiusTopRightPressed,
                R.styleable.ColorFrameLayout_cornerRadiusTopRightSelected,
                R.styleable.ColorFrameLayout_cornerRadiusTopRightChecked,
                R.styleable.ColorFrameLayout_cornerRadiusTopRightUnable,

                R.styleable.ColorFrameLayout_cornerRadiusBottomLeftNormal,
                R.styleable.ColorFrameLayout_cornerRadiusBottomLeftPressed,
                R.styleable.ColorFrameLayout_cornerRadiusBottomLeftSelected,
                R.styleable.ColorFrameLayout_cornerRadiusBottomLeftChecked,
                R.styleable.ColorFrameLayout_cornerRadiusBottomLeftUnable,

                R.styleable.ColorFrameLayout_cornerRadiusBottomRightNormal,
                R.styleable.ColorFrameLayout_cornerRadiusBottomRightPressed,
                R.styleable.ColorFrameLayout_cornerRadiusBottomRightSelected,
                R.styleable.ColorFrameLayout_cornerRadiusBottomRightChecked,
                R.styleable.ColorFrameLayout_cornerRadiusBottomRightUnable,

                R.styleable.ColorFrameLayout_borderWidthNormal,
                R.styleable.ColorFrameLayout_borderWidthPressed,
                R.styleable.ColorFrameLayout_borderWidthSelected,
                R.styleable.ColorFrameLayout_borderWidthChecked,
                R.styleable.ColorFrameLayout_borderWidthUnable,

                R.styleable.ColorFrameLayout_borderDashWidthNormal,
                R.styleable.ColorFrameLayout_borderDashWidthPressed,
                R.styleable.ColorFrameLayout_borderDashWidthSelected,
                R.styleable.ColorFrameLayout_borderDashWidthChecked,
                R.styleable.ColorFrameLayout_borderDashWidthUnable,

                R.styleable.ColorFrameLayout_borderDashGapNormal,
                R.styleable.ColorFrameLayout_borderDashGapPressed,
                R.styleable.ColorFrameLayout_borderDashGapSelected,
                R.styleable.ColorFrameLayout_borderDashGapChecked,
                R.styleable.ColorFrameLayout_borderDashGapUnable,

                R.styleable.ColorFrameLayout_borderColorNormal,
                R.styleable.ColorFrameLayout_borderColorPressed,
                R.styleable.ColorFrameLayout_borderColorSelected,
                R.styleable.ColorFrameLayout_borderColorChecked,
                R.styleable.ColorFrameLayout_borderColorUnable,

                R.styleable.ColorFrameLayout_backgroundTintPressed);

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
