package com.wei.android.lib.colorview.helper;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;

import androidx.core.graphics.drawable.DrawableCompat;

import com.wei.android.lib.colorview.utils.Constant;


/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorViewHelper<T extends View> {

    // 纯色背景
    private int mBackgroundColorNormal;
    private int mBackgroundColorPressed;
    private int mBackgroundColorSelected;
    private int mBackgroundColorChecked;
    private int mBackgroundColorUnable;

    // 资源背景
    private Drawable mBackgroundDrawableNormal;
    private Drawable mBackgroundDrawablePressed;
    private Drawable mBackgroundDrawableSelected;
    private Drawable mBackgroundDrawableChecked;
    private Drawable mBackgroundDrawableUnable;
    private final boolean[] mBackgroundDrawableExistArray = new boolean[Constant.STATE_INDEX_COUNT];

    // 渐变色背景
    private int mGradientOrientationNormal;
    private int mGradientOrientationPressed;
    private int mGradientOrientationSelected;
    private int mGradientOrientationChecked;
    private int mGradientOrientationUnable;

    // 渐变色背景
    private float mGradientCenterXNormal;
    private float mGradientCenterXPressed;
    private float mGradientCenterXSelected;
    private float mGradientCenterXChecked;
    private float mGradientCenterXUnable;

    // 渐变色背景
    private float mGradientCenterYNormal;
    private float mGradientCenterYPressed;
    private float mGradientCenterYSelected;
    private float mGradientCenterYChecked;
    private float mGradientCenterYUnable;

    // 渐变色背景
    private int mGradientStartColorNormal;
    private int mGradientStartColorPressed;
    private int mGradientStartColorSelected;
    private int mGradientStartColorChecked;
    private int mGradientStartColorUnable;

    // 渐变色背景
    private int mGradientCenterColorNormal;
    private int mGradientCenterColorPressed;
    private int mGradientCenterColorSelected;
    private int mGradientCenterColorChecked;
    private int mGradientCenterColorUnable;

    // 渐变色背景
    private boolean mHasGradientCenterColorNormal;
    private boolean mHasGradientCenterColorPressed;
    private boolean mHasGradientCenterColorSelected;
    private boolean mHasGradientCenterColorChecked;
    private boolean mHasGradientCenterColorUnable;

    // 渐变色背景
    private int mGradientEndColorNormal;
    private int mGradientEndColorPressed;
    private int mGradientEndColorSelected;
    private int mGradientEndColorChecked;
    private int mGradientEndColorUnable;

    // 渐变色背景
    private int mGradientRadiusNormal;
    private int mGradientRadiusPressed;
    private int mGradientRadiusSelected;
    private int mGradientRadiusChecked;
    private int mGradientRadiusUnable;

    // 渐变色背景
    private int mGradientTypeNormal;
    private int mGradientTypePressed;
    private int mGradientTypeSelected;
    private int mGradientTypeChecked;
    private int mGradientTypeUnable;

    // 圆角
    private int mCornerRadiusTopLeftNormal;
    private int mCornerRadiusTopLeftPressed;
    private int mCornerRadiusTopLeftSelected;
    private int mCornerRadiusTopLeftChecked;
    private int mCornerRadiusTopLeftUnable;

    // 圆角
    private int mCornerRadiusTopRightNormal;
    private int mCornerRadiusTopRightPressed;
    private int mCornerRadiusTopRightSelected;
    private int mCornerRadiusTopRightChecked;
    private int mCornerRadiusTopRightUnable;

    // 圆角
    private int mCornerRadiusBottomLeftNormal;
    private int mCornerRadiusBottomLeftPressed;
    private int mCornerRadiusBottomLeftSelected;
    private int mCornerRadiusBottomLeftChecked;
    private int mCornerRadiusBottomLeftUnable;

    // 圆角
    private int mCornerRadiusBottomRightNormal;
    private int mCornerRadiusBottomRightPressed;
    private int mCornerRadiusBottomRightSelected;
    private int mCornerRadiusBottomRightChecked;
    private int mCornerRadiusBottomRightUnable;

    // 边框
    private int mBorderWidthNormal;
    private int mBorderWidthPressed;
    private int mBorderWidthSelected;
    private int mBorderWidthChecked;
    private int mBorderWidthUnable;

    // 边框
    private int mBorderDashWidthNormal;
    private int mBorderDashWidthPressed;
    private int mBorderDashWidthSelected;
    private int mBorderDashWidthChecked;
    private int mBorderDashWidthUnable;

    // 边框
    private int mBorderDashGapNormal;
    private int mBorderDashGapPressed;
    private int mBorderDashGapSelected;
    private int mBorderDashGapChecked;
    private int mBorderDashGapUnable;

    // 边框
    private int mBorderColorNormal;
    private int mBorderColorPressed;
    private int mBorderColorSelected;
    private int mBorderColorChecked;
    private int mBorderColorUnable;

    // 点击背景着色
    private boolean mHasBackgroundColorTintPressed;
    private int mBackgroundColorTintPressed;

    // 目标View
    protected T mView;

    public ColorViewHelper(T view,
                           TypedArray typedArray,

                           int backgroundColorNormal,
                           int backgroundColorPressed,
                           int backgroundColorSelected,
                           int backgroundColorChecked,
                           int backgroundColorUnable,

                           int backgroundDrawableNormal,
                           int backgroundDrawablePressed,
                           int backgroundDrawableSelected,
                           int backgroundDrawableChecked,
                           int backgroundDrawableUnable,

                           int gradientOrientationNormal,
                           int gradientOrientationPressed,
                           int gradientOrientationSelected,
                           int gradientOrientationChecked,
                           int gradientOrientationUnable,

                           int gradientCenterXNormal,
                           int gradientCenterXPressed,
                           int gradientCenterXSelected,
                           int gradientCenterXChecked,
                           int gradientCenterXUnable,

                           int gradientCenterYNormal,
                           int gradientCenterYPressed,
                           int gradientCenterYSelected,
                           int gradientCenterYChecked,
                           int gradientCenterYUnable,

                           int gradientStartColorNormal,
                           int gradientStartColorPressed,
                           int gradientStartColorSelected,
                           int gradientStartColorChecked,
                           int gradientStartColorUnable,

                           int gradientCenterColorNormal,
                           int gradientCenterColorPressed,
                           int gradientCenterColorSelected,
                           int gradientCenterColorChecked,
                           int gradientCenterColorUnable,

                           int gradientEndColorNormal,
                           int gradientEndColorPressed,
                           int gradientEndColorSelected,
                           int gradientEndColorChecked,
                           int gradientEndColorUnable,

                           int gradientRadiusNormal,
                           int gradientRadiusPressed,
                           int gradientRadiusSelected,
                           int gradientRadiusChecked,
                           int gradientRadiusUnable,

                           int gradientTypeNormal,
                           int gradientTypePressed,
                           int gradientTypeSelected,
                           int gradientTypeChecked,
                           int gradientTypeUnable,

                           int cornerRadiusNormal,
                           int cornerRadiusPressed,
                           int cornerRadiusSelected,
                           int cornerRadiusChecked,
                           int cornerRadiusUnable,

                           int cornerRadiusTopLeftNormal,
                           int cornerRadiusTopLeftPressed,
                           int cornerRadiusTopLeftSelected,
                           int cornerRadiusTopLeftChecked,
                           int cornerRadiusTopLeftUnable,

                           int cornerRadiusTopRightNormal,
                           int cornerRadiusTopRightPressed,
                           int cornerRadiusTopRightSelected,
                           int cornerRadiusTopRightChecked,
                           int cornerRadiusTopRightUnable,

                           int cornerRadiusBottomLeftNormal,
                           int cornerRadiusBottomLeftPressed,
                           int cornerRadiusBottomLeftSelected,
                           int cornerRadiusBottomLeftChecked,
                           int cornerRadiusBottomLeftUnable,

                           int cornerRadiusBottomRightNormal,
                           int cornerRadiusBottomRightPressed,
                           int cornerRadiusBottomRightSelected,
                           int cornerRadiusBottomRightChecked,
                           int cornerRadiusBottomRightUnable,

                           int borderWidthNormal,
                           int borderWidthPressed,
                           int borderWidthSelected,
                           int borderWidthChecked,
                           int borderWidthUnable,

                           int borderDashWidthNormal,
                           int borderDashWidthPressed,
                           int borderDashWidthSelected,
                           int borderDashWidthChecked,
                           int borderDashWidthUnable,

                           int borderDashGapNormal,
                           int borderDashGapPressed,
                           int borderDashGapSelected,
                           int borderDashGapChecked,
                           int borderDashGapUnable,

                           int borderColorNormal,
                           int borderColorPressed,
                           int borderColorSelected,
                           int borderColorChecked,
                           int borderColorUnable,

                           int backgroundColorTintPressed) {

        mView = view;

        mBackgroundColorNormal = typedArray.getColor(backgroundColorNormal, Color.TRANSPARENT);
        mBackgroundColorPressed = typedArray.getColor(backgroundColorPressed, mBackgroundColorNormal);
        mBackgroundColorSelected = typedArray.getColor(backgroundColorSelected, mBackgroundColorNormal);
        mBackgroundColorChecked = typedArray.getColor(backgroundColorChecked, mBackgroundColorNormal);
        mBackgroundColorUnable = typedArray.getColor(backgroundColorUnable, mBackgroundColorNormal);

        mBackgroundDrawableExistArray[Constant.STATE_INDEX_NORMAL] = typedArray.hasValue(backgroundDrawableNormal);
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_PRESSED] = typedArray.hasValue(backgroundDrawablePressed);
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_SELECTED] = typedArray.hasValue(backgroundDrawableSelected);
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_CHECKED] = typedArray.hasValue(backgroundDrawableChecked);
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_UNABLE] = typedArray.hasValue(backgroundDrawableUnable);
        mBackgroundDrawableNormal = typedArray.getDrawable(backgroundDrawableNormal);
        mBackgroundDrawablePressed = typedArray.getDrawable(backgroundDrawablePressed);
        mBackgroundDrawableSelected = typedArray.getDrawable(backgroundDrawableSelected);
        mBackgroundDrawableChecked = typedArray.getDrawable(backgroundDrawableChecked);
        mBackgroundDrawableUnable = typedArray.getDrawable(backgroundDrawableUnable);
        if (mBackgroundDrawableNormal != null) {
            if (!mBackgroundDrawableExistArray[Constant.STATE_INDEX_PRESSED]) {
                mBackgroundDrawablePressed = typedArray.getDrawable(backgroundDrawableNormal);
            }
            if (!mBackgroundDrawableExistArray[Constant.STATE_INDEX_SELECTED]) {
                mBackgroundDrawableSelected = typedArray.getDrawable(backgroundDrawableNormal);
            }
            if (!mBackgroundDrawableExistArray[Constant.STATE_INDEX_CHECKED]) {
                mBackgroundDrawableChecked = typedArray.getDrawable(backgroundDrawableNormal);
            }
            if (!mBackgroundDrawableExistArray[Constant.STATE_INDEX_UNABLE]) {
                mBackgroundDrawableUnable = typedArray.getDrawable(backgroundDrawableNormal);
            }
        }

        mGradientOrientationNormal = typedArray.getInt(gradientOrientationNormal, Constant.GRADIENT_ORIENTATION_L_R);
        mGradientOrientationPressed = typedArray.getInt(gradientOrientationPressed, mGradientOrientationNormal);
        mGradientOrientationSelected = typedArray.getInt(gradientOrientationSelected, mGradientOrientationNormal);
        mGradientOrientationChecked = typedArray.getInt(gradientOrientationChecked, mGradientOrientationNormal);
        mGradientOrientationUnable = typedArray.getInt(gradientOrientationUnable, mGradientOrientationNormal);

        mGradientCenterXNormal = typedArray.getFloat(gradientCenterXNormal, Constant.CENTER_XY);
        mGradientCenterXPressed = typedArray.getFloat(gradientCenterXPressed, mGradientCenterXNormal);
        mGradientCenterXSelected = typedArray.getFloat(gradientCenterXSelected, mGradientCenterXNormal);
        mGradientCenterXChecked = typedArray.getFloat(gradientCenterXChecked, mGradientCenterXNormal);
        mGradientCenterXUnable = typedArray.getFloat(gradientCenterXUnable, mGradientCenterXNormal);

        mGradientCenterYNormal = typedArray.getFloat(gradientCenterYNormal, Constant.CENTER_XY);
        mGradientCenterYPressed = typedArray.getFloat(gradientCenterYPressed, mGradientCenterYNormal);
        mGradientCenterYSelected = typedArray.getFloat(gradientCenterYSelected, mGradientCenterYNormal);
        mGradientCenterYChecked = typedArray.getFloat(gradientCenterYChecked, mGradientCenterYNormal);
        mGradientCenterYUnable = typedArray.getFloat(gradientCenterYUnable, mGradientCenterYNormal);

        mGradientStartColorNormal = typedArray.getColor(gradientStartColorNormal, Color.TRANSPARENT);
        mGradientStartColorPressed = typedArray.getColor(gradientStartColorPressed, mGradientStartColorNormal);
        mGradientStartColorSelected = typedArray.getColor(gradientStartColorSelected, mGradientStartColorNormal);
        mGradientStartColorChecked = typedArray.getColor(gradientStartColorChecked, mGradientStartColorNormal);
        mGradientStartColorUnable = typedArray.getColor(gradientStartColorUnable, mGradientStartColorNormal);

        mHasGradientCenterColorNormal = typedArray.hasValue(gradientCenterColorNormal);
        mHasGradientCenterColorPressed = typedArray.hasValue(gradientCenterColorPressed);
        mHasGradientCenterColorSelected = typedArray.hasValue(gradientCenterColorSelected);
        mHasGradientCenterColorChecked = typedArray.hasValue(gradientCenterColorChecked);
        mHasGradientCenterColorUnable = typedArray.hasValue(gradientCenterColorUnable);

        mGradientCenterColorNormal = typedArray.getColor(gradientCenterColorNormal, Color.TRANSPARENT);
        mGradientCenterColorPressed = typedArray.getColor(gradientCenterColorPressed, mGradientCenterColorNormal);
        mGradientCenterColorSelected = typedArray.getColor(gradientCenterColorSelected, mGradientCenterColorNormal);
        mGradientCenterColorChecked = typedArray.getColor(gradientCenterColorChecked, mGradientCenterColorNormal);
        mGradientCenterColorUnable = typedArray.getColor(gradientCenterColorUnable, mGradientCenterColorNormal);

        mGradientEndColorNormal = typedArray.getColor(gradientEndColorNormal, Color.TRANSPARENT);
        mGradientEndColorPressed = typedArray.getColor(gradientEndColorPressed, mGradientEndColorNormal);
        mGradientEndColorSelected = typedArray.getColor(gradientEndColorSelected, mGradientEndColorNormal);
        mGradientEndColorChecked = typedArray.getColor(gradientEndColorChecked, mGradientEndColorNormal);
        mGradientEndColorUnable = typedArray.getColor(gradientEndColorUnable, mGradientEndColorNormal);

        mGradientRadiusNormal = typedArray.getDimensionPixelOffset(gradientRadiusNormal, 0);
        mGradientRadiusPressed = typedArray.getDimensionPixelOffset(gradientRadiusPressed, mGradientRadiusNormal);
        mGradientRadiusSelected = typedArray.getDimensionPixelOffset(gradientRadiusSelected, mGradientRadiusNormal);
        mGradientRadiusChecked = typedArray.getDimensionPixelOffset(gradientRadiusChecked, mGradientRadiusNormal);
        mGradientRadiusUnable = typedArray.getDimensionPixelOffset(gradientRadiusUnable, mGradientRadiusNormal);

        mGradientTypeNormal = typedArray.getInt(gradientTypeNormal, Constant.GRADIENT_TYPE_NONE);
        mGradientTypePressed = typedArray.getInt(gradientTypePressed, mGradientTypeNormal);
        mGradientTypeSelected = typedArray.getInt(gradientTypeSelected, mGradientTypeNormal);
        mGradientTypeChecked = typedArray.getInt(gradientTypeChecked, mGradientTypeNormal);
        mGradientTypeUnable = typedArray.getInt(gradientTypeUnable, mGradientTypeNormal);

        int tempCornerRadiusNormal = typedArray.getDimensionPixelOffset(cornerRadiusNormal, Integer.MIN_VALUE);
        int tempCornerRadiusPressed = typedArray.getDimensionPixelOffset(cornerRadiusPressed, Integer.MIN_VALUE);
        int tempCornerRadiusSelected = typedArray.getDimensionPixelOffset(cornerRadiusSelected, Integer.MIN_VALUE);
        int tempCornerRadiusChecked = typedArray.getDimensionPixelOffset(cornerRadiusChecked, Integer.MIN_VALUE);
        int tempCornerRadiusUnable = typedArray.getDimensionPixelOffset(cornerRadiusUnable, Integer.MIN_VALUE);

        mCornerRadiusTopLeftNormal = typedArray.getDimensionPixelOffset(cornerRadiusTopLeftNormal, getCornerSize(tempCornerRadiusNormal, tempCornerRadiusNormal));
        mCornerRadiusTopLeftPressed = typedArray.getDimensionPixelOffset(cornerRadiusTopLeftPressed, getCornerSize(mCornerRadiusTopLeftNormal, tempCornerRadiusPressed));
        mCornerRadiusTopLeftSelected = typedArray.getDimensionPixelOffset(cornerRadiusTopLeftSelected, getCornerSize(mCornerRadiusTopLeftNormal, tempCornerRadiusSelected));
        mCornerRadiusTopLeftChecked = typedArray.getDimensionPixelOffset(cornerRadiusTopLeftChecked, getCornerSize(mCornerRadiusTopLeftNormal, tempCornerRadiusChecked));
        mCornerRadiusTopLeftUnable = typedArray.getDimensionPixelOffset(cornerRadiusTopLeftUnable, getCornerSize(mCornerRadiusTopLeftNormal, tempCornerRadiusUnable));

        mCornerRadiusTopRightNormal = typedArray.getDimensionPixelOffset(cornerRadiusTopRightNormal, getCornerSize(tempCornerRadiusNormal, tempCornerRadiusNormal));
        mCornerRadiusTopRightPressed = typedArray.getDimensionPixelOffset(cornerRadiusTopRightPressed, getCornerSize(mCornerRadiusTopRightNormal, tempCornerRadiusPressed));
        mCornerRadiusTopRightSelected = typedArray.getDimensionPixelOffset(cornerRadiusTopRightSelected, getCornerSize(mCornerRadiusTopRightNormal, tempCornerRadiusSelected));
        mCornerRadiusTopRightChecked = typedArray.getDimensionPixelOffset(cornerRadiusTopRightChecked, getCornerSize(mCornerRadiusTopRightNormal, tempCornerRadiusChecked));
        mCornerRadiusTopRightUnable = typedArray.getDimensionPixelOffset(cornerRadiusTopRightUnable, getCornerSize(mCornerRadiusTopRightNormal, tempCornerRadiusUnable));

        mCornerRadiusBottomLeftNormal = typedArray.getDimensionPixelOffset(cornerRadiusBottomLeftNormal, getCornerSize(tempCornerRadiusNormal, tempCornerRadiusNormal));
        mCornerRadiusBottomLeftPressed = typedArray.getDimensionPixelOffset(cornerRadiusBottomLeftPressed, getCornerSize(mCornerRadiusBottomLeftNormal, tempCornerRadiusPressed));
        mCornerRadiusBottomLeftSelected = typedArray.getDimensionPixelOffset(cornerRadiusBottomLeftSelected, getCornerSize(mCornerRadiusBottomLeftNormal, tempCornerRadiusSelected));
        mCornerRadiusBottomLeftChecked = typedArray.getDimensionPixelOffset(cornerRadiusBottomLeftChecked, getCornerSize(mCornerRadiusBottomLeftNormal, tempCornerRadiusChecked));
        mCornerRadiusBottomLeftUnable = typedArray.getDimensionPixelOffset(cornerRadiusBottomLeftUnable, getCornerSize(mCornerRadiusBottomLeftNormal, tempCornerRadiusUnable));

        mCornerRadiusBottomRightNormal = typedArray.getDimensionPixelOffset(cornerRadiusBottomRightNormal, getCornerSize(tempCornerRadiusNormal, tempCornerRadiusNormal));
        mCornerRadiusBottomRightPressed = typedArray.getDimensionPixelOffset(cornerRadiusBottomRightPressed, getCornerSize(mCornerRadiusBottomRightNormal, tempCornerRadiusPressed));
        mCornerRadiusBottomRightSelected = typedArray.getDimensionPixelOffset(cornerRadiusBottomRightSelected, getCornerSize(mCornerRadiusBottomRightNormal, tempCornerRadiusSelected));
        mCornerRadiusBottomRightChecked = typedArray.getDimensionPixelOffset(cornerRadiusBottomRightChecked, getCornerSize(mCornerRadiusBottomRightNormal, tempCornerRadiusChecked));
        mCornerRadiusBottomRightUnable = typedArray.getDimensionPixelOffset(cornerRadiusBottomRightUnable, getCornerSize(mCornerRadiusBottomRightNormal, tempCornerRadiusUnable));

        mBorderWidthNormal = typedArray.getDimensionPixelOffset(borderWidthNormal, 0);
        mBorderWidthPressed = typedArray.getDimensionPixelOffset(borderWidthPressed, mBorderWidthNormal);
        mBorderWidthSelected = typedArray.getDimensionPixelOffset(borderWidthSelected, mBorderWidthNormal);
        mBorderWidthChecked = typedArray.getDimensionPixelOffset(borderWidthChecked, mBorderWidthNormal);
        mBorderWidthUnable = typedArray.getDimensionPixelOffset(borderWidthUnable, mBorderWidthNormal);

        mBorderDashWidthNormal = typedArray.getDimensionPixelOffset(borderDashWidthNormal, 0);
        mBorderDashWidthPressed = typedArray.getDimensionPixelOffset(borderDashWidthPressed, mBorderDashWidthNormal);
        mBorderDashWidthSelected = typedArray.getDimensionPixelOffset(borderDashWidthSelected, mBorderDashWidthNormal);
        mBorderDashWidthChecked = typedArray.getDimensionPixelOffset(borderDashWidthChecked, mBorderDashWidthNormal);
        mBorderDashWidthUnable = typedArray.getDimensionPixelOffset(borderDashWidthUnable, mBorderDashWidthNormal);

        mBorderDashGapNormal = typedArray.getDimensionPixelOffset(borderDashGapNormal, 0);
        mBorderDashGapPressed = typedArray.getDimensionPixelOffset(borderDashGapPressed, mBorderDashGapNormal);
        mBorderDashGapSelected = typedArray.getDimensionPixelOffset(borderDashGapSelected, mBorderDashGapNormal);
        mBorderDashGapChecked = typedArray.getDimensionPixelOffset(borderDashGapChecked, mBorderDashGapNormal);
        mBorderDashGapUnable = typedArray.getDimensionPixelOffset(borderDashGapUnable, mBorderDashGapNormal);

        mBorderColorNormal = typedArray.getColor(borderColorNormal, Color.TRANSPARENT);
        mBorderColorPressed = typedArray.getColor(borderColorPressed, mBorderColorNormal);
        mBorderColorSelected = typedArray.getColor(borderColorSelected, mBorderColorNormal);
        mBorderColorChecked = typedArray.getColor(borderColorChecked, mBorderColorNormal);
        mBorderColorUnable = typedArray.getColor(borderColorUnable, mBorderColorNormal);

        mHasBackgroundColorTintPressed = typedArray.hasValue(backgroundColorTintPressed);
        mBackgroundColorTintPressed = typedArray.getColor(backgroundColorTintPressed, Color.TRANSPARENT);

        if (mBackgroundDrawableNormal == null) {
            updateNormalDrawable();
        }
        if (mBackgroundDrawablePressed == null) {
            updatePressedDrawable();
        }
        if (mBackgroundDrawableSelected == null) {
            updateSelectedDrawable();
        }
        if (mBackgroundDrawableChecked == null) {
            updateCheckedDrawable();
        }
        if (mBackgroundDrawableUnable == null) {
            updateUnableDrawable();
        }

        updatePressedTint();

        // 生成背景
        recreateViewBackgroundDrawable();
    }

    // 更新对应状态的背景
    private void updateNormalDrawable() {
        if (mBackgroundDrawableExistArray[Constant.STATE_INDEX_NORMAL]) {
            if (mBackgroundDrawableNormal == null) {
                mBackgroundDrawableNormal = new GradientDrawable();
            }
        } else {
            mBackgroundDrawableNormal = createDrawable(mBackgroundColorNormal,
                    mGradientOrientationNormal, mGradientCenterXNormal, mGradientCenterYNormal,
                    mGradientStartColorNormal, mHasGradientCenterColorNormal, mGradientCenterColorNormal, mGradientEndColorNormal,
                    mGradientRadiusNormal, mGradientTypeNormal,
                    mCornerRadiusTopLeftNormal, mCornerRadiusTopRightNormal,
                    mCornerRadiusBottomLeftNormal, mCornerRadiusBottomRightNormal,
                    mBorderWidthNormal, mBorderDashWidthNormal, mBorderDashGapNormal, mBorderColorNormal);
        }
    }

    private void updatePressedDrawable() {
        if (mBackgroundDrawableExistArray[Constant.STATE_INDEX_PRESSED]) {
            if (mBackgroundDrawablePressed == null) {
                mBackgroundDrawablePressed = new GradientDrawable();
            }
        } else {
            mBackgroundDrawablePressed = createDrawable(mBackgroundColorPressed,
                    mGradientOrientationPressed, mGradientCenterXPressed, mGradientCenterYPressed,
                    mGradientStartColorPressed, mHasGradientCenterColorPressed, mGradientCenterColorPressed, mGradientEndColorPressed,
                    mGradientRadiusPressed, mGradientTypePressed,
                    mCornerRadiusTopLeftPressed, mCornerRadiusTopRightPressed,
                    mCornerRadiusBottomLeftPressed, mCornerRadiusBottomRightPressed,
                    mBorderWidthPressed, mBorderDashWidthPressed, mBorderDashGapPressed, mBorderColorPressed);
        }
    }

    private void updateSelectedDrawable() {
        if (mBackgroundDrawableExistArray[Constant.STATE_INDEX_SELECTED]) {
            if (mBackgroundDrawableSelected == null) {
                mBackgroundDrawableSelected = new GradientDrawable();
            }
        } else {
            mBackgroundDrawableSelected = createDrawable(mBackgroundColorSelected,
                    mGradientOrientationSelected, mGradientCenterXSelected, mGradientCenterYSelected,
                    mGradientStartColorSelected, mHasGradientCenterColorSelected, mGradientCenterColorSelected, mGradientEndColorSelected,
                    mGradientRadiusSelected, mGradientTypeSelected,
                    mCornerRadiusTopLeftSelected, mCornerRadiusTopRightSelected,
                    mCornerRadiusBottomLeftSelected, mCornerRadiusBottomRightSelected,
                    mBorderWidthSelected, mBorderDashWidthSelected, mBorderDashGapSelected, mBorderColorSelected);
        }
    }

    private void updateCheckedDrawable() {
        if (mBackgroundDrawableExistArray[Constant.STATE_INDEX_CHECKED]) {
            if (mBackgroundDrawableChecked == null) {
                mBackgroundDrawableChecked = new GradientDrawable();
            }
        } else {
            mBackgroundDrawableChecked = createDrawable(mBackgroundColorChecked,
                    mGradientOrientationChecked, mGradientCenterXChecked, mGradientCenterYChecked,
                    mGradientStartColorChecked, mHasGradientCenterColorChecked, mGradientCenterColorChecked, mGradientEndColorChecked,
                    mGradientRadiusChecked, mGradientTypeChecked,
                    mCornerRadiusTopLeftChecked, mCornerRadiusTopRightChecked,
                    mCornerRadiusBottomLeftChecked, mCornerRadiusBottomRightChecked,
                    mBorderWidthChecked, mBorderDashWidthChecked, mBorderDashGapChecked, mBorderColorChecked);
        }
    }

    private void updateUnableDrawable() {
        if (mBackgroundDrawableExistArray[Constant.STATE_INDEX_UNABLE]) {
            if (mBackgroundDrawableUnable == null) {
                mBackgroundDrawableUnable = new GradientDrawable();
            }
        } else {
            mBackgroundDrawableUnable = createDrawable(mBackgroundColorUnable,
                    mGradientOrientationUnable, mGradientCenterXUnable, mGradientCenterYUnable,
                    mGradientStartColorUnable, mHasGradientCenterColorUnable, mGradientCenterColorUnable, mGradientEndColorUnable,
                    mGradientRadiusUnable, mGradientTypeUnable,
                    mCornerRadiusTopLeftUnable, mCornerRadiusTopRightUnable,
                    mCornerRadiusBottomLeftUnable, mCornerRadiusBottomRightUnable,
                    mBorderWidthUnable, mBorderDashWidthUnable, mBorderDashGapUnable, mBorderColorUnable);
        }
    }

    private void updatePressedTint() {
        if (mHasBackgroundColorTintPressed) {
            DrawableCompat.setTint(mBackgroundDrawablePressed, mBackgroundColorTintPressed);
            DrawableCompat.setTintMode(mBackgroundDrawablePressed, PorterDuff.Mode.SRC_ATOP);
        }
    }

    // 刷新本视图的背景
    private void recreateViewBackgroundDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(Constant.STATE_0_UNABLE, mBackgroundDrawableUnable);
        stateListDrawable.addState(Constant.STATE_1_PRESSED, mBackgroundDrawablePressed);
        stateListDrawable.addState(Constant.STATE_2_SELECTED, mBackgroundDrawableSelected);
        stateListDrawable.addState(Constant.STATE_3_CHECKED, mBackgroundDrawableChecked);
        stateListDrawable.addState(Constant.STATE_4_ENABLED, mBackgroundDrawableNormal);
        stateListDrawable.addState(Constant.STATE_5_NONE, mBackgroundDrawableNormal);
        mView.setBackground(stateListDrawable);
    }

    // 通用构造器
    private Drawable createDrawable(int backgroundColor,
                                    int gradientOrientation, float gradientCenterX, float gradientCenterY,
                                    int gradientStartColor, boolean hasGradientCenterColor, int gradientCenterColor, int gradientEndColor,
                                    int gradientRadius, int gradientType,
                                    int cornerRadiusTopLeft, int cornerRadiusTopRight,
                                    int cornerRadiusBottomLeft, int cornerRadiusBottomRight,
                                    int borderWidth, int borderDashWidth, int borderDashGap, int borderColor) {

        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(backgroundColor);
        gradientDrawable.setStroke(borderWidth, borderColor, borderDashWidth, borderDashGap);

        if (gradientType != Constant.GRADIENT_TYPE_NONE) {
            if (hasGradientCenterColor) {
                gradientDrawable.setColors(new int[]{gradientStartColor, gradientCenterColor, gradientEndColor});
            } else {
                gradientDrawable.setColors(new int[]{gradientStartColor, gradientEndColor});
            }
            if (gradientType == Constant.GRADIENT_TYPE_LINEAR) {
                gradientDrawable.setGradientType(GradientDrawable.LINEAR_GRADIENT);
                gradientDrawable.setOrientation(getOrientation(gradientOrientation));
            } else if (gradientType == Constant.GRADIENT_TYPE_RADIAL) {
                gradientDrawable.setGradientType(GradientDrawable.RADIAL_GRADIENT);
                gradientDrawable.setGradientCenter(gradientCenterX, gradientCenterY);
                gradientDrawable.setGradientRadius(gradientRadius);
            } else if (gradientType == Constant.GRADIENT_TYPE_SWEEP) {
                gradientDrawable.setGradientType(GradientDrawable.SWEEP_GRADIENT);
                gradientDrawable.setGradientCenter(gradientCenterX, gradientCenterY);
            }
        }

        if (cornerRadiusTopLeft == cornerRadiusTopRight && cornerRadiusTopRight == cornerRadiusBottomLeft && cornerRadiusBottomLeft == cornerRadiusBottomRight) {
            gradientDrawable.setCornerRadius(cornerRadiusTopLeft);
        } else {
            float[] cornerArray = new float[8];
            cornerArray[0] = cornerRadiusTopLeft;
            cornerArray[1] = cornerRadiusTopLeft;
            cornerArray[2] = cornerRadiusTopRight;
            cornerArray[3] = cornerRadiusTopRight;
            cornerArray[4] = cornerRadiusBottomRight;
            cornerArray[5] = cornerRadiusBottomRight;
            cornerArray[6] = cornerRadiusBottomLeft;
            cornerArray[7] = cornerRadiusBottomLeft;
            gradientDrawable.setCornerRadii(cornerArray);
        }

        return gradientDrawable;
    }

    // 我们的方向转成标准方向
    private GradientDrawable.Orientation getOrientation(int orientation) {
        switch (orientation) {
            case Constant.GRADIENT_ORIENTATION_T_B:
                return GradientDrawable.Orientation.TOP_BOTTOM;
            case Constant.GRADIENT_ORIENTATION_TR_BL:
                return GradientDrawable.Orientation.TR_BL;
            case Constant.GRADIENT_ORIENTATION_R_L:
                return GradientDrawable.Orientation.RIGHT_LEFT;
            case Constant.GRADIENT_ORIENTATION_BR_TL:
                return GradientDrawable.Orientation.BR_TL;
            case Constant.GRADIENT_ORIENTATION_B_T:
                return GradientDrawable.Orientation.BOTTOM_TOP;
            case Constant.GRADIENT_ORIENTATION_BL_TR:
                return GradientDrawable.Orientation.BL_TR;
            case Constant.GRADIENT_ORIENTATION_L_R:
                return GradientDrawable.Orientation.LEFT_RIGHT;
            case Constant.GRADIENT_ORIENTATION_TL_BR:
                return GradientDrawable.Orientation.TL_BR;
        }

        return GradientDrawable.Orientation.LEFT_RIGHT;
    }

    // 判断圆角的值
    private int getCornerSize(int normalSize, int targetSize) {
        if (normalSize == Integer.MIN_VALUE) {
            return targetSize == Integer.MIN_VALUE ? 0 : targetSize;
        } else {
            return targetSize == Integer.MIN_VALUE ? normalSize : targetSize;
        }
    }

    // GET SET
    public int getBackgroundColorNormal() {
        return mBackgroundColorNormal;
    }

    public void setBackgroundColorNormal(int backgroundColorNormal) {
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_NORMAL] = false;
        if (mBackgroundColorNormal != backgroundColorNormal) {
            mBackgroundColorNormal = backgroundColorNormal;
            updateNormalDrawable();
            recreateViewBackgroundDrawable();
        }
    }

    public int getBackgroundColorPressed() {
        return mBackgroundColorPressed;
    }

    public void setBackgroundColorPressed(int backgroundColorPressed) {
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_PRESSED] = false;
        if (mBackgroundColorPressed != backgroundColorPressed) {
            mBackgroundColorPressed = backgroundColorPressed;
            updatePressedDrawable();
            recreateViewBackgroundDrawable();
        }
    }

    public int getBackgroundColorSelected() {
        return mBackgroundColorSelected;
    }

    public void setBackgroundColorSelected(int backgroundColorSelected) {
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_SELECTED] = false;
        if (mBackgroundColorSelected != backgroundColorSelected) {
            mBackgroundColorSelected = backgroundColorSelected;
            updateSelectedDrawable();
            recreateViewBackgroundDrawable();
        }
    }

    public int getBackgroundColorChecked() {
        return mBackgroundColorChecked;
    }

    public void setBackgroundColorChecked(int backgroundColorChecked) {
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_CHECKED] = false;
        if (mBackgroundColorChecked != backgroundColorChecked) {
            mBackgroundColorChecked = backgroundColorChecked;
            updateCheckedDrawable();
            recreateViewBackgroundDrawable();
        }
    }

    public int getBackgroundColorUnable() {
        return mBackgroundColorUnable;
    }

    public void setBackgroundColorUnable(int backgroundColorUnable) {
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_UNABLE] = false;
        if (mBackgroundColorUnable != backgroundColorUnable) {
            mBackgroundColorUnable = backgroundColorUnable;
            updateUnableDrawable();
            recreateViewBackgroundDrawable();
        }
    }

    public Drawable getBackgroundDrawableNormal() {
        return mBackgroundDrawableNormal;
    }

    public void setBackgroundDrawableNormal(Drawable backgroundDrawableNormal) {
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_NORMAL] = true;
        if (backgroundDrawableNormal != null) {
            if (mBackgroundDrawableNormal != backgroundDrawableNormal) {
                mBackgroundDrawableNormal = backgroundDrawableNormal;
                recreateViewBackgroundDrawable();
            }
        }
    }

    public Drawable getBackgroundDrawablePressed() {
        return mBackgroundDrawablePressed;
    }

    public void setBackgroundDrawablePressed(Drawable backgroundDrawablePressed) {
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_PRESSED] = true;
        if (backgroundDrawablePressed != null) {
            if (mBackgroundDrawablePressed != backgroundDrawablePressed) {
                mBackgroundDrawablePressed = backgroundDrawablePressed;
                updatePressedTint();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public Drawable getBackgroundDrawableSelected() {
        return mBackgroundDrawableSelected;
    }

    public void setBackgroundDrawableSelected(Drawable backgroundDrawableSelected) {
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_SELECTED] = true;
        if (backgroundDrawableSelected != null) {
            if (mBackgroundDrawableSelected != backgroundDrawableSelected) {
                mBackgroundDrawableSelected = backgroundDrawableSelected;
                recreateViewBackgroundDrawable();
            }
        }
    }

    public Drawable getBackgroundDrawableChecked() {
        return mBackgroundDrawableChecked;
    }

    public void setBackgroundDrawableChecked(Drawable backgroundDrawableChecked) {
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_CHECKED] = true;
        if (backgroundDrawableChecked != null) {
            if (mBackgroundDrawableChecked != backgroundDrawableChecked) {
                mBackgroundDrawableChecked = backgroundDrawableChecked;
                recreateViewBackgroundDrawable();
            }
        }
    }

    public Drawable getBackgroundDrawableUnable() {
        return mBackgroundDrawableUnable;
    }

    public void setBackgroundDrawableUnable(Drawable backgroundDrawableUnable) {
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_UNABLE] = true;
        if (backgroundDrawableUnable != null) {
            if (mBackgroundDrawableUnable != backgroundDrawableUnable) {
                mBackgroundDrawableUnable = backgroundDrawableUnable;
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getGradientOrientationNormal() {
        return mGradientOrientationNormal;
    }

    public void setGradientOrientationNormal(int gradientOrientationNormal) {
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mGradientTypeNormal == Constant.GRADIENT_TYPE_LINEAR) {
                if (mGradientOrientationNormal != gradientOrientationNormal) {
                    mGradientOrientationNormal = gradientOrientationNormal;
                    updateNormalDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientOrientationPressed() {
        return mGradientOrientationPressed;
    }

    public void setGradientOrientationPressed(int gradientOrientationPressed) {
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mGradientTypePressed == Constant.GRADIENT_TYPE_LINEAR) {
                if (mGradientOrientationPressed != gradientOrientationPressed) {
                    mGradientOrientationPressed = gradientOrientationPressed;
                    updatePressedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientOrientationSelected() {
        return mGradientOrientationSelected;
    }

    public void setGradientOrientationSelected(int gradientOrientationSelected) {
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mGradientTypeSelected == Constant.GRADIENT_TYPE_LINEAR) {
                if (mGradientOrientationSelected != gradientOrientationSelected) {
                    mGradientOrientationSelected = gradientOrientationSelected;
                    updateSelectedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientOrientationChecked() {
        return mGradientOrientationChecked;
    }

    public void setGradientOrientationChecked(int gradientOrientationChecked) {
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mGradientTypeChecked == Constant.GRADIENT_TYPE_LINEAR) {
                if (mGradientOrientationChecked != gradientOrientationChecked) {
                    mGradientOrientationChecked = gradientOrientationChecked;
                    updateCheckedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientOrientationUnable() {
        return mGradientOrientationUnable;
    }

    public void setGradientOrientationUnable(int gradientOrientationUnable) {
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mGradientTypeUnable == Constant.GRADIENT_TYPE_LINEAR) {
                if (mGradientOrientationUnable != gradientOrientationUnable) {
                    mGradientOrientationUnable = gradientOrientationUnable;
                    updateUnableDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public float getGradientCenterXNormal() {
        return mGradientCenterXNormal;
    }

    public void setGradientCenterXNormal(float gradientCenterXNormal) {
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mGradientTypeNormal == Constant.GRADIENT_TYPE_RADIAL || mGradientTypePressed == Constant.GRADIENT_TYPE_SWEEP) {
                if (mGradientCenterXNormal != gradientCenterXNormal) {
                    mGradientCenterXNormal = gradientCenterXNormal;
                    updateNormalDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public float getGradientCenterXPressed() {
        return mGradientCenterXPressed;
    }

    public void setGradientCenterXPressed(float gradientCenterXPressed) {
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mGradientTypePressed == Constant.GRADIENT_TYPE_RADIAL || mGradientTypePressed == Constant.GRADIENT_TYPE_SWEEP) {
                if (mGradientCenterXPressed != gradientCenterXPressed) {
                    mGradientCenterXPressed = gradientCenterXPressed;
                    updatePressedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public float getGradientCenterXSelected() {
        return mGradientCenterXSelected;
    }

    public void setGradientCenterXSelected(float gradientCenterXSelected) {
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mGradientTypeSelected == Constant.GRADIENT_TYPE_RADIAL || mGradientTypeSelected == Constant.GRADIENT_TYPE_SWEEP) {
                if (mGradientCenterXSelected != gradientCenterXSelected) {
                    mGradientCenterXSelected = gradientCenterXSelected;
                    updateSelectedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public float getGradientCenterXChecked() {
        return mGradientCenterXChecked;
    }

    public void setGradientCenterXChecked(float gradientCenterXChecked) {
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mGradientTypeChecked == Constant.GRADIENT_TYPE_RADIAL || mGradientTypeChecked == Constant.GRADIENT_TYPE_SWEEP) {
                if (mGradientCenterXChecked != gradientCenterXChecked) {
                    mGradientCenterXChecked = gradientCenterXChecked;
                    updateCheckedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public float getGradientCenterXUnable() {
        return mGradientCenterXUnable;
    }

    public void setGradientCenterXUnable(float gradientCenterXUnable) {
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mGradientTypeUnable == Constant.GRADIENT_TYPE_RADIAL || mGradientTypeUnable == Constant.GRADIENT_TYPE_SWEEP) {
                if (mGradientCenterXUnable != gradientCenterXUnable) {
                    mGradientCenterXUnable = gradientCenterXUnable;
                    updateUnableDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public float getGradientCenterYNormal() {
        return mGradientCenterYNormal;
    }

    public void setGradientCenterYNormal(float gradientCenterYNormal) {
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mGradientTypeNormal == Constant.GRADIENT_TYPE_RADIAL || mGradientTypeNormal == Constant.GRADIENT_TYPE_SWEEP) {
                if (mGradientCenterYNormal != gradientCenterYNormal) {
                    mGradientCenterYNormal = gradientCenterYNormal;
                    updateNormalDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public float getGradientCenterYPressed() {
        return mGradientCenterYPressed;
    }

    public void setGradientCenterYPressed(float gradientCenterYPressed) {
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mGradientTypePressed == Constant.GRADIENT_TYPE_RADIAL || mGradientTypePressed == Constant.GRADIENT_TYPE_SWEEP) {
                if (mGradientCenterYPressed != gradientCenterYPressed) {
                    mGradientCenterYPressed = gradientCenterYPressed;
                    updatePressedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public float getGradientCenterYSelected() {
        return mGradientCenterYSelected;
    }

    public void setGradientCenterYSelected(float gradientCenterYSelected) {
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mGradientTypeSelected == Constant.GRADIENT_TYPE_RADIAL || mGradientTypeSelected == Constant.GRADIENT_TYPE_SWEEP) {
                if (mGradientCenterYSelected != gradientCenterYSelected) {
                    mGradientCenterYSelected = gradientCenterYSelected;
                    updateSelectedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public float getGradientCenterYChecked() {
        return mGradientCenterYChecked;
    }

    public void setGradientCenterYChecked(float gradientCenterYChecked) {
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mGradientTypeChecked == Constant.GRADIENT_TYPE_RADIAL || mGradientTypeChecked == Constant.GRADIENT_TYPE_SWEEP) {
                if (mGradientCenterYChecked != gradientCenterYChecked) {
                    mGradientCenterYChecked = gradientCenterYChecked;
                    updateCheckedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public float getGradientCenterYUnable() {
        return mGradientCenterYUnable;
    }

    public void setGradientCenterYUnable(float gradientCenterYUnable) {
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mGradientTypeUnable == Constant.GRADIENT_TYPE_RADIAL || mGradientTypeUnable == Constant.GRADIENT_TYPE_SWEEP) {
                if (mGradientCenterYUnable != gradientCenterYUnable) {
                    mGradientCenterYUnable = gradientCenterYUnable;
                    updateUnableDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientStartColorNormal() {
        return mGradientStartColorNormal;
    }

    public void setGradientStartColorNormal(int gradientStartColorNormal) {
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mGradientTypeNormal != Constant.GRADIENT_TYPE_NONE) {
                if (mGradientStartColorNormal != gradientStartColorNormal) {
                    mGradientStartColorNormal = gradientStartColorNormal;
                    updateNormalDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientStartColorPressed() {
        return mGradientStartColorPressed;
    }

    public void setGradientStartColorPressed(int gradientStartColorPressed) {
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mGradientTypePressed != Constant.GRADIENT_TYPE_NONE) {
                if (mGradientStartColorPressed != gradientStartColorPressed) {
                    mGradientStartColorPressed = gradientStartColorPressed;
                    updatePressedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientStartColorSelected() {
        return mGradientStartColorSelected;
    }

    public void setGradientStartColorSelected(int gradientStartColorSelected) {
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mGradientTypeSelected != Constant.GRADIENT_TYPE_NONE) {
                if (mGradientStartColorSelected != gradientStartColorSelected) {
                    mGradientStartColorSelected = gradientStartColorSelected;
                    updateSelectedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientStartColorChecked() {
        return mGradientStartColorChecked;
    }

    public void setGradientStartColorChecked(int gradientStartColorChecked) {
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mGradientTypeChecked != Constant.GRADIENT_TYPE_NONE) {
                if (mGradientStartColorChecked != gradientStartColorChecked) {
                    mGradientStartColorChecked = gradientStartColorChecked;
                    updateCheckedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientStartColorUnable() {
        return mGradientStartColorUnable;
    }

    public void setGradientStartColorUnable(int gradientStartColorUnable) {
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mGradientTypeUnable != Constant.GRADIENT_TYPE_NONE) {
                if (mGradientStartColorUnable != gradientStartColorUnable) {
                    mGradientStartColorUnable = gradientStartColorUnable;
                    updateUnableDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientCenterColorNormal() {
        return mGradientCenterColorNormal;
    }

    public void setGradientCenterColorNormal(int gradientCenterColorNormal) {
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mGradientTypeNormal != Constant.GRADIENT_TYPE_NONE) {
                if (mGradientCenterColorNormal != gradientCenterColorNormal) {
                    mGradientCenterColorNormal = gradientCenterColorNormal;
                    updateNormalDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientCenterColorPressed() {
        return mGradientCenterColorPressed;
    }

    public void setGradientCenterColorPressed(int gradientCenterColorPressed) {
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mGradientTypePressed != Constant.GRADIENT_TYPE_NONE) {
                if (mGradientCenterColorPressed != gradientCenterColorPressed) {
                    mGradientCenterColorPressed = gradientCenterColorPressed;
                    updatePressedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientCenterColorSelected() {
        return mGradientCenterColorSelected;
    }

    public void setGradientCenterColorSelected(int gradientCenterColorSelected) {
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mGradientTypeSelected != Constant.GRADIENT_TYPE_NONE) {
                if (mGradientCenterColorSelected != gradientCenterColorSelected) {
                    mGradientCenterColorSelected = gradientCenterColorSelected;
                    updateSelectedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientCenterColorChecked() {
        return mGradientCenterColorChecked;
    }

    public void setGradientCenterColorChecked(int gradientCenterColorChecked) {
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mGradientTypeChecked != Constant.GRADIENT_TYPE_NONE) {
                if (mGradientCenterColorChecked != gradientCenterColorChecked) {
                    mGradientCenterColorChecked = gradientCenterColorChecked;
                    updateCheckedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientCenterColorUnable() {
        return mGradientCenterColorUnable;
    }

    public void setGradientCenterColorUnable(int gradientCenterColorUnable) {
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mGradientTypeUnable != Constant.GRADIENT_TYPE_NONE) {
                if (mGradientCenterColorUnable != gradientCenterColorUnable) {
                    mGradientCenterColorUnable = gradientCenterColorUnable;
                    updateUnableDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientEndColorNormal() {
        return mGradientEndColorNormal;
    }

    public void setGradientEndColorNormal(int gradientEndColorNormal) {
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mGradientTypeNormal != Constant.GRADIENT_TYPE_NONE) {
                if (mGradientEndColorNormal != gradientEndColorNormal) {
                    mGradientEndColorNormal = gradientEndColorNormal;
                    updateNormalDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientEndColorPressed() {
        return mGradientEndColorPressed;
    }

    public void setGradientEndColorPressed(int gradientEndColorPressed) {
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mGradientTypePressed != Constant.GRADIENT_TYPE_NONE) {
                if (mGradientEndColorPressed != gradientEndColorPressed) {
                    mGradientEndColorPressed = gradientEndColorPressed;
                    updatePressedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientEndColorSelected() {
        return mGradientEndColorSelected;
    }

    public void setGradientEndColorSelected(int gradientEndColorSelected) {
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mGradientTypeSelected != Constant.GRADIENT_TYPE_NONE) {
                if (mGradientEndColorSelected != gradientEndColorSelected) {
                    mGradientEndColorSelected = gradientEndColorSelected;
                    updateSelectedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientEndColorChecked() {
        return mGradientEndColorChecked;
    }

    public void setGradientEndColorChecked(int gradientEndColorChecked) {
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mGradientTypeChecked != Constant.GRADIENT_TYPE_NONE) {
                if (mGradientEndColorChecked != gradientEndColorChecked) {
                    mGradientEndColorChecked = gradientEndColorChecked;
                    updateCheckedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientEndColorUnable() {
        return mGradientEndColorUnable;
    }

    public void setGradientEndColorUnable(int gradientEndColorUnable) {
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mGradientTypeUnable != Constant.GRADIENT_TYPE_NONE) {
                if (mGradientEndColorUnable != gradientEndColorUnable) {
                    mGradientEndColorUnable = gradientEndColorUnable;
                    updateUnableDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientRadiusNormal() {
        return mGradientRadiusNormal;
    }

    public void setGradientRadiusNormal(int gradientRadiusNormal) {
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mGradientTypeNormal == Constant.GRADIENT_TYPE_RADIAL) {
                if (mGradientRadiusNormal != gradientRadiusNormal) {
                    mGradientRadiusNormal = gradientRadiusNormal;
                    updateNormalDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientRadiusPressed() {
        return mGradientRadiusPressed;
    }

    public void setGradientRadiusPressed(int gradientRadiusPressed) {
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mGradientTypePressed == Constant.GRADIENT_TYPE_RADIAL) {
                if (mGradientRadiusPressed != gradientRadiusPressed) {
                    mGradientRadiusPressed = gradientRadiusPressed;
                    updatePressedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientRadiusSelected() {
        return mGradientRadiusSelected;
    }

    public void setGradientRadiusSelected(int gradientRadiusSelected) {
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mGradientTypeSelected == Constant.GRADIENT_TYPE_RADIAL) {
                if (mGradientRadiusSelected != gradientRadiusSelected) {
                    mGradientRadiusSelected = gradientRadiusSelected;
                    updateSelectedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientRadiusChecked() {
        return mGradientRadiusChecked;
    }

    public void setGradientRadiusChecked(int gradientRadiusChecked) {
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mGradientTypeChecked == Constant.GRADIENT_TYPE_RADIAL) {
                if (mGradientRadiusChecked != gradientRadiusChecked) {
                    mGradientRadiusChecked = gradientRadiusChecked;
                    updateCheckedDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientRadiusUnable() {
        return mGradientRadiusUnable;
    }

    public void setGradientRadiusUnable(int gradientRadiusUnable) {
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mGradientTypeUnable == Constant.GRADIENT_TYPE_RADIAL) {
                if (mGradientRadiusUnable != gradientRadiusUnable) {
                    mGradientRadiusUnable = gradientRadiusUnable;
                    updateUnableDrawable();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientTypeNormal() {
        return mGradientTypeNormal;
    }

    public void setGradientTypeNormal(int gradientTypeNormal) {
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_NORMAL] = false;
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mGradientTypeNormal != gradientTypeNormal) {
                mGradientTypeNormal = gradientTypeNormal;
                updateNormalDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getGradientTypePressed() {
        return mGradientTypePressed;
    }

    public void setGradientTypePressed(int gradientTypePressed) {
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_PRESSED] = false;
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mGradientTypePressed != gradientTypePressed) {
                mGradientTypePressed = gradientTypePressed;
                updatePressedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getGradientTypeSelected() {
        return mGradientTypeSelected;
    }

    public void setGradientTypeSelected(int gradientTypeSelected) {
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_SELECTED] = false;
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mGradientTypeSelected != gradientTypeSelected) {
                mGradientTypeSelected = gradientTypeSelected;
                updateSelectedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getGradientTypeChecked() {
        return mGradientTypeChecked;
    }

    public void setGradientTypeChecked(int gradientTypeChecked) {
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_CHECKED] = false;
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mGradientTypeChecked != gradientTypeChecked) {
                mGradientTypeChecked = gradientTypeChecked;
                updateCheckedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getGradientTypeUnable() {
        return mGradientTypeUnable;
    }

    public void setGradientTypeUnable(int gradientTypeUnable) {
        mBackgroundDrawableExistArray[Constant.STATE_INDEX_UNABLE] = false;
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mGradientTypeUnable != gradientTypeUnable) {
                mGradientTypeUnable = gradientTypeUnable;
                updateUnableDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusTopLeftNormal() {
        return mCornerRadiusTopLeftNormal;
    }

    public void setCornerRadiusTopLeftNormal(int cornerRadiusTopLeftNormal) {
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mCornerRadiusTopLeftNormal != cornerRadiusTopLeftNormal) {
                mCornerRadiusTopLeftNormal = cornerRadiusTopLeftNormal;
                updateNormalDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusTopLeftPressed() {
        return mCornerRadiusTopLeftPressed;
    }

    public void setCornerRadiusTopLeftPressed(int cornerRadiusTopLeftPressed) {
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mCornerRadiusTopLeftPressed != cornerRadiusTopLeftPressed) {
                mCornerRadiusTopLeftPressed = cornerRadiusTopLeftPressed;
                updatePressedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusTopLeftSelected() {
        return mCornerRadiusTopLeftSelected;
    }

    public void setCornerRadiusTopLeftSelected(int cornerRadiusTopLeftSelected) {
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mCornerRadiusTopLeftSelected != cornerRadiusTopLeftSelected) {
                mCornerRadiusTopLeftSelected = cornerRadiusTopLeftSelected;
                updateSelectedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusTopLeftChecked() {
        return mCornerRadiusTopLeftChecked;
    }

    public void setCornerRadiusTopLeftChecked(int cornerRadiusTopLeftChecked) {
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mCornerRadiusTopLeftChecked != cornerRadiusTopLeftChecked) {
                mCornerRadiusTopLeftChecked = cornerRadiusTopLeftChecked;
                updateCheckedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusTopLeftUnable() {
        return mCornerRadiusTopLeftUnable;
    }

    public void setCornerRadiusTopLeftUnable(int cornerRadiusTopLeftUnable) {
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mCornerRadiusTopLeftUnable != cornerRadiusTopLeftUnable) {
                mCornerRadiusTopLeftUnable = cornerRadiusTopLeftUnable;
                updateUnableDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusTopRightNormal() {
        return mCornerRadiusTopRightNormal;
    }

    public void setCornerRadiusTopRightNormal(int cornerRadiusTopRightNormal) {
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mCornerRadiusTopRightNormal != cornerRadiusTopRightNormal) {
                mCornerRadiusTopRightNormal = cornerRadiusTopRightNormal;
                updateNormalDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusTopRightPressed() {
        return mCornerRadiusTopRightPressed;
    }

    public void setCornerRadiusTopRightPressed(int cornerRadiusTopRightPressed) {
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mCornerRadiusTopRightPressed != cornerRadiusTopRightPressed) {
                mCornerRadiusTopRightPressed = cornerRadiusTopRightPressed;
                updatePressedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusTopRightSelected() {
        return mCornerRadiusTopRightSelected;
    }

    public void setCornerRadiusTopRightSelected(int cornerRadiusTopRightSelected) {
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mCornerRadiusTopRightSelected != cornerRadiusTopRightSelected) {
                mCornerRadiusTopRightSelected = cornerRadiusTopRightSelected;
                updateSelectedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusTopRightChecked() {
        return mCornerRadiusTopRightChecked;
    }

    public void setCornerRadiusTopRightChecked(int cornerRadiusTopRightChecked) {
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mCornerRadiusTopRightChecked != cornerRadiusTopRightChecked) {
                mCornerRadiusTopRightChecked = cornerRadiusTopRightChecked;
                updateCheckedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusTopRightUnable() {
        return mCornerRadiusTopRightUnable;
    }

    public void setCornerRadiusTopRightUnable(int cornerRadiusTopRightUnable) {
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mCornerRadiusTopRightUnable != cornerRadiusTopRightUnable) {
                mCornerRadiusTopRightUnable = cornerRadiusTopRightUnable;
                updateUnableDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusBottomLeftNormal() {
        return mCornerRadiusBottomLeftNormal;
    }

    public void setCornerRadiusBottomLeftNormal(int cornerRadiusBottomLeftNormal) {
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mCornerRadiusBottomLeftNormal != cornerRadiusBottomLeftNormal) {
                mCornerRadiusBottomLeftNormal = cornerRadiusBottomLeftNormal;
                updateNormalDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusBottomLeftPressed() {
        return mCornerRadiusBottomLeftPressed;
    }

    public void setCornerRadiusBottomLeftPressed(int cornerRadiusBottomLeftPressed) {
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mCornerRadiusBottomLeftPressed != cornerRadiusBottomLeftPressed) {
                mCornerRadiusBottomLeftPressed = cornerRadiusBottomLeftPressed;
                updatePressedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusBottomLeftSelected() {
        return mCornerRadiusBottomLeftSelected;
    }

    public void setCornerRadiusBottomLeftSelected(int cornerRadiusBottomLeftSelected) {
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mCornerRadiusBottomLeftSelected != cornerRadiusBottomLeftSelected) {
                mCornerRadiusBottomLeftSelected = cornerRadiusBottomLeftSelected;
                updateSelectedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusBottomLeftChecked() {
        return mCornerRadiusBottomLeftChecked;
    }

    public void setCornerRadiusBottomLeftChecked(int cornerRadiusBottomLeftChecked) {
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mCornerRadiusBottomLeftChecked != cornerRadiusBottomLeftChecked) {
                mCornerRadiusBottomLeftChecked = cornerRadiusBottomLeftChecked;
                updateCheckedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusBottomLeftUnable() {
        return mCornerRadiusBottomLeftUnable;
    }

    public void setCornerRadiusBottomLeftUnable(int cornerRadiusBottomLeftUnable) {
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mCornerRadiusBottomLeftUnable != cornerRadiusBottomLeftUnable) {
                mCornerRadiusBottomLeftUnable = cornerRadiusBottomLeftUnable;
                updateUnableDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusBottomRightNormal() {
        return mCornerRadiusBottomRightNormal;
    }

    public void setCornerRadiusBottomRightNormal(int cornerRadiusBottomRightNormal) {
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mCornerRadiusBottomRightNormal != cornerRadiusBottomRightNormal) {
                mCornerRadiusBottomRightNormal = cornerRadiusBottomRightNormal;
                updateNormalDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusBottomRightPressed() {
        return mCornerRadiusBottomRightPressed;
    }

    public void setCornerRadiusBottomRightPressed(int cornerRadiusBottomRightPressed) {
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mCornerRadiusBottomRightPressed != cornerRadiusBottomRightPressed) {
                mCornerRadiusBottomRightPressed = cornerRadiusBottomRightPressed;
                updatePressedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusBottomRightSelected() {
        return mCornerRadiusBottomRightSelected;
    }

    public void setCornerRadiusBottomRightSelected(int cornerRadiusBottomRightSelected) {
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mCornerRadiusBottomRightSelected != cornerRadiusBottomRightSelected) {
                mCornerRadiusBottomRightSelected = cornerRadiusBottomRightSelected;
                updateSelectedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusBottomRightChecked() {
        return mCornerRadiusBottomRightChecked;
    }

    public void setCornerRadiusBottomRightChecked(int cornerRadiusBottomRightChecked) {
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mCornerRadiusBottomRightChecked != cornerRadiusBottomRightChecked) {
                mCornerRadiusBottomRightChecked = cornerRadiusBottomRightChecked;
                updateCheckedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getCornerRadiusBottomRightUnable() {
        return mCornerRadiusBottomRightUnable;
    }

    public void setCornerRadiusBottomRightUnable(int cornerRadiusBottomRightUnable) {
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mCornerRadiusBottomRightUnable != cornerRadiusBottomRightUnable) {
                mCornerRadiusBottomRightUnable = cornerRadiusBottomRightUnable;
                updateUnableDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderWidthNormal() {
        return mBorderWidthNormal;
    }

    public void setBorderWidthNormal(int borderWidthNormal) {
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mBorderWidthNormal != borderWidthNormal) {
                mBorderWidthNormal = borderWidthNormal;
                updateNormalDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderWidthPressed() {
        return mBorderWidthPressed;
    }

    public void setBorderWidthPressed(int borderWidthPressed) {
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mBorderWidthPressed != borderWidthPressed) {
                mBorderWidthPressed = borderWidthPressed;
                updatePressedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderWidthSelected() {
        return mBorderWidthSelected;
    }

    public void setBorderWidthSelected(int borderWidthSelected) {
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mBorderWidthSelected != borderWidthSelected) {
                mBorderWidthSelected = borderWidthSelected;
                updateSelectedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderWidthChecked() {
        return mBorderWidthChecked;
    }

    public void setBorderWidthChecked(int borderWidthChecked) {
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mBorderWidthChecked != borderWidthChecked) {
                mBorderWidthChecked = borderWidthChecked;
                updateCheckedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderWidthUnable() {
        return mBorderWidthUnable;
    }

    public void setBorderWidthUnable(int borderWidthUnable) {
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mBorderWidthUnable != borderWidthUnable) {
                mBorderWidthUnable = borderWidthUnable;
                updateUnableDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderDashWidthNormal() {
        return mBorderDashWidthNormal;
    }

    public void setBorderDashWidthNormal(int borderDashWidthNormal) {
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mBorderDashWidthNormal != borderDashWidthNormal) {
                mBorderDashWidthNormal = borderDashWidthNormal;
                updateNormalDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderDashWidthPressed() {
        return mBorderDashWidthPressed;
    }

    public void setBorderDashWidthPressed(int borderDashWidthPressed) {
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mBorderDashWidthPressed != borderDashWidthPressed) {
                mBorderDashWidthPressed = borderDashWidthPressed;
                updatePressedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderDashWidthSelected() {
        return mBorderDashWidthSelected;
    }

    public void setBorderDashWidthSelected(int borderDashWidthSelected) {
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mBorderDashWidthSelected != borderDashWidthSelected) {
                mBorderDashWidthSelected = borderDashWidthSelected;
                updateSelectedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderDashWidthChecked() {
        return mBorderDashWidthChecked;
    }

    public void setBorderDashWidthChecked(int borderDashWidthChecked) {
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mBorderDashWidthChecked != borderDashWidthChecked) {
                mBorderDashWidthChecked = borderDashWidthChecked;
                updateCheckedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderDashWidthUnable() {
        return mBorderDashWidthUnable;
    }

    public void setBorderDashWidthUnable(int borderDashWidthUnable) {
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mBorderDashWidthUnable != borderDashWidthUnable) {
                mBorderDashWidthUnable = borderDashWidthUnable;
                updateUnableDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderDashGapNormal() {
        return mBorderDashGapNormal;
    }

    public void setBorderDashGapNormal(int borderDashGapNormal) {
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mBorderDashGapNormal != borderDashGapNormal) {
                mBorderDashGapNormal = borderDashGapNormal;
                updateNormalDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderDashGapPressed() {
        return mBorderDashGapPressed;
    }

    public void setBorderDashGapPressed(int borderDashGapPressed) {
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mBorderDashGapPressed != borderDashGapPressed) {
                mBorderDashGapPressed = borderDashGapPressed;
                updatePressedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderDashGapSelected() {
        return mBorderDashGapSelected;
    }

    public void setBorderDashGapSelected(int borderDashGapSelected) {
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mBorderDashGapSelected != borderDashGapSelected) {
                mBorderDashGapSelected = borderDashGapSelected;
                updateSelectedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderDashGapChecked() {
        return mBorderDashGapChecked;
    }

    public void setBorderDashGapChecked(int borderDashGapChecked) {
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mBorderDashGapChecked != borderDashGapChecked) {
                mBorderDashGapChecked = borderDashGapChecked;
                updateCheckedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderDashGapUnable() {
        return mBorderDashGapUnable;
    }

    public void setBorderDashGapUnable(int borderDashGapUnable) {
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mBorderDashGapUnable != borderDashGapUnable) {
                mBorderDashGapUnable = borderDashGapUnable;
                updateUnableDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderColorNormal() {
        return mBorderColorNormal;
    }

    public void setBorderColorNormal(int borderColorNormal) {
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mBorderColorNormal != borderColorNormal) {
                mBorderColorNormal = borderColorNormal;
                updateNormalDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderColorPressed() {
        return mBorderColorPressed;
    }

    public void setBorderColorPressed(int borderColorPressed) {
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mBorderColorPressed != borderColorPressed) {
                mBorderColorPressed = borderColorPressed;
                updatePressedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderColorSelected() {
        return mBorderColorSelected;
    }

    public void setBorderColorSelected(int borderColorSelected) {
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mBorderColorSelected != borderColorSelected) {
                mBorderColorSelected = borderColorSelected;
                updateSelectedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderColorChecked() {
        return mBorderColorChecked;
    }

    public void setBorderColorChecked(int borderColorChecked) {
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mBorderColorChecked != borderColorChecked) {
                mBorderColorChecked = borderColorChecked;
                updateCheckedDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBorderColorUnable() {
        return mBorderColorUnable;
    }

    public void setBorderColorUnable(int borderColorUnable) {
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mBorderColorUnable != borderColorUnable) {
                mBorderColorUnable = borderColorUnable;
                updateUnableDrawable();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getBackgroundColorTintPressed() {
        return mBackgroundColorTintPressed;
    }

    public void setBackgroundColorTintPressed(int backgroundColorTintPressed) {
        if (mBackgroundColorTintPressed != backgroundColorTintPressed) {
            mBackgroundColorTintPressed = backgroundColorTintPressed;
            mHasBackgroundColorTintPressed = true;
            updatePressedTint();
            recreateViewBackgroundDrawable();
        }
    }
}
