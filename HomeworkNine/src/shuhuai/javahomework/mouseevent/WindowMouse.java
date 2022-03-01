package shuhuai.javahomework.mouseevent;

import java.awt.*;
import javax.swing.*;

public class WindowMouse extends JFrame {
    JTextField text;
    JButton button;
    JTextArea textArea;
    MousePolice police;
    MotionPolice motionPolice;
    FocusPolice focusPolice;

    WindowMouse() {
        init();
        setBounds(100, 100, 420, 220);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        setLayout(new FlowLayout());
        textArea = new JTextArea(15, 30);
        police = new MousePolice();
        motionPolice = new MotionPolice();
        focusPolice = new FocusPolice();
        police.setJTextArea(textArea);
        motionPolice.setJTextArea(textArea);
        focusPolice.setJTextArea(textArea);
        button = new JButton("按钮");
        button.addMouseListener(police);
        button.addMouseMotionListener(motionPolice);
        text = new JTextField(8);
        text.addMouseListener(police);
        text.addMouseMotionListener(motionPolice);
        text.addFocusListener(focusPolice);
        addMouseListener(police);
        addMouseMotionListener(motionPolice);
        add(button);
        add(text);
        add(new JScrollPane(textArea));
    }
}