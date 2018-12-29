package com.wei.android.lib.colorview.helper;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

import com.wei.android.lib.colorview.drawable.CompoundDrawables;
import com.wei.android.lib.colorview.utils.Constant;

/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorTextViewHelper extends ColorViewHelper<TextView> {

    // 文字颜色
    private int mTextColorNormal;
    private int mTextColorPressed;
    private int mTextColorSelected;
    private int mTextColorChecked;
    private int mTextColorUnable;

    // 文字颜色
    private int mTextColorHintNormal;
    private int mTextColorHintPressed;
    private int mTextColorHintSelected;
    private int mTextColorHintChecked;
    private int mTextColorHintUnable;

    // 边缘图标
    private CompoundDrawables mCompoundDrawables;

    public ColorTextViewHelper(TextView textView,
                               TypedArray typedArray,

                               int currentTextColor,
                               int textColorNormal,
                               int textColorPressed,
                               int textColorSelected,
                               int textColorChecked,
                               int textColorUnable,

                               int currentTextColorHint,
                               int textColorHintNormal,
                               int textColorHintPressed,
                               int textColorHintSelected,
                               int textColorHintChecked,
                               int textColorHintUnable,

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

                               int drawableLeftNormal,
                               int drawableLeftPressed,
                               int drawableLeftSelected,
                               int drawableLeftChecked,
                               int drawableLeftUnable,

                               int drawableTopNormal,
                               int drawableTopPressed,
                               int drawableTopSelected,
                               int drawableTopChecked,
                               int drawableTopUnable,

                               int drawableRightNormal,
                               int drawableRightPressed,
                               int drawableRightSelected,
                               int drawableRightChecked,
                               int drawableRightUnable,

                               int drawableBottomNormal,
                               int drawableBottomPressed,
                               int drawableBottomSelected,
                               int drawableBottomChecked,
                               int drawableBottomUnable,

                               int drawableLeftWidth,
                               int drawableLeftHeight,

                               int drawableTopWidth,
                               int drawableTopHeight,

                               int drawableRightWidth,
                               int drawableRightHeight,

                               int drawableBottomWidth,
                               int drawableBottomHeight) {

        super(textView,
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
                borderColorUnable);

        mTextColorNormal = typedArray.getColor(textColorNormal, currentTextColor);
        mTextColorPressed = typedArray.getColor(textColorPressed, mTextColorNormal);
        mTextColorSelected = typedArray.getColor(textColorSelected, mTextColorNormal);
        mTextColorChecked = typedArray.getColor(textColorChecked, mTextColorNormal);
        mTextColorUnable = typedArray.getColor(textColorUnable, mTextColorNormal);

        mTextColorHintNormal = typedArray.getColor(textColorHintNormal, currentTextColorHint);
        mTextColorHintPressed = typedArray.getColor(textColorHintPressed, mTextColorHintNormal);
        mTextColorHintSelected = typedArray.getColor(textColorHintSelected, mTextColorHintNormal);
        mTextColorHintChecked = typedArray.getColor(textColorHintChecked, mTextColorHintNormal);
        mTextColorHintUnable = typedArray.getColor(textColorHintUnable, mTextColorHintNormal);

        mCompoundDrawables = new CompoundDrawables(textView,
                typedArray,

                drawableLeftNormal,
                drawableLeftPressed,
                drawableLeftSelected,
                drawableLeftChecked,
                drawableLeftUnable,

                drawableTopNormal,
                drawableTopPressed,
                drawableTopSelected,
                drawableTopChecked,
                drawableTopUnable,

                drawableRightNormal,
                drawableRightPressed,
                drawableRightSelected,
                drawableRightChecked,
                drawableRightUnable,

                drawableBottomNormal,
                drawableBottomPressed,
                drawableBottomSelected,
                drawableBottomChecked,
                drawableBottomUnable,

                drawableLeftWidth,
                drawableLeftHeight,

                drawableTopWidth,
                drawableTopHeight,

                drawableRightWidth,
                drawableRightHeight,

                drawableBottomWidth,
                drawableBottomHeight);

        updateTextColor();
        updateTextColorHint();
    }

    // 文字颜色
    private void updateTextColor() {
        int[] colors = {mTextColorUnable, mTextColorPressed, mTextColorSelected, mTextColorChecked, mTextColorNormal, mTextColorNormal};
        mView.setTextColor(new ColorStateList(Constant.STATE_ARRAY, colors));
    }

    private void updateTextColorHint() {
        int[] colors = {mTextColorHintUnable, mTextColorHintPressed, mTextColorHintSelected, mTextColorHintChecked, mTextColorHintNormal, mTextColorHintNormal};
        mView.setHintTextColor(new ColorStateList(Constant.STATE_ARRAY, colors));
    }

    // GET SET
    public int getTextColorNormal() {
        return mTextColorNormal;
    }

    public void setTextColorNormal(int textColorNormal) {
        if (mTextColorNormal != textColorNormal) {
            mTextColorNormal = textColorNormal;
            updateTextColor();
        }
    }

    public int getTextColorPressed() {
        return mTextColorPressed;
    }

    public void setTextColorPressed(int textColorPressed) {
        if (mTextColorPressed != textColorPressed) {
            mTextColorPressed = textColorPressed;
            updateTextColor();
        }
    }

    public int getTextColorSelected() {
        return mTextColorSelected;
    }

    public void setTextColorSelected(int textColorSelected) {
        if (mTextColorSelected != textColorSelected) {
            mTextColorSelected = textColorSelected;
            updateTextColor();
        }
    }

    public int getTextColorChecked() {
        return mTextColorChecked;
    }

    public void setTextColorChecked(int textColorChecked) {
        if (mTextColorChecked != textColorChecked) {
            mTextColorChecked = textColorChecked;
            updateTextColor();
        }
    }

    public int getTextColorUnable() {
        return mTextColorUnable;
    }

    public void setTextColorUnable(int textColorUnable) {
        if (mTextColorUnable != textColorUnable) {
            mTextColorUnable = textColorUnable;
            updateTextColor();
        }
    }

    public int getTextColorHintNormal() {
        return mTextColorHintNormal;
    }

    public void setTextColorHintNormal(int textColorHintNormal) {
        if (mTextColorHintNormal != textColorHintNormal) {
            mTextColorHintNormal = textColorHintNormal;
            updateTextColorHint();
        }
    }

    public int getTextColorHintPressed() {
        return mTextColorHintPressed;
    }

    public void setTextColorHintPressed(int textColorHintPressed) {
        if (mTextColorHintPressed != textColorHintPressed) {
            mTextColorHintPressed = textColorHintPressed;
            updateTextColorHint();
        }
    }

    public int getTextColorHintSelected() {
        return mTextColorHintSelected;
    }

    public void setTextColorHintSelected(int textColorHintSelected) {
        if (mTextColorHintSelected != textColorHintSelected) {
            mTextColorHintSelected = textColorHintSelected;
            updateTextColorHint();
        }
    }

    public int getTextColorHintChecked() {
        return mTextColorHintChecked;
    }

    public void setTextColorHintChecked(int textColorHintChecked) {
        if (mTextColorHintChecked != textColorHintChecked) {
            mTextColorHintChecked = textColorHintChecked;
            updateTextColorHint();
        }
    }

    public int getTextColorHintUnable() {
        return mTextColorHintUnable;
    }

    public void setTextColorHintUnable(int textColorHintUnable) {
        if (mTextColorHintUnable != textColorHintUnable) {
            mTextColorHintUnable = textColorHintUnable;
            updateTextColorHint();
        }
    }

    // GET SET
    public Drawable getDrawableLeftNormal() {
        return mCompoundDrawables.mDrawableLeftNormal;
    }

    public void setDrawableLeftNormal(Drawable drawableLeftNormal) {
        if (mCompoundDrawables.mDrawableLeftNormal != drawableLeftNormal) {
            mCompoundDrawables.mDrawableLeftNormal = drawableLeftNormal;
            mCompoundDrawables.updateDrawableLeft();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableLeftPressed() {
        return mCompoundDrawables.mDrawableLeftPressed;
    }

    public void setDrawableLeftPressed(Drawable drawableLeftPressed) {
        if (mCompoundDrawables.mDrawableLeftPressed != drawableLeftPressed) {
            mCompoundDrawables.mDrawableLeftPressed = drawableLeftPressed;
            mCompoundDrawables.updateDrawableLeft();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableLeftSelected() {
        return mCompoundDrawables.mDrawableLeftSelected;
    }

    public void setDrawableLeftSelected(Drawable drawableLeftSelected) {
        if (mCompoundDrawables.mDrawableLeftSelected != drawableLeftSelected) {
            mCompoundDrawables.mDrawableLeftSelected = drawableLeftSelected;
            mCompoundDrawables.updateDrawableLeft();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableLeftChecked() {
        return mCompoundDrawables.mDrawableLeftChecked;
    }

    public void setDrawableLeftChecked(Drawable drawableLeftChecked) {
        if (mCompoundDrawables.mDrawableLeftChecked != drawableLeftChecked) {
            mCompoundDrawables.mDrawableLeftChecked = drawableLeftChecked;
            mCompoundDrawables.updateDrawableLeft();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableLeftUnable() {
        return mCompoundDrawables.mDrawableLeftUnable;
    }

    public void setDrawableLeftUnable(Drawable drawableLeftUnable) {
        if (mCompoundDrawables.mDrawableLeftUnable != drawableLeftUnable) {
            mCompoundDrawables.mDrawableLeftUnable = drawableLeftUnable;
            mCompoundDrawables.updateDrawableLeft();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableTopNormal() {
        return mCompoundDrawables.mDrawableTopNormal;
    }

    public void setDrawableTopNormal(Drawable drawableTopNormal) {
        if (mCompoundDrawables.mDrawableTopNormal != drawableTopNormal) {
            mCompoundDrawables.mDrawableTopNormal = drawableTopNormal;
            mCompoundDrawables.updateDrawableTop();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableTopPressed() {
        return mCompoundDrawables.mDrawableTopPressed;
    }

    public void setDrawableTopPressed(Drawable drawableTopPressed) {
        if (mCompoundDrawables.mDrawableTopPressed != drawableTopPressed) {
            mCompoundDrawables.mDrawableTopPressed = drawableTopPressed;
            mCompoundDrawables.updateDrawableTop();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableTopSelected() {
        return mCompoundDrawables.mDrawableTopSelected;
    }

    public void setDrawableTopSelected(Drawable drawableTopSelected) {
        if (mCompoundDrawables.mDrawableTopSelected != drawableTopSelected) {
            mCompoundDrawables.mDrawableTopSelected = drawableTopSelected;
            mCompoundDrawables.updateDrawableTop();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableTopChecked() {
        return mCompoundDrawables.mDrawableTopChecked;
    }

    public void setDrawableTopChecked(Drawable drawableTopChecked) {
        if (mCompoundDrawables.mDrawableTopChecked != drawableTopChecked) {
            mCompoundDrawables.mDrawableTopChecked = drawableTopChecked;
            mCompoundDrawables.updateDrawableTop();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableTopUnable() {
        return mCompoundDrawables.mDrawableTopUnable;
    }

    public void setDrawableTopUnable(Drawable drawableTopUnable) {
        if (mCompoundDrawables.mDrawableTopUnable != drawableTopUnable) {
            mCompoundDrawables.mDrawableTopUnable = drawableTopUnable;
            mCompoundDrawables.updateDrawableTop();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableRightNormal() {
        return mCompoundDrawables.mDrawableRightNormal;
    }

    public void setDrawableRightNormal(Drawable drawableRightNormal) {
        if (mCompoundDrawables.mDrawableRightNormal != drawableRightNormal) {
            mCompoundDrawables.mDrawableRightNormal = drawableRightNormal;
            mCompoundDrawables.updateDrawableRight();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableRightPressed() {
        return mCompoundDrawables.mDrawableRightPressed;
    }

    public void setDrawableRightPressed(Drawable drawableRightPressed) {
        if (mCompoundDrawables.mDrawableRightPressed != drawableRightPressed) {
            mCompoundDrawables.mDrawableRightPressed = drawableRightPressed;
            mCompoundDrawables.updateDrawableRight();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableRightSelected() {
        return mCompoundDrawables.mDrawableRightSelected;
    }

    public void setDrawableRightSelected(Drawable drawableRightSelected) {
        if (mCompoundDrawables.mDrawableRightSelected != drawableRightSelected) {
            mCompoundDrawables.mDrawableRightSelected = drawableRightSelected;
            mCompoundDrawables.updateDrawableRight();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableRightChecked() {
        return mCompoundDrawables.mDrawableRightChecked;
    }

    public void setDrawableRightChecked(Drawable drawableRightChecked) {
        if (mCompoundDrawables.mDrawableRightChecked != drawableRightChecked) {
            mCompoundDrawables.mDrawableRightChecked = drawableRightChecked;
            mCompoundDrawables.updateDrawableRight();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableRightUnable() {
        return mCompoundDrawables.mDrawableRightUnable;
    }

    public void setDrawableRightUnable(Drawable drawableRightUnable) {
        if (mCompoundDrawables.mDrawableRightUnable != drawableRightUnable) {
            mCompoundDrawables.mDrawableRightUnable = drawableRightUnable;
            mCompoundDrawables.updateDrawableRight();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableBottomNormal() {
        return mCompoundDrawables.mDrawableBottomNormal;
    }

    public void setDrawableBottomNormal(Drawable drawableBottomNormal) {
        if (mCompoundDrawables.mDrawableBottomNormal != drawableBottomNormal) {
            mCompoundDrawables.mDrawableBottomNormal = drawableBottomNormal;
            mCompoundDrawables.updateDrawableBottom();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableBottomPressed() {
        return mCompoundDrawables.mDrawableBottomPressed;
    }

    public void setDrawableBottomPressed(Drawable drawableBottomPressed) {
        if (mCompoundDrawables.mDrawableBottomPressed != drawableBottomPressed) {
            mCompoundDrawables.mDrawableBottomPressed = drawableBottomPressed;
            mCompoundDrawables.updateDrawableBottom();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableBottomSelected() {
        return mCompoundDrawables.mDrawableBottomSelected;
    }

    public void setDrawableBottomSelected(Drawable drawableBottomSelected) {
        if (mCompoundDrawables.mDrawableBottomSelected != drawableBottomSelected) {
            mCompoundDrawables.mDrawableBottomSelected = drawableBottomSelected;
            mCompoundDrawables.updateDrawableBottom();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableBottomChecked() {
        return mCompoundDrawables.mDrawableBottomChecked;
    }

    public void setDrawableBottomChecked(Drawable drawableBottomChecked) {
        if (mCompoundDrawables.mDrawableBottomChecked != drawableBottomChecked) {
            mCompoundDrawables.mDrawableBottomChecked = drawableBottomChecked;
            mCompoundDrawables.updateDrawableBottom();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public Drawable getDrawableBottomUnable() {
        return mCompoundDrawables.mDrawableBottomUnable;
    }

    public void setDrawableBottomUnable(Drawable drawableBottomUnable) {
        if (mCompoundDrawables.mDrawableBottomUnable != drawableBottomUnable) {
            mCompoundDrawables.mDrawableBottomUnable = drawableBottomUnable;
            mCompoundDrawables.updateDrawableBottom();
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public int getDrawableLeftWidth() {
        return mCompoundDrawables.mDrawableLeftWidth;
    }

    public void setDrawableLeftWidth(int drawableLeftWidth) {
        if (mCompoundDrawables.mDrawableLeftWidth != drawableLeftWidth) {
            mCompoundDrawables.mDrawableLeftWidth = drawableLeftWidth;
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public int getDrawableLeftHeight() {
        return mCompoundDrawables.mDrawableLeftHeight;
    }

    public void setDrawableLeftHeight(int drawableLeftHeight) {
        if (mCompoundDrawables.mDrawableLeftHeight != drawableLeftHeight) {
            mCompoundDrawables.mDrawableLeftHeight = drawableLeftHeight;
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public int getDrawableRightWidth() {
        return mCompoundDrawables.mDrawableRightWidth;
    }

    public void setDrawableRightWidth(int drawableRightWidth) {
        if (mCompoundDrawables.mDrawableRightWidth != drawableRightWidth) {
            mCompoundDrawables.mDrawableRightWidth = drawableRightWidth;
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public int getDrawableRightHeight() {
        return mCompoundDrawables.mDrawableRightHeight;
    }

    public void setDrawableRightHeight(int drawableRightHeight) {
        if (mCompoundDrawables.mDrawableRightHeight != drawableRightHeight) {
            mCompoundDrawables.mDrawableRightHeight = drawableRightHeight;
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public int getDrawableTopWidth() {
        return mCompoundDrawables.mDrawableTopWidth;
    }

    public void setDrawableTopWidth(int drawableTopWidth) {
        if (mCompoundDrawables.mDrawableTopWidth != drawableTopWidth) {
            mCompoundDrawables.mDrawableTopWidth = drawableTopWidth;
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public int getDrawableTopHeight() {
        return mCompoundDrawables.mDrawableTopHeight;
    }

    public void setDrawableTopHeight(int drawableTopHeight) {
        if (mCompoundDrawables.mDrawableTopHeight != drawableTopHeight) {
            mCompoundDrawables.mDrawableTopHeight = drawableTopHeight;
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public int getDrawableBottomWidth() {
        return mCompoundDrawables.mDrawableBottomWidth;
    }

    public void setDrawableBottomWidth(int drawableBottomWidth) {
        if (mCompoundDrawables.mDrawableBottomWidth != drawableBottomWidth) {
            mCompoundDrawables.mDrawableBottomWidth = drawableBottomWidth;
            mCompoundDrawables.updateDrawableAndSize();
        }
    }

    public int getDrawableBottomHeight() {
        return mCompoundDrawables.mDrawableBottomHeight;
    }

    public void setDrawableBottomHeight(int drawableBottomHeight) {
        if (mCompoundDrawables.mDrawableBottomHeight != drawableBottomHeight) {
            mCompoundDrawables.mDrawableBottomHeight = drawableBottomHeight;
            mCompoundDrawables.updateDrawableAndSize();
        }
    }
}
