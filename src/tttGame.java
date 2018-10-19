import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class tttGame{
    public tttGame() {

        //creates main menu window for game 
        JFrame mainWindow = new JFrame("Tic-Tac-Toe");
        JLabel headerLabel = new JLabel("Welcome to Tic-Tac-Toe", SwingConstants.CENTER);
        JPanel gamePanel = new JPanel();

        mainWindow.setVisible(true);
        mainWindow.setSize(400, 400);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
<<<<<<< HEAD
        
        centerFrame(mainWindow);

=======
        centerFrame(mainWindow);
>>>>>>> Tyler
        gamePanel.setLayout(new GridLayout(3,1));
        mainWindow.add(gamePanel);
        gamePanel.add(headerLabel);

        //Closes main menu and starts a 2 player game
        JButton start2player = new JButton("Start 2-player game");
        start2player.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                mainWindow.dispose();
                new twoPlayer();
            }
        });
        gamePanel.add(start2player);

        //Closes main menu and starts computer game
        JButton startComputer = new JButton("Start Computer game (WIP)");
        startComputer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
<<<<<<< HEAD
                //mainWindow.dispose();
                //new computerPlayer();
                JOptionPane.showMessageDialog(null, "Game mode currently not available");
=======
                mainWindow.dispose();   
                new computerPlayer();
>>>>>>> Tyler
            }
        });
        gamePanel.add(startComputer);

        // //Closes main menu and opens character select
        // JButton selectCharacter = new JButton("Select Character");
        // selectCharacter.addActionListener(new ActionListener(){
        
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         mainWindow.dispose();
        //         new characterSelect();
        //     }
        // });
        // gamePanel.add(selectCharacter);
    }

    public static void centerFrame(JFrame frame){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = frame.getSize().width;
        int h = frame.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        frame.setLocation(x, y);
    }

    public static void centerFrame(JFrame frame){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = frame.getSize().width;
        int h = frame.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        frame.setLocation(x, y);
    }

    public static void main(String[] args){
        new tttGame();
    }
}