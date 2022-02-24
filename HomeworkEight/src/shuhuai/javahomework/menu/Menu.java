package shuhuai.javahomework.menu;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Menu extends JFrame {
    JMenuBar menuBar;
    JMenu menuFile, menuEdit, menuView, menuHelp, menuForm;
    JMenuItem menuNew, menuOpen, menuClose, menuSave, menuSaveAs, menuExit;

    public Menu(String s, int x, int y, int w, int h) {
        init(s);
        setLocation(x, y);
        setSize(w, h);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    void init(String s) {
        setTitle(s);
        menuBar = new JMenuBar();
        menuFile = new JMenu("文件");
        menuEdit = new JMenu("编辑");
        menuView = new JMenu("视图");
        menuHelp = new JMenu("帮助");
        menuForm = new JMenu("文件格式");
        menuNew = new JMenuItem("新建文件");
        menuOpen = new JMenuItem("打开文件");
        menuClose = new JMenuItem("关闭文件");
        menuSave = new JMenuItem("保存文件");
        menuSaveAs = new JMenuItem("文件另存为");
        menuExit = new JMenuItem("退出");
        menuNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        menuOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        menuClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        menuSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        menuExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuView);
        menuBar.add(menuHelp);
        menuFile.add(menuNew);
        menuFile.add(menuOpen);
        menuFile.add(menuClose);
        menuFile.addSeparator();
        menuFile.add(menuForm);
        menuFile.add(menuSave);
        menuFile.add(menuSaveAs);
        menuFile.addSeparator();
        menuFile.add(menuExit);
        menuForm.add(new JMenuItem("Java文件"));
        menuForm.add(new JMenuItem("Txt文件"));
        menuForm.add(new JMenuItem("只读"));
        menuForm.add(new JMenuItem("可写"));
        setJMenuBar(menuBar);
    }
}