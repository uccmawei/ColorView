package com.wei.android.lib.colorview.demo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.wei.android.lib.colorview.helper.ColorTextViewHelper;
import com.wei.android.lib.colorview.view.ColorTextView;

public class MainActivity extends AppCompatActivity {

    private ColorTextViewHelper mColorTextViewHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mColorTextViewHelper = ((ColorTextView) findViewById(R.id.mColorTextView)).getColorTextViewHelper();
    }

    public void bg1(View view) {
        mColorTextViewHelper.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.n1), true);
    }

    public void bg2(View view) {
        mColorTextViewHelper.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.n2), true);
    }

    public void bg3(View view) {
        mColorTextViewHelper.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.n1), false);
    }

    public void bd1(View view) {
        mColorTextViewHelper.setBorderColor(Color.parseColor("#f39c12"), true);
    }

    public void bd2(View view) {
        mColorTextViewHelper.setBorderColor(Color.parseColor("#d35400"), true);
    }

    public void bd3(View view) {
        mColorTextViewHelper.setBorderColor(Color.parseColor("#c0392b"), true);
    }

    public void bdw1(View view) {
        mColorTextViewHelper.setBorderWidth(1);
    }

    public void bdw2(View view) {
        mColorTextViewHelper.setBorderWidth(dp2px(10));
    }

    public void bdw3(View view) {
        mColorTextViewHelper.setBorderWidth(dp2px(20));
    }

    public void bddg1(View view) {
        mColorTextViewHelper.setBorderDashGap(1);
    }

    public void bddg2(View view) {
        mColorTextViewHelper.setBorderDashGap(dp2px(10));
    }

    public void bddg3(View view) {
        mColorTextViewHelper.setBorderDashGap(dp2px(20));
    }

    public void bddw1(View view) {
        mColorTextViewHelper.setBorderDashWidth(1);
    }

    public void bddw2(View view) {
        mColorTextViewHelper.setBorderDashWidth(dp2px(10));
    }

    public void bddw3(View view) {
        mColorTextViewHelper.setBorderDashWidth(dp2px(20));
    }

    public void cr1(View view) {
        mColorTextViewHelper.setCornerRadius(0);
    }

    public void cr2(View view) {
        mColorTextViewHelper.setCornerRadius(dp2px(20));
    }

    public void cr3(View view) {
        mColorTextViewHelper.setCornerRadiusTopRight(dp2px(50));
    }

    private int dp2px(float dp) {
        return (int) (dp * getResources().getDisplayMetrics().density + 0.5f);
    }
}
