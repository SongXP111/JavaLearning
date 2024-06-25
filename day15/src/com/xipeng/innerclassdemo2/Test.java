package com.xipeng.innerclassdemo2;

public class Test {
    public static void main(String[] args) {
        // 匿名内部类
        // new 类名或接口名 {
        //  重写方法;
        // };

        // 1. 实现了swim
        // 2. 重写了swim方法
        // 3. 创建了对象
        new Swim() {

            @Override
            public void swim() {
                System.out.println("重写了swim方法");
            }
        };

        // 1. 继承关系
        // 2. 方法重写
        // 3. 创建对象
        new Animal() {

            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };

        // 以前：
        // 创建一个Dog类并创造对象

        // 现在：
        method(
                new Animal() {

                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );
    }

    // Animal a = 子类对象 多态
    public static void method(Animal a) {
        a.eat();
    }
}
