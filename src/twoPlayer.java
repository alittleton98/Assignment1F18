import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;

public class twoPlayer extends JFrame implements ActionListener{
   // private JFrame f = new JFrame("Two player mode");
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private JLabel playerLabel;
    private String playerTurn = "x";

    String imageX = "src/redX.jpg";
    String imageO = "src/blueO";

    Boolean b1Check = false;
    Boolean b2Check = false;
    Boolean b3Check = false;
    Boolean b4Check = false;
    Boolean b5Check = false;
    Boolean b6Check = false;
    Boolean b7Check = false;
    Boolean b8Check = false;
    Boolean b9Check = false;

    public twoPlayer() {

        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();

        playerLabel = new JLabel();
        playerLabel.setForeground(Color.RED);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(playerLabel);

        b1.setPreferredSize(new Dimension(100,100));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,3,3,3));
        setSize(500,500);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1){
            if(b1Check == false){
                buttonPressed(b1);
                getButtonImage(b1);
                b1Check = true;
            } else {
                buttonAlreadyPressed();
            }

        }
        if(ae.getSource() == b2){
            if(b2Check == false){
                buttonPressed(b2);
                b2Check = true;
            } else {
                buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b3){
            if(b3Check == false){
                buttonPressed(b3);
                b3Check = true;
            } else {
                buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b4){
            if(b4Check == false){
                buttonPressed(b4);
                b4Check = true;
            } else {
                buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b5){
            if(b5Check == false){
                buttonPressed(b5);
                b5Check = true;
            } else {
                buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b6){
            if(b6Check == false){
                buttonPressed(b6);
                b6Check = true;
            } else {
                buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b7){
            if(b7Check == false){
                buttonPressed(b7);
                b7Check = true;
            } else {
                buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b8){
            if(b8Check == false){
                buttonPressed(b8);
                b8Check = true;
            } else {
                buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b9){
            if(b9Check == false){
                buttonPressed(b9);
                b9Check = true;
            } else {
                buttonAlreadyPressed();
            }
        }            
    }
    public void buttonPressed(JButton button){
        if(playerTurn.equals("x")) {
            changeXImage(button);
            playerTurn = "o";
            playerLabel.setText("player o's turn");

            JOptionPane.showMessageDialog(null, "player o's turn");

        } else if(playerTurn.equals("o")){
            changeOImage(button);
            playerTurn = "x";
           playerLabel.setText("player x's turn");

           JOptionPane.showMessageDialog(null, "player x's turn");

        }
    }
    public void changeOImage(JButton b){
        try{
            java.net.URL imgURL = getClass().getResource("/images/blue.jpg");
            ImageIcon icon = new ImageIcon(imgURL);
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(100,100, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImg);
            b.setIcon(icon);
            b.setBorder(BorderFactory.createEmptyBorder());
        } catch(Exception e) {
            e.printStackTrace();
        
        }

    }
    public void changeXImage(JButton b){
        // try {
        //     b.setIcon(new ImageIcon(ImageIO.read(Thread.currentThread().getContextClassLoader().getResourceAsStream("redX.jpg"))));
        // } catch(IOException e){
        //       e.printStackTrace();
        // }
        try{
            java.net.URL imgURL = getClass().getResource("/images/redX.jpg");
            ImageIcon icon = new ImageIcon(imgURL);
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(100,100, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImg);
            b.setIcon(icon);
            b.setBorder(BorderFactory.createEmptyBorder());
        } catch(Exception e) {
            e.printStackTrace();
        
        }

    }
    public void getButtonImage(JButton button){
        System.out.println(button.getIcon());
    }
    public void buttonAlreadyPressed(){
        //playerLabel.setText("This button has already been pressed");
        JOptionPane.showMessageDialog(null, "This button has already been pressed.");
    }
}