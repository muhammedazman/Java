package com.muhammedazman;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;

public class MyWindow extends Frame {

    public MyWindow(String title) throws HeadlessException {
        super(title);
        setSize(500, 300);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Font sansSerif = new Font("sans-serif", Font.BOLD, 18);
        g.setFont(sansSerif);
        g.drawString("JAVA DERSLERI", 100, 150);

        Font sansSerifKucuk = new Font("sans-serif", Font.BOLD, 12);
        g.setFont(sansSerifKucuk);
        g.drawString("by Muhammed Azman", 100, 120);

    }
}
