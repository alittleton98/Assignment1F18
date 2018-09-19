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
        JButton startComputer = new JButton("Start Computer game");
        startComputer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                mainWindow.dispose();
                new computerPlayer();
            }
        });
        gamePanel.add(startComputer);
    }

    public static void main(String[] args){
        new tttGame();
    }
}