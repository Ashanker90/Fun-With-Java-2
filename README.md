# Fun-With-Java-2

A JAVA program that will implement the Tic-Tac-Toe game discussed in class. The program is
for when a human plays human;

Technical considerations
Implementation uses a two-dimensional array as the data structure representing the game board.
For purposes of this program, players are to use array notation to indicate the space in which they wish to
place their X/) marker.

Strategy considerations
1) The game will be played on a two-dimensional board of three cells by three cells;
2) The game is to be developed for two “human” players. Player one is to use the symbol X, player
two will use the symbol O;
3) Player one (X) will always make the first play;
4) A win will be identified as the player with three contiguous, identical characters (three X’s or
three 0’s) placed in a single column, row, or diagonal.
a. There are 8 possible arrangements that identify a win;
5) Beginning with the 5th move, the game is to determine if there is a winner;
6) The game will end when there are no empty squares left.
7) After each game is completed, player will be prompted to “play again” or “quit”.

Solution Considerations
Solution is to use two classes, Gameboard and TicTacToe.
Class Gameboard will provide the board on which the game of TicTacToe will be played. Gameboard may
also be used in other game situations for example Chess and Checkers. Class Gameboard is to have the
following:
• a single data member which is a private reference variable for a two dimension array of type char;
• a single constructor that receives two arguments, the first representing the number of rows on the
game board, the second representing the columns on the game board. The constructor will then
create an array of the size of the two argument values and set each of the values to ‘_’;
• a set method that will take three arguments, a character representing a player’s character, and two
integer arguments representing the row and column positions at which the character is to be
placed. The method will store the character parameter at the given positions;
• a get method that takes two arguments representing the row and column values for a character.

The method returns the character at the row and column positions;
• a clearBoard( ) method that sets all character ‘_’;
• a method printBoard( ) that prints the board in its current state;
Class TicTacToe will implement the game strategy by first creating a TicTacToe game board using class
Gameboard. 