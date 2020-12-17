package com.arronlong.httpclientutil.test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Jframe extends JFrame implements ActionListener {
//    JFrame jf;
//    JPanel jp;
//    JButton jb;
//    public Jframe(){
//        jf=new JFrame();
//        jp=new JPanel();
//        jb=new JButton("点击我");
//        jb.addActionListener(new ActionListener() {ActionListener
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // TODO Auto-generated method stub
//                JOptionPane.showMessageDialog(null, "ABCDEFG");
//            }
//        });
//        jp.add(jb);
//        jf.add(jp);
//        jf.setBounds(50,50,300,300);
//        jf.setVisible(true);
//    }
    JFrame jf;
    JTextField result;
    JPanel jp=new JPanel();
    JButton jb;
    JPanel operPanel=new JPanel();




    public static double a,b;
    public static char opea=' ';
    public static String op1;
    public void jsq() {
        jp.setLayout(new BorderLayout());
        result = new JTextField();
        result.setBackground(Color.red);
        result.setSize(200, 100);
        result.setEditable(false);
        result.setText(null);
        jp.add(result, BorderLayout.NORTH);
        //左边的panel
        JPanel keyPanel = new JPanel();
        keyPanel.setLayout(new GridLayout(5, 3));
        for (int i = 1; i <= 9; i++) {
            jb = new JButton("" + i);
            jb.addActionListener(this);
            keyPanel.add(jb);

        }
        jb = new JButton("" + 0);
        jb.addActionListener(this);
        keyPanel.add(jb);
        jb = new JButton("清空");
        jb.addActionListener(this);
        keyPanel.add(jb);
        jb = new JButton("退格");
        jb.addActionListener(this);
        keyPanel.add(jb);
        jb = new JButton(".");
        jb.addActionListener(this);
        keyPanel.add(jb);
        jb = new JButton("=");
        jb.addActionListener(this);
        keyPanel.add(jb);
        jp.add(keyPanel, BorderLayout.CENTER);
        //定义操作

        operPanel.setLayout(new GridLayout(4, 1));
        jb = new JButton("+");
        jb.addActionListener(this);
        operPanel.add(jb);
        jb = new JButton("-");
        jb.addActionListener(this);
        operPanel.add(jb);
        jb = new JButton("/");
        jb.addActionListener(this);
        operPanel.add(jb);
        jb = new JButton("*");
        jb.addActionListener(this);
        operPanel.add(jb);

        jb.addActionListener(this);
        jf = new JFrame();
        jf.add(jp);
        jf.add(operPanel, BorderLayout.EAST);
        jf.setBounds(300, 300, 300, 300);
        jf.setVisible(true);
    }


        /**
         * @param args
         */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Jframe();
        //new jsq() ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
