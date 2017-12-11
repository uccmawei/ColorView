package com.wei.android.lib.colorview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.wei.android.lib.colorview.R;
import com.wei.android.lib.colorview.helper.ColorImageViewHelper;

/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorImageView extends ImageView {

    private ColorImageViewHelper mColorImageViewHelper;

    public ColorImageView(Context context) {
        super(context);
        init(null);
    }

    public ColorImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ColorImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ColorImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ColorImageView);

        mColorImageViewHelper = new ColorImageViewHelper(
                this, typedArray,
                R.styleable.ColorImageView_srcDrawableNormal,
                R.styleable.ColorImageView_srcDrawablePressed,
                R.styleable.ColorImageView_srcDrawableSelected,
                R.styleable.ColorImageView_srcDrawableChecked,
                R.styleable.ColorImageView_srcDrawableUnable,
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
                R.styleable.ColorImageView_borderColorNormal,
                R.styleable.ColorImageView_borderColorPressed,
                R.styleable.ColorImageView_borderColorSelected,
                R.styleable.ColorImageView_borderColorChecked,
                R.styleable.ColorImageView_borderColorUnable,
                R.styleable.ColorImageView_borderWidth,
                R.styleable.ColorImageView_borderDashGap,
                R.styleable.ColorImageView_borderDashWidth,
                R.styleable.ColorImageView_cornerRadius,
                R.styleable.ColorImageView_cornerRadiusTopLeft,
                R.styleable.ColorImageView_cornerRadiusTopRight,
                R.styleable.ColorImageView_cornerRadiusBottomLeft,
                R.styleable.ColorImageView_cornerRadiusBottomRight
        );

        typedArray.recycle();
    }

    public ColorImageViewHelper getColorImageViewHelper() {
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
    public void setBackgroundResource(@DrawableRes int resid) {
        super.setBackgroundResource(resid);
    }

    @Deprecated
    @Override
    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
    }
}
