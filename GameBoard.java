public class GameBoard
{
   //data members
   private char [][] gameboard;
   
   //constructors
   public GameBoard(int row, int col)
   {
      gameboard = new char[row][col];
      char k = 49;
      for(int i = 0; i < gameboard.length; i++)
      {
         for(int j = 0; j < gameboard[i].length; j++, k++)
         {
            gameboard[i][j] = k;
         }
     }
   }
   //set and get method
   public void setCharacter(char a, int row, int col)
   {
      gameboard[row][col] = a;
   }
 
   public char getCharacter(int row, int col)// get have to be sent in values as we need to define the position
   {
      return(this.gameboard[row][col]);
   }
 
   public void clearBoard()
   {char k = 49;
    for(int i = 0; i < gameboard.length; i++)
    {
     for(int j = 0; j < gameboard[i].length; j++, k++)
     {
       gameboard[i][j] = k;
     }
    }
   }
   
public void printboard()
{
 for(int i = 0; i < gameboard.length; i++)
 {
  for(int j = 0; j < gameboard[i].length; j++)
  {
   System.out.print(gameboard[i][j] + " ");
  }
  System.out.println();
 }
}
    
   
 
}