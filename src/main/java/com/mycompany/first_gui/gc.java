/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first_gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Akram
 */
//drawing
public class gc extends JPanel implements ActionListener, KeyListener {

    JButton b = new JButton("Set BG");
    Timer tt = new Timer(10, this);
    int b1 = 0, b2 = 0, bb1 = 5, bb2 = 5, n1 = 235, n2 = 300;

    public gc() {
        this.add(b);
        b.addActionListener(this);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        g.setColor(Color.white);
//        g.draw3DRect(10, 10, 100, 200, true);
//        g.setColor(Color.green);
//        g.fill3DRect(120, 10, 100, 200, true);
//        g.setColor(Color.red);
//        g.drawLine(10, 10, 100, 100);
//
//        //in line there is x1,x2,y1,y2;
//        //in any other form there is x,y,w,h;
//        
////        g.draw3DRect(200, 300, 300, 100, true);
////        g.setColor(Color.yellow);
////        g.drawLine(200, 300, 300, 100);
//        g.drawOval(100, 250, 50, 50);
//        g.fillOval(150, 250, 50, 50);
//        g.drawLine(50, 0, 50, this.getHeight());
//        g.drawLine(0, 50, this.getWidth(), 50);
//        g.drawLine(100, 0, 100, this.getHeight());
//        g.drawLine(0, 100, this.getWidth(), 100);

//////Draw , Fill and For Loop
//        for (int i = 50; i <= getHeight(); i += 50) {
//            g.drawLine(i, 0, i, this.getHeight());
//            g.drawLine(0, i, this.getWidth(), i);
//        }
//        g.setColor(Color.red);
////        g.drawLine(0, 0, this.getWidth(), 20);
////        g.drawLine(0, 0, this.getWidth(), 30);
////        g.drawLine(0, 0, this.getWidth(), 40);
//        for (int x = 10; x <= this.getHeight(); x += 5) {
////للتدريج
////            int y = 255;
////            y -= 50;
////            Color v = new Color(y, 0, 0);
//            g.setColor(Color.red);
//            g.drawLine(0, 0, this.getWidth(), x);
//        }
//        g.setColor(Color.green);
//        for (int x = 10; x <= this.getWidth(); x += 5) {
//            g.drawLine(0, 0, x, this.getHeight());
//        }
///
//practice Finish Drawing In Java and Graphics
        tt.start();
        g.setColor(Color.red);
        g.draw3DRect(150, 100, 200, 300, true);
        g.setColor(Color.white);
        g.fill3DRect(200, 150, 30, 50, true);
        g.fill3DRect(270, 150, 30, 50, true);
        g.fill3DRect(200, 250, 30, 50, true);
        g.fill3DRect(270, 250, 30, 50, true);
        g.setColor(Color.lightGray);
        g.fill3DRect(235, 350, 30, 50, true);
        g.fillOval(b1, b2, 50, 50);
        //Key Listener and Keyboard Event
        g.setColor(Color.blue);
        g.fillOval(n1, n2, 100, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //b1 += 5;
        //b2 += 5;
        if (e.getSource() == b) {
            JColorChooser c = new JColorChooser();
            Color vv = c.showDialog(null, "", Color.blue);
            this.setBackground(vv);
        }
        if (b1 < 0 || b1 > this.getWidth() + 50) {
            bb1 = -bb1;
        } else if (b2 < 0 || b2 > this.getHeight() + 50) {
            bb2 = -bb2;
        }
        b1 += bb1;
        b2 += bb2;
        repaint();

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int k = e.getKeyCode();
        switch (k) {
            case KeyEvent.VK_UP:
                n2 -= 5;
                break;
            case KeyEvent.VK_DOWN:
                n2 += 5;
                break;
            case KeyEvent.VK_RIGHT:
                n1 += 5;
                break;
            case KeyEvent.VK_LEFT:
                n1 -= 5;
                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
