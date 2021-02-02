package com.wei.android.lib.colorview.drawable;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.TextView;

import com.wei.android.lib.colorview.utils.Constant;

/**
 * Created by UCCMAWEI on 2018/12/27.
 */

public class CompoundDrawables {

    private final TextView mTextView;

    // 边缘图标
    private StateListDrawable mCompoundDrawablesLeft;
    private StateListDrawable mCompoundDrawablesTop;
    private StateListDrawable mCompoundDrawablesRight;
    private StateListDrawable mCompoundDrawablesBottom;

    // 边缘图标
    public Drawable mDrawableLeftNormal;
    public Drawable mDrawableLeftPressed;
    public Drawable mDrawableLeftSelected;
    public Drawable mDrawableLeftChecked;
    public Drawable mDrawableLeftUnable;

    // 边缘图标
    public Drawable mDrawableTopNormal;
    public Drawable mDrawableTopPressed;
    public Drawable mDrawableTopSelected;
    public Drawable mDrawableTopChecked;
    public Drawable mDrawableTopUnable;

    // 边缘图标
    public Drawable mDrawableRightNormal;
    public Drawable mDrawableRightPressed;
    public Drawable mDrawableRightSelected;
    public Drawable mDrawableRightChecked;
    public Drawable mDrawableRightUnable;

    // 边缘图标
    public Drawable mDrawableBottomNormal;
    public Drawable mDrawableBottomPressed;
    public Drawable mDrawableBottomSelected;
    public Drawable mDrawableBottomChecked;
    public Drawable mDrawableBottomUnable;

    // 图标大小
    public int mDrawableLeftWidth;
    public int mDrawableLeftHeight;
    public int mDrawableTopWidth;
    public int mDrawableTopHeight;
    public int mDrawableRightWidth;
    public int mDrawableRightHeight;
    public int mDrawableBottomWidth;
    public int mDrawableBottomHeight;

    public CompoundDrawables(TextView textView,
                             TypedArray typedArray,

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

        mTextView = textView;

        mDrawableLeftNormal = typedArray.getDrawable(drawableLeftNormal);
        mDrawableLeftPressed = typedArray.getDrawable(drawableLeftPressed);
        mDrawableLeftSelected = typedArray.getDrawable(drawableLeftSelected);
        mDrawableLeftChecked = typedArray.getDrawable(drawableLeftChecked);
        mDrawableLeftUnable = typedArray.getDrawable(drawableLeftUnable);

        mDrawableTopNormal = typedArray.getDrawable(drawableTopNormal);
        mDrawableTopPressed = typedArray.getDrawable(drawableTopPressed);
        mDrawableTopSelected = typedArray.getDrawable(drawableTopSelected);
        mDrawableTopChecked = typedArray.getDrawable(drawableTopChecked);
        mDrawableTopUnable = typedArray.getDrawable(drawableTopUnable);

        mDrawableRightNormal = typedArray.getDrawable(drawableRightNormal);
        mDrawableRightPressed = typedArray.getDrawable(drawableRightPressed);
        mDrawableRightSelected = typedArray.getDrawable(drawableRightSelected);
        mDrawableRightChecked = typedArray.getDrawable(drawableRightChecked);
        mDrawableRightUnable = typedArray.getDrawable(drawableRightUnable);

        mDrawableBottomNormal = typedArray.getDrawable(drawableBottomNormal);
        mDrawableBottomPressed = typedArray.getDrawable(drawableBottomPressed);
        mDrawableBottomSelected = typedArray.getDrawable(drawableBottomSelected);
        mDrawableBottomChecked = typedArray.getDrawable(drawableBottomChecked);
        mDrawableBottomUnable = typedArray.getDrawable(drawableBottomUnable);

        mDrawableLeftWidth = typedArray.getDimensionPixelOffset(drawableLeftWidth, 0);
        mDrawableLeftHeight = typedArray.getDimensionPixelOffset(drawableLeftHeight, 0);

        mDrawableTopWidth = typedArray.getDimensionPixelOffset(drawableTopWidth, 0);
        mDrawableTopHeight = typedArray.getDimensionPixelOffset(drawableTopHeight, 0);

        mDrawableRightWidth = typedArray.getDimensionPixelOffset(drawableRightWidth, 0);
        mDrawableRightHeight = typedArray.getDimensionPixelOffset(drawableRightHeight, 0);

        mDrawableBottomWidth = typedArray.getDimensionPixelOffset(drawableBottomWidth, 0);
        mDrawableBottomHeight = typedArray.getDimensionPixelOffset(drawableBottomHeight, 0);

        updateDrawableLeft();
        updateDrawableTop();
        updateDrawableRight();
        updateDrawableBottom();

        updateDrawableAndSize();
    }

    public void updateDrawableLeft() {
        if (mDrawableLeftNormal == null) {
            mCompoundDrawablesLeft = null;
            return;
        }

        mCompoundDrawablesLeft = new StateListDrawable();
        if (mDrawableLeftUnable != null) {
            mCompoundDrawablesLeft.addState(Constant.STATE_0_UNABLE, mDrawableLeftUnable);
        }
        if (mDrawableLeftPressed != null) {
            mCompoundDrawablesLeft.addState(Constant.STATE_1_PRESSED, mDrawableLeftPressed);
        }
        if (mDrawableLeftSelected != null) {
            mCompoundDrawablesLeft.addState(Constant.STATE_2_SELECTED, mDrawableLeftSelected);
        }
        if (mDrawableLeftChecked != null) {
            mCompoundDrawablesLeft.addState(Constant.STATE_3_CHECKED, mDrawableLeftChecked);
        }
        mCompoundDrawablesLeft.addState(Constant.STATE_4_ENABLED, mDrawableLeftNormal);
        mCompoundDrawablesLeft.addState(Constant.STATE_5_NONE, mDrawableLeftNormal);
    }

    public void updateDrawableTop() {
        if (mDrawableTopNormal == null) {
            mCompoundDrawablesTop = null;
            return;
        }

        mCompoundDrawablesTop = new StateListDrawable();
        if (mDrawableTopUnable != null) {
            mCompoundDrawablesTop.addState(Constant.STATE_0_UNABLE, mDrawableTopUnable);
        }
        if (mDrawableTopPressed != null) {
            mCompoundDrawablesTop.addState(Constant.STATE_1_PRESSED, mDrawableTopPressed);
        }
        if (mDrawableTopSelected != null) {
            mCompoundDrawablesTop.addState(Constant.STATE_2_SELECTED, mDrawableTopSelected);
        }
        if (mDrawableTopChecked != null) {
            mCompoundDrawablesTop.addState(Constant.STATE_3_CHECKED, mDrawableTopChecked);
        }
        mCompoundDrawablesTop.addState(Constant.STATE_4_ENABLED, mDrawableTopNormal);
        mCompoundDrawablesTop.addState(Constant.STATE_5_NONE, mDrawableTopNormal);
    }

    public void updateDrawableRight() {
        if (mDrawableRightNormal == null) {
            mCompoundDrawablesRight = null;
            return;
        }

        mCompoundDrawablesRight = new StateListDrawable();
        if (mDrawableRightUnable != null) {
            mCompoundDrawablesRight.addState(Constant.STATE_0_UNABLE, mDrawableRightUnable);
        }
        if (mDrawableRightPressed != null) {
            mCompoundDrawablesRight.addState(Constant.STATE_1_PRESSED, mDrawableRightPressed);
        }
        if (mDrawableRightSelected != null) {
            mCompoundDrawablesRight.addState(Constant.STATE_2_SELECTED, mDrawableRightSelected);
        }
        if (mDrawableRightChecked != null) {
            mCompoundDrawablesRight.addState(Constant.STATE_3_CHECKED, mDrawableRightChecked);
        }
        mCompoundDrawablesRight.addState(Constant.STATE_4_ENABLED, mDrawableRightNormal);
        mCompoundDrawablesRight.addState(Constant.STATE_5_NONE, mDrawableRightNormal);
    }

    public void updateDrawableBottom() {
        if (mDrawableBottomNormal == null) {
            mCompoundDrawablesBottom = null;
            return;
        }

        mCompoundDrawablesBottom = new StateListDrawable();
        if (mDrawableBottomUnable != null) {
            mCompoundDrawablesBottom.addState(Constant.STATE_0_UNABLE, mDrawableBottomUnable);
        }
        if (mDrawableBottomPressed != null) {
            mCompoundDrawablesBottom.addState(Constant.STATE_1_PRESSED, mDrawableBottomPressed);
        }
        if (mDrawableBottomSelected != null) {
            mCompoundDrawablesBottom.addState(Constant.STATE_2_SELECTED, mDrawableBottomSelected);
        }
        if (mDrawableBottomChecked != null) {
            mCompoundDrawablesBottom.addState(Constant.STATE_3_CHECKED, mDrawableBottomChecked);
        }
        mCompoundDrawablesBottom.addState(Constant.STATE_4_ENABLED, mDrawableBottomNormal);
        mCompoundDrawablesBottom.addState(Constant.STATE_5_NONE, mDrawableBottomNormal);
    }

    public void updateDrawableAndSize() {
        if (mCompoundDrawablesLeft != null) {
            if (mDrawableLeftWidth == 0 && mDrawableLeftHeight == 0) {
                mCompoundDrawablesLeft.setBounds(0, 0, mCompoundDrawablesLeft.getMinimumWidth(), mCompoundDrawablesLeft.getMinimumHeight());
            } else {
                mCompoundDrawablesLeft.setBounds(0, 0, mDrawableLeftWidth, mDrawableLeftHeight);
            }
        }

        if (mCompoundDrawablesTop != null) {
            if (mDrawableTopWidth == 0 && mDrawableTopHeight == 0) {
                mCompoundDrawablesTop.setBounds(0, 0, mCompoundDrawablesTop.getMinimumWidth(), mCompoundDrawablesTop.getMinimumHeight());
            } else {
                mCompoundDrawablesTop.setBounds(0, 0, mDrawableTopWidth, mDrawableTopHeight);
            }
        }

        if (mCompoundDrawablesRight != null) {
            if (mDrawableRightWidth == 0 && mDrawableRightHeight == 0) {
                mCompoundDrawablesRight.setBounds(0, 0, mCompoundDrawablesRight.getMinimumWidth(), mCompoundDrawablesRight.getMinimumHeight());
            } else {
                mCompoundDrawablesRight.setBounds(0, 0, mDrawableRightWidth, mDrawableRightHeight);
            }
        }

        if (mCompoundDrawablesBottom != null) {
            if (mDrawableBottomWidth == 0 && mDrawableBottomHeight == 0) {
                mCompoundDrawablesBottom.setBounds(0, 0, mCompoundDrawablesBottom.getMinimumWidth(), mCompoundDrawablesBottom.getMinimumHeight());
            } else {
                mCompoundDrawablesBottom.setBounds(0, 0, mDrawableBottomWidth, mDrawableBottomHeight);
            }
        }

        mTextView.setCompoundDrawables(mCompoundDrawablesLeft, mCompoundDrawablesTop, mCompoundDrawablesRight, mCompoundDrawablesBottom);
    }
}
