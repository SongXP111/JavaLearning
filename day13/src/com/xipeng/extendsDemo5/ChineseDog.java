package com.xipeng.extendsDemo5;

public class ChineseDog extends Dog {
    // 吃剩饭
    // 中华田园犬不需要父类中的方法，所以不需要super
    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }
}
