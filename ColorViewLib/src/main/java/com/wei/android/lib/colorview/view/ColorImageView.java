package com.wei.android.lib.colorview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import com.wei.android.lib.colorview.R;
import com.wei.android.lib.colorview.helper.ColorImageViewHelper;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorImageView extends AppCompatImageView {

    private ColorImageViewHelper mColorImageViewHelper;

    public ColorImageView(Context context) {
        super(context);
        init(null);
    }

    public ColorImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ColorImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ColorImageView);

        mColorImageViewHelper = new ColorImageViewHelper(this,
                typedArray,

                R.styleable.ColorImageView_srcNormal,
                R.styleable.ColorImageView_srcPressed,
                R.styleable.ColorImageView_srcSelected,
                R.styleable.ColorImageView_srcChecked,
                R.styleable.ColorImageView_srcUnable,

                R.styleable.ColorImageView_backgroundColorNormal,
                R.styleable.ColorImageView_backgroundColorPressed,
                R.styleable.ColorImageView_backgroundColorSelected,
                R.styleable.ColorImageView_backgroundColorChecked,
                R.styleable.ColorImageView_backgroundColorUnable,

                R.styleable.ColorImageView_backgroundDrawableNormal,
                R.styleable.ColorImageView_backgroundDrawablePressed,
                R.styleable.ColorImageView_backgroundDrawableSelected,
                R.styleable.ColorImageView_backgroundDrawableChecked,
                R.styleable.ColorImageView_backgroundDrawableUnable,

                R.styleable.ColorImageView_gradientOrientationNormal,
                R.styleable.ColorImageView_gradientOrientationPressed,
                R.styleable.ColorImageView_gradientOrientationSelected,
                R.styleable.ColorImageView_gradientOrientationChecked,
                R.styleable.ColorImageView_gradientOrientationUnable,

                R.styleable.ColorImageView_gradientCenterXNormal,
                R.styleable.ColorImageView_gradientCenterXPressed,
                R.styleable.ColorImageView_gradientCenterXSelected,
                R.styleable.ColorImageView_gradientCenterXChecked,
                R.styleable.ColorImageView_gradientCenterXUnable,

                R.styleable.ColorImageView_gradientCenterYNormal,
                R.styleable.ColorImageView_gradientCenterYPressed,
                R.styleable.ColorImageView_gradientCenterYSelected,
                R.styleable.ColorImageView_gradientCenterYChecked,
                R.styleable.ColorImageView_gradientCenterYUnable,

                R.styleable.ColorImageView_gradientStartColorNormal,
                R.styleable.ColorImageView_gradientStartColorPressed,
                R.styleable.ColorImageView_gradientStartColorSelected,
                R.styleable.ColorImageView_gradientStartColorChecked,
                R.styleable.ColorImageView_gradientStartColorUnable,

                R.styleable.ColorImageView_gradientCenterColorNormal,
                R.styleable.ColorImageView_gradientCenterColorPressed,
                R.styleable.ColorImageView_gradientCenterColorSelected,
                R.styleable.ColorImageView_gradientCenterColorChecked,
                R.styleable.ColorImageView_gradientCenterColorUnable,

                R.styleable.ColorImageView_gradientEndColorNormal,
                R.styleable.ColorImageView_gradientEndColorPressed,
                R.styleable.ColorImageView_gradientEndColorSelected,
                R.styleable.ColorImageView_gradientEndColorChecked,
                R.styleable.ColorImageView_gradientEndColorUnable,

                R.styleable.ColorImageView_gradientRadiusNormal,
                R.styleable.ColorImageView_gradientRadiusPressed,
                R.styleable.ColorImageView_gradientRadiusSelected,
                R.styleable.ColorImageView_gradientRadiusChecked,
                R.styleable.ColorImageView_gradientRadiusUnable,

                R.styleable.ColorImageView_gradientTypeNormal,
                R.styleable.ColorImageView_gradientTypePressed,
                R.styleable.ColorImageView_gradientTypeSelected,
                R.styleable.ColorImageView_gradientTypeChecked,
                R.styleable.ColorImageView_gradientTypeUnable,

                R.styleable.ColorImageView_cornerRadiusNormal,
                R.styleable.ColorImageView_cornerRadiusPressed,
                R.styleable.ColorImageView_cornerRadiusSelected,
                R.styleable.ColorImageView_cornerRadiusChecked,
                R.styleable.ColorImageView_cornerRadiusUnable,

                R.styleable.ColorImageView_cornerRadiusTopLeftNormal,
                R.styleable.ColorImageView_cornerRadiusTopLeftPressed,
                R.styleable.ColorImageView_cornerRadiusTopLeftSelected,
                R.styleable.ColorImageView_cornerRadiusTopLeftChecked,
                R.styleable.ColorImageView_cornerRadiusTopLeftUnable,

                R.styleable.ColorImageView_cornerRadiusTopRightNormal,
                R.styleable.ColorImageView_cornerRadiusTopRightPressed,
                R.styleable.ColorImageView_cornerRadiusTopRightSelected,
                R.styleable.ColorImageView_cornerRadiusTopRightChecked,
                R.styleable.ColorImageView_cornerRadiusTopRightUnable,

                R.styleable.ColorImageView_cornerRadiusBottomLeftNormal,
                R.styleable.ColorImageView_cornerRadiusBottomLeftPressed,
                R.styleable.ColorImageView_cornerRadiusBottomLeftSelected,
                R.styleable.ColorImageView_cornerRadiusBottomLeftChecked,
                R.styleable.ColorImageView_cornerRadiusBottomLeftUnable,

                R.styleable.ColorImageView_cornerRadiusBottomRightNormal,
                R.styleable.ColorImageView_cornerRadiusBottomRightPressed,
                R.styleable.ColorImageView_cornerRadiusBottomRightSelected,
                R.styleable.ColorImageView_cornerRadiusBottomRightChecked,
                R.styleable.ColorImageView_cornerRadiusBottomRightUnable,

                R.styleable.ColorImageView_borderWidthNormal,
                R.styleable.ColorImageView_borderWidthPressed,
                R.styleable.ColorImageView_borderWidthSelected,
                R.styleable.ColorImageView_borderWidthChecked,
                R.styleable.ColorImageView_borderWidthUnable,

                R.styleable.ColorImageView_borderDashWidthNormal,
                R.styleable.ColorImageView_borderDashWidthPressed,
                R.styleable.ColorImageView_borderDashWidthSelected,
                R.styleable.ColorImageView_borderDashWidthChecked,
                R.styleable.ColorImageView_borderDashWidthUnable,

                R.styleable.ColorImageView_borderDashGapNormal,
                R.styleable.ColorImageView_borderDashGapPressed,
                R.styleable.ColorImageView_borderDashGapSelected,
                R.styleable.ColorImageView_borderDashGapChecked,
                R.styleable.ColorImageView_borderDashGapUnable,

                R.styleable.ColorImageView_borderColorNormal,
                R.styleable.ColorImageView_borderColorPressed,
                R.styleable.ColorImageView_borderColorSelected,
                R.styleable.ColorImageView_borderColorChecked,
                R.styleable.ColorImageView_borderColorUnable);

        typedArray.recycle();
    }

    public ColorImageViewHelper getColorHelper() {
        return mColorImageViewHelper;
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

    @Deprecated
    @Override
    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
    }
}
