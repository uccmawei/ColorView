ColorView
========

抛弃 Selector 和 Shape ，直接在布局文件中实现多彩样式。

![](https://github.com/uccmawei/ColorView/raw/master/demo.png)


**1. Gradle 添加引用**

    compile 'com.wei.android.lib:colorview:1.3.0'

**2. 拓展的View**

    ColorView
    ColorButton
    ColorTextView
    ColorEditText
    ColorImageView
    ColorFrameLayout
    ColorLinearLayout
    ColorRelativeLayout

**3. 拓展的属性**

    以下带有Normal字样的属性都支持以下五种状态：
    Normal，Pressed，Selected，Checked，Unable

    app:backgroundColorNormal="#FFFFFF"                 // 背景色
    app:backgroundDrawableNormal="@drawable/apple"      // 背景图
    app:gradientOrientationNormal="TL_BR"               // 渐变角度：左上到右下
    app:gradientCenterXNormal="0.5"                     // 渐变中心
    app:gradientCenterYNormal="0.5"                     // 渐变中心
    app:gradientStartColorNormal="#FFFFFF"              // 渐变开始颜色
    app:gradientCenterColorNormal="#FFFFFF"             // 渐变中间颜色
    app:gradientEndColorNormal="#FFFFFF"                // 渐变末尾颜色
    app:gradientRadiusNormal="20dp"                     // 渐变辐射半径
    app:gradientTypeNormal="linear"                     // 渐变类型：默认线性
    app:textColorNormal="#FFFFFF"                       // 文字颜色
    app:textColorHintNormal="#FFFFFF"                   // 提示文字颜色
    app:srcNormal="@drawable/apple"                     // 图片资源
    app:cornerRadiusNormal="20dp"                       // 背景圆角
    app:cornerRadiusTopLeftNormal="20dp"                // 背景圆角，左上
    app:cornerRadiusTopRightNormal="20dp"               // 背景圆角，右上
    app:cornerRadiusBottomLeftNormal="20dp"             // 背景圆角，左下
    app:cornerRadiusBottomRightNormal="20dp"            // 背景圆角，右下
    app:borderWidthNormal="2dp"                         // 边框粗细
    app:borderDashGapNormal="20dp"                      // 边框虚线之间的间隔
    app:borderDashWidthNormal="20dp"                    // 边框虚线大小
    app:borderColorNormal="#FFFFFF"                     // 边框颜色
    app:drawableLeftNormal="@drawable/banana"           // 左边图标
    app:drawableTopNormal="@drawable/banana"            // 上边图标
    app:drawableRightNormal="@drawable/banana"          // 右边图标
    app:drawableBottomNormal="@drawable/banana"         // 下边图标
    app:drawableLeftWidth="20dp"                        // 左边图标宽度
    app:drawableLeftHeight="20dp"                       // 左边图标高度
    app:drawableTopWidth="20dp"                         // 上边图标宽度
    app:drawableTopHeight="20dp"                        // 上边图标高度
    app:drawableRightWidth="20dp"                       // 右边图标宽度
    app:drawableRightHeight="20dp"                      // 右边图标高度
    app:drawableBottomWidth="20dp"                      // 下边图标宽度
    app:drawableBottomHeight="20dp"                     // 下边图标高度

**3. 属性介绍**

    1. Normal属性具有默认性，其他属性的默认值都跟Normal保持一致。
    
    2. 背景图片的和背景颜色一起设定时，背景图片会覆盖背景颜色。

    3. 需要更新某个属性则调用：view.getColorHelper().setXXX();

**4. 开发笔记**

[1. 加粗边框时需要重新构建背景对象，否则背景边框绘制不正确。](https://issuetracker.google.com/issues/70444558 "Google Issue")

**5. 本库小瑕疵**

[1. 当四个圆角的值不一样时，背景绘制的效果有些不准确，圆角值越大越明显，Selector也有一样的问题。](https://issuetracker.google.com/issues/70461762 "Google Issue")

**6. 版本记录**

**v1.3.0**　`2018.12.28`　支持更多属性字段，细化更多状态属性

**v1.2.1**　`2018.02.09`　修正代码逻辑判断

**v1.2.0**　`2017.12.12`　发布1.2.0版本

## License ##

Licensed under the MIT License, see the [LICENSE](https://github.com/uccmawei/ColorView/blob/master/LICENSE) for copying permission.
