import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class computerPlayer {
    private JFrame f = new JFrame("Computer mode");

    public computerPlayer() {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = (JPanel)f.getContentPane();
        panel.setLayout(new GridLayout(3,3,4,3));

        
        JButton b1 = new JButton("F");
        JButton b2 = new JButton("F");
        JButton b3 = new JButton("F");
        JButton b4 = new JButton("F");
        JButton b5 = new JButton("F");
        JButton b6 = new JButton("F");
        JButton b7 = new JButton("F");
        JButton b8 = new JButton("F");
        JButton b9 = new JButton("F");

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);

        b1.setPreferredSize(new Dimension(100,100));

        f.setSize(500,500);
        f.getContentPane().setBackground(Color.BLACK);
        
        f.setVisible(true);

    }
}