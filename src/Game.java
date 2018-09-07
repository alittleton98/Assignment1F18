public class Game {

    private String[][] gameBoard = new String[3][3];
    private int count = 0;
    public Game(){

    }

    public void placeX(int row, int col){
       
    }

    public void placeO(int row, int col){

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
}