package org.example.button;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ButtonPanel extends JPanel  {
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 20;
    static final int BUTTON_UNIT = (SCREEN_HEIGHT*SCREEN_WIDTH)/UNIT_SIZE;
    static final int CENTER = BUTTON_UNIT;
    static final int DELAY = 1000;
    static final int GROWTH_RATE = 5;
    static final int MAX_RADIUS = SCREEN_HEIGHT/2;
    Timer timer ;
    Random random;
    int radius;
    ButtonPanel(){
        Border border = BorderFactory.createLineBorder(Color.black);
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.setBorder(border);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        int centerX = getWidth()/2;
        int centerY = getHeight()/2;
        radius = UNIT_SIZE;
        int diameter =  radius * 2;
        int x = centerX - radius;
        int y = centerY - radius;
        g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
        g.fillOval(x,y,diameter,diameter);
        growCircle();
    }
    public void growCircle() {
        while (radius <= MAX_RADIUS) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            radius += GROWTH_RATE;
            repaint();
        }
    }
}
