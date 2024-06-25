package com.xipeng.extendsDemo5;

public class SharPei extends Dog {
    // 沙皮狗吃狗粮和骨头
    @Override
    public void eat() {
        super.eat(); // 吃狗粮
        System.out.println("狗啃骨头");
    }
}
