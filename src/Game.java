import java.util.*;

public class Game {
    private static String[][] gameBoard = new String[3][3];
    private static int count = 0;
   // private Random piecePlacement = new Random();

    public Game(){
      //  gameBoard = gb;
    }

    public boolean checkVictory(){
        boolean victory = false;
            //Check diag
            if (gameBoard[1][1].equals("X")){
                if(gameBoard[0][0].equals("X")){
                    if(gameBoard[2][2].equals("X")){
                        victory = true;
                    }
                }
                else if(gameBoard[0][2].equals("X")){
                    if(gameBoard[2][0].equals("X")){
                       victory = true;
                    }
                }
            }
            
            //check adjacency
            if(r == 0){
                c = 0;
                if(gameBoard[r+1][c].equals("X")){
                    if(gameBoard[r+2][c].equals("X")){
                       victory = true;
                    }
                }
                if(gameBoard[r][c+1].equals("X")){
                    if(gameBoard[r][c+2].equals("X")){
                       victory = true;
                    }
                }
            }

            //check first row
            if (r == 1){
                c = 0;
                if(gameBoard[r][c+1].equals("X")){
                    if(gameBoard[r][c+2].equals("X")){
                       victory = true;
                    }
                }
                if(gameBoard[r][c+1].equals("X")){
                    if(gameBoard[r][c+2].equals("X")){
                       victory = true;
                    }
                }
            }

            //check second row
            if(r == 2){
                c = 0;
                if(gameBoard[r][c+1].equals("X")){
                    if(gameBoard[r][c+2].equals("X")){
                       victory = true;
                    }
                }
            }

            //check first column
            if (c == 1){
                r = 0;
                if(gameBoard[r+1][c].equals("X")){
                    if(gameBoard[r+2][c].equals("X")){
                       victory = true;
                    }
                }
            }

            //check second column
            if (c == 2){
                r = 0;
                if(gameBoard[r+1][c].equals("X")){
                    if(gameBoard[r+2][c].equals("X")){
                       victory = true;
                    }
                }
            }
            //Check diag
            if (gameBoard[1][1].equals("O")){
                if(gameBoard[0][0].equals("O")){
                    if(gameBoard[2][2].equals("O")){
                       victory = true;
                    }
                }
                else if(gameBoard[0][2].equals("O")){
                    if(gameBoard[2][0].equals("O")){
                       victory = true;
                    }
                }
            }
            
            //check adjacency
            if(r == 0){
                c = 0;
                if(gameBoard[r+1][c].equals("O")){
                    if(gameBoard[r+2][c].equals("O")){
                       victory = true;
                    }
                }
                if(gameBoard[r][c+1].equals("O")){
                    if(gameBoard[r][c+2].equals("O")){
                       victory = true;
                    }
                }
            }
            if (r == 1){
                c = 0;
                if(gameBoard[r][c+1].equals("O")){
                    if(gameBoard[r][c+2].equals("O")){
                       victory = true;
                    }
                }
                if(gameBoard[r][c+1].equals("O")){
                    if(gameBoard[r][c+2].equals("O")){
                       victory = true;
                    }
                }
            }
            if(r == 2){
                c = 0;
                if(gameBoard[r][c+1].equals("O")){
                    if(gameBoard[r][c+2].equals("O")){
                       victory = true;
                    }
                }
            }
            if (c == 1){
                r = 0;
                if(gameBoard[r+1][c].equals("O")){
                    if(gameBoard[r+2][c].equals("O")){
                       victory = true;
                    }
                }
            }
            if (c == 2){
                r = 0;
                if(gameBoard[r+1][c].equals("O")){
                    if(gameBoard[r+2][c].equals("O")){
                       victory = true;
                    }
                }
            }

        return victory;
    }
}