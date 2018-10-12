import javax.swing.*;

public class messageHandler {

    //Players to keep track of wins, easier to implement in message handler, wins detected here too
    public static xPlayer x;
    public static oPlayer o;

    public static void playerXMessage(){
        JOptionPane.showMessageDialog(null, "player x's turn");
    }
    public static void playerOMessage(){
        JOptionPane.showMessageDialog(null, "player o's turn");
    }
    public static void playerXWonMessage(JFrame frame){
        JOptionPane.showMessageDialog(null, "sike, PLAYER X WINS");
        x.wins++;
        frame.dispose();
        new tttGame();
    }
    public static void playerOWonMessage(JFrame frame){
        JOptionPane.showMessageDialog(null, "sike, PLAYER O WINS");
        o.wins++;
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