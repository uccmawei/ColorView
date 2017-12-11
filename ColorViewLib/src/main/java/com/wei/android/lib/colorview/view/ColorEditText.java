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
import android.widget.EditText;

import com.wei.android.lib.colorview.R;
import com.wei.android.lib.colorview.helper.ColorTextViewHelper;

/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorEditText extends EditText {

    private ColorTextViewHelper mColorTextViewHelper;

    public ColorEditText(Context context) {
        super(context);
        init(null);
    }

    public ColorEditText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ColorEditText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ColorEditText(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ColorEditText);

        mColorTextViewHelper = new ColorTextViewHelper(
                this, typedArray, getCurrentTextColor(),
                R.styleable.ColorEditText_textColorNormal,
                R.styleable.ColorEditText_textColorPressed,
                R.styleable.ColorEditText_textColorSelected,
                R.styleable.ColorEditText_textColorChecked,
                R.styleable.ColorEditText_textColorUnable,
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
                R.styleable.ColorEditText_borderColorNormal,
                R.styleable.ColorEditText_borderColorPressed,
                R.styleable.ColorEditText_borderColorSelected,
                R.styleable.ColorEditText_borderColorChecked,
                R.styleable.ColorEditText_borderColorUnable,
                R.styleable.ColorEditText_borderWidth,
                R.styleable.ColorEditText_borderDashGap,
                R.styleable.ColorEditText_borderDashWidth,
                R.styleable.ColorEditText_cornerRadius,
                R.styleable.ColorEditText_cornerRadiusTopLeft,
                R.styleable.ColorEditText_cornerRadiusTopRight,
                R.styleable.ColorEditText_cornerRadiusBottomLeft,
                R.styleable.ColorEditText_cornerRadiusBottomRight
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
