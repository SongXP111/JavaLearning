package com.xipeng.interfacedemo2;

public class Test {
    public static void main(String[] args) {
        // 接口中成员的特点：
        // 成员变量：只能是常量，默认 public static final
        // 构造方法：没有
        // 成员方法：只能是抽象方法

        System.out.println(Inter.a);
        InterImpl i = new InterImpl();
        i.method();
    }
}
