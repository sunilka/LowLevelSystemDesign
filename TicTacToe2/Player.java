package TicTacToe2;

public class Player {
    private int playerID;
    private String playerName;
    private PlayingPawn playerPlayingPawn;

    public Player(int playerID, String playerName, PlayingPawn playerPlayingPawn){
        this.playerID = playerID;
        this.playerName = playerName;
        this.playerPlayingPawn = playerPlayingPawn;
    }

    public int getPlayerID(){
        return this.playerID;
    }

    public String getPlayerName(){
        return this.playerName;
    }

    public PlayingPawn getPlayerPlayingPawn(){
        return this.playerPlayingPawn;
    }
}
