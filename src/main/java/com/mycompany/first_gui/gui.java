package com.mycompany.first_gui;


//the * to empliment all imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Akram
 */
//public class gui extends JFrame {//(for itemlistener)//implements ItemListener {
////////////Practice:
//    //JPanel n = new JPanel();
//    JButton b1 = new JButton("save");
//    JButton b2 = new JButton("show");
//    JButton b3 = new JButton("save");
//    JButton b4 = new JButton("show");
//    JButton b5 = new JButton("save");
//    //JTextField t1 = new JTextField();
//
//    public gui() {
////        setTitle("akram");
////        setSize(500, 300);
////        setVisible(true);
////        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        setResizable(false);
//        showm();
//    }
//
//    public void showm() {
////        setTitle("akram");
////        setSize(500, 300);
////        setVisible(true);
////        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        setResizable(false);
////        setLocation(100, 100);
////        //this.setLayout(new FlowLayout(FlowLayout.CENTER,10,30));
////        //this.setLayout(new GridLayout(2,3,10,40));
////        //this.setLayout(new BorderLayout(10,35));
////
////        // setLayout(new FlowLayout());
////        //this.add(n);
////        //n.setBackground(Color.LIGHT_GRAY);
//////        this.add(b1,BorderLayout.EAST);
//////        this.add(b2,BorderLayout.CENTER);
//////        this.add(b3,BorderLayout.WEST);
//////        this.add(b4,BorderLayout.NORTH);
//////        this.add(b5,BorderLayout.SOUTH);
////        //this.add(t1);
////        setLayout(null);
////        b1.setBounds(50, 50, 100, 50);
////        this.add(b1);
////        b2.setBounds(310, 50, 100, 50);
////        this.add(b2);
//}
//JButton b1=new JButton("SAVE");
//    JButton b1, b2;
//    //JTextField t1;
//JPasswordField t1;
//    public gui() {
//        b1 = new JButton("SAVE");
//        b2 = new JButton("SHOW");
//        //t1 = new JTextField();
//        t1 = new JPasswordField();
//        this.setTitle("Akram");
//        this.setSize(500, 200);
//        this.setVisible(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(null);
//        this.setLocation(500, 300);
//        this.setResizable(false);
//        b1.setBounds(40,20,120,50);
//        b2.setBounds(340,20,120,50);
//        this.add(b1);
//        this.add(b2);
//        b1.setBackground(Color.blue);
//        b2.setBackground(Color.red);
//        t1.setBounds(170, 100, 150, 25);
//        this.add(t1);
//        b2.setBackground(Color.yellow);
//    }
////////////////
//////////Calculator:
//    
//    JPanel p1 = new JPanel();
//    JPanel p2 = new JPanel();
//    JTextField t1 = new JTextField();
//    JButton b1 = new JButton(" 1 ");
//    JButton b2 = new JButton(" 2 ");
//    JButton b3 = new JButton(" 3 ");
//    JButton b4 = new JButton(" 4 ");
//    JButton b5 = new JButton(" 5 ");
//    JButton b6 = new JButton(" 6 ");
//    JButton b7 = new JButton(" 7 ");
//    JButton b8 = new JButton(" 8 ");
//    JButton b9 = new JButton(" 9 ");
//    JButton b10 = new JButton(" 10 ");
//    JButton b11 = new JButton(" + ");
//    JButton b12 = new JButton(" = ");
//
//    public gui() {
//        this.setTitle("Caculator");
//        this.setSize(300, 400);
//        this.setVisible(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLocation(500, 200);
//        this.setResizable(false);
//        p1.setBackground(Color.lightGray);
//        p2.setBackground(Color.darkGray);
//        this.setLayout(new GridLayout(2, 1));
//        t1.setBounds(70, 70, 150, 30);
//        p1.setLayout(null);
//        this.add(p1);
//        this.add(p2);
//        p2.setLayout(new GridLayout(3, 4, 2, 2));
//        b1.setBackground(Color.CYAN);
//        b2.setForeground(Color.BLUE);
//        b3.setBackground(Color.CYAN);
//        b4.setForeground(Color.BLUE);
//        b5.setBackground(Color.CYAN);
//        b6.setForeground(Color.BLUE);
//        b7.setBackground(Color.CYAN);
//        b8.setForeground(Color.BLUE);
//        b9.setBackground(Color.CYAN);
//        b10.setForeground(Color.BLUE);
//        b11.setBackground(Color.CYAN);
//        b12.setForeground(Color.BLUE);
//        b2.setBackground(Color.CYAN);
//        b1.setForeground(Color.BLUE);
//        b4.setBackground(Color.CYAN);
//        b3.setForeground(Color.BLUE);
//        b6.setBackground(Color.CYAN);
//        b5.setForeground(Color.BLUE);
//        b8.setBackground(Color.CYAN);
//        b7.setForeground(Color.BLUE);
//        b10.setBackground(Color.CYAN);
//        b9.setForeground(Color.BLUE);
//        b12.setBackground(Color.CYAN);
//        b11.setForeground(Color.BLUE);
//        p1.add(t1);
//        p2.add(b1);
//        p2.add(b2);
//        p2.add(b3);
//        p2.add(b4);
//        p2.add(b5);
//        p2.add(b6);
//        p2.add(b7);
//        p2.add(b8);
//        p2.add(b9);
//        p2.add(b10);
//        p2.add(b11);
//        p2.add(b12);
//    }
////////////////////
//    //////////Login page Practice:
//    // JPanel p1,p2,p3;
//    JButton n1 = new JButton("menu 1");
//    JButton n2 = new JButton("menu 2");
//    JButton n3 = new JButton("menu 3");
//    JButton n4 = new JButton("menu 4");
//    JButton n11 = new JButton("menu 1");
//    JButton n12 = new JButton("menu 2");
//    JButton n13 = new JButton("menu 3");
//    JButton n14 = new JButton("menu 4");
//    JLabel bn1 = new JLabel("menu 1");
//    JLabel bn2 = new JLabel("menu 3");
//    JLabel bn3 = new JLabel("menu 2");
//    JLabel bn4 = new JLabel("menu 4");
//    JButton b1, b2;
//    JTextField t1;
//    JPasswordField t2;
//    JLabel l1, l2, l3, l4, l5;
//    JRadioButton r1 = new JRadioButton("male");
//    JRadioButton r2 = new JRadioButton("female");
//    JRadioButton r3 = new JRadioButton("s");
//    JRadioButton r4 = new JRadioButton("m");
//    ButtonGroup g1 = new ButtonGroup();
//    ButtonGroup g2 = new ButtonGroup();
//    ButtonGroup g3 = new ButtonGroup();
//    JCheckBox c1 = new JCheckBox("cg");
//    JCheckBox c2 = new JCheckBox("ca");
//    JCheckBox c3 = new JCheckBox("db");
//    JMenu m1 = new JMenu("file");
//    JMenu m2 = new JMenu("edit");
//    JMenu m3 = new JMenu("help");
//    JMenuBar bb1 = new JMenuBar();
//
//    public gui() {
//        this.setTitle("main form");
//        this.setVisible(true);
//        this.setSize(500, 700);
//        this.setLocation(200, 50);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setResizable(false);
////        p1=new JPanel();
////        p2=new JPanel();
////        p3=new JPanel();
//        b1 = new JButton("save");
//        b2 = new JButton("show");
//        t1 = new JTextField();
//        t2 = new JPasswordField();
//        l1 = new JLabel("full name");
//        l2 = new JLabel("password");
//        l3 = new JLabel("gender");
//        l4 = new JLabel("status");
//        l5 = new JLabel("material");
//
////        p1.setBackground(Color.LIGHT_GRAY);
////        p2.setBackground(Color.GRAY);
////        p3.setBackground(Color.DARK_GRAY);
////        this.add(p1);
////        this.add(p2);
////        this.add(p3);
//        //this.setLayout(new GridLayout(3,1));
//        this.setLayout(null);
//        l1.setBounds(10, 50, 100, 25);
//        l2.setBounds(10, 90, 100, 25);
//        l3.setBounds(10, 200, 90, 25);
//        l4.setBounds(10, 250, 90, 25);
//        l5.setBounds(10, 300, 90, 25);
//        t1.setBounds(220, 50, 150, 25);
//        t2.setBounds(220, 90, 150, 25);
//        b1.setBounds(100, 130, 75, 25);
//        b2.setBounds(250, 130, 75, 25);
//        r1.setBounds(70, 200, 100, 25);
//        r2.setBounds(170, 200, 100, 25);
//        r3.setBounds(70, 250, 100, 25);
//        r4.setBounds(170, 250, 100, 25);
//        c1.setBounds(90, 300, 70, 25);
//        c2.setBounds(160, 300, 70, 25);
//        c3.setBounds(230, 300, 70, 25);
//        bb1.setBounds(0,0,500,30);
//        n1.setBackground(Color.red);n1.setForeground(Color.WHITE);
//
//        m1.add(n1);
//        m1.add(n2);
//        m1.add(n3);
//        m1.add(n4);
//        m2.add(n11);
//        m2.add(n12);
//        m2.add(n13);
//        m2.add(n14);
//        m3.add(bn1);
//        m3.add(bn2);
//        m3.add(bn3);
//        m3.add(bn4);
//        bb1.add(m1);
//        bb1.add(m2);
//        bb1.add(m3);
//        this.add(bb1);
//        this.add(l1);
//        this.add(l2);
//        this.add(l3);
//        this.add(l4);
//        this.add(l5);
//        this.add(t1);
//        this.add(t2);
//        this.add(b1);
//        this.add(b2);
//        this.add(r1);
//        this.add(r2);
//        this.add(r3);
//        this.add(r4);
//        g1.add(r1);
//        g1.add(r2);
//        g2.add(r3);
//        g2.add(r4);
//        this.add(c1);
//        this.add(c2);
//        this.add(c3);
//        g3.add(c1);
//        g3.add(c2);
//        g3.add(c3);
//
//    }
/////////////////
//    //Practice Action Events and Listener
//    //variables
//    int x = 30, y = 15;
//    JButton b1, b2, b3, b4, b5, b6;
//    JLabel l1, l2, l3;
//    JTextField t1;
//    JPasswordField t2;
//    JTextField t3;
//    JPanel p1, p2, p3;
//    JRadioButton r1, r2, r3;
//    JCheckBox c1, c2, c3;
//    ButtonGroup g1, g2;
//    acln al = new acln();
//    //end var
//
//    public gui() {
//        this.setTitle("event");
//        this.setVisible(true);
//        this.setSize(300, 700);
//        this.setLocation(500, 30);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setResizable(false);
//
//        //initilize
//        p1 = new JPanel();
//        p2 = new JPanel();
//        p3 = new JPanel();
//        b1 = new JButton("save");
//        b2 = new JButton("show");
//        b3 = new JButton("r");
//        b4 = new JButton("l");
//        b5 = new JButton("min");
//        b6 = new JButton("max");
//        l1 = new JLabel("full name");
//        l2 = new JLabel("pw");
//        l3 = new JLabel();
//        t1 = new JTextField();
//        t2 = new JPasswordField();
//        t3 = new JTextField();
//        g1 = new ButtonGroup();
//        g2 = new ButtonGroup();
//        r1 = new JRadioButton("red");
//        r2 = new JRadioButton("blue");
//        r3 = new JRadioButton("yellow");
//        c1 = new JCheckBox("-18");
//        c2 = new JCheckBox("18");
//        c3 = new JCheckBox("+18");
//        //end inititize
//        p1.setBackground(Color.LIGHT_GRAY);
//        p2.setBackground(Color.gray);
//        p3.setBackground(Color.DARK_GRAY);
//        this.add(p1);
//        this.add(p2);
//        this.add(p3);
//
//        this.setLayout(new GridLayout(3, 1));
////        p1.setSize(500, 200);
////        p2.setSize(500, 400);
////        p3.setSize(500, 600);
//        p1.setLayout(null);
//        p2.setLayout(null);
//        p3.setLayout(null);
//        l1.setBounds(30, 10, 100, 25);
//        p1.add(l1);
//        p1.setLayout(null);
//        l2.setBounds(30, 50, 100, 25);
//        p1.add(l2);
//        t1.setBounds(120, 10, 150, 25);
//        p1.add(t1);
//        t2.setBounds(120, 50, 150, 25);
//        p1.add(t2);
//        b1.setBounds(50, 120, 75, 25);
//        p1.add(b1);
//        b2.setBounds(150, 120, 75, 25);
//        p1.add(b2);
//        b1.setBackground(Color.CYAN);
//        b1.setForeground(Color.white);
//        b2.setBackground(Color.cyan);
//        b2.setForeground(Color.white);
//        t3.setBounds(30, 30, 220, 25);
//        p2.add(t3);
//        r1.setBounds(10, 70, 70, 25);
//        r2.setBounds(100, 70, 70, 25);
//        r3.setBounds(190, 70, 70, 25);
//        p2.add(r1);
//        p2.add(r2);
//        p2.add(r3);
//        g1.add(r1);
//        g1.add(r2);
//        g1.add(r3);
//        l3.setBounds(x, 50, 220, 25);
//        p3.add(l3);
//        l3.setFont(new Font("atilic", Font.BOLD, y));
//        c1.setBounds(30, 10, 45, 25);
//        p3.add(c1);
//        c2.setBounds(120, 10, 45, 25);
//        p3.add(c2);
//        c3.setBounds(210, 10, 45, 25);
//        p3.add(c3);
//        g2.add(c1);
//        g2.add(c2);
//        g2.add(c3);
//        b3.setBounds(10, 100, 40, 25);
//        p3.add(b3);
//        b3.setBackground(Color.blue);
//        b3.setForeground(Color.yellow);
//        b4.setBounds(70, 100, 40, 25);
//        p3.add(b4);
//        b4.setBackground(Color.blue);
//        b4.setForeground(Color.yellow);
//        b5.setBounds(120, 100, 70, 25);
//        p3.add(b5);
//        b5.setBackground(Color.blue);
//        b5.setForeground(Color.yellow);
//        b6.setBounds(200, 100, 70, 25);
//        p3.add(b6);
//        b6.setBackground(Color.blue);
//        b6.setForeground(Color.yellow);
//
//        b1.addActionListener(al);
//        b2.addActionListener(al);
//        b3.addActionListener(al);
//        b4.addActionListener(al);
//        b5.addActionListener(al);
//        b6.addActionListener(al);
//        r1.addActionListener(al);
//        r2.addActionListener(al);
//        r3.addActionListener(al);
//        c1.addItemListener(this);
//        c2.addItemListener(this);
//        c3.addItemListener(this);
//
//    }
//
//    @Override
//    public void itemStateChanged(ItemEvent e) {
//        if (c1.isSelected()) {
//            l3.setFont(new Font("atilic", Font.BOLD+Font.PLAIN, y));
//        }
//        else if(c2.isSelected()){
//        l3.setFont(new Font("atilic", Font.ROMAN_BASELINE, y));
//        } 
//        else if(c3.isSelected()){
//        l3.setFont(new Font("atilic", Font.HANGING_BASELINE, y));
//        }
//    }
//
//    private class acln implements ActionListener {
//
//        @Override
//
//        public void actionPerformed(ActionEvent e) {
//            String ss1, ss2;
//            if (e.getSource() == b1) {
//                ss1 = t1.getText().toString();
//                ss2 = t2.getText().toString();
//                System.out.println("First Name: " + ss1 + " , Password: " + ss2);
//
//            }
//            if (e.getSource() == b2) {
//
//                ss1 = t1.getText().toString();
//                ss2 = t2.getText().toString();
//                t3.setText("First Name: " + ss1 + " , Password: " + ss2);
//                l3.setText("Welcome " + ss1);
//                //للمسح بعد الكبس
//                t1.setText("");
//                t2.setText("");
//            }
//            if (e.getSource() == r1) {
//                p1.setBackground(Color.blue);
//                p2.setBackground(Color.red);
//                t3.setForeground(Color.red);
//                l3.setForeground(Color.red);
//            }
//            if (e.getSource() == r2) {
//                p1.setBackground(Color.red);
//                p2.setBackground(Color.blue);
//                t3.setForeground(Color.blue);
//                l3.setForeground(Color.blue);
//            }
//            if (e.getSource() == r3) {
//                p1.setBackground(Color.green);
//                p2.setBackground(Color.yellow);
//                t3.setForeground(Color.yellow);
//                l3.setForeground(Color.yellow);
//            }
//            if (e.getSource() == b3) {
//                x += 5;
//                l3.setBounds(x, 50, 220, 25);
//            }
//            if (e.getSource() == b4) {
//                x -= 5;
//                l3.setBounds(x, 50, 220, 25);
//            }
//            if (e.getSource() == b5) {
//                y -= 2;
//                l3.setFont(new Font("atilic", Font.BOLD, y));
//            }
//            if (e.getSource() == b6) {
//                y += 2;
//                l3.setFont(new Font("atilic", Font.BOLD, y));
//            }
//        }
//    }
////////////////////////
/*    //mouse event
    JPanel p1, p2;
    JLabel l1, l2;
    mouse m = new mouse();

    public gui() {
        this.setTitle("mouse event");
        this.setVisible(true);
        this.setSize(300, 500);
        this.setLocation(100, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        //////////////
        p1 = new JPanel();
        p2 = new JPanel();
        l1 = new JLabel("hi");
        l2 = new JLabel("bye");
        p1.setBackground(Color.red);
        p2.setBackground(Color.blue);
        this.add(p1);
        this.add(p2);
        l1.setBounds(100, 30, 100, 25);
        l2.setBounds(100, 30, 100, 25);
        l1.setForeground(Color.blue);
        l2.setForeground(Color.red);
        this.setLayout(new GridLayout(2, 1));
        p1.setLayout(null);
        p2.setLayout(null);
        p1.add(l1);
        p2.add(l2);
//        p1.addMouseListener(m);
//        p2.addMouseListener(m);
//        p1.addMouseMotionListener(m);
//        p1.addMouseMotionListener(m);
//        p2.addMouseWheelListener(m);
//        p2.addMouseWheelListener(m);
        this.addMouseListener(m);
        this.addMouseWheelListener(m);
        this.addMouseMotionListener(m);

        //هنالك عدة طرق هنا
        //way 1
        p1.addMouseMotionListener(new MouseMotionAdapter() {

            @Override
            public void mouseMoved(MouseEvent e) {
                l2.setForeground(Color.black);
            }
        });
    }

    class b implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseExited(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }

    //way 2
    private class mouse implements MouseListener, MouseWheelListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            p2.setBackground(Color.MAGENTA);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if (e.isAltDown()) {
                l1.setText("done");
            }
            if (e.isShiftDown()) {
                l2.setText("okayyy");
            }

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            l1.setText("mouse entered");
            p1.setBackground(Color.GRAY);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            l1.setText("mouse exited");
            p1.setBackground(Color.red);
        }

        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }

        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            l2.setText(e.getX() + " " + e.getY());
        }

    }
 */
///////////////////
//Drawing In Java and Graphics
public class gui extends JFrame {

    gc c = new gc();

    public gui() {

        this.setTitle("akram.darwich");
        this.setSize(500, 600);
        this.setLocation(400, 60);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        c.setBackground(Color.black);
        this.add(c);
    }
}
