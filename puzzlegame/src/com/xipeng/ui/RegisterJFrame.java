package com.xipeng.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    // 注册界面
    public RegisterJFrame() {
        this.setSize(488, 500);

        // 设置标题
        this.setTitle("注册");

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
