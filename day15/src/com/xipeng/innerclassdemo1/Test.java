package com.xipeng.innerclassdemo1;

public class Test {
    public static void main(String[] args) {
        // 内部类
        // 可以直接访问外部类的成员，包括私有 
        // 外部类要访问内部类的成员，必须创建对象

        // B类表示的是A的一部分，且B单独存在没有意义，就把B写成内部类

        Car c = new Car();
        c.carName = "宾利";
        c.carAge = 1;
        c.carColor = "粉色";

        c.show();
    }
}
