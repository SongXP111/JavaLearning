package com.xipeng.myimmutable;

import java.util.Map;

public class ImmutableDemo3 {
    public static void main(String[] args) {
        // 不可变map
        // key不能重复
        // of的参数有上限，最多10对kv
        Map<String, String> map = Map.of("aaa", "AAA", "bbb", "BBB");
    }
}
