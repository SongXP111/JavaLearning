package com.xipeng.lambdademo1;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // 1. Lambda表达式可以简化匿名内部类书写
        // 2. Lambda表达式只能简化函数式接口的匿名内部类的写法
        // 3. 函数式接口：有且只有一个抽象方法的接口叫函数式接口，接口上方可以加@FunctionaInterface

        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳");
            }
        });

        // Lambda
        method(
                () -> {
                    System.out.println("正在游泳游泳");
                }
        );
    }

    public static void method(Swim s) {
        s.swimming();
    }
}

@FunctionalInterface
interface Swim {
    public abstract void swimming();
}
