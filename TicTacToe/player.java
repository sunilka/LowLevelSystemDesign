public class player {

    int playerID;
    String playerName;
    int playerAge;
    pawns playerPawn;

    player(int playerID, String playerName, int playerAge, pawns playerPawn){
        this.playerID = playerID;
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerPawn = playerPawn;
    }
    
    int get_player_ID(){
        return this.playerID;
    }

    String get_player_name(){
        return this.playerName;
    }

    int get_player_age(){
        return this.playerAge;
    }

    pawns get_player_pawn(){
        return this.playerPawn;
    }
}