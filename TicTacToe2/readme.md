**Brief working of the game**

- Let us first look at the breif working of the Tic Tac Toe game.
- In the game of the tic tac toe game, there is a board. (3*3) board.
- There would be 2 players that would be playing the game, and each player would be assigned with a playing pawn. 
- And initially the board has no players pawns.
- The players would take in turns to place their pawns in the board.
    - While the players are placing the pawns in the boards, we have to do checks like:
        - Out of boundary checks.
        - If the place where the player wants to place his pawn that is empty and not occupied by any other pawn.
- After each player has placed his pawn, we check if the win condition happens, if yes, we declare the player as won and end the game, or continue playing. 
- There would be a game controller that would be controlling the game.

**Identification of the objects in the game**

1) Player
2) Board
3) GameController

**Diving into the UML Diagram**

Lets dive into the UML diagram for the tic tac toe game.

**Algorithm to win**

After each player places his pawn, we get all the positions of his pawn from the board and then we would see if those positions are along the same row or same col or along the diagonal. If yes, that player wins. If no, the game continues until there are no free spaces present in the board.