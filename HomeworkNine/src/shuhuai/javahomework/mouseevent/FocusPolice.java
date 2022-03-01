package shuhuai.javahomework.mouseevent;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextArea;

public class FocusPolice implements FocusListener {
    JTextArea area;

    public void setJTextArea(JTextArea area) {
        this.area = area;
    }

    @Override
    public void focusGained(FocusEvent e) {
        area.append("\n文本框获得焦点,ID:" + "(" + e.getID() + ")");
    }

    @Override
    public void focusLost(FocusEvent e) {
        area.append("\n文本框失去焦点,ID:" + "(" + e.getID() + ")");
    }
}