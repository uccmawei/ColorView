package com.wei.android.lib.colorview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import com.wei.android.lib.colorview.R;
import com.wei.android.lib.colorview.helper.ColorViewHelper;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

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

        mColorViewHelper = new ColorViewHelper<View>(this,
                typedArray,

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

                R.styleable.ColorView_gradientOrientationNormal,
                R.styleable.ColorView_gradientOrientationPressed,
                R.styleable.ColorView_gradientOrientationSelected,
                R.styleable.ColorView_gradientOrientationChecked,
                R.styleable.ColorView_gradientOrientationUnable,

                R.styleable.ColorView_gradientCenterXNormal,
                R.styleable.ColorView_gradientCenterXPressed,
                R.styleable.ColorView_gradientCenterXSelected,
                R.styleable.ColorView_gradientCenterXChecked,
                R.styleable.ColorView_gradientCenterXUnable,

                R.styleable.ColorView_gradientCenterYNormal,
                R.styleable.ColorView_gradientCenterYPressed,
                R.styleable.ColorView_gradientCenterYSelected,
                R.styleable.ColorView_gradientCenterYChecked,
                R.styleable.ColorView_gradientCenterYUnable,

                R.styleable.ColorView_gradientStartColorNormal,
                R.styleable.ColorView_gradientStartColorPressed,
                R.styleable.ColorView_gradientStartColorSelected,
                R.styleable.ColorView_gradientStartColorChecked,
                R.styleable.ColorView_gradientStartColorUnable,

                R.styleable.ColorView_gradientCenterColorNormal,
                R.styleable.ColorView_gradientCenterColorPressed,
                R.styleable.ColorView_gradientCenterColorSelected,
                R.styleable.ColorView_gradientCenterColorChecked,
                R.styleable.ColorView_gradientCenterColorUnable,

                R.styleable.ColorView_gradientEndColorNormal,
                R.styleable.ColorView_gradientEndColorPressed,
                R.styleable.ColorView_gradientEndColorSelected,
                R.styleable.ColorView_gradientEndColorChecked,
                R.styleable.ColorView_gradientEndColorUnable,

                R.styleable.ColorView_gradientRadiusNormal,
                R.styleable.ColorView_gradientRadiusPressed,
                R.styleable.ColorView_gradientRadiusSelected,
                R.styleable.ColorView_gradientRadiusChecked,
                R.styleable.ColorView_gradientRadiusUnable,

                R.styleable.ColorView_gradientTypeNormal,
                R.styleable.ColorView_gradientTypePressed,
                R.styleable.ColorView_gradientTypeSelected,
                R.styleable.ColorView_gradientTypeChecked,
                R.styleable.ColorView_gradientTypeUnable,

                R.styleable.ColorView_cornerRadiusNormal,
                R.styleable.ColorView_cornerRadiusPressed,
                R.styleable.ColorView_cornerRadiusSelected,
                R.styleable.ColorView_cornerRadiusChecked,
                R.styleable.ColorView_cornerRadiusUnable,

                R.styleable.ColorView_cornerRadiusTopLeftNormal,
                R.styleable.ColorView_cornerRadiusTopLeftPressed,
                R.styleable.ColorView_cornerRadiusTopLeftSelected,
                R.styleable.ColorView_cornerRadiusTopLeftChecked,
                R.styleable.ColorView_cornerRadiusTopLeftUnable,

                R.styleable.ColorView_cornerRadiusTopRightNormal,
                R.styleable.ColorView_cornerRadiusTopRightPressed,
                R.styleable.ColorView_cornerRadiusTopRightSelected,
                R.styleable.ColorView_cornerRadiusTopRightChecked,
                R.styleable.ColorView_cornerRadiusTopRightUnable,

                R.styleable.ColorView_cornerRadiusBottomLeftNormal,
                R.styleable.ColorView_cornerRadiusBottomLeftPressed,
                R.styleable.ColorView_cornerRadiusBottomLeftSelected,
                R.styleable.ColorView_cornerRadiusBottomLeftChecked,
                R.styleable.ColorView_cornerRadiusBottomLeftUnable,

                R.styleable.ColorView_cornerRadiusBottomRightNormal,
                R.styleable.ColorView_cornerRadiusBottomRightPressed,
                R.styleable.ColorView_cornerRadiusBottomRightSelected,
                R.styleable.ColorView_cornerRadiusBottomRightChecked,
                R.styleable.ColorView_cornerRadiusBottomRightUnable,

                R.styleable.ColorView_borderWidthNormal,
                R.styleable.ColorView_borderWidthPressed,
                R.styleable.ColorView_borderWidthSelected,
                R.styleable.ColorView_borderWidthChecked,
                R.styleable.ColorView_borderWidthUnable,

                R.styleable.ColorView_borderDashWidthNormal,
                R.styleable.ColorView_borderDashWidthPressed,
                R.styleable.ColorView_borderDashWidthSelected,
                R.styleable.ColorView_borderDashWidthChecked,
                R.styleable.ColorView_borderDashWidthUnable,

                R.styleable.ColorView_borderDashGapNormal,
                R.styleable.ColorView_borderDashGapPressed,
                R.styleable.ColorView_borderDashGapSelected,
                R.styleable.ColorView_borderDashGapChecked,
                R.styleable.ColorView_borderDashGapUnable,

                R.styleable.ColorView_borderColorNormal,
                R.styleable.ColorView_borderColorPressed,
                R.styleable.ColorView_borderColorSelected,
                R.styleable.ColorView_borderColorChecked,
                R.styleable.ColorView_borderColorUnable);

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
