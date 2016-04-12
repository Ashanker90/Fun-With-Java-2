public class GameBoardTesterApp
{
   public static void main(String args[])
   {
    GameBoard three = new GameBoard(3,3);  
    
    three.setCharacter('X', 1, 2);
    three.setCharacter('O', 2, 1);
    three.printboard();
   
    System.out.println();
    three.clearBoard();
   
    System.out.println();
    three.printboard();
    }
}
