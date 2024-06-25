package com.xipeng.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        // 设置界面的宽高
        jFrame.setSize(603, 680);
        // 设置标题
        jFrame.setTitle("拼图单机版v1.0");
        // 设置置顶
        jFrame.setAlwaysOnTop(true);
        // 设置界面居中
        jFrame.setLocationRelativeTo(null);
        // 设置游戏关闭模式
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 取消默认的居中放置，只有取消类了才会按照xy轴的形式
        jFrame.setLayout(null);

        // 按钮
        JButton jbt = new JButton("点我啊");
        // 位置和宽高
        jbt.setBounds(0, 0, 100, 50);
        // 动作监听
        // 鼠标左键点击，空格
//        jbt.addActionListener(new MyActionListener());
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点我呀");
            }
        });
        // 添加按钮
        jFrame.getContentPane().add(jbt);

        jFrame.setVisible(true);
    }
}
