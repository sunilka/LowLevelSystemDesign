import java.util.*;

public class game {

    boolean _check_empty_positions(board board_obj){
        /* Method to check the if there are any vacant position to place a pawn */
        int board_size = board_obj.get_board_size();
        char[][] board = board_obj.get_board();

        for(int i=0;i<board_size;i++){
            for(int j=0;j<board_size;j++){
                if(board[i][j] == '*'){
                    return true;
                }
            }
        }
        return false;
    } 

    boolean _check_if_input_position_are_valid(int x, int y, board board){
        /* Method to check if the input positions are valid */
        int board_size = board.get_board_size();
        if(x<0 || x>=board_size || y<0 || y>=board_size){
            return false;
        }
        return true;
    }

    boolean _check_win_condition(board board, player player_turn_to_play){
        /* Method to check if the current player has won */
        pawns cur_player_pawn = player_turn_to_play.get_player_pawn();
        char player_pawn_symbol;
        if(cur_player_pawn == pawns.CIRCLE){
            player_pawn_symbol = 'O';
        }
        else{
            player_pawn_symbol = 'X';
        }

        int board_size = board.get_board_size();
        char[][] playing_board = board.get_board();
        ArrayList<ArrayList<Integer>> positions = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<board_size; i++){
            for(int j=0; j<board_size; j++){
                if(playing_board[i][j] == player_pawn_symbol){
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(i);
                    temp.add(j);
                    positions.add(temp);
                }
            }
        }

        if(positions.size()!=3){
            return false;
        }

        /* Check if all the rows are the same */
        Set<Integer> s = new HashSet<Integer>();
        for(int i=0; i<positions.size(); i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp = positions.get(i);
            s.add(temp.get(0));
        }
        if(s.size() == 1){
            return true;
        }
        s.clear();

        /* Check if all the cols are the same */
        for(int i=0; i<positions.size(); i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp = positions.get(i);
            s.add(temp.get(1));
        }
        if(s.size() == 1){
            return true;
        }

        return false;
    }
    
    public static void main(String[] args) {
        
        // We have to initilize the board first and also the players.
        // We will have a 3*3 board and we will have 2 players in the game.
        game game = new game();
        board board = new board(3);
        player playera = new player(1, "Player A", 25, pawns.CROSS);
        player playerb = new player(2, "Player B", 25, pawns.CIRCLE);

        Deque<player> player_turn_queue = new ArrayDeque<>();
        player_turn_queue.add(playera);
        player_turn_queue.add(playerb);

        while(true){
            /*
                First we check if there is an empty position where a pawn could be placed.
                If there is no empty position, then we just break out and end the game.
            */
            if(!game._check_empty_positions(board)){
                System.out.println("No more empty positions.. Game ended!!!");
                break;
            }

            /*
             * Get the player that is infront of the queue, and ask for the position where he wants to place his pawn.
             * Validate if the position is valid. If its valid, then check if the win conditions happens to this player.
             * If the win condition happens, then declare him as the winner and exit out. Else, put this player in the 
             * back of the queue and print the status of the board.
             */

            player player_turn_to_play = player_turn_queue.removeFirst();
            System.out.println(player_turn_to_play.get_player_name()+" plz enter the position to place your pawn");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println("Entered input : "+x+" "+y);

            if(!game._check_if_input_position_are_valid(x, y, board)){
            System.out.println("Invalid input positions, plz re-enter the valid positions");
            continue;
            }

             /* Printing the board after placing the pawn in the position specified by the player */
            char player_pawn_symbol;
            pawns cur_player_pawn = player_turn_to_play.get_player_pawn();
            if(cur_player_pawn == pawns.CIRCLE){
                player_pawn_symbol = 'O';
            }
            else{
                player_pawn_symbol = 'X';
            }
            
            board.board[x][y] = player_pawn_symbol;
            board.print_board();
            if(game._check_win_condition(board, player_turn_to_play)){
                System.out.println(player_turn_to_play.get_player_name()+ "Wins");
                break;
            }
            player_turn_queue.addLast(player_turn_to_play);
        }
    }
}