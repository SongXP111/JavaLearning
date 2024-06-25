package com.xipeng.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    // 游戏的主界面
    // 游戏相关的所有逻辑都在这个class

    // 创造二维数组
    // 管理数据
    int[][] data = new int[4][4];
    // 空白方块
    int x;
    int y;
    // 当前图片路径
    String path = "puzzlegame/image/animal/animal3/";
    // 二维数组存储正确的数据
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    // 计步器
    int step = 0;
    // 创建选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登陆");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");

    public GameJFrame() {
        initJFrame();

        // 初始化菜单
        initJMenuBar();

        // 初始化数据（打乱）
        initData();

        // 初始化图片（打乱之后的）
        initImage();

        // 显示
        this.setVisible(true);
    }

    // 初始化数据
    private void initData() {
        // 把一位数组中0 - 15 打乱
        // 然后四个一组添加到二维数组中

        // 1. 创造一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // 2. 打乱
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        // 3. 添加
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    // 初始化图片
    private void initImage() {
        // 删除现在的图片
        this.getContentPane().removeAll();

        // 胜利
        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon( "puzzlegame/image/win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepCount = new JLabel("步数："  + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(new ImageIcon(path + data[i][j] + ".jpg"));
                // 指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                // 给图片添加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                // 把管理容器添加到界面
                this.getContentPane().add(jLabel);
            }
        }

        // 背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame/image/background.png"));
        background.setBounds(40, 40, background.getPreferredSize().width, background.getPreferredSize().height);
        this.getContentPane().add(background);

        // 刷新
        this.getContentPane().repaint();
    }

    // 初始化菜单
    private void initJMenuBar() {
        // 创建菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        // 创建菜单上面的两个选项的对象（功能，关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        // 将每一个选项下面的条目添加到选项当中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        // 给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);

        accountItem.addActionListener(this);

        // 将菜单两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        // 给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    // 初始化界面
    private void initJFrame() {
        // 设置界面的宽高
        this.setSize(603, 680);
        // 设置标题
        this.setTitle("拼图单机版v1.0");
        // 设置置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置游戏关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 取消默认的居中放置，只有取消类了才会按照xy轴的形式
        this.setLayout(null);
        // 添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    // 按下不松
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            // 把界面所有图片全部删除
            this.getContentPane().removeAll();
            // 加载第一张完整图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            // 加载背景图片
            JLabel background = new JLabel(new ImageIcon("puzzlegame/image/background.png"));
            background.setBounds(40, 40, background.getPreferredSize().width, background.getPreferredSize().height);
            this.getContentPane().add(background);
            // 刷新
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // 如果胜利，直接结束
        if (victory()) {
            return;
        }
        // 上下左右
        // 左：37
        // 上：38
        // 右：39
        // 下：40
        int code = e.getKeyCode();
        if (code == 37) {
            System.out.println("向左移动");
            // x，y + 1表示右方
            if (y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();
        } else if (code == 38) {
            System.out.println("向上移动");
            if (x == 3) {
                return;
            }
            // x, y表示空白
            // x + 1，y表示下方
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage();
        } else if (code == 39) {
            System.out.println("向右移动");
            if (y == 0) {
                return;
            }
            // x，y - 1表示左方
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            initImage();
        } else if (code == 40) {
            System.out.println("向下移动");
            if (x == 0) {
                return;
            }
            // x - 1, y表示上方
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            x = 3;
            y = 3;
            initImage();
        }
    }

    // 判断游戏胜利
    public boolean victory() {
        return Arrays.deepEquals(data, win);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取条目对象
        Object obj = e.getSource();
        if (obj == replayItem) {
            System.out.println("重新游戏");
            // 计步器清零
            step = 0;
            // 打乱
            initData();
            // 重新加载
            initImage();
        } else if (obj == reLoginItem) {
            System.out.println("重新登陆");
            // 返回登陆界面
            // 关闭游戏
            this.setVisible(false);
            // 打开登陆
            new LoginJFrame();
        } else if (obj == closeItem) {
            System.out.println("关闭游戏");
            // 关闭虚拟机
            System.exit(0);
        } else if (obj == accountItem) {
            System.out.println("公众号");
            // 创建弹窗
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("puzzlegame/image/about.png"));
            // 设置位置和宽高
            jLabel.setBounds(0, 0, 258, 258);
            // 添加到弹窗
            jDialog.getContentPane().add(jLabel);
            // 设置弹窗大小
            jDialog.setSize(344, 344);
            // 置顶
            jDialog.setAlwaysOnTop(true);
            // 居中
            jDialog.setLocationRelativeTo(null);
            // 弹窗不关闭
            jDialog.setModal(true);
            // 显示
            jDialog.setVisible(true);
        }

    }
}
