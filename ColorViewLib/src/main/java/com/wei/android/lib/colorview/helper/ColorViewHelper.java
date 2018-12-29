package com.wei.android.lib.colorview.helper;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;

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
                           int borderColorUnable) {

        mView = view;

        mBackgroundColorNormal = typedArray.getColor(backgroundColorNormal, Color.TRANSPARENT);
        mBackgroundColorPressed = typedArray.getColor(backgroundColorPressed, mBackgroundColorNormal);
        mBackgroundColorSelected = typedArray.getColor(backgroundColorSelected, mBackgroundColorNormal);
        mBackgroundColorChecked = typedArray.getColor(backgroundColorChecked, mBackgroundColorNormal);
        mBackgroundColorUnable = typedArray.getColor(backgroundColorUnable, mBackgroundColorNormal);

        mBackgroundDrawableNormal = typedArray.getDrawable(backgroundDrawableNormal);
        mBackgroundDrawablePressed = typedArray.getDrawable(backgroundDrawablePressed);
        mBackgroundDrawableSelected = typedArray.getDrawable(backgroundDrawableSelected);
        mBackgroundDrawableChecked = typedArray.getDrawable(backgroundDrawableChecked);
        mBackgroundDrawableUnable = typedArray.getDrawable(backgroundDrawableUnable);

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

        // 图片模式
        boolean isBackgroundColorMode = mBackgroundDrawableNormal == null;
        if (mBackgroundDrawableNormal == null) {
            mBackgroundDrawableNormal = new GradientDrawable();
        }
        if (mBackgroundDrawablePressed == null) {
            mBackgroundDrawablePressed = isBackgroundColorMode ? new GradientDrawable() : typedArray.getDrawable(backgroundDrawableNormal);
        }
        if (mBackgroundDrawableSelected == null) {
            mBackgroundDrawableSelected = isBackgroundColorMode ? new GradientDrawable() : typedArray.getDrawable(backgroundDrawableNormal);
        }
        if (mBackgroundDrawableChecked == null) {
            mBackgroundDrawableChecked = isBackgroundColorMode ? new GradientDrawable() : typedArray.getDrawable(backgroundDrawableNormal);
        }
        if (mBackgroundDrawableUnable == null) {
            mBackgroundDrawableUnable = isBackgroundColorMode ? new GradientDrawable() : typedArray.getDrawable(backgroundDrawableNormal);
        }

        // 颜色模式
        if (isBackgroundColorMode) {
            updateNormalColor();
            updatePressedColor();
            updateSelectedColor();
            updateCheckedColor();
            updateUnableColor();
        }

        // 生成背景
        recreateViewBackgroundDrawable();
    }

    // 更新对应状态的背景
    private void updateNormalColor() {
        mBackgroundDrawableNormal = createDrawable(mBackgroundColorNormal,
                mGradientOrientationNormal, mGradientCenterXNormal, mGradientCenterYNormal,
                mGradientStartColorNormal, mHasGradientCenterColorNormal, mGradientCenterColorNormal, mGradientEndColorNormal,
                mGradientRadiusNormal, mGradientTypeNormal,
                mCornerRadiusTopLeftNormal, mCornerRadiusTopRightNormal,
                mCornerRadiusBottomLeftNormal, mCornerRadiusBottomRightNormal,
                mBorderWidthNormal, mBorderDashWidthNormal, mBorderDashGapNormal, mBorderColorNormal);
    }

    private void updatePressedColor() {
        mBackgroundDrawablePressed = createDrawable(mBackgroundColorPressed,
                mGradientOrientationPressed, mGradientCenterXPressed, mGradientCenterYPressed,
                mGradientStartColorPressed, mHasGradientCenterColorPressed, mGradientCenterColorPressed, mGradientEndColorPressed,
                mGradientRadiusPressed, mGradientTypePressed,
                mCornerRadiusTopLeftPressed, mCornerRadiusTopRightPressed,
                mCornerRadiusBottomLeftPressed, mCornerRadiusBottomRightPressed,
                mBorderWidthPressed, mBorderDashWidthPressed, mBorderDashGapPressed, mBorderColorPressed);
    }

    private void updateSelectedColor() {
        mBackgroundDrawableSelected = createDrawable(mBackgroundColorSelected,
                mGradientOrientationSelected, mGradientCenterXSelected, mGradientCenterYSelected,
                mGradientStartColorSelected, mHasGradientCenterColorSelected, mGradientCenterColorSelected, mGradientEndColorSelected,
                mGradientRadiusSelected, mGradientTypeSelected,
                mCornerRadiusTopLeftSelected, mCornerRadiusTopRightSelected,
                mCornerRadiusBottomLeftSelected, mCornerRadiusBottomRightSelected,
                mBorderWidthSelected, mBorderDashWidthSelected, mBorderDashGapSelected, mBorderColorSelected);
    }

    private void updateCheckedColor() {
        mBackgroundDrawableChecked = createDrawable(mBackgroundColorChecked,
                mGradientOrientationChecked, mGradientCenterXChecked, mGradientCenterYChecked,
                mGradientStartColorChecked, mHasGradientCenterColorChecked, mGradientCenterColorChecked, mGradientEndColorChecked,
                mGradientRadiusChecked, mGradientTypeChecked,
                mCornerRadiusTopLeftChecked, mCornerRadiusTopRightChecked,
                mCornerRadiusBottomLeftChecked, mCornerRadiusBottomRightChecked,
                mBorderWidthChecked, mBorderDashWidthChecked, mBorderDashGapChecked, mBorderColorChecked);
    }

    private void updateUnableColor() {
        mBackgroundDrawableUnable = createDrawable(mBackgroundColorUnable,
                mGradientOrientationUnable, mGradientCenterXUnable, mGradientCenterYUnable,
                mGradientStartColorUnable, mHasGradientCenterColorUnable, mGradientCenterColorUnable, mGradientEndColorUnable,
                mGradientRadiusUnable, mGradientTypeUnable,
                mCornerRadiusTopLeftUnable, mCornerRadiusTopRightUnable,
                mCornerRadiusBottomLeftUnable, mCornerRadiusBottomRightUnable,
                mBorderWidthUnable, mBorderDashWidthUnable, mBorderDashGapUnable, mBorderColorUnable);
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
        if (mBackgroundColorNormal != backgroundColorNormal) {
            mBackgroundColorNormal = backgroundColorNormal;
            updateNormalColor();
            recreateViewBackgroundDrawable();
        }
    }

    public int getBackgroundColorPressed() {
        return mBackgroundColorPressed;
    }

    public void setBackgroundColorPressed(int backgroundColorPressed) {
        if (mBackgroundColorPressed != backgroundColorPressed) {
            mBackgroundColorPressed = backgroundColorPressed;
            updatePressedColor();
            recreateViewBackgroundDrawable();
        }
    }

    public int getBackgroundColorSelected() {
        return mBackgroundColorSelected;
    }

    public void setBackgroundColorSelected(int backgroundColorSelected) {
        if (mBackgroundColorSelected != backgroundColorSelected) {
            mBackgroundColorSelected = backgroundColorSelected;
            updateSelectedColor();
            recreateViewBackgroundDrawable();
        }
    }

    public int getBackgroundColorChecked() {
        return mBackgroundColorChecked;
    }

    public void setBackgroundColorChecked(int backgroundColorChecked) {
        if (mBackgroundColorChecked != backgroundColorChecked) {
            mBackgroundColorChecked = backgroundColorChecked;
            updateCheckedColor();
            recreateViewBackgroundDrawable();
        }
    }

    public int getBackgroundColorUnable() {
        return mBackgroundColorUnable;
    }

    public void setBackgroundColorUnable(int backgroundColorUnable) {
        if (mBackgroundColorUnable != backgroundColorUnable) {
            mBackgroundColorUnable = backgroundColorUnable;
            updateUnableColor();
            recreateViewBackgroundDrawable();
        }
    }

    public Drawable getBackgroundDrawableNormal() {
        return mBackgroundDrawableNormal;
    }

    public void setBackgroundDrawableNormal(Drawable backgroundDrawableNormal) {
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
        if (backgroundDrawablePressed != null) {
            if (mBackgroundDrawablePressed != backgroundDrawablePressed) {
                mBackgroundDrawablePressed = backgroundDrawablePressed;
                recreateViewBackgroundDrawable();
            }
        }
    }

    public Drawable getBackgroundDrawableSelected() {
        return mBackgroundDrawableSelected;
    }

    public void setBackgroundDrawableSelected(Drawable backgroundDrawableSelected) {
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
                    updateNormalColor();
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
                    updatePressedColor();
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
                    updateSelectedColor();
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
                    updateCheckedColor();
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
                    updateUnableColor();
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
                    updateNormalColor();
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
                    updatePressedColor();
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
                    updateSelectedColor();
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
                    updateCheckedColor();
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
                    updateUnableColor();
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
                    updateNormalColor();
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
                    updatePressedColor();
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
                    updateSelectedColor();
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
                    updateCheckedColor();
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
                    updateUnableColor();
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
                    updateNormalColor();
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
                    updatePressedColor();
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
                    updateSelectedColor();
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
                    updateCheckedColor();
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
                    updateUnableColor();
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
                    updateNormalColor();
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
                    updatePressedColor();
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
                    updateSelectedColor();
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
                    updateCheckedColor();
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
                    updateUnableColor();
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
                    updateNormalColor();
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
                    updatePressedColor();
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
                    updateSelectedColor();
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
                    updateCheckedColor();
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
                    updateUnableColor();
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
                    updateNormalColor();
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
                    updatePressedColor();
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
                    updateSelectedColor();
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
                    updateCheckedColor();
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
                    updateUnableColor();
                    recreateViewBackgroundDrawable();
                }
            }
        }
    }

    public int getGradientTypeNormal() {
        return mGradientTypeNormal;
    }

    public void setGradientTypeNormal(int gradientTypeNormal) {
        if (mBackgroundDrawableNormal instanceof GradientDrawable) {
            if (mGradientTypeNormal != gradientTypeNormal) {
                mGradientTypeNormal = gradientTypeNormal;
                updateNormalColor();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getGradientTypePressed() {
        return mGradientTypePressed;
    }

    public void setGradientTypePressed(int gradientTypePressed) {
        if (mBackgroundDrawablePressed instanceof GradientDrawable) {
            if (mGradientTypePressed != gradientTypePressed) {
                mGradientTypePressed = gradientTypePressed;
                updatePressedColor();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getGradientTypeSelected() {
        return mGradientTypeSelected;
    }

    public void setGradientTypeSelected(int gradientTypeSelected) {
        if (mBackgroundDrawableSelected instanceof GradientDrawable) {
            if (mGradientTypeSelected != gradientTypeSelected) {
                mGradientTypeSelected = gradientTypeSelected;
                updateSelectedColor();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getGradientTypeChecked() {
        return mGradientTypeChecked;
    }

    public void setGradientTypeChecked(int gradientTypeChecked) {
        if (mBackgroundDrawableChecked instanceof GradientDrawable) {
            if (mGradientTypeChecked != gradientTypeChecked) {
                mGradientTypeChecked = gradientTypeChecked;
                updateCheckedColor();
                recreateViewBackgroundDrawable();
            }
        }
    }

    public int getGradientTypeUnable() {
        return mGradientTypeUnable;
    }

    public void setGradientTypeUnable(int gradientTypeUnable) {
        if (mBackgroundDrawableUnable instanceof GradientDrawable) {
            if (mGradientTypeUnable != gradientTypeUnable) {
                mGradientTypeUnable = gradientTypeUnable;
                updateUnableColor();
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
                updateNormalColor();
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
                updatePressedColor();
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
                updateSelectedColor();
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
                updateCheckedColor();
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
                updateUnableColor();
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
                updateNormalColor();
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
                updatePressedColor();
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
                updateSelectedColor();
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
                updateCheckedColor();
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
                updateUnableColor();
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
                updateNormalColor();
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
                updatePressedColor();
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
                updateSelectedColor();
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
                updateCheckedColor();
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
                updateUnableColor();
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
                updateNormalColor();
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
                updatePressedColor();
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
                updateSelectedColor();
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
                updateCheckedColor();
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
                updateUnableColor();
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
                updateNormalColor();
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
                updatePressedColor();
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
                updateSelectedColor();
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
                updateCheckedColor();
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
                updateUnableColor();
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
                updateNormalColor();
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
                updatePressedColor();
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
                updateSelectedColor();
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
                updateCheckedColor();
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
                updateUnableColor();
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
                updateNormalColor();
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
                updatePressedColor();
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
                updateSelectedColor();
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
                updateCheckedColor();
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
                updateUnableColor();
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
                updateNormalColor();
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
                updatePressedColor();
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
                updateSelectedColor();
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
                updateCheckedColor();
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
                updateUnableColor();
                recreateViewBackgroundDrawable();
            }
        }
    }
}
