import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class tttGame{
    public tttGame() {

        JFrame mainWindow = new JFrame("Tic-Tac-Toe");
        JLabel headerLabel = new JLabel("Welcome to Tic-Tac-Toe", SwingConstants.CENTER);
        JPanel gamePanel = new JPanel();

<<<<<<< HEAD
    public static void main(String[] args){
        tttGame tictactoe = new tttGame();
        tictactoe.showGame();

        //Conditional for 2 player or single player option
        /* if (single player selected)
            Player player2 = new Player("COMPUTER", "Y");
        */
        Player player1 = new Player("PLAYER 1", "X");
        Player player2 = new Player("PLAYER 2", "Y");
        Game tictactoegame = new Game();

        //Player 1 goes first
        
    }

    private void setUPUI(){
        mainWindow = new JFrame("Tic-Tac-Toe");
=======
        mainWindow.setVisible(true);
>>>>>>> origin/Tyler
        mainWindow.setSize(400, 400);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        gamePanel.setLayout(new GridLayout(3,1));
        mainWindow.add(gamePanel);
        gamePanel.add(headerLabel);


        JButton start2player = new JButton("Start 2-player game");
        start2player.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                mainWindow.dispose();
                new twoPlayer();
            }
        });
        gamePanel.add(start2player);

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