package TicTacToe2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class GameController {
    private static GameController gameControllerInstance;  
    private Board board;
    private Deque<Player> players;

    GameController(){}

    public void assignBoard(Board board){
        this.board = board;
    }

    public static GameController getGameControllerInstance(){
        if(gameControllerInstance != null){
            return gameControllerInstance;
        }
        else{
            gameControllerInstance = new GameController();
            return gameControllerInstance;
        }
    }

    private boolean check_input_validity(int row, int col){
        if(row>2 || row<0){
            return false;
        }

        if(col>2 || col<0){
            return false;
        }

        if(this.board.getElementAtPosition(row, col) != '-'){
            return false;
        }

        return true;
    }

    public void assignPlayersToGame(Player playerA, Player playerB){
        this.players = new ArrayDeque<>();
        this.players.add(playerA);
        this.players.add(playerB);
    }

    private boolean check_win_condition(PlayingPawn playerPlayingPawn){
        char element = 'O';
        if(playerPlayingPawn == PlayingPawn.CROSS){
            element = 'X';
        }

        List<Integer> rows = new ArrayList<Integer>();
        List<Integer> cols = new ArrayList<Integer>();

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(this.board.getElementAtPosition(i, j) == element){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        if(rows.size()!=3){
            return false;
        }

        rows.sort(null);
        cols.sort(null);

        if(rows.get(1) == rows.get(0)+1 && rows.get(2) == rows.get(1)+1){
            return true;
        }
        if(cols.get(1) == cols.get(0)+1 && cols.get(2) == cols.get(1)+1){
            return true;
        }

        for(int i=0; i<3; i++){
            if(rows.get(i) != cols.get(i)){
                return false;
            }
        }
        return true;
    }

    public void playGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting the game and printing the board here \n");
        this.board.printBoard();
        System.out.println();
        while(true){
            if(!this.board.check_if_empty_space_is_available()){
                System.out.println("No more empty spaces are available in the board, Game is over");
                break;
            }

            Player player = this.players.peek();
            System.out.println(player.getPlayerName() + "its your turn. Enter the position in which you want to place your pawn : ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(!check_input_validity(row, col)){
                continue;
            }

            this.board.assignElementAtPosition(row, col, player.getPlayerPlayingPawn());
            this.board.printBoard();
            boolean did_player_win = check_win_condition(player.getPlayerPlayingPawn());
            if(did_player_win){
                System.out.println(player.getPlayerName() + "You Won!!!");
                break;
            }

            Player player_removed = players.removeFirst();
            players.addLast(player_removed);
        }
        sc.close();
    }
}
