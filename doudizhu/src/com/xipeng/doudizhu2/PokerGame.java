package com.xipeng.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    // 牌盒Map
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        // 牌
        String[] color = {"♠️", "♦️", "♥️", "♣️"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int serial = 1;
        // 牌盒
        for (String n : number) {
            for (String c : color) {
                String card = c + n;
                hm.put(serial, card);
                list.add(serial);
                serial++;
            }
        }
        list.add(serial);
        hm.put(serial, "小王");
        serial++;
        list.add(serial);
        hm.put(serial, "大王");
    }


    public PokerGame() {
        // 洗牌
        Collections.shuffle(list);

        // 发牌
        // 4个集合，3个人，1个底牌
        // 用TreeSet方便用序号排序
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        // 遍历集合得到每一张牌
        // 牌以序号表示
        for (int i = 0; i < list.size(); i++) {
            int poker = list.get(i);
            // 底牌
            if (i <= 2) {
                lord.add(poker);
                continue;
            }
            // 给三个玩家轮流发牌
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }

        // 看牌
        lookPoker("底牌", lord);
        lookPoker("玩家1", player1);
        lookPoker("玩家2", player2);
        lookPoker("玩家3", player3);
    }

    // 参数一：玩家名字
    // 参数二：玩家的牌
    public void lookPoker(String name, TreeSet<Integer> list) {
        System.out.print(name + ": ");
        for (int poker : list) {
            System.out.print(hm.get(poker) + " ");
        }
        System.out.println();
    }
}
