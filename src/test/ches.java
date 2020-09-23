package test;

import javax.swing.*;
import java.awt.*;

public class ches extends JPanel {
    public void paint(Graphics g){
        for (int i =20;i<220;i+=20){
                g.setColor(Color.blue);
                g.drawLine(i, 20, i, 200);
                g.drawLine(20, i, 200, i);
        }
    }
    public static void main(String[] args) {
        JFrame a = new JFrame("Шахматы");
        a.setSize(240,260);
        ches b = new ches();
        a.add(b);
        a.setVisible(true);
    }
}
