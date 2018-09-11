public class Player{
    private String playingPiece;
    private String name;

    public Player(String n, String piece){
        name = n;
        playingPiece = piece;
    }

    public void setName(String n){
        name = n;
    }
    public void setPiece(int start){
        if (start == 1){
            playingPiece = "X";
        }
        else{
            playingPiece = "O";
        }
    }
    public String getName(){
        return name;
    }

    public String getPiece(){
        return playingPiece;
    }
}