package com.xipeng.interfacedemo5;

public class Test {
    public static void main(String[] args) {
        PingPongSporter pps = new PingPongSporter("马龙", 23);
        System.out.println(pps.getName() + " " + pps.getAge());
        pps.study();
        pps.speakEnglish();
    }
}
