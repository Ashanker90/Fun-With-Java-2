import java.util.Scanner;

class TicTacToeApp
{
 public static void main(String args[])
  {
   TicTacToe tic = new TicTacToe();
   
   Scanner kbd = new Scanner(System.in);
   
   tic.clear();
   System.out.println("Welcome To the game of TicTacToe" + "\n");
   
  tic.print();
   
   int count = 9;
   while(count > 0)
   {
   System.out.println("Player one plays with an X, please enter where you wish to play");
   char posx = kbd.next(".").charAt(0);
   tic.placerx(posx);
   count--;
   tic.checkWin();
   System.out.println("PLayer two plays with O");
   char posy = kbd.next(".").charAt(0);
   tic.placery(posy);
   count--;
   tic.checkWin();
   }
  }
}