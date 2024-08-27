package com.xipeng.a13waitandnotify;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
        * 需求：
        * 完成生产者和消费者的代码（等待唤醒机制）
        * 实现线程轮流交替执行的效果
        * */

        // 创建线程对象
        Cook c = new Cook();
        Foodie f = new Foodie();

        // 设置名字
        c.setName("厨师");
        f.setName("吃货");

        // 启动
        c.start();
        f.start();
    }
}
