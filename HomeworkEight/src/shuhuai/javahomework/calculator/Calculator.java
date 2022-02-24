package shuhuai.javahomework.calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    double inputNumberOne;
    double inputNumberTwo;
    double result;
    int operator = -1;
    StringBuilder sBuilder = new StringBuilder();

    public Calculator() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    void init() {
        JPanel panel = new JPanel();
        setBounds(100, 100, 800, 450);
        String[] str = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "C", "="};
        panel.setLayout(new GridLayout(4, 4));
        JButton[] buttons = new JButton[str.length];
        for (int i = 0; i < str.length; i++) {
            buttons[i] = new JButton(str[i]);
            panel.add(buttons[i]);
        }
        JTextField text = new JTextField("0");
        text.setHorizontalAlignment(JTextField.LEFT);
        add(text, "North");
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttons[0].addActionListener(e -> {
            sBuilder.append("0");
            text.setText(sBuilder.toString());
        });
        buttons[1].addActionListener(e -> {
            sBuilder.append("1");
            text.setText(sBuilder.toString());
        });
        buttons[2].addActionListener(e -> {
            sBuilder.append("2");
            text.setText(sBuilder.toString());
        });
        buttons[3].addActionListener(e -> {
            sBuilder.append("3");
            text.setText(sBuilder.toString());
        });
        buttons[4].addActionListener(e -> {
            sBuilder.append("4");
            text.setText(sBuilder.toString());
        });
        buttons[5].addActionListener(e -> {
            sBuilder.append("5");
            text.setText(sBuilder.toString());
        });
        buttons[6].addActionListener(e -> {
            sBuilder.append("6");
            text.setText(sBuilder.toString());
        });
        buttons[7].addActionListener(e -> {
            sBuilder.append("7");
            text.setText(sBuilder.toString());
        });
        buttons[8].addActionListener(e -> {
            sBuilder.append("8");
            text.setText(sBuilder.toString());
        });
        buttons[9].addActionListener(e -> {
            sBuilder.append("9");
            text.setText(sBuilder.toString());
        });
        buttons[10].addActionListener(e -> {
            inputNumberOne = Double.parseDouble(sBuilder.toString());
            sBuilder = new StringBuilder();
            if (operator != -1) {
                text.setText("输入符号不符合要求");
            } else {
                text.setText("+");
                operator = 0;
            }
        });
        buttons[11].addActionListener(e -> {
            inputNumberOne = Double.parseDouble(sBuilder.toString());
            sBuilder = new StringBuilder();
            if (operator != -1) {
                text.setText("输入符号不符合要求");
            } else {
                text.setText("-");
                operator = 1;
            }
        });
        buttons[12].addActionListener(e -> {
            inputNumberOne = Double.parseDouble(sBuilder.toString());
            sBuilder = new StringBuilder();
            if (operator != -1) {
                text.setText("输入符号不符合要求");
            } else {
                text.setText("*");
                operator = 2;
            }
        });
        buttons[13].addActionListener(e -> {
            inputNumberOne = Double.parseDouble(sBuilder.toString());
            sBuilder = new StringBuilder();
            if (operator != -1) {
                text.setText("输入符号不符合要求");
            } else {
                text.setText("/");
                operator = 3;
            }
        });
        buttons[14].addActionListener(e -> {
            sBuilder = new StringBuilder();
            text.setText("0");
        });
        buttons[15].addActionListener(e -> {
            if (!"".equals(sBuilder.toString())) {
                inputNumberTwo = Double.parseDouble(sBuilder.toString());
                sBuilder.append("=");
                text.setText(sBuilder.toString());
                if (operator == 0) {
                    result = inputNumberOne + inputNumberTwo;
                    text.setText(String.valueOf(result));
                    sBuilder = new StringBuilder();
                    sBuilder.append(result);
                } else if (operator == 1) {
                    result = inputNumberOne - inputNumberTwo;
                    text.setText(String.valueOf(result));
                    sBuilder = new StringBuilder();
                    sBuilder.append(result);
                } else if (operator == 2) {
                    result = inputNumberOne * inputNumberTwo;
                    text.setText(String.valueOf(result));
                    sBuilder = new StringBuilder();
                    sBuilder.append(result);
                } else if (operator == 3) {
                    if (inputNumberTwo == 0) {
                        sBuilder = new StringBuilder();
                        text.setText("被除数不可为0");
                    } else {
                        result = inputNumberOne / inputNumberTwo;
                        text.setText(String.valueOf(result));
                        sBuilder = new StringBuilder();
                        sBuilder.append(result);
                    }
                } else {
                    sBuilder = new StringBuilder();
                    text.setText("输入符号不符合要求");
                }
                operator = -1;
            }
        });
    }
}