package com.xipeng.finalDemo1;

public class Test {
    public static void main(String[] args) {
        // final
        // 可以修饰方法：不能被重写
        // 可以修饰类：不能被继承
        // 可以修饰变量：常量，只能被赋值一次

        final int a = 10;
        System.out.println(a);
    }
}

class Fu {
    public void show() {
        System.out.println("Fu show");
    }
}

class Zi extends Fu {
    @Override
    public void show() {
        System.out.println("Zi show");
    }
}