package com.xipeng.mytest;

import java.io.*;
import java.util.*;

public class Test06 {
    public static void main(String[] args) throws IOException {
        // 需求：把出师表的文章顺序进行恢复到一个新文件中
        // TreeMap

        // 1, 读取数据
        BufferedReader br = new BufferedReader(new FileReader("myio/src/com/xipeng/files/test06Input.txt"));
        String line;
        TreeMap<Integer, String> map = new TreeMap<>();
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            map.put(Integer.parseInt(arr[0]), line);
        }

        br.close();

        // 2. 写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio/src/com/xipeng/files/test06Output.txt"));
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : set) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }
        bw.close();
    }
}
