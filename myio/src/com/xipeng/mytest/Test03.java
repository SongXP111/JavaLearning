package com.xipeng.mytest;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test03 {
    public static void main(String[] args) throws IOException {
        // 需求：
        // 文本中有 2-1-9-4-7-8，将他们排序

        // 1. 读取
        FileReader fr = new FileReader("myio/src/com/xipeng/files/numbers.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();

        // 2. 排序
//        String str = sb.toString();
//        String[] arrStr = str.split("-");
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for (String s : arrStr) {
//            list.add(Integer.parseInt(s));
//        }
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
        Integer[] arr = Arrays.stream(sb.toString()
                .split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        // 3. 写出
        FileWriter fw = new FileWriter("myio/src/com/xipeng/files/sortedNumbers.txt");
//        for (int i = 0; i < list.size(); i++) {
//            if (i == list.size() - 1) {
//                fw.write(list.get(i) + "");
//            } else {
//                fw.write(list.get(i) + "-");
//            }
//        }
        String s = Arrays.toString(arr).replace(", ", "-");
        String result = s.substring(1, s.length() - 1);
        System.out.println(result);
        fw.write(result);

        fw.close();
    }
}
