package shuhuai.javahomework.mouseevent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MotionPolice implements MouseMotionListener {
    JTextArea area;

    public void setJTextArea(JTextArea area) {
        this.area = area;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() instanceof JButton)
            area.append("\n鼠标在按纽拖动,位置:" + "(" + e.getX() + "," + e.getY() + ")");
        if (e.getSource() instanceof JTextField)
            area.append("\n鼠标在文本框拖动,位置:" + "(" + e.getX() + "," + e.getY() + ")");
        if (e.getSource() instanceof JFrame)
            area.append("\n鼠标在窗口拖动,位置:" + "(" + e.getX() + "," + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() instanceof JButton)
            area.append("\n鼠标在按纽移动,位置:" + "(" + e.getX() + "," + e.getY() + ")");
        if (e.getSource() instanceof JTextField)
            area.append("\n鼠标在文本框移动,位置:" + "(" + e.getX() + "," + e.getY() + ")");
        if (e.getSource() instanceof JFrame)
            area.append("\n鼠标在窗口移动,位置:" + "(" + e.getX() + "," + e.getY() + ")");
    }
}