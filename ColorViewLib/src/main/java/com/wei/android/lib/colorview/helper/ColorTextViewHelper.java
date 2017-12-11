package com.wei.android.lib.colorview.helper;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.widget.TextView;

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

    public ColorTextViewHelper(
            TextView view,
            TypedArray typedArray,
            int currentTextColor,
            int textColorNormal,
            int textColorPressed,
            int textColorSelected,
            int textColorChecked,
            int textColorUnable,
            int bgColorNormal,
            int bgColorPressed,
            int bgColorSelected,
            int bgColorChecked,
            int bgColorUnable,
            int bgDrawableNormal,
            int bgDrawablePressed,
            int bgDrawableSelected,
            int bgDrawableChecked,
            int bgDrawableUnable,
            int bdColorNormal,
            int bdColorPressed,
            int bdColorSelected,
            int bdColorChecked,
            int bdColorUnable,
            int bdWidth,
            int bdDashGap,
            int bdDashWidth,
            int cr,
            int crTopLeft,
            int crTopRight,
            int crBottomLeft,
            int crBottomRight
    ) {
        super(
                view, typedArray,
                bgColorNormal,
                bgColorPressed,
                bgColorSelected,
                bgColorChecked,
                bgColorUnable,
                bgDrawableNormal,
                bgDrawablePressed,
                bgDrawableSelected,
                bgDrawableChecked,
                bgDrawableUnable,
                bdColorNormal,
                bdColorPressed,
                bdColorSelected,
                bdColorChecked,
                bdColorUnable,
                bdWidth,
                bdDashGap,
                bdDashWidth,
                cr,
                crTopLeft,
                crTopRight,
                crBottomLeft,
                crBottomRight);

        mTextColorNormal = typedArray.getColor(textColorNormal, currentTextColor);
        mTextColorPressed = typedArray.getColor(textColorPressed, mTextColorNormal);
        mTextColorSelected = typedArray.getColor(textColorSelected, mTextColorNormal);
        mTextColorChecked = typedArray.getColor(textColorChecked, mTextColorNormal);
        mTextColorUnable = typedArray.getColor(textColorUnable, mTextColorNormal);

        updateTextColor();
    }

    // 文字颜色
    private void updateTextColor() {
        int[] colors = {mTextColorUnable, mTextColorPressed, mTextColorSelected, mTextColorChecked, mTextColorNormal, mTextColorNormal};
        mView.setTextColor(new ColorStateList(mStateArray, colors));
    }

    // SET TextColor
    public void setTextColor(int textColor, boolean includeUnableState) {
        mTextColorNormal = textColor;
        mTextColorPressed = textColor;
        mTextColorSelected = textColor;
        mTextColorChecked = textColor;

        if (includeUnableState) {
            mTextColorUnable = textColor;
        }

        updateTextColor();
    }

    public void setTextColorNormal(int textColorNormal) {
        mTextColorNormal = textColorNormal;
        updateTextColor();
    }

    public void setTextColorPressed(int textColorPressed) {
        mTextColorPressed = textColorPressed;
        updateTextColor();
    }

    public void setTextColorSelected(int textColorSelected) {
        mTextColorSelected = textColorSelected;
        updateTextColor();
    }

    public void setTextColorChecked(int textColorChecked) {
        mTextColorChecked = textColorChecked;
        updateTextColor();
    }

    public void setTextColorUnable(int textColorUnable) {
        mTextColorUnable = textColorUnable;
        updateTextColor();
    }
}
