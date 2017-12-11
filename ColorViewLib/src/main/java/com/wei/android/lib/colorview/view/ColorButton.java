package com.wei.android.lib.colorview.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.Button;

import com.wei.android.lib.colorview.R;
import com.wei.android.lib.colorview.helper.ColorTextViewHelper;

/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorButton extends Button {

    private ColorTextViewHelper mColorTextViewHelper;

    public ColorButton(Context context) {
        super(context);
        init(null);
    }

    public ColorButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ColorButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ColorButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ColorButton);

        mColorTextViewHelper = new ColorTextViewHelper(
                this, typedArray, getCurrentTextColor(),
                R.styleable.ColorButton_textColorNormal,
                R.styleable.ColorButton_textColorPressed,
                R.styleable.ColorButton_textColorSelected,
                R.styleable.ColorButton_textColorChecked,
                R.styleable.ColorButton_textColorUnable,
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
                R.styleable.ColorButton_borderColorNormal,
                R.styleable.ColorButton_borderColorPressed,
                R.styleable.ColorButton_borderColorSelected,
                R.styleable.ColorButton_borderColorChecked,
                R.styleable.ColorButton_borderColorUnable,
                R.styleable.ColorButton_borderWidth,
                R.styleable.ColorButton_borderDashGap,
                R.styleable.ColorButton_borderDashWidth,
                R.styleable.ColorButton_cornerRadius,
                R.styleable.ColorButton_cornerRadiusTopLeft,
                R.styleable.ColorButton_cornerRadiusTopRight,
                R.styleable.ColorButton_cornerRadiusBottomLeft,
                R.styleable.ColorButton_cornerRadiusBottomRight
        );

        typedArray.recycle();
    }

    public ColorTextViewHelper getColorTextViewHelper() {
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
    public void setBackgroundResource(@DrawableRes int resid) {
        super.setBackgroundResource(resid);
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
