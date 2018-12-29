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
import androidx.appcompat.widget.AppCompatButton;

/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorButton extends AppCompatButton {

    private ColorTextViewHelper mColorTextViewHelper;

    public ColorButton(Context context) {
        super(context);
        init(null);
    }

    public ColorButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ColorButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ColorButton);

        mColorTextViewHelper = new ColorTextViewHelper(this,
                typedArray,

                getCurrentTextColor(),
                R.styleable.ColorButton_textColorNormal,
                R.styleable.ColorButton_textColorPressed,
                R.styleable.ColorButton_textColorSelected,
                R.styleable.ColorButton_textColorChecked,
                R.styleable.ColorButton_textColorUnable,

                getCurrentHintTextColor(),
                R.styleable.ColorButton_textColorHintNormal,
                R.styleable.ColorButton_textColorHintPressed,
                R.styleable.ColorButton_textColorHintSelected,
                R.styleable.ColorButton_textColorHintChecked,
                R.styleable.ColorButton_textColorHintUnable,

                R.styleable.ColorButton_backgroundColorNormal,
                R.styleable.ColorButton_backgroundColorPressed,
                R.styleable.ColorButton_backgroundColorSelected,
                R.styleable.ColorButton_backgroundColorChecked,
                R.styleable.ColorButton_backgroundColorUnable,

                R.styleable.ColorButton_backgroundDrawableNormal,
                R.styleable.ColorButton_backgroundDrawablePressed,
                R.styleable.ColorButton_backgroundDrawableSelected,
                R.styleable.ColorButton_backgroundDrawableChecked,
                R.styleable.ColorButton_backgroundDrawableUnable,

                R.styleable.ColorButton_gradientOrientationNormal,
                R.styleable.ColorButton_gradientOrientationPressed,
                R.styleable.ColorButton_gradientOrientationSelected,
                R.styleable.ColorButton_gradientOrientationChecked,
                R.styleable.ColorButton_gradientOrientationUnable,

                R.styleable.ColorButton_gradientCenterXNormal,
                R.styleable.ColorButton_gradientCenterXPressed,
                R.styleable.ColorButton_gradientCenterXSelected,
                R.styleable.ColorButton_gradientCenterXChecked,
                R.styleable.ColorButton_gradientCenterXUnable,

                R.styleable.ColorButton_gradientCenterYNormal,
                R.styleable.ColorButton_gradientCenterYPressed,
                R.styleable.ColorButton_gradientCenterYSelected,
                R.styleable.ColorButton_gradientCenterYChecked,
                R.styleable.ColorButton_gradientCenterYUnable,

                R.styleable.ColorButton_gradientStartColorNormal,
                R.styleable.ColorButton_gradientStartColorPressed,
                R.styleable.ColorButton_gradientStartColorSelected,
                R.styleable.ColorButton_gradientStartColorChecked,
                R.styleable.ColorButton_gradientStartColorUnable,

                R.styleable.ColorButton_gradientCenterColorNormal,
                R.styleable.ColorButton_gradientCenterColorPressed,
                R.styleable.ColorButton_gradientCenterColorSelected,
                R.styleable.ColorButton_gradientCenterColorChecked,
                R.styleable.ColorButton_gradientCenterColorUnable,

                R.styleable.ColorButton_gradientEndColorNormal,
                R.styleable.ColorButton_gradientEndColorPressed,
                R.styleable.ColorButton_gradientEndColorSelected,
                R.styleable.ColorButton_gradientEndColorChecked,
                R.styleable.ColorButton_gradientEndColorUnable,

                R.styleable.ColorButton_gradientRadiusNormal,
                R.styleable.ColorButton_gradientRadiusPressed,
                R.styleable.ColorButton_gradientRadiusSelected,
                R.styleable.ColorButton_gradientRadiusChecked,
                R.styleable.ColorButton_gradientRadiusUnable,

                R.styleable.ColorButton_gradientTypeNormal,
                R.styleable.ColorButton_gradientTypePressed,
                R.styleable.ColorButton_gradientTypeSelected,
                R.styleable.ColorButton_gradientTypeChecked,
                R.styleable.ColorButton_gradientTypeUnable,

                R.styleable.ColorButton_cornerRadiusNormal,
                R.styleable.ColorButton_cornerRadiusPressed,
                R.styleable.ColorButton_cornerRadiusSelected,
                R.styleable.ColorButton_cornerRadiusChecked,
                R.styleable.ColorButton_cornerRadiusUnable,

                R.styleable.ColorButton_cornerRadiusTopLeftNormal,
                R.styleable.ColorButton_cornerRadiusTopLeftPressed,
                R.styleable.ColorButton_cornerRadiusTopLeftSelected,
                R.styleable.ColorButton_cornerRadiusTopLeftChecked,
                R.styleable.ColorButton_cornerRadiusTopLeftUnable,

                R.styleable.ColorButton_cornerRadiusTopRightNormal,
                R.styleable.ColorButton_cornerRadiusTopRightPressed,
                R.styleable.ColorButton_cornerRadiusTopRightSelected,
                R.styleable.ColorButton_cornerRadiusTopRightChecked,
                R.styleable.ColorButton_cornerRadiusTopRightUnable,

                R.styleable.ColorButton_cornerRadiusBottomLeftNormal,
                R.styleable.ColorButton_cornerRadiusBottomLeftPressed,
                R.styleable.ColorButton_cornerRadiusBottomLeftSelected,
                R.styleable.ColorButton_cornerRadiusBottomLeftChecked,
                R.styleable.ColorButton_cornerRadiusBottomLeftUnable,

                R.styleable.ColorButton_cornerRadiusBottomRightNormal,
                R.styleable.ColorButton_cornerRadiusBottomRightPressed,
                R.styleable.ColorButton_cornerRadiusBottomRightSelected,
                R.styleable.ColorButton_cornerRadiusBottomRightChecked,
                R.styleable.ColorButton_cornerRadiusBottomRightUnable,

                R.styleable.ColorButton_borderWidthNormal,
                R.styleable.ColorButton_borderWidthPressed,
                R.styleable.ColorButton_borderWidthSelected,
                R.styleable.ColorButton_borderWidthChecked,
                R.styleable.ColorButton_borderWidthUnable,

                R.styleable.ColorButton_borderDashWidthNormal,
                R.styleable.ColorButton_borderDashWidthPressed,
                R.styleable.ColorButton_borderDashWidthSelected,
                R.styleable.ColorButton_borderDashWidthChecked,
                R.styleable.ColorButton_borderDashWidthUnable,

                R.styleable.ColorButton_borderDashGapNormal,
                R.styleable.ColorButton_borderDashGapPressed,
                R.styleable.ColorButton_borderDashGapSelected,
                R.styleable.ColorButton_borderDashGapChecked,
                R.styleable.ColorButton_borderDashGapUnable,

                R.styleable.ColorButton_borderColorNormal,
                R.styleable.ColorButton_borderColorPressed,
                R.styleable.ColorButton_borderColorSelected,
                R.styleable.ColorButton_borderColorChecked,
                R.styleable.ColorButton_borderColorUnable,

                R.styleable.ColorButton_drawableLeftNormal,
                R.styleable.ColorButton_drawableLeftPressed,
                R.styleable.ColorButton_drawableLeftSelected,
                R.styleable.ColorButton_drawableLeftChecked,
                R.styleable.ColorButton_drawableLeftUnable,

                R.styleable.ColorButton_drawableTopNormal,
                R.styleable.ColorButton_drawableTopPressed,
                R.styleable.ColorButton_drawableTopSelected,
                R.styleable.ColorButton_drawableTopChecked,
                R.styleable.ColorButton_drawableTopUnable,

                R.styleable.ColorButton_drawableRightNormal,
                R.styleable.ColorButton_drawableRightPressed,
                R.styleable.ColorButton_drawableRightSelected,
                R.styleable.ColorButton_drawableRightChecked,
                R.styleable.ColorButton_drawableRightUnable,

                R.styleable.ColorButton_drawableBottomNormal,
                R.styleable.ColorButton_drawableBottomPressed,
                R.styleable.ColorButton_drawableBottomSelected,
                R.styleable.ColorButton_drawableBottomChecked,
                R.styleable.ColorButton_drawableBottomUnable,

                R.styleable.ColorButton_drawableLeftWidth,
                R.styleable.ColorButton_drawableLeftHeight,

                R.styleable.ColorButton_drawableTopWidth,
                R.styleable.ColorButton_drawableTopHeight,

                R.styleable.ColorButton_drawableRightWidth,
                R.styleable.ColorButton_drawableRightHeight,

                R.styleable.ColorButton_drawableBottomWidth,
                R.styleable.ColorButton_drawableBottomHeight);

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
