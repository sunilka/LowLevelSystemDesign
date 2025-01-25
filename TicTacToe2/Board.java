package TicTacToe2;

public class Board {
    private char[][] playingCells;

    public Board(){
        this.playingCells = new char[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                playingCells[i][j] = '-';
            }
        }
    }

    public char getElementAtPosition(int row, int col){
        return this.playingCells[row][col];
    }

    public void assignElementAtPosition(int row, int col, PlayingPawn playingPawn){
        char element = 'O';
        if(playingPawn == PlayingPawn.CROSS){
            element = 'X';
        }
        this.playingCells[row][col] = element;
    }

    public void printBoard(){
        System.out.println("Printing the board : \n");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(this.playingCells[i][j] + " ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public boolean check_if_empty_space_is_available(){
        for(int i=0; i<3 ; i++){
            for(int j=0; j<3; j++){
                if(this.playingCells[i][j]=='-'){
                    return true;
                }
            }
        }
        return false;
    }
}
