package com.xipeng.doudizhu3;

import java.util.*;

public class PokerGame {
    // 牌盒Map
    static HashMap<String, Integer> hm = new HashMap<>();
    static ArrayList<String> list = new ArrayList<>();

    static {
        // 牌
        String[] color = {"♠", "♦", "♥", "♣"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        // 牌盒
        for (String n : number) {
            for (String c : color) {
                String card = c + n;
                list.add(card);
            }
        }
        list.add(" 小王");
        list.add(" 大王");

        // 给每张牌一个价值
        // 3 - 10 不需要，数字就是价值
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("小王", 50);
        hm.put("大王", 100);
    }


    public PokerGame() {
        // 洗牌
        Collections.shuffle(list);

        // 发牌
        // 4个集合，3个人，1个底牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        // 遍历集合得到每一张牌
        // 牌以序号表示
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
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

        // 排序
        order(lord);
        order(player1);
        order(player2);
        order(player3);

        // 看牌
        lookPoker("底牌", lord);
        lookPoker("玩家1", player1);
        lookPoker("玩家2", player2);
        lookPoker("玩家3", player3);
    }


    // 排序
    // 利用牌的价值进行排序
    public void order(ArrayList<String> list) {
        list.sort((o1, o2) -> {
            // 计算o1的花色和价值
            String color1 = o1.substring(0, 1);
            int value1 = getValue(o1);
            // 计算o2的花色和价值
            String color2 = o2.substring(0, 1);
            int value2 = getValue(o2);

            int i = value1 - value2;
            return i == 0 ? color1.compareTo(color2) : i;
        });
    }

    // 计算牌的价值
    public int getValue(String poker) {
        // 从1截取到最后
        String number = poker.substring(1);
        if (hm.containsKey(number)) {
            return hm.get(number);
        } else {
            return Integer.parseInt(number);
        }
    }


    // 参数一：玩家名字
    // 参数二：玩家的牌
    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ": ");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
