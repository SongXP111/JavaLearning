package com.xipeng.myreflect4;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MyReflectDemo {
    public static void main(String[] args) throws Exception {
        // 反射获取成员方法

        // 1. 获取class对象
        Class clazz = Class.forName("com.xipeng.myreflect4.Student");

        // 2. 获取成员方法

        // 获取公共方法（也会获取到父类的方法）
//        Method[] methods = clazz.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }

        // 获取所有的方法对象（不能获取父类的，但可以获取本类私有的）
//        Method[] methods = clazz.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }

        // 因为方法重载，需要明确方法参数的类
//        Method m = clazz.getMethod("eat", String.class);
//        System.out.println(m);

        Method m = clazz.getDeclaredMethod("eat", String.class);
        System.out.println(m);

        // 获取方法的修饰符
        int mod = m.getModifiers();
        System.out.println(mod);

        // 获取方法的名字
        String name = m.getName();
        System.out.println(name);

        // 获取方法的形参
        Parameter[] parameters = m.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        // 方法抛出的异常
        Class[] exceptions = m.getExceptionTypes();
        for (Class exception : exceptions) {
            System.out.println(exception);
        }

        // 运行获取出来的方法
        Student s = new Student();
        /*
        * 参数：方法的调用者，和调用方法的实际参数
        * */
        m.setAccessible(true);
        Object result = m.invoke(s, "汉堡包");
        System.out.println(result);

        // 获取方法的返回值
    }
}
