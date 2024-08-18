package com.xipeng.myobjectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 序列化流/对象操作流
        // 需求：把一个对象写入到本地文件中

        // ObjectOutputStream
        // writeObject

        // 1. 创建对象
        Student s = new Student("zhangsan", 23);

        // 2. 创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myio/src/com/xipeng/myobjectstream/objects.txt"));

        // 3. 写出数据
        oos.writeObject(s);

        // 4. 释放资源
        oos.close();
    }
}
