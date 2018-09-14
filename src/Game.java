import java.util.*;

public class Game {
    private static String[][] gameBoard = new String[3][3];
    private static int count = 0;
    // private Random piecePlacement = new Random();
    //private int r;
    //private int c;
    
    public Game(){
        // piecePlacement.ints(0,4);
        // r = piecePlacement;
        // c = piecePlacement;
    }

    public void placeX(int row, int col){
       gameBoard[row][col] = "X";
      // count++;
       System.out.println(Arrays.deepToString(gameBoard));
        /*
       if (count > 4){
           if (checkVictory("X", row, col)){
               System.out.println("Player X has won!");
           }
        }
        */
    }

    public void placeO(int row, int col){
        gameBoard[row][col] = "O";
        //count++;
        System.out.println(Arrays.deepToString(gameBoard));
        /*
        if (count > 4){
            if (checkVictory("O", row, col)){
                System.out.println("Player X has won!");
            }
        }
        */
    }

    public boolean checkVictory(String lastPlayer, int r, int c){
        boolean victory = false;
        int row = r;
        int col = c;
        if (lastPlayer.equals("X")){
            

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
            if(row == 0){
                col = 0;
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
            if (row == 1){
                col = 0;
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
            if(row == 2){
                col = 0;
                if(gameBoard[r][c+1].equals("X")){
                    if(gameBoard[r][c+2].equals("X")){
                       victory = true;
                    }
                }
            }

            //check first column
            if (col == 1){
                row = 0;
                if(gameBoard[r+1][c].equals("X")){
                    if(gameBoard[r+2][c].equals("X")){
                       victory = true;
                    }
                }
            }

            //check second column
            if (col == 2){
                row = 0;
                if(gameBoard[r+1][c].equals("X")){
                    if(gameBoard[r+2][c].equals("X")){
                       victory = true;
                    }
                }
            }
        }
        if (lastPlayer.equals("O")){
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
            if(row == 0){
                col = 0;
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
            if (row == 1){
                col = 0;
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
            if(row == 2){
                col = 0;
                if(gameBoard[r][c+1].equals("O")){
                    if(gameBoard[r][c+2].equals("O")){
                       victory = true;
                    }
                }
            }
            if (col == 1){
                row = 0;
                if(gameBoard[r+1][c].equals("O")){
                    if(gameBoard[r+2][c].equals("O")){
                       victory = true;
                    }
                }
            }
            if (col == 2){
                row = 0;
                if(gameBoard[r+1][c].equals("O")){
                    if(gameBoard[r+2][c].equals("O")){
                       victory = true;
                    }
                }
            }
        }
        else{
            victory = false;
        }
        return victory;
    }
}