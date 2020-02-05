package com.zetcode;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.EventQueue;

public class AbsoluteLayoutEx extends JFrame {

    public AbsoluteLayoutEx() {

        initUI();
    }

    private void initUI() {

        setLayout(null);
       

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        var width = (int)d.getWidth();
        var height = (int)d.getHeight();
        setTitle("Absolute positioning");
        setSize(width, height);

        var okBtn = new JButton("OK");
        okBtn.setBounds(width/2 - 80, height/2, 80, 25);

        var closeBtn = new JButton("Close");
        closeBtn.setBounds(width/2+80, height/2, 80, 25);
        closeBtn.addActionListener((event) -> System.exit(0));

        add(okBtn);
        add(closeBtn);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            var ex = new AbsoluteLayoutEx();
            ex.setVisible(true);
        });
    }
}
