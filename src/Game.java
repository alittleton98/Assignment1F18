import java.util.*;

public class Game {

    private static String[][] gameBoard = new String[3][3];
    private int count = 0;
    private Random piecePlacement = new Random();
    private int r;
    private int c;
    
    public Game(){
        piecePlacement.ints(0,4);
        r = piecePlacement;
        c = piecePlacement;
    }

    public static void placeX(int row, int col){
       gameBoard[row][col] = "X";
    }

    public static void placeO(int row, int col){
        gameBoard[row][col] = "O";
    }

    public boolean checkVictory(String lastPlayer){
        int i = 0;
        int j = 0;
        if (lastPlayer.equals("x")){
            return true;
        }
        if (lastPlayer.equals("o")){
            return true;
        }
        else{
            return false;
        }
    }

    public void computerMove(){
        
        if (player2.getPiece() == "X"){
            if (gameBoard[r][c] = null){
                Game.placeX(r,c);
            }
        }
        if (player2.getPiece() == "O"){
            if (gameBoard[r][c] = null){
                Game.placeO(r,c);
            }
        }
    }
}