package com.xipeng.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    // 登陆界面
    public LoginJFrame() {
        // 创建登陆界面的时候，设置一些信息
        this.setSize(488, 430);

        // 设置标题
        this.setTitle("登陆");

        // 设置置顶
        this.setAlwaysOnTop(true);

        // 设置界面居中
        this.setLocationRelativeTo(null);

        // 设置游戏关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 显示
        this.setVisible(true);
    }
}
