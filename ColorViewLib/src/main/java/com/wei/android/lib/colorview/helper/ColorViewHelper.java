package com.wei.android.lib.colorview.helper;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;

/**
 * Created by UCCMAWEI on 2017/11/17.
 */

public class ColorViewHelper<T extends View> {

    // 背景颜色
    private int mBgColorNormal;
    private int mBgColorPressed;
    private int mBgColorSelected;
    private int mBgColorChecked;
    private int mBgColorUnable;

    // 描边颜色
    private int mBdColorNormal;
    private int mBdColorPressed;
    private int mBdColorSelected;
    private int mBdColorChecked;
    private int mBdColorUnable;

    // 描边粗细
    private int mBdWidth;
    private int mBdDashGap;
    private int mBdDashWidth;

    // 圆角大小
    private int mCRTopLeft;
    private int mCRTopRight;
    private int mCRBottomLeft;
    private int mCRBottomRight;

    // 背景资源
    private Drawable mDrawableNormal;
    private Drawable mDrawablePressed;
    private Drawable mDrawableSelected;
    private Drawable mDrawableChecked;
    private Drawable mDrawableUnable;

    // 状态
    protected int[][] mStateArray = new int[6][];

    // 目标View
    protected T mView;

    public ColorViewHelper(
            T view,
            TypedArray typedArray,
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
        mView = view;

        // 背景颜色
        mBgColorNormal = typedArray.getColor(bgColorNormal, Color.TRANSPARENT);
        mBgColorPressed = typedArray.getColor(bgColorPressed, mBgColorNormal);
        mBgColorSelected = typedArray.getColor(bgColorSelected, mBgColorNormal);
        mBgColorChecked = typedArray.getColor(bgColorChecked, mBgColorNormal);
        mBgColorUnable = typedArray.getColor(bgColorUnable, mBgColorNormal);

        // 描边颜色
        mBdColorNormal = typedArray.getColor(bdColorNormal, Color.TRANSPARENT);
        mBdColorPressed = typedArray.getColor(bdColorPressed, mBdColorNormal);
        mBdColorSelected = typedArray.getColor(bdColorSelected, mBdColorNormal);
        mBdColorChecked = typedArray.getColor(bdColorChecked, mBdColorNormal);
        mBdColorUnable = typedArray.getColor(bdColorUnable, mBdColorNormal);

        // 描边粗细
        mBdWidth = typedArray.getDimensionPixelOffset(bdWidth, 0);
        mBdDashGap = typedArray.getDimensionPixelOffset(bdDashGap, 0);
        mBdDashWidth = typedArray.getDimensionPixelOffset(bdDashWidth, 0);

        // 圆角大小
        int mcr = typedArray.getDimensionPixelOffset(cr, 0);
        mCRTopLeft = typedArray.getDimensionPixelOffset(crTopLeft, mcr);
        mCRTopRight = typedArray.getDimensionPixelOffset(crTopRight, mcr);
        mCRBottomLeft = typedArray.getDimensionPixelOffset(crBottomLeft, mcr);
        mCRBottomRight = typedArray.getDimensionPixelOffset(crBottomRight, mcr);

        // 背景图片
        mDrawableNormal = typedArray.getDrawable(bgDrawableNormal);
        mDrawablePressed = typedArray.getDrawable(bgDrawablePressed);
        mDrawableSelected = typedArray.getDrawable(bgDrawableSelected);
        mDrawableChecked = typedArray.getDrawable(bgDrawableChecked);
        mDrawableUnable = typedArray.getDrawable(bgDrawableUnable);

        // 五种支持的状态
        mStateArray[0] = new int[]{-android.R.attr.state_enabled};
        mStateArray[1] = new int[]{android.R.attr.state_pressed};
        mStateArray[2] = new int[]{android.R.attr.state_selected};
        mStateArray[3] = new int[]{android.R.attr.state_checked};
        mStateArray[4] = new int[]{android.R.attr.state_enabled};
        mStateArray[5] = new int[]{};

        // 图片模式优先于颜色模式
        boolean isBackgroundColorMode = mDrawableNormal == null;

        if (mDrawableNormal == null) {
            mDrawableNormal = new GradientDrawable();
        }

        if (mDrawablePressed == null) {
            mDrawablePressed = isBackgroundColorMode ? new GradientDrawable() : typedArray.getDrawable(bgDrawableNormal);
        }

        if (mDrawableSelected == null) {
            mDrawableSelected = isBackgroundColorMode ? new GradientDrawable() : typedArray.getDrawable(bgDrawableNormal);
        }

        if (mDrawableChecked == null) {
            mDrawableChecked = isBackgroundColorMode ? new GradientDrawable() : typedArray.getDrawable(bgDrawableNormal);
        }

        if (mDrawableUnable == null) {
            mDrawableUnable = isBackgroundColorMode ? new GradientDrawable() : typedArray.getDrawable(bgDrawableNormal);
        }

        updateNormal(false);
        updatePressed(false);
        updateSelected(false);
        updateChecked(false);
        updateUnable(false);

        recreateViewBackgroundDrawable();
    }

    private boolean updateNormal(boolean forceToColorMode) {
        if (forceToColorMode) {
            mDrawableNormal = createDrawable(mDrawableNormal, mBgColorNormal, mBdColorNormal, true);
        } else {
            if (mDrawableNormal instanceof GradientDrawable) {
                mDrawableNormal = createDrawable(mDrawableNormal, mBgColorNormal, mBdColorNormal, false);
            } else {
                return false;
            }
        }

        return true;
    }

    private boolean updatePressed(boolean forceToColorMode) {
        if (forceToColorMode) {
            mDrawablePressed = createDrawable(mDrawablePressed, mBgColorPressed, mBdColorPressed, true);
        } else {
            if (mDrawablePressed instanceof GradientDrawable) {
                mDrawablePressed = createDrawable(mDrawablePressed, mBgColorPressed, mBdColorPressed, false);
            } else {
                return false;
            }
        }

        return true;
    }

    private boolean updateSelected(boolean forceToColorMode) {
        if (forceToColorMode) {
            mDrawableSelected = createDrawable(mDrawableSelected, mBgColorSelected, mBdColorSelected, true);
        } else {
            if (mDrawableSelected instanceof GradientDrawable) {
                mDrawableSelected = createDrawable(mDrawableSelected, mBgColorSelected, mBdColorSelected, false);
            } else {
                return false;
            }
        }

        return true;
    }

    private boolean updateChecked(boolean forceToColorMode) {
        if (forceToColorMode) {
            mDrawableChecked = createDrawable(mDrawableChecked, mBgColorChecked, mBdColorChecked, true);
        } else {
            if (mDrawableChecked instanceof GradientDrawable) {
                mDrawableChecked = createDrawable(mDrawableChecked, mBgColorChecked, mBdColorChecked, false);
            } else {
                return false;
            }
        }

        return true;
    }

    private boolean updateUnable(boolean forceToColorMode) {
        if (forceToColorMode) {
            mDrawableUnable = createDrawable(mDrawableUnable, mBgColorUnable, mBdColorUnable, true);
        } else {
            if (mDrawableUnable instanceof GradientDrawable) {
                mDrawableUnable = createDrawable(mDrawableUnable, mBgColorUnable, mBdColorUnable, false);
            } else {
                return false;
            }
        }

        return true;
    }

    private void recreateViewBackgroundDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(mStateArray[0], mDrawableUnable);
        stateListDrawable.addState(mStateArray[1], mDrawablePressed);
        stateListDrawable.addState(mStateArray[2], mDrawableSelected);
        stateListDrawable.addState(mStateArray[3], mDrawableChecked);
        stateListDrawable.addState(mStateArray[4], mDrawableNormal);
        stateListDrawable.addState(mStateArray[5], mDrawableNormal);
        mView.setBackground(stateListDrawable);
    }

    private Drawable createDrawable(Drawable drawable, int backgroundColor, int borderColor, boolean forceToColorMode) {
        if (!(drawable instanceof GradientDrawable) && !forceToColorMode) {
            return drawable;
        }

        GradientDrawable gradientDrawable = new GradientDrawable();

        gradientDrawable.setColor(backgroundColor);
        gradientDrawable.setStroke(mBdWidth, borderColor, mBdDashWidth, mBdDashGap);

        if (mCRTopLeft == mCRTopRight
                && mCRTopRight == mCRBottomRight
                && mCRBottomRight == mCRBottomLeft) {
            gradientDrawable.setCornerRadius(mCRTopLeft);
        } else {
            float[] cornerArray = new float[8];
            cornerArray[0] = mCRTopLeft;
            cornerArray[1] = mCRTopLeft;
            cornerArray[2] = mCRTopRight;
            cornerArray[3] = mCRTopRight;
            cornerArray[4] = mCRBottomRight;
            cornerArray[5] = mCRBottomRight;
            cornerArray[6] = mCRBottomLeft;
            cornerArray[7] = mCRBottomLeft;
            gradientDrawable.setCornerRadii(cornerArray);
        }

        return gradientDrawable;
    }

    // SET BackgroundColor
    public void setBackgroundColor(int backgroundColor, boolean includeUnableState) {
        mBgColorNormal = backgroundColor;
        updateNormal(true);

        mBgColorPressed = backgroundColor;
        updatePressed(true);

        mBgColorSelected = backgroundColor;
        updateSelected(true);

        mBgColorChecked = backgroundColor;
        updateChecked(true);

        if (includeUnableState) {
            mBgColorUnable = backgroundColor;
            updateUnable(true);
        }

        recreateViewBackgroundDrawable();
    }

    public void setBackgroundColorNormal(int backgroundColorNormal) {
        mBgColorNormal = backgroundColorNormal;
        updateNormal(true);
        recreateViewBackgroundDrawable();
    }

    public void setBackgroundColorPressed(int backgroundColorPressed) {
        mBgColorPressed = backgroundColorPressed;
        updatePressed(true);
        recreateViewBackgroundDrawable();
    }

    public void setBackgroundColorSelected(int backgroundColorSelected) {
        mBgColorSelected = backgroundColorSelected;
        updateSelected(true);
        recreateViewBackgroundDrawable();
    }

    public void setBackgroundColorChecked(int backgroundColorChecked) {
        mBgColorChecked = backgroundColorChecked;
        updateChecked(true);
        recreateViewBackgroundDrawable();
    }

    public void setBackgroundColorUnable(int backgroundColorUnable) {
        mBgColorUnable = backgroundColorUnable;
        updateUnable(true);
        recreateViewBackgroundDrawable();
    }

    // SET BorderColor
    public void setBorderColor(int borderColor, boolean includeUnableState) {
        boolean needToRecreate;

        mBdColorNormal = borderColor;
        needToRecreate = updateNormal(false);

        mBdColorPressed = borderColor;
        needToRecreate = needToRecreate | updatePressed(false);

        mBdColorSelected = borderColor;
        needToRecreate = needToRecreate | updateSelected(false);

        mBdColorChecked = borderColor;
        needToRecreate = needToRecreate | updateChecked(false);

        if (includeUnableState) {
            mBdColorUnable = borderColor;
            needToRecreate = needToRecreate | updateUnable(false);
        }

        if (needToRecreate) {
            recreateViewBackgroundDrawable();
        }
    }

    public void setBorderColorNormal(int borderColorNormal) {
        mBdColorNormal = borderColorNormal;
        if (updateNormal(false)) {
            recreateViewBackgroundDrawable();
        }
    }

    public void setBorderColorPressed(int borderColorPressed) {
        mBdColorPressed = borderColorPressed;
        if (updatePressed(false)) {
            recreateViewBackgroundDrawable();
        }
    }

    public void setBorderColorSelected(int borderColorSelected) {
        mBdColorSelected = borderColorSelected;
        if (updateSelected(false)) {
            recreateViewBackgroundDrawable();
        }
    }

    public void setBorderColorChecked(int borderColorChecked) {
        mBdColorChecked = borderColorChecked;
        if (updateChecked(false)) {
            recreateViewBackgroundDrawable();
        }
    }

    public void setBorderColorUnable(int borderColorUnable) {
        mBdColorUnable = borderColorUnable;
        if (updateUnable(false)) {
            recreateViewBackgroundDrawable();
        }
    }

    // SET BorderWidth & BorderDashGap & BorderDashWidth & CornerRadius
    private void updateBorderAndCornerRadius() {
        if (updateNormal(false) | updatePressed(false) | updateSelected(false)
                | updateChecked(false) | updateUnable(false)) {
            recreateViewBackgroundDrawable();
        }
    }

    public void setBorderWidth(int borderWidth) {
        mBdWidth = borderWidth;
        updateBorderAndCornerRadius();
    }

    public void setBorderDashGap(int borderDashGap) {
        mBdDashGap = borderDashGap;
        updateBorderAndCornerRadius();
    }

    public void setBorderDashWidth(int borderDashWidth) {
        mBdDashWidth = borderDashWidth;
        updateBorderAndCornerRadius();
    }

    public void setCornerRadius(int cornerRadius) {
        mCRTopLeft = cornerRadius;
        mCRTopRight = cornerRadius;
        mCRBottomLeft = cornerRadius;
        mCRBottomRight = cornerRadius;
        updateBorderAndCornerRadius();
    }

    public void setCornerRadiusTopLeft(int cornerRadiusTopLeft) {
        mCRTopLeft = cornerRadiusTopLeft;
        updateBorderAndCornerRadius();
    }

    public void setCornerRadiusTopRight(int cornerRadiusTopRight) {
        mCRTopRight = cornerRadiusTopRight;
        updateBorderAndCornerRadius();
    }

    public void setCornerRadiusBottomLeft(int cornerRadiusBottomLeft) {
        mCRBottomLeft = cornerRadiusBottomLeft;
        updateBorderAndCornerRadius();
    }

    public void setCornerRadiusBottomRight(int cornerRadiusBottomRight) {
        mCRBottomRight = cornerRadiusBottomRight;
        updateBorderAndCornerRadius();
    }

    // SET Drawable
    public void setBackgroundDrawable(Drawable backgroundDrawable, boolean includeUnableState) {
        if (backgroundDrawable == null) {
            return;
        }

        mDrawableNormal = backgroundDrawable;
        mDrawablePressed = backgroundDrawable;
        mDrawableSelected = backgroundDrawable;
        mDrawableChecked = backgroundDrawable;

        if (includeUnableState) {
            mDrawableUnable = backgroundDrawable;
        }

        recreateViewBackgroundDrawable();
    }

    public void setBackgroundDrawableNormal(Drawable backgroundDrawableNormal) {
        if (backgroundDrawableNormal != null) {
            mDrawableNormal = backgroundDrawableNormal;
            recreateViewBackgroundDrawable();
        }
    }

    public void setBackgroundDrawablePressed(Drawable backgroundDrawablePressed) {
        if (backgroundDrawablePressed != null) {
            mDrawablePressed = backgroundDrawablePressed;
            recreateViewBackgroundDrawable();
        }
    }

    public void setBackgroundDrawableSelected(Drawable backgroundDrawableSelected) {
        if (backgroundDrawableSelected != null) {
            mDrawableSelected = backgroundDrawableSelected;
            recreateViewBackgroundDrawable();
        }
    }

    public void setBackgroundDrawableChecked(Drawable backgroundDrawableChecked) {
        if (backgroundDrawableChecked != null) {
            mDrawableChecked = backgroundDrawableChecked;
            recreateViewBackgroundDrawable();
        }
    }

    public void setBackgroundDrawableUnable(Drawable backgroundDrawableUnable) {
        if (backgroundDrawableUnable != null) {
            mDrawableUnable = backgroundDrawableUnable;
            recreateViewBackgroundDrawable();
        }
    }
}
