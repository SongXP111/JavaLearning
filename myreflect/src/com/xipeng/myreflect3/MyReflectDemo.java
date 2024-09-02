package com.xipeng.myreflect3;

import java.lang.reflect.Field;

public class MyReflectDemo {
    public static void main(String[] args) throws Exception {
        // 反射获取成员变量

        // 1. 获取class字节码文件的对象
        Class clazz = Class.forName("com.xipeng.myreflect3.Student");

        // 2. 获取成员变量的对象

        // 获取公共成员变量
//        Field[] fields = clazz.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }

        // 获取所有成员变量
//        Field[] fields = clazz.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }

        // 获取单独的成员变量
//        Field f = clazz.getField("gender");
//        System.out.println(f);

        // 获取单独的成员变量（可以获取私有的）
        Field name = clazz.getDeclaredField("name");
        System.out.println(name);

        // 获取权限修饰符
        int modifiers = name.getModifiers();
        System.out.println(modifiers);

        // 名字
        String n = name.getName();
        System.out.println(n);

        // 类型
        Class<?> type = name.getType();
        System.out.println(type);

        // 获取成员变量记录的值
        Student s = new Student("张三", 23, "男");
        name.setAccessible(true);
        Object value = name.get(s);
        System.out.println(value);

        // 修改对象记录的值
        name.set(s, "李四");
        System.out.println(s);
    }
}
