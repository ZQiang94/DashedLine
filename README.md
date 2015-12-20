# DashedLine
#####mail : 452608069@qq.com || zhangqiang452608069@gmail.com<br>
#####weibo : http://weibo.com/u/3174082744<br>
#####欢迎交流Android开发技术~<br>

虚线，Demo中使用两种方式来实现<br>
1.drawable作为background<br>
2.自定义View<br>
<br>
因为Android3.0以后，硬件加速默认是关闭，使用第一种方法的前提是要开启硬件加速。<br>
#####ps:硬件加速什么？开启有什么利弊？为什么Android3.0之后可以关闭/开启？<br>

补:Android系统所有的“窗口合成”都是基于硬件加速的GPU渲染产生，<br>
我们可以这样理解，在屏幕上描绘任何新的元素，都会启用硬件加速。<br>

如果没有发生重绘变换，比如按钮本身高亮或者按下状态，这些变化就是通过软件渲染。<br>
但我们点击一个菜单按钮，所产生的覆盖效果是就由GPU完成的。<br>
开启硬件加速就是为了更流畅<br>

因为某些2ddrawable和anim在硬件加速开启的情况下不能显示出来，所以有的要开启硬件加速；<br>

参考：    http://tech2ipo.com/38255<br>
     http://blog.csdn.net/xushuaic/article/details/38975915<br>
![image](https://raw.githubusercontent.com/ZQiang94/DashedLine/master/demo.png)
