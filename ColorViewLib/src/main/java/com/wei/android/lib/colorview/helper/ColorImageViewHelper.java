package com.wei.android.lib.colorview.helper;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

import androidx.appcompat.widget.AppCompatImageView;

import com.wei.android.lib.colorview.utils.Constant;

/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorImageViewHelper extends ColorViewHelper<AppCompatImageView> {

    // 图片
    private Drawable mSrcNormal;
    private Drawable mSrcPressed;
    private Drawable mSrcSelected;
    private Drawable mSrcChecked;
    private Drawable mSrcUnable;

    public ColorImageViewHelper(AppCompatImageView imageView,
                                TypedArray typedArray,

                                int srcNormal,
                                int srcPressed,
                                int srcSelected,
                                int srcChecked,
                                int srcUnable,

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

        super(imageView,
                typedArray,

                backgroundColorNormal,
                backgroundColorPressed,
                backgroundColorSelected,
                backgroundColorChecked,
                backgroundColorUnable,

                backgroundDrawableNormal,
                backgroundDrawablePressed,
                backgroundDrawableSelected,
                backgroundDrawableChecked,
                backgroundDrawableUnable,

                gradientOrientationNormal,
                gradientOrientationPressed,
                gradientOrientationSelected,
                gradientOrientationChecked,
                gradientOrientationUnable,

                gradientCenterXNormal,
                gradientCenterXPressed,
                gradientCenterXSelected,
                gradientCenterXChecked,
                gradientCenterXUnable,

                gradientCenterYNormal,
                gradientCenterYPressed,
                gradientCenterYSelected,
                gradientCenterYChecked,
                gradientCenterYUnable,

                gradientStartColorNormal,
                gradientStartColorPressed,
                gradientStartColorSelected,
                gradientStartColorChecked,
                gradientStartColorUnable,

                gradientCenterColorNormal,
                gradientCenterColorPressed,
                gradientCenterColorSelected,
                gradientCenterColorChecked,
                gradientCenterColorUnable,

                gradientEndColorNormal,
                gradientEndColorPressed,
                gradientEndColorSelected,
                gradientEndColorChecked,
                gradientEndColorUnable,

                gradientRadiusNormal,
                gradientRadiusPressed,
                gradientRadiusSelected,
                gradientRadiusChecked,
                gradientRadiusUnable,

                gradientTypeNormal,
                gradientTypePressed,
                gradientTypeSelected,
                gradientTypeChecked,
                gradientTypeUnable,

                cornerRadiusNormal,
                cornerRadiusPressed,
                cornerRadiusSelected,
                cornerRadiusChecked,
                cornerRadiusUnable,

                cornerRadiusTopLeftNormal,
                cornerRadiusTopLeftPressed,
                cornerRadiusTopLeftSelected,
                cornerRadiusTopLeftChecked,
                cornerRadiusTopLeftUnable,

                cornerRadiusTopRightNormal,
                cornerRadiusTopRightPressed,
                cornerRadiusTopRightSelected,
                cornerRadiusTopRightChecked,
                cornerRadiusTopRightUnable,

                cornerRadiusBottomLeftNormal,
                cornerRadiusBottomLeftPressed,
                cornerRadiusBottomLeftSelected,
                cornerRadiusBottomLeftChecked,
                cornerRadiusBottomLeftUnable,

                cornerRadiusBottomRightNormal,
                cornerRadiusBottomRightPressed,
                cornerRadiusBottomRightSelected,
                cornerRadiusBottomRightChecked,
                cornerRadiusBottomRightUnable,

                borderWidthNormal,
                borderWidthPressed,
                borderWidthSelected,
                borderWidthChecked,
                borderWidthUnable,

                borderDashWidthNormal,
                borderDashWidthPressed,
                borderDashWidthSelected,
                borderDashWidthChecked,
                borderDashWidthUnable,

                borderDashGapNormal,
                borderDashGapPressed,
                borderDashGapSelected,
                borderDashGapChecked,
                borderDashGapUnable,

                borderColorNormal,
                borderColorPressed,
                borderColorSelected,
                borderColorChecked,
                borderColorUnable,

                backgroundColorTintPressed);

        mSrcNormal = typedArray.getDrawable(srcNormal);
        mSrcPressed = typedArray.getDrawable(srcPressed);
        mSrcSelected = typedArray.getDrawable(srcSelected);
        mSrcChecked = typedArray.getDrawable(srcChecked);
        mSrcUnable = typedArray.getDrawable(srcUnable);

        if (mSrcPressed == null && mSrcNormal != null) {
            mSrcPressed = typedArray.getDrawable(srcNormal);
        }

        if (mSrcSelected == null && mSrcNormal != null) {
            mSrcSelected = typedArray.getDrawable(srcNormal);
        }

        if (mSrcChecked == null && mSrcNormal != null) {
            mSrcChecked = typedArray.getDrawable(srcNormal);
        }

        if (mSrcUnable == null && mSrcNormal != null) {
            mSrcUnable = typedArray.getDrawable(srcNormal);
        }

        updateSrcDrawable();
    }

    // 设置图片
    private void updateSrcDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();

        if (mSrcUnable != null) {
            stateListDrawable.addState(Constant.STATE_0_UNABLE, mSrcUnable);
        }

        if (mSrcPressed != null) {
            stateListDrawable.addState(Constant.STATE_1_PRESSED, mSrcPressed);
        }

        if (mSrcSelected != null) {
            stateListDrawable.addState(Constant.STATE_2_SELECTED, mSrcSelected);
        }

        if (mSrcChecked != null) {
            stateListDrawable.addState(Constant.STATE_3_CHECKED, mSrcChecked);
        }

        if (mSrcNormal != null) {
            stateListDrawable.addState(Constant.STATE_4_ENABLED, mSrcNormal);
        }

        if (mSrcNormal != null) {
            stateListDrawable.addState(Constant.STATE_5_NONE, mSrcNormal);
        }

        mView.setImageDrawable(stateListDrawable);
    }

    // GET SET
    public Drawable getSrcNormal() {
        return mSrcNormal;
    }

    public void setSrcNormal(Drawable srcNormal) {
        if (mSrcNormal != srcNormal) {
            mSrcNormal = srcNormal;
            updateSrcDrawable();
        }
    }

    public Drawable getSrcPressed() {
        return mSrcPressed;
    }

    public void setSrcPressed(Drawable srcPressed) {
        if (mSrcPressed != srcPressed) {
            mSrcPressed = srcPressed;
            updateSrcDrawable();
        }
    }

    public Drawable getSrcSelected() {
        return mSrcSelected;
    }

    public void setSrcSelected(Drawable srcSelected) {
        if (mSrcSelected != srcSelected) {
            mSrcSelected = srcSelected;
            updateSrcDrawable();
        }
    }

    public Drawable getSrcChecked() {
        return mSrcChecked;
    }

    public void setSrcChecked(Drawable srcChecked) {
        if (mSrcChecked != srcChecked) {
            mSrcChecked = srcChecked;
            updateSrcDrawable();
        }
    }

    public Drawable getSrcUnable() {
        return mSrcUnable;
    }

    public void setSrcUnable(Drawable srcUnable) {
        if (mSrcUnable != srcUnable) {
            mSrcUnable = srcUnable;
            updateSrcDrawable();
        }
    }
}
