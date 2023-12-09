package org.example.growing;

import javax.swing.*;
import java.awt.*;


public class GrowingFrame extends JFrame{
    JLabel label ;
    public GrowingFrame(){
        add(new GrowingPanel());
        setTitle("Growing Circle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setBackground(Color.WHITE );
    }


    public static void main(String[] args) {
        new GrowingFrame();
    }
}
