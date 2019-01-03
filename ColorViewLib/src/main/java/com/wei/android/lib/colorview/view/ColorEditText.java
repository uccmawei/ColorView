package com.wei.android.lib.colorview.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import com.wei.android.lib.colorview.R;
import com.wei.android.lib.colorview.helper.ColorTextViewHelper;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatEditText;

/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorEditText extends AppCompatEditText {

    private ColorTextViewHelper mColorTextViewHelper;

    public ColorEditText(Context context) {
        super(context);
        init(null);
    }

    public ColorEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ColorEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ColorEditText);

        mColorTextViewHelper = new ColorTextViewHelper(this,
                typedArray,

                getCurrentTextColor(),
                R.styleable.ColorEditText_textColorNormal,
                R.styleable.ColorEditText_textColorPressed,
                R.styleable.ColorEditText_textColorSelected,
                R.styleable.ColorEditText_textColorChecked,
                R.styleable.ColorEditText_textColorUnable,

                getCurrentHintTextColor(),
                R.styleable.ColorEditText_textColorHintNormal,
                R.styleable.ColorEditText_textColorHintPressed,
                R.styleable.ColorEditText_textColorHintSelected,
                R.styleable.ColorEditText_textColorHintChecked,
                R.styleable.ColorEditText_textColorHintUnable,

                R.styleable.ColorEditText_backgroundColorNormal,
                R.styleable.ColorEditText_backgroundColorPressed,
                R.styleable.ColorEditText_backgroundColorSelected,
                R.styleable.ColorEditText_backgroundColorChecked,
                R.styleable.ColorEditText_backgroundColorUnable,

                R.styleable.ColorEditText_backgroundDrawableNormal,
                R.styleable.ColorEditText_backgroundDrawablePressed,
                R.styleable.ColorEditText_backgroundDrawableSelected,
                R.styleable.ColorEditText_backgroundDrawableChecked,
                R.styleable.ColorEditText_backgroundDrawableUnable,

                R.styleable.ColorEditText_gradientOrientationNormal,
                R.styleable.ColorEditText_gradientOrientationPressed,
                R.styleable.ColorEditText_gradientOrientationSelected,
                R.styleable.ColorEditText_gradientOrientationChecked,
                R.styleable.ColorEditText_gradientOrientationUnable,

                R.styleable.ColorEditText_gradientCenterXNormal,
                R.styleable.ColorEditText_gradientCenterXPressed,
                R.styleable.ColorEditText_gradientCenterXSelected,
                R.styleable.ColorEditText_gradientCenterXChecked,
                R.styleable.ColorEditText_gradientCenterXUnable,

                R.styleable.ColorEditText_gradientCenterYNormal,
                R.styleable.ColorEditText_gradientCenterYPressed,
                R.styleable.ColorEditText_gradientCenterYSelected,
                R.styleable.ColorEditText_gradientCenterYChecked,
                R.styleable.ColorEditText_gradientCenterYUnable,

                R.styleable.ColorEditText_gradientStartColorNormal,
                R.styleable.ColorEditText_gradientStartColorPressed,
                R.styleable.ColorEditText_gradientStartColorSelected,
                R.styleable.ColorEditText_gradientStartColorChecked,
                R.styleable.ColorEditText_gradientStartColorUnable,

                R.styleable.ColorEditText_gradientCenterColorNormal,
                R.styleable.ColorEditText_gradientCenterColorPressed,
                R.styleable.ColorEditText_gradientCenterColorSelected,
                R.styleable.ColorEditText_gradientCenterColorChecked,
                R.styleable.ColorEditText_gradientCenterColorUnable,

                R.styleable.ColorEditText_gradientEndColorNormal,
                R.styleable.ColorEditText_gradientEndColorPressed,
                R.styleable.ColorEditText_gradientEndColorSelected,
                R.styleable.ColorEditText_gradientEndColorChecked,
                R.styleable.ColorEditText_gradientEndColorUnable,

                R.styleable.ColorEditText_gradientRadiusNormal,
                R.styleable.ColorEditText_gradientRadiusPressed,
                R.styleable.ColorEditText_gradientRadiusSelected,
                R.styleable.ColorEditText_gradientRadiusChecked,
                R.styleable.ColorEditText_gradientRadiusUnable,

                R.styleable.ColorEditText_gradientTypeNormal,
                R.styleable.ColorEditText_gradientTypePressed,
                R.styleable.ColorEditText_gradientTypeSelected,
                R.styleable.ColorEditText_gradientTypeChecked,
                R.styleable.ColorEditText_gradientTypeUnable,

                R.styleable.ColorEditText_cornerRadiusNormal,
                R.styleable.ColorEditText_cornerRadiusPressed,
                R.styleable.ColorEditText_cornerRadiusSelected,
                R.styleable.ColorEditText_cornerRadiusChecked,
                R.styleable.ColorEditText_cornerRadiusUnable,

                R.styleable.ColorEditText_cornerRadiusTopLeftNormal,
                R.styleable.ColorEditText_cornerRadiusTopLeftPressed,
                R.styleable.ColorEditText_cornerRadiusTopLeftSelected,
                R.styleable.ColorEditText_cornerRadiusTopLeftChecked,
                R.styleable.ColorEditText_cornerRadiusTopLeftUnable,

                R.styleable.ColorEditText_cornerRadiusTopRightNormal,
                R.styleable.ColorEditText_cornerRadiusTopRightPressed,
                R.styleable.ColorEditText_cornerRadiusTopRightSelected,
                R.styleable.ColorEditText_cornerRadiusTopRightChecked,
                R.styleable.ColorEditText_cornerRadiusTopRightUnable,

                R.styleable.ColorEditText_cornerRadiusBottomLeftNormal,
                R.styleable.ColorEditText_cornerRadiusBottomLeftPressed,
                R.styleable.ColorEditText_cornerRadiusBottomLeftSelected,
                R.styleable.ColorEditText_cornerRadiusBottomLeftChecked,
                R.styleable.ColorEditText_cornerRadiusBottomLeftUnable,

                R.styleable.ColorEditText_cornerRadiusBottomRightNormal,
                R.styleable.ColorEditText_cornerRadiusBottomRightPressed,
                R.styleable.ColorEditText_cornerRadiusBottomRightSelected,
                R.styleable.ColorEditText_cornerRadiusBottomRightChecked,
                R.styleable.ColorEditText_cornerRadiusBottomRightUnable,

                R.styleable.ColorEditText_borderWidthNormal,
                R.styleable.ColorEditText_borderWidthPressed,
                R.styleable.ColorEditText_borderWidthSelected,
                R.styleable.ColorEditText_borderWidthChecked,
                R.styleable.ColorEditText_borderWidthUnable,

                R.styleable.ColorEditText_borderDashWidthNormal,
                R.styleable.ColorEditText_borderDashWidthPressed,
                R.styleable.ColorEditText_borderDashWidthSelected,
                R.styleable.ColorEditText_borderDashWidthChecked,
                R.styleable.ColorEditText_borderDashWidthUnable,

                R.styleable.ColorEditText_borderDashGapNormal,
                R.styleable.ColorEditText_borderDashGapPressed,
                R.styleable.ColorEditText_borderDashGapSelected,
                R.styleable.ColorEditText_borderDashGapChecked,
                R.styleable.ColorEditText_borderDashGapUnable,

                R.styleable.ColorEditText_borderColorNormal,
                R.styleable.ColorEditText_borderColorPressed,
                R.styleable.ColorEditText_borderColorSelected,
                R.styleable.ColorEditText_borderColorChecked,
                R.styleable.ColorEditText_borderColorUnable,

                R.styleable.ColorEditText_drawableLeftNormal,
                R.styleable.ColorEditText_drawableLeftPressed,
                R.styleable.ColorEditText_drawableLeftSelected,
                R.styleable.ColorEditText_drawableLeftChecked,
                R.styleable.ColorEditText_drawableLeftUnable,

                R.styleable.ColorEditText_drawableTopNormal,
                R.styleable.ColorEditText_drawableTopPressed,
                R.styleable.ColorEditText_drawableTopSelected,
                R.styleable.ColorEditText_drawableTopChecked,
                R.styleable.ColorEditText_drawableTopUnable,

                R.styleable.ColorEditText_drawableRightNormal,
                R.styleable.ColorEditText_drawableRightPressed,
                R.styleable.ColorEditText_drawableRightSelected,
                R.styleable.ColorEditText_drawableRightChecked,
                R.styleable.ColorEditText_drawableRightUnable,

                R.styleable.ColorEditText_drawableBottomNormal,
                R.styleable.ColorEditText_drawableBottomPressed,
                R.styleable.ColorEditText_drawableBottomSelected,
                R.styleable.ColorEditText_drawableBottomChecked,
                R.styleable.ColorEditText_drawableBottomUnable,

                R.styleable.ColorEditText_drawableLeftWidth,
                R.styleable.ColorEditText_drawableLeftHeight,

                R.styleable.ColorEditText_drawableTopWidth,
                R.styleable.ColorEditText_drawableTopHeight,

                R.styleable.ColorEditText_drawableRightWidth,
                R.styleable.ColorEditText_drawableRightHeight,

                R.styleable.ColorEditText_drawableBottomWidth,
                R.styleable.ColorEditText_drawableBottomHeight,

                R.styleable.ColorEditText_backgroundTintPressed);

        typedArray.recycle();
    }

    public ColorTextViewHelper getColorHelper() {
        return mColorTextViewHelper;
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
    public void setTextColor(@ColorInt int color) {
        super.setTextColor(color);
    }

    @Deprecated
    @Override
    public void setTextColor(ColorStateList colors) {
        super.setTextColor(colors);
    }
}
