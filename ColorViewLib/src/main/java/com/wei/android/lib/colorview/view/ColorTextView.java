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
import androidx.appcompat.widget.AppCompatTextView;

/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorTextView extends AppCompatTextView {

    private ColorTextViewHelper mColorTextViewHelper;

    public ColorTextView(Context context) {
        super(context);
        init(null);
    }

    public ColorTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ColorTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ColorTextView);

        mColorTextViewHelper = new ColorTextViewHelper(this,
                typedArray,

                getCurrentTextColor(),
                R.styleable.ColorTextView_textColorNormal,
                R.styleable.ColorTextView_textColorPressed,
                R.styleable.ColorTextView_textColorSelected,
                R.styleable.ColorTextView_textColorChecked,
                R.styleable.ColorTextView_textColorUnable,

                getCurrentHintTextColor(),
                R.styleable.ColorTextView_textColorHintNormal,
                R.styleable.ColorTextView_textColorHintPressed,
                R.styleable.ColorTextView_textColorHintSelected,
                R.styleable.ColorTextView_textColorHintChecked,
                R.styleable.ColorTextView_textColorHintUnable,

                R.styleable.ColorTextView_backgroundColorNormal,
                R.styleable.ColorTextView_backgroundColorPressed,
                R.styleable.ColorTextView_backgroundColorSelected,
                R.styleable.ColorTextView_backgroundColorChecked,
                R.styleable.ColorTextView_backgroundColorUnable,

                R.styleable.ColorTextView_backgroundDrawableNormal,
                R.styleable.ColorTextView_backgroundDrawablePressed,
                R.styleable.ColorTextView_backgroundDrawableSelected,
                R.styleable.ColorTextView_backgroundDrawableChecked,
                R.styleable.ColorTextView_backgroundDrawableUnable,

                R.styleable.ColorTextView_gradientOrientationNormal,
                R.styleable.ColorTextView_gradientOrientationPressed,
                R.styleable.ColorTextView_gradientOrientationSelected,
                R.styleable.ColorTextView_gradientOrientationChecked,
                R.styleable.ColorTextView_gradientOrientationUnable,

                R.styleable.ColorTextView_gradientCenterXNormal,
                R.styleable.ColorTextView_gradientCenterXPressed,
                R.styleable.ColorTextView_gradientCenterXSelected,
                R.styleable.ColorTextView_gradientCenterXChecked,
                R.styleable.ColorTextView_gradientCenterXUnable,

                R.styleable.ColorTextView_gradientCenterYNormal,
                R.styleable.ColorTextView_gradientCenterYPressed,
                R.styleable.ColorTextView_gradientCenterYSelected,
                R.styleable.ColorTextView_gradientCenterYChecked,
                R.styleable.ColorTextView_gradientCenterYUnable,

                R.styleable.ColorTextView_gradientStartColorNormal,
                R.styleable.ColorTextView_gradientStartColorPressed,
                R.styleable.ColorTextView_gradientStartColorSelected,
                R.styleable.ColorTextView_gradientStartColorChecked,
                R.styleable.ColorTextView_gradientStartColorUnable,

                R.styleable.ColorTextView_gradientCenterColorNormal,
                R.styleable.ColorTextView_gradientCenterColorPressed,
                R.styleable.ColorTextView_gradientCenterColorSelected,
                R.styleable.ColorTextView_gradientCenterColorChecked,
                R.styleable.ColorTextView_gradientCenterColorUnable,

                R.styleable.ColorTextView_gradientEndColorNormal,
                R.styleable.ColorTextView_gradientEndColorPressed,
                R.styleable.ColorTextView_gradientEndColorSelected,
                R.styleable.ColorTextView_gradientEndColorChecked,
                R.styleable.ColorTextView_gradientEndColorUnable,

                R.styleable.ColorTextView_gradientRadiusNormal,
                R.styleable.ColorTextView_gradientRadiusPressed,
                R.styleable.ColorTextView_gradientRadiusSelected,
                R.styleable.ColorTextView_gradientRadiusChecked,
                R.styleable.ColorTextView_gradientRadiusUnable,

                R.styleable.ColorTextView_gradientTypeNormal,
                R.styleable.ColorTextView_gradientTypePressed,
                R.styleable.ColorTextView_gradientTypeSelected,
                R.styleable.ColorTextView_gradientTypeChecked,
                R.styleable.ColorTextView_gradientTypeUnable,

                R.styleable.ColorTextView_cornerRadiusNormal,
                R.styleable.ColorTextView_cornerRadiusPressed,
                R.styleable.ColorTextView_cornerRadiusSelected,
                R.styleable.ColorTextView_cornerRadiusChecked,
                R.styleable.ColorTextView_cornerRadiusUnable,

                R.styleable.ColorTextView_cornerRadiusTopLeftNormal,
                R.styleable.ColorTextView_cornerRadiusTopLeftPressed,
                R.styleable.ColorTextView_cornerRadiusTopLeftSelected,
                R.styleable.ColorTextView_cornerRadiusTopLeftChecked,
                R.styleable.ColorTextView_cornerRadiusTopLeftUnable,

                R.styleable.ColorTextView_cornerRadiusTopRightNormal,
                R.styleable.ColorTextView_cornerRadiusTopRightPressed,
                R.styleable.ColorTextView_cornerRadiusTopRightSelected,
                R.styleable.ColorTextView_cornerRadiusTopRightChecked,
                R.styleable.ColorTextView_cornerRadiusTopRightUnable,

                R.styleable.ColorTextView_cornerRadiusBottomLeftNormal,
                R.styleable.ColorTextView_cornerRadiusBottomLeftPressed,
                R.styleable.ColorTextView_cornerRadiusBottomLeftSelected,
                R.styleable.ColorTextView_cornerRadiusBottomLeftChecked,
                R.styleable.ColorTextView_cornerRadiusBottomLeftUnable,

                R.styleable.ColorTextView_cornerRadiusBottomRightNormal,
                R.styleable.ColorTextView_cornerRadiusBottomRightPressed,
                R.styleable.ColorTextView_cornerRadiusBottomRightSelected,
                R.styleable.ColorTextView_cornerRadiusBottomRightChecked,
                R.styleable.ColorTextView_cornerRadiusBottomRightUnable,

                R.styleable.ColorTextView_borderWidthNormal,
                R.styleable.ColorTextView_borderWidthPressed,
                R.styleable.ColorTextView_borderWidthSelected,
                R.styleable.ColorTextView_borderWidthChecked,
                R.styleable.ColorTextView_borderWidthUnable,

                R.styleable.ColorTextView_borderDashWidthNormal,
                R.styleable.ColorTextView_borderDashWidthPressed,
                R.styleable.ColorTextView_borderDashWidthSelected,
                R.styleable.ColorTextView_borderDashWidthChecked,
                R.styleable.ColorTextView_borderDashWidthUnable,

                R.styleable.ColorTextView_borderDashGapNormal,
                R.styleable.ColorTextView_borderDashGapPressed,
                R.styleable.ColorTextView_borderDashGapSelected,
                R.styleable.ColorTextView_borderDashGapChecked,
                R.styleable.ColorTextView_borderDashGapUnable,

                R.styleable.ColorTextView_borderColorNormal,
                R.styleable.ColorTextView_borderColorPressed,
                R.styleable.ColorTextView_borderColorSelected,
                R.styleable.ColorTextView_borderColorChecked,
                R.styleable.ColorTextView_borderColorUnable,

                R.styleable.ColorTextView_drawableLeftNormal,
                R.styleable.ColorTextView_drawableLeftPressed,
                R.styleable.ColorTextView_drawableLeftSelected,
                R.styleable.ColorTextView_drawableLeftChecked,
                R.styleable.ColorTextView_drawableLeftUnable,

                R.styleable.ColorTextView_drawableTopNormal,
                R.styleable.ColorTextView_drawableTopPressed,
                R.styleable.ColorTextView_drawableTopSelected,
                R.styleable.ColorTextView_drawableTopChecked,
                R.styleable.ColorTextView_drawableTopUnable,

                R.styleable.ColorTextView_drawableRightNormal,
                R.styleable.ColorTextView_drawableRightPressed,
                R.styleable.ColorTextView_drawableRightSelected,
                R.styleable.ColorTextView_drawableRightChecked,
                R.styleable.ColorTextView_drawableRightUnable,

                R.styleable.ColorTextView_drawableBottomNormal,
                R.styleable.ColorTextView_drawableBottomPressed,
                R.styleable.ColorTextView_drawableBottomSelected,
                R.styleable.ColorTextView_drawableBottomChecked,
                R.styleable.ColorTextView_drawableBottomUnable,

                R.styleable.ColorTextView_drawableLeftWidth,
                R.styleable.ColorTextView_drawableLeftHeight,

                R.styleable.ColorTextView_drawableTopWidth,
                R.styleable.ColorTextView_drawableTopHeight,

                R.styleable.ColorTextView_drawableRightWidth,
                R.styleable.ColorTextView_drawableRightHeight,

                R.styleable.ColorTextView_drawableBottomWidth,
                R.styleable.ColorTextView_drawableBottomHeight,

                R.styleable.ColorTextView_backgroundTintPressed);

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
