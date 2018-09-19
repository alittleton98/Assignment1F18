import javax.swing.*;

public class messageHandler {
    public static void playerXMessage(){
        JOptionPane.showMessageDialog(null, "player x's turn");
    }
    public static void playerOMessage(){
        JOptionPane.showMessageDialog(null, "player o's turn");
    }
    public static void playerXWonMessage(JFrame frame){
        JOptionPane.showMessageDialog(null, "sike, PLAYER X WINS");
        frame.dispose();
        new tttGame();
    }
    public static void playerOWonMessage(JFrame frame){
        JOptionPane.showMessageDialog(null, "sike, PLAYER O WINS");
        frame.dispose();
        new tttGame();
    }
    public static void gameTie(JFrame frame){
        JOptionPane.showMessageDialog(null, "TIE GAME");
        frame.dispose();
        new tttGame();
    }
    public static void buttonAlreadyPressed(){
        JOptionPane.showMessageDialog(null, "This button has already been pressed.");
    }
    
}