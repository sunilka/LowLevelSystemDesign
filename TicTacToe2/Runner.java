package TicTacToe2;

public class Runner {
    public static void main(String args[]){
        GameController gameController = GameController.getGameControllerInstance();
        
        // Creating a board and assigning it to the game controller.
        Board board = new Board();
        gameController.assignBoard(board);

        // Creating the players and assigning them to the game.
        Player playerA = new Player(1, "player A", PlayingPawn.CIRCLE);
        Player playerB = new Player(2, "player B", PlayingPawn.CROSS);
        gameController.assignPlayersToGame(playerA, playerB);

        gameController.playGame();
    }
}
