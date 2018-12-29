package com.wei.android.lib.colorview.utils;

/**
 * Created by UCCMAWEI on 2018/12/27.
 * <p>
 * 常量都在这边定义
 */

public class Constant {

    // 整个库支持的五种状态
    public static final int[] STATE_0_UNABLE = {-android.R.attr.state_enabled};
    public static final int[] STATE_1_PRESSED = {android.R.attr.state_pressed};
    public static final int[] STATE_2_SELECTED = {android.R.attr.state_selected};
    public static final int[] STATE_3_CHECKED = {android.R.attr.state_checked};
    public static final int[] STATE_4_ENABLED = {android.R.attr.state_enabled};
    public static final int[] STATE_5_NONE = {};

    // 整个库支持的五种状态
    public static final int[][] STATE_ARRAY = {STATE_0_UNABLE, STATE_1_PRESSED, STATE_2_SELECTED, STATE_3_CHECKED, STATE_4_ENABLED, STATE_5_NONE};

    // 渐变支持八个方向
    public static final int GRADIENT_ORIENTATION_T_B = 1;
    public static final int GRADIENT_ORIENTATION_TR_BL = 2;
    public static final int GRADIENT_ORIENTATION_R_L = 3;
    public static final int GRADIENT_ORIENTATION_BR_TL = 4;
    public static final int GRADIENT_ORIENTATION_B_T = 5;
    public static final int GRADIENT_ORIENTATION_BL_TR = 6;
    public static final int GRADIENT_ORIENTATION_L_R = 7;
    public static final int GRADIENT_ORIENTATION_TL_BR = 8;

    // 渐变支持3种类型
    public static final int GRADIENT_TYPE_NONE = 0;
    public static final int GRADIENT_TYPE_LINEAR = 1;
    public static final int GRADIENT_TYPE_RADIAL = 2;
    public static final int GRADIENT_TYPE_SWEEP = 3;

    // 默认从中间开始
    public static final float CENTER_XY = 0.5f;
}
