package com.xipeng.test1;

public class PhoneTest {
    public static void main(String[] args) {
        // 创建手机的对象
        Phone p = new Phone();

        // 给手机赋值
        p.brand = "小米";
        p.price = 1999.98;

        // 获得对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        // 调用对象中的方法
        p.call();
        p.playGame();
    }
}
