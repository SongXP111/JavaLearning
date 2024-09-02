package com.xipeng.myreflect5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MyReflectDemo {
    public static void main(String[] args) throws Exception {
       /*
       * 对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中
       * */

        Student s = new Student("张三", 23, "男", 188.0, "打篮球");
        Teacher t = new Teacher("王老师", 80000);

        saveObject(s);
//        saveObject(t);
    }

    public static void saveObject(Object obj) throws IllegalAccessException, IOException {
        // 1. 获取字节码文件
        Class clazz = obj.getClass();

        // 2. 创建IO流
        BufferedWriter bw = new BufferedWriter(new FileWriter("myreflect/src/com/xipeng/myreflect5/a.txt"));

        // 3. 获取所有的成员变量
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(obj);
            bw.write(name + "=" + value);
            bw.newLine();
        }
        bw.close();
    }
}
