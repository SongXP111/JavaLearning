package com.xipeng.a18test4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    // 共享数据
    // 集合
    ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws InterruptedException {
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            synchronized (MyCallable.class) {
                if (list.isEmpty()) {
                    System.out.println(Thread.currentThread().getName() + ": " + boxList);
                    break;
                } else {
                    // 继续抽奖
                    Collections.shuffle(list);
                    Integer prize = list.remove(0);
                    boxList.add(prize);
                }
            }
            Thread.sleep(10);
        }
        // 把集合中的最大值返回
        if (boxList.isEmpty()) {
            return null;
        } else {
            return Collections.max(boxList);
        }
    }
}
