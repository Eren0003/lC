package org.example.button;

import javax.swing.*;

public class ButtonFrame extends JFrame {

    ButtonFrame(){
        this.add(new ButtonPanel());
        this.setTitle("Touch");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
