package com.xipeng.myexception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args) throws ParseException {
        // 编译时异常
        // 在编译阶段，必须手动处理，否则代码报错
        // Java通过javac命令生成字节码文件
        String time = "2030年1月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(time);
        System.out.println(date);

        // 运行时异常
        // RuntimeException及其子类，编译阶段不需要处理，代码运行时出现的异常
        // 通过java命令运行字节码文件
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[10]);
    }
}
