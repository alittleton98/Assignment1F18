import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class twoPlayer extends JFrame implements ActionListener{
    private JFrame playerFrame = new JFrame("Two player mode");
    private String[][] gameBoard = new String[3][3];
    private int count = 0;

    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private JLabel playerLabel;
    private String playerTurn = "x";

    String imageX = "/images/redX.jpg";
    String imageO = "/images/blue.jpg";

    //Checks if the tile has already been pressed
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
        populateBoard(gameBoard);

        //Allows players to click a tile to draw their turn
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();

        //shows what player turn it is
        playerLabel = new JLabel();
        playerLabel.setForeground(Color.RED);

        //Allows button to take action when pressed
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        //adds button to jframe
        playerFrame.add(b1);
        playerFrame.add(b2);
        playerFrame.add(b3);
        playerFrame.add(b4);
        playerFrame.add(b5);
        playerFrame.add(b6);
        playerFrame.add(b7);
        playerFrame.add(b8);
        playerFrame.add(b9);
        playerFrame.add(playerLabel);

        //sets the size for first button which defaults the others to the same size
        b1.setPreferredSize(new Dimension(100,100));

        playerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        playerFrame.setLayout(new GridLayout(4,3,3,3));
        playerFrame.setSize(500,500);
        playerFrame.getContentPane().setBackground(Color.BLACK);
        playerFrame.setVisible(true);

    }
    //button interactions
    public void actionPerformed(ActionEvent ae) {
<<<<<<< HEAD
        Game g = new Game();
=======
>>>>>>> Tyler
        if(ae.getSource() == b1){
            if(b1Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
<<<<<<< HEAD
                    //gameBoard[0][0] = "x";
                    g.placeX(0, 0);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("X", 0, 0)){
                            System.out.println("Player X has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    //gameBoard[0][0] = "o";
                    g.placeO(0, 0);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("O", 0, 0)){
                            System.out.println("Player O has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
=======
                    gameBoard[0][0] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[0][0] = "o";
>>>>>>> Tyler
                }
                buttonPressed(b1);
                b1Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }

        }
        if(ae.getSource() == b2){
            if(b2Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
<<<<<<< HEAD
                    //gameBoard[0][0] = "x";
                    g.placeX(0, 1);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("X", 0, 1)){
                            System.out.println("Player X has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    //gameBoard[0][0] = "o";
                    g.placeO(0, 1);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("O", 0, 1)){
                            System.out.println("Player O has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
=======
                    gameBoard[0][1] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[0][1] = "o";
>>>>>>> Tyler
                }
                buttonPressed(b2);
                b2Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b3){
            if(b3Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
<<<<<<< HEAD
                    //gameBoard[0][0] = "x";
                    g.placeX(0, 2);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("X", 0, 2)){
                            System.out.println("Player X has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    //gameBoard[0][0] = "o";
                    g.placeO(0, 2);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("O", 0, 2)){
                            System.out.println("Player O has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
=======
                    gameBoard[0][2] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[0][2] = "o";
>>>>>>> Tyler
                }
                buttonPressed(b3);
                b3Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b4){
            if(b4Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
<<<<<<< HEAD
                    //gameBoard[0][0] = "x";
                    g.placeX(1, 0);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("X", 1, 0)){
                            System.out.println("Player X has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    //gameBoard[0][0] = "o";
                    g.placeO(1, 0);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("O", 1, 0)){
                            System.out.println("Player O has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
=======
                    gameBoard[1][0] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[1][0] = "o";
>>>>>>> Tyler
                }
                buttonPressed(b4);
                b4Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b5){
            if(b5Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
<<<<<<< HEAD
                    //gameBoard[0][0] = "x";
                    g.placeX(1, 1);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("O", 1, 1)){
                            System.out.println("Player X has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    //gameBoard[0][0] = "o";
                    g.placeO(1, 1);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("O", 1, 1)){
                            System.out.println("Player O has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
=======
                    gameBoard[1][1] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[1][1] = "o";
>>>>>>> Tyler
                }
                buttonPressed(b5);
                b5Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b6){
            if(b6Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
<<<<<<< HEAD
                    //gameBoard[0][0] = "x";
                    g.placeX(1, 2);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("O", 1, 2)){
                            System.out.println("Player X has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    //gameBoard[0][0] = "o";
                    g.placeO(1, 2);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("O", 1, 2)){
                            System.out.println("Player O has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
=======
                    gameBoard[1][2] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[1][2] = "o";
>>>>>>> Tyler
                }
                buttonPressed(b6);
                b6Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b7){
            if(b7Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
<<<<<<< HEAD
                    //gameBoard[0][0] = "x";
                    g.placeX(2, 0);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("X", 2, 0)){
                            System.out.println("Player X has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    //gameBoard[0][0] = "o";
                    g.placeO(2, 0);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("O", 2, 0)){
                            System.out.println("Player O has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
=======
                    gameBoard[2][0] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[2][0] = "o";
>>>>>>> Tyler
                }
                buttonPressed(b7);
                b7Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b8){
            if(b8Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
<<<<<<< HEAD
                    //gameBoard[0][0] = "x";
                    g.placeX(2, 1);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("X", 2, 1)){
                            System.out.println("Player X has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    //gameBoard[0][0] = "o";
                    g.placeO(2, 1);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("O", 2, 1)){
                            System.out.println("Player O has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
=======
                    gameBoard[2][1] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[2][1] = "o";
>>>>>>> Tyler
                }
                buttonPressed(b8);
                b8Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b9){
            if(b9Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
<<<<<<< HEAD
                    //gameBoard[0][0] = "x";
                    g.placeX(2, 2);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("O", 2, 2)){
                            System.out.println("Player X has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    //gameBoard[0][0] = "o";
                    g.placeO(2, 2);
                    count++;
                    if (count > 4){
                        if (g.checkVictory("O", 2, 2)){
                            System.out.println("Player O has won!");
                        }
                    }
                    //System.out.println(Arrays.deepToString(gameBoard));
=======
                    gameBoard[2][2] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[2][2] = "o";
>>>>>>> Tyler
                }
                buttonPressed(b9);
                b9Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }
    }

    //If a button is pressed, it changes the turn and shows an alert to see whose turn it is
    public void buttonPressed(JButton button){
        count++;
        if(playerTurn.equals("x")) {
            changeXImage(button);
            messageHandler.playerOMessage();
            checkForWinner();
            playerTurn = "o";
            playerLabel.setText("player o's turn");



        } else if(playerTurn.equals("o")){
            changeOImage(button);
            messageHandler.playerXMessage();
            checkForWinner();
            playerTurn = "x";
           playerLabel.setText("player x's turn");

        }


    }
    public void checkForWinner(){
        Game g = new Game();
        if(count >= 5 && count < 9){
             if(g.victor(gameBoard, playerFrame)){
                 System.out.println("someone won");
             }
        } else if(count == 9 && !g.victor(gameBoard, playerFrame)){
            messageHandler.gameTie(playerFrame);
        }
    }
    
    //Changes the buttton's icon image to corresponding turn
    public void changeOImage(JButton b){
        try{
            java.net.URL imgURL = getClass().getResource(imageO);
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
        try{
            java.net.URL imgURL = getClass().getResource(imageX);
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
    public void populateBoard(String[][] board){
        board[0][0]= "not used";
        board[0][1]= "not used";
        board[0][2]= "not used";
        board[1][0]= "not used";
        board[1][1]= "not used";
        board[1][2]= "not used";
        board[2][0]= "not used";
        board[2][1]= "not used";
        board[2][2]= "not used";
        System.out.println("Board populated");
    }
    public Boolean boardFull(){
        if(b1Check == true 
            && b2Check == true
            && b3Check == true
            && b4Check == true
            && b5Check == true
            && b6Check == true
            && b7Check == true
            && b8Check == true
            && b9Check == true){
            return true;
        }
        return false;
    }
}