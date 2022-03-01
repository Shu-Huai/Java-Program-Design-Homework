package shuhuai.javahomework.listen;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class WindowInput extends JFrame implements ActionListener {
    JTextArea showResult;
    JButton openInput;

    WindowInput() {
        openInput = new JButton("打开对话框");
        showResult = new JTextArea();
        add(openInput, BorderLayout.NORTH);
        add(new JScrollPane(showResult), BorderLayout.CENTER);
        openInput.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String str = JOptionPane.showInputDialog(this, "输入相关信息到主窗口", "输入对话框",
                JOptionPane.INFORMATION_MESSAGE);
        if (str != null) {
            showResult.append(str + ", ");
        }
    }
}