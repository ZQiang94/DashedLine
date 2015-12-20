package com.dashline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * create by ZQiang94
 * 2015年12月20日
 *
 * 虚线，改Demo中使用两种方式来实现
 * 1.drawable作为background
 * 2.自定义View；
 * 因为Android3.0以后，硬件加速默认是关闭，使用第一种方法的前提是要开启硬件加速。
 *
 * ps:硬件加速什么？开启有什么利弊？为什么Android3.0之后可以关闭/开启？
 *      Android系统所有的“窗口合成”都是基于硬件加速的GPU渲染产生，
 * 我们可以这样理解，在屏幕上描绘任何新的元素，都会启用硬件加速。
 * 如果没有发生重绘变换，比如按钮本身高亮或者按下状态，这些变化就是通过软件渲染。
 * 但我们点击一个菜单按钮，所产生的覆盖效果是就由GPU完成的。
 *
 * 开启硬件加速就是为了更流畅
 *
 * 因为某些2ddrawable和anim在硬件加速开启的情况下不能显示出来，所以有的要开启硬件加速；
 *
 * 参考：http://tech2ipo.com/38255
 * http://blog.csdn.net/xushuaic/article/details/38975915
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.txtDashedLine);
        tv.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
    }
}
