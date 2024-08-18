package com.xipeng.myobjectstream;

import java.io.*;

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 反序列化流/对象操作输入流
        // 需求：把一个文件中的对象读到程序中

        // ObjectInputStream
        // readObject

        // 1. 创建反序列化流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myio/src/com/xipeng/myobjectstream/objects.txt"));

        // 2. 读取数据
        Object o = ois.readObject();
        System.out.println(o);

        // 3. 释放资源
        ois.close();
    }
}
