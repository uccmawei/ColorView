package com.wei.android.lib.colorview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

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

        mColorViewHelper = new ColorViewHelper<View>(this,
                typedArray,

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

                R.styleable.ColorRelativeLayout_gradientOrientationNormal,
                R.styleable.ColorRelativeLayout_gradientOrientationPressed,
                R.styleable.ColorRelativeLayout_gradientOrientationSelected,
                R.styleable.ColorRelativeLayout_gradientOrientationChecked,
                R.styleable.ColorRelativeLayout_gradientOrientationUnable,

                R.styleable.ColorRelativeLayout_gradientCenterXNormal,
                R.styleable.ColorRelativeLayout_gradientCenterXPressed,
                R.styleable.ColorRelativeLayout_gradientCenterXSelected,
                R.styleable.ColorRelativeLayout_gradientCenterXChecked,
                R.styleable.ColorRelativeLayout_gradientCenterXUnable,

                R.styleable.ColorRelativeLayout_gradientCenterYNormal,
                R.styleable.ColorRelativeLayout_gradientCenterYPressed,
                R.styleable.ColorRelativeLayout_gradientCenterYSelected,
                R.styleable.ColorRelativeLayout_gradientCenterYChecked,
                R.styleable.ColorRelativeLayout_gradientCenterYUnable,

                R.styleable.ColorRelativeLayout_gradientStartColorNormal,
                R.styleable.ColorRelativeLayout_gradientStartColorPressed,
                R.styleable.ColorRelativeLayout_gradientStartColorSelected,
                R.styleable.ColorRelativeLayout_gradientStartColorChecked,
                R.styleable.ColorRelativeLayout_gradientStartColorUnable,

                R.styleable.ColorRelativeLayout_gradientCenterColorNormal,
                R.styleable.ColorRelativeLayout_gradientCenterColorPressed,
                R.styleable.ColorRelativeLayout_gradientCenterColorSelected,
                R.styleable.ColorRelativeLayout_gradientCenterColorChecked,
                R.styleable.ColorRelativeLayout_gradientCenterColorUnable,

                R.styleable.ColorRelativeLayout_gradientEndColorNormal,
                R.styleable.ColorRelativeLayout_gradientEndColorPressed,
                R.styleable.ColorRelativeLayout_gradientEndColorSelected,
                R.styleable.ColorRelativeLayout_gradientEndColorChecked,
                R.styleable.ColorRelativeLayout_gradientEndColorUnable,

                R.styleable.ColorRelativeLayout_gradientRadiusNormal,
                R.styleable.ColorRelativeLayout_gradientRadiusPressed,
                R.styleable.ColorRelativeLayout_gradientRadiusSelected,
                R.styleable.ColorRelativeLayout_gradientRadiusChecked,
                R.styleable.ColorRelativeLayout_gradientRadiusUnable,

                R.styleable.ColorRelativeLayout_gradientTypeNormal,
                R.styleable.ColorRelativeLayout_gradientTypePressed,
                R.styleable.ColorRelativeLayout_gradientTypeSelected,
                R.styleable.ColorRelativeLayout_gradientTypeChecked,
                R.styleable.ColorRelativeLayout_gradientTypeUnable,

                R.styleable.ColorRelativeLayout_cornerRadiusNormal,
                R.styleable.ColorRelativeLayout_cornerRadiusPressed,
                R.styleable.ColorRelativeLayout_cornerRadiusSelected,
                R.styleable.ColorRelativeLayout_cornerRadiusChecked,
                R.styleable.ColorRelativeLayout_cornerRadiusUnable,

                R.styleable.ColorRelativeLayout_cornerRadiusTopLeftNormal,
                R.styleable.ColorRelativeLayout_cornerRadiusTopLeftPressed,
                R.styleable.ColorRelativeLayout_cornerRadiusTopLeftSelected,
                R.styleable.ColorRelativeLayout_cornerRadiusTopLeftChecked,
                R.styleable.ColorRelativeLayout_cornerRadiusTopLeftUnable,

                R.styleable.ColorRelativeLayout_cornerRadiusTopRightNormal,
                R.styleable.ColorRelativeLayout_cornerRadiusTopRightPressed,
                R.styleable.ColorRelativeLayout_cornerRadiusTopRightSelected,
                R.styleable.ColorRelativeLayout_cornerRadiusTopRightChecked,
                R.styleable.ColorRelativeLayout_cornerRadiusTopRightUnable,

                R.styleable.ColorRelativeLayout_cornerRadiusBottomLeftNormal,
                R.styleable.ColorRelativeLayout_cornerRadiusBottomLeftPressed,
                R.styleable.ColorRelativeLayout_cornerRadiusBottomLeftSelected,
                R.styleable.ColorRelativeLayout_cornerRadiusBottomLeftChecked,
                R.styleable.ColorRelativeLayout_cornerRadiusBottomLeftUnable,

                R.styleable.ColorRelativeLayout_cornerRadiusBottomRightNormal,
                R.styleable.ColorRelativeLayout_cornerRadiusBottomRightPressed,
                R.styleable.ColorRelativeLayout_cornerRadiusBottomRightSelected,
                R.styleable.ColorRelativeLayout_cornerRadiusBottomRightChecked,
                R.styleable.ColorRelativeLayout_cornerRadiusBottomRightUnable,

                R.styleable.ColorRelativeLayout_borderWidthNormal,
                R.styleable.ColorRelativeLayout_borderWidthPressed,
                R.styleable.ColorRelativeLayout_borderWidthSelected,
                R.styleable.ColorRelativeLayout_borderWidthChecked,
                R.styleable.ColorRelativeLayout_borderWidthUnable,

                R.styleable.ColorRelativeLayout_borderDashWidthNormal,
                R.styleable.ColorRelativeLayout_borderDashWidthPressed,
                R.styleable.ColorRelativeLayout_borderDashWidthSelected,
                R.styleable.ColorRelativeLayout_borderDashWidthChecked,
                R.styleable.ColorRelativeLayout_borderDashWidthUnable,

                R.styleable.ColorRelativeLayout_borderDashGapNormal,
                R.styleable.ColorRelativeLayout_borderDashGapPressed,
                R.styleable.ColorRelativeLayout_borderDashGapSelected,
                R.styleable.ColorRelativeLayout_borderDashGapChecked,
                R.styleable.ColorRelativeLayout_borderDashGapUnable,

                R.styleable.ColorRelativeLayout_borderColorNormal,
                R.styleable.ColorRelativeLayout_borderColorPressed,
                R.styleable.ColorRelativeLayout_borderColorSelected,
                R.styleable.ColorRelativeLayout_borderColorChecked,
                R.styleable.ColorRelativeLayout_borderColorUnable,

                R.styleable.ColorRelativeLayout_backgroundTintPressed);

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
