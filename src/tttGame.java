import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class tttGame{
    private JFrame mainWindow;
    private JLabel headerLabel;
    private JPanel gamePanel;

    public tttGame(){
        setUPUI();
    }

    public static void main(String[] args){
        tttGame tictactoe = new tttGame();
        tictactoe.showGame();
    }

    private void setUPUI(){
        mainWindow = new JFrame("Tic-Tac-Toe");
        mainWindow.setSize(400, 400);
        mainWindow.setLayout(new GridLayout(3, 1));
        mainWindow.addWindowListener(new WindowAdapter() {
            public void closeWindow(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);

        gamePanel = new JPanel();
        gamePanel.setLayout(new FlowLayout());

        mainWindow.add(headerLabel);
        mainWindow.add(gamePanel);
        mainWindow.setVisible(true);
    }

    void showGame(){
        headerLabel.setText("Welcome to Tic-Tac-Toe");

        // JButton startGameButton = new JButton("Start Game");
        // startGameButton.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e){
        //         window
        //     }
        // });

       // gamePanel.add(startGameButton);
        mainWindow.setVisible(true);
    }
    
}