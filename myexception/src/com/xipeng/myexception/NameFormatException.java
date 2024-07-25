package com.xipeng.myexception;

public class NameFormatException extends RuntimeException {
    // 运行异常：继承RuntimeException（核心：由于参数错误导致的问题）
    // 编译异常：继承Exception（核心：提醒程序员检查本地信息）


    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
