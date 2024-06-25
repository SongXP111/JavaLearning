package com.xipeng.finalDemo2;

public class Test {
    public static void main(String[] args) {
        // final修饰基本数据类型，记录的值不能被改变
        // final修饰引用数据类型，记录的地址值不能被改变，但内部的属性值可以改变（记录的是地址值）
        final Student S = new Student("张三", 23);

        // 报错
        // 地址值不能被改变
        // S = new Student();
        // 属性值可以改变
        S.setName("李四");
        S.setAge(24);
        System.out.println(S.toString());

        // 数组
        // 数组中的值可以改变
        final int[] ARR = {1, 2, 3, 4, 5};
        ARR[0] = 10;
        ARR[1] = 20;
        for (int i = 0; i < ARR.length; i++) {
            System.out.println(ARR[i]);
        }
    }
}
