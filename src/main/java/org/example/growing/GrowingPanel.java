package org.example.growing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class GrowingPanel extends JPanel implements MouseListener {
    public GrowingPanel(){
        setPreferredSize(new Dimension(600,600));
        setBackground(Color.black);
        setFocusable(true);
    }
    private int radius = 1;
    Random random;
    private final int maxRadius = 300;
    private final int growthRate = 1;

    public void paintComponent(Graphics g){
        super.paintComponents(g);
        draw(g);
    }

    public void draw (Graphics g) {
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int diameter = radius * 2;
        int x = centerX - radius ;
        int y = centerY - radius ;
        random = new Random();
            g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
//        g.setColor(Color.black);
            g.drawOval(x, y, diameter, diameter);
            radius += growthRate;
            System.out.println(radius);
        try {
            Thread.sleep(20);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        if(!(radius > maxRadius)) {
            repaint();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
