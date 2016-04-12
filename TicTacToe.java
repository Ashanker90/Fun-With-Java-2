import java.util.Scanner;

class TicTacToe 
{ 
 private GameBoard tic; 
 public TicTacToe()
 {
   tic = new GameBoard(3,3);
 }
public void clear()
{
   tic.clearBoard();
}

public void print()
{
   tic.printboard();
}

public void placerx(char posx)
{
   if(posx==49){
   tic.setCharacter('X' , 0, 0);
   tic.printboard();}
   else if(posx==50){
   tic.setCharacter('X', 0, 1);
   tic.printboard();}
   else if(posx==51){
   tic.setCharacter('X', 0, 2);
   tic.printboard();}
   else if(posx==52){
   tic.setCharacter('X',1 , 0);
   tic.printboard();}
   else if(posx==53){
   tic.setCharacter('X', 1, 1);
   tic.printboard();}
   else if(posx==54){
   tic.setCharacter('X', 1, 2);
   tic.printboard();}
   else if(posx==55){
   tic.setCharacter('X', 2, 0 );
   tic.printboard();}
   else if(posx==56){
   tic.setCharacter('X', 2, 1);
   tic.printboard();}
   else{
   tic.setCharacter('X', 2, 2);
   tic.printboard();}
}

public void placery(char posy)
{
   if(posy==49){
   tic.setCharacter('O' , 0, 0);
   tic.printboard();}
   else if(posy==50){
   tic.setCharacter('O', 0, 1);
   tic.printboard();}
   else if(posy==51){
   tic.setCharacter('O', 0, 2);
   tic.printboard();}
   else if(posy==52){
   tic.setCharacter('O',1 , 0);
   tic.printboard();}
   else if(posy==53){
   tic.setCharacter('O', 1, 1);
   tic.printboard();}
   else if(posy==54){
   tic.setCharacter('O', 1, 2);
   tic.printboard();}
   else if(posy==55){
   tic.setCharacter('O', 2, 0 );
   tic.printboard();}
   else if(posy==56){
   tic.setCharacter('O', 2, 1);
   tic.printboard();}
   else{
   tic.setCharacter('O', 2, 2);
   tic.printboard();}
}

public void checkWin()
{
 for(int row = 0;row<1; row++)
  {
   for(int col = 0; col<1; col++)
   {
    if(tic.getCharacter(row,col) == 'X' && tic.getCharacter(row,col+1) == 'X' && tic.getCharacter(row,col+2) == 'X')
    System.out.println("Player ONE wins . The X have it!");
    
    else if(tic.getCharacter(row,col) == 'O' && tic.getCharacter(row,col+1) == 'O' && tic.getCharacter(row,col+2) == 'O')
    System.out.println("Player TWO wins . The O have it!");
    
    else if(tic.getCharacter(row,col) == 'X' && tic.getCharacter(row+1,col+1) == 'X' && tic.getCharacter(row+2,col+2) == 'X')
    System.out.println("Player ONE wins . The X have it!");
    
    else if(tic.getCharacter(row,col) == 'O' && tic.getCharacter(row+1,col+1) == 'O' && tic.getCharacter(row+2,col+2) == 'O')
    System.out.println("Player TWO WINS . The O have it!"); 
    
    else if(tic.getCharacter(row,col+2) == 'X' && tic.getCharacter(row+1,col+1) == 'X' && tic.getCharacter(row+2,col) == 'X')
    System.out.println("Player ONE wins . The X have it!");

    else if(tic.getCharacter(row,col+2) == 'O' && tic.getCharacter(row+1,col+1) == 'O' && tic.getCharacter(row+2,col) == 'O')
    System.out.println("Player TWO wins . The O have it!");  
    }
  }
 }
}