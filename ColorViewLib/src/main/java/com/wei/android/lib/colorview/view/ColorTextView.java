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
import android.widget.TextView;

import com.wei.android.lib.colorview.R;
import com.wei.android.lib.colorview.helper.ColorTextViewHelper;

/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorTextView extends TextView {

    private ColorTextViewHelper mColorTextViewHelper;

    public ColorTextView(Context context) {
        super(context);
        init(null);
    }

    public ColorTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ColorTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ColorTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ColorTextView);

        mColorTextViewHelper = new ColorTextViewHelper(
                this, typedArray, getCurrentTextColor(),
                R.styleable.ColorTextView_textColorNormal,
                R.styleable.ColorTextView_textColorPressed,
                R.styleable.ColorTextView_textColorSelected,
                R.styleable.ColorTextView_textColorChecked,
                R.styleable.ColorTextView_textColorUnable,
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
                R.styleable.ColorTextView_borderColorNormal,
                R.styleable.ColorTextView_borderColorPressed,
                R.styleable.ColorTextView_borderColorSelected,
                R.styleable.ColorTextView_borderColorChecked,
                R.styleable.ColorTextView_borderColorUnable,
                R.styleable.ColorTextView_borderWidth,
                R.styleable.ColorTextView_borderDashGap,
                R.styleable.ColorTextView_borderDashWidth,
                R.styleable.ColorTextView_cornerRadius,
                R.styleable.ColorTextView_cornerRadiusTopLeft,
                R.styleable.ColorTextView_cornerRadiusTopRight,
                R.styleable.ColorTextView_cornerRadiusBottomLeft,
                R.styleable.ColorTextView_cornerRadiusBottomRight
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
