public class board {
    
    int boardSize;
    char[][] board;

    board(int boardSize){
        this.boardSize = boardSize;
        this.board = new char[this.boardSize][this.boardSize];

        // Placing * symbol in the places of the positions
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                this.board[i][j] = '*';
            }
        }
    }

    int get_board_size(){
        return this.boardSize;
    }

    char get_char_at_position(int x, int y){
        return this.board[x][y];
    }

    char[][] get_board(){
        return this.board;
    }

    void print_board(){
        System.out.println("Printing the board below");
        System.out.println("-------------------------");
        for(int i=0; i<this.boardSize; i++){
            for(int j=0; j<this.boardSize; j++){
                System.out.print(this.board[i][j]+" ");
            }
            System.out.println('\n');;
        }
        System.out.println("-------------------------");
    }
}