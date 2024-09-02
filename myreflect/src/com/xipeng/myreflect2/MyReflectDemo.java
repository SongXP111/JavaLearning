package com.xipeng.myreflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class MyReflectDemo {
    public static void main(String[] args) throws Exception {
        // 反射获取构造方法

        // 1. 获取class字节码文件
        Class clazz = Class.forName("com.xipeng.myreflect2.Student");

        // 2. 获取构造方法

        // 获取public的
//        Constructor[] cons1 = clazz.getConstructors();
//        for (Constructor constructor : cons1) {
//            System.out.println(constructor);
//        }

        // 获取所有的
//        Constructor[] cons2 = clazz.getDeclaredConstructors();
//        for (Constructor constructor : cons2) {
//            System.out.println(constructor);
//        }

        // 获取某一个
//        Constructor c1 = clazz.getDeclaredConstructor();
//        System.out.println(c1);
//
//        Constructor c2 = clazz.getDeclaredConstructor(String.class);
//        System.out.println(c2);
//
//        Constructor c3 = clazz.getDeclaredConstructor(int.class);
//        System.out.println(c3);

        Constructor c4 = clazz.getDeclaredConstructor(String.class, int.class);
//        System.out.println(c4);

        // 获取权限修饰符（对应的数字）
//        int mod = c4.getModifiers();
//        System.out.println(mod);

        // 获取参数
//        Parameter[] parameters = c4.getParameters();
//        for (Parameter parameter : parameters) {
//            System.out.println(parameter);
//        }

        // 创建对象，需和c4的参数保持一致
        // 暴力反射，临时取消权限
        c4.setAccessible(true);
        Student s = (Student) c4.newInstance("张三", 23); // private会报错，需要用setAccessible
        System.out.println(s);
    }
}
