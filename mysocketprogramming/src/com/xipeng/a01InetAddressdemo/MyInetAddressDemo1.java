package com.xipeng.a01InetAddressdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        // InetAddress

        // getByName
        // 确定主机名称的IP地址
        // 1. 获取IP的对象
        InetAddress address = InetAddress.getByName("192.168.1.100");
        System.out.println(address);

        // 获取IP的主机名
        String name = address.getHostName();
        System.out.println(name);

        // 返回IP地址字符串
        String ip = address.getHostAddress();
        System.out.println(ip);
    }
}
