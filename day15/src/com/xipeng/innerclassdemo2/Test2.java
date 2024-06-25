package com.xipeng.innerclassdemo2;

public class Test2 {
    public static void main(String[] args) {
        // 可以理解为Swim接口的实现类对象
        // 接口多态
        Swim s = new Swim() {

            @Override
            public void swim() {
                System.out.println("重写之后游泳方法");
            }
        };
        s.swim();

        // 调用方法
        new Swim() {

            @Override
            public void swim() {
                System.out.println("重写之后游泳方法");
            }
        }.swim();;
    }
}
