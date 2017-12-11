package com.wei.android.lib.colorview.helper;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.ImageView;

/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorImageViewHelper extends ColorViewHelper<ImageView> {

    // 图片
    private Drawable mSrcDrawableNormal;
    private Drawable mSrcDrawablePressed;
    private Drawable mSrcDrawableSelected;
    private Drawable mSrcDrawableChecked;
    private Drawable mSrcDrawableUnable;

    public ColorImageViewHelper(
            ImageView view,
            TypedArray typedArray,
            int srcDrawableNormal,
            int srcDrawablePressed,
            int srcDrawableSelected,
            int srcDrawableChecked,
            int srcDrawableUnable,
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

        mSrcDrawableNormal = typedArray.getDrawable(srcDrawableNormal);
        mSrcDrawablePressed = typedArray.getDrawable(srcDrawablePressed);
        mSrcDrawableSelected = typedArray.getDrawable(srcDrawableSelected);
        mSrcDrawableChecked = typedArray.getDrawable(srcDrawableChecked);
        mSrcDrawableUnable = typedArray.getDrawable(srcDrawableUnable);

        if (mSrcDrawablePressed == null && mSrcDrawableNormal != null) {
            mSrcDrawablePressed = typedArray.getDrawable(srcDrawableNormal);
        }

        if (mSrcDrawableSelected == null && mSrcDrawableNormal != null) {
            mSrcDrawableSelected = typedArray.getDrawable(srcDrawableNormal);
        }

        if (mSrcDrawableChecked == null && mSrcDrawableNormal != null) {
            mSrcDrawableChecked = typedArray.getDrawable(srcDrawableNormal);
        }

        if (mSrcDrawableUnable == null && mSrcDrawableNormal != null) {
            mSrcDrawableUnable = typedArray.getDrawable(srcDrawableNormal);
        }

        updateSrcDrawable();
    }

    // 设置图片
    private void updateSrcDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();

        if (mSrcDrawableUnable != null) {
            stateListDrawable.addState(mStateArray[0], mSrcDrawableUnable);
        }

        if (mSrcDrawablePressed != null) {
            stateListDrawable.addState(mStateArray[1], mSrcDrawablePressed);
        }

        if (mSrcDrawableSelected != null) {
            stateListDrawable.addState(mStateArray[2], mSrcDrawableSelected);
        }

        if (mSrcDrawableChecked != null) {
            stateListDrawable.addState(mStateArray[3], mSrcDrawableChecked);
        }

        if (mSrcDrawableNormal != null) {
            stateListDrawable.addState(mStateArray[4], mSrcDrawableNormal);
        }

        if (mSrcDrawableNormal != null) {
            stateListDrawable.addState(mStateArray[5], mSrcDrawableNormal);
        }

        mView.setImageDrawable(stateListDrawable);
    }

    // SET SrcDrawable
    public void setSrcDrawable(Drawable srcDrawable, boolean includeUnableState) {
        if (srcDrawable == null) {
            return;
        }

        mSrcDrawableNormal = srcDrawable;
        mSrcDrawablePressed = srcDrawable;
        mSrcDrawableSelected = srcDrawable;
        mSrcDrawableChecked = srcDrawable;

        if (includeUnableState) {
            mSrcDrawableUnable = srcDrawable;
        }

        updateSrcDrawable();
    }

    public void setSrcDrawableNormal(Drawable srcDrawableNormal) {
        if (srcDrawableNormal != null) {
            mSrcDrawableNormal = srcDrawableNormal;
            updateSrcDrawable();
        }
    }

    public void setSrcDrawablePressed(Drawable srcDrawablePressed) {
        if (srcDrawablePressed != null) {
            mSrcDrawablePressed = srcDrawablePressed;
            updateSrcDrawable();
        }
    }

    public void setSrcDrawableSelected(Drawable srcDrawableSelected) {
        if (srcDrawableSelected != null) {
            mSrcDrawableSelected = srcDrawableSelected;
            updateSrcDrawable();
        }
    }

    public void setSrcDrawableChecked(Drawable srcDrawableChecked) {
        if (srcDrawableChecked != null) {
            mSrcDrawableChecked = srcDrawableChecked;
            updateSrcDrawable();
        }
    }

    public void setSrcDrawableUnable(Drawable srcDrawableUnable) {
        if (srcDrawableUnable != null) {
            mSrcDrawableUnable = srcDrawableUnable;
            updateSrcDrawable();
        }
    }
}
