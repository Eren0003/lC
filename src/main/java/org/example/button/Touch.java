package org.example.button;

import javax.swing.*;

public class Touch {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
            new ButtonFrame();
        });
    }
}
