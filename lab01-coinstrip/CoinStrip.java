// Students, replace this comment and implement Lab 1
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class CoinStrip {

    /**
     * Function to create the board
     * @param coins holds the set of coins
     */
    private int[] coins;
    private int[] gameboard;


public void createBoard(int[] coins) {

      Random rng = new Random();
       // at least one coin on the board
      for(int i = 1 ; i < coins.length; i++) {
        while (getNumCoins(coins) < coinNum) {
          int j = rng.nextInt(coins.length);
          if (coins[j] == 0){
            coins[j] = coins[j] +1;
          }
        }
      }
    }

public static void printBoard(int coins[] ){

  int coinLocation = 0;

      gameboard = new int[15];
      for (int j = 0; j<coins.length; j++){
        if (coins[j] == coinLocation){
            System.out.print(j);
        } else{
            System.out.print('*');
            coinLocation++;
            j--;
          }
      }

      }
    /**
    * Update this comment with a description of your method as it relates
    * to the Silver Dollar Game
    * @param coins holds the set of coins
    * @param whichCoin the number of the coin to move
    * @param numSpaces number of spaces to move the coin (left)
    * @return true if the move is valid
    */

    public boolean isValidMove(int coins[],int whichCoin, int numSpaces) {
        // Update this method to enforce the game's rules.
        int e = getCoinPosition(coins, whichCoin);
        int t = e - numSpaces;
        if (numSpaces<=0){
          return false;
        }
        for(int i=e; i>=t; i--) {
          if (coins[i] != 0){
            return false;
          }
        }return true;
    }


    /** Updates the game board to reflect a move.
     * Behavior is undefined if the described move is invalid.
     * @param coins holds the set of coins
     * @param whichCoin the number of the coin
     * @param numSpaces number of spaces to move the coin (left)
     */
    public static void makeMove(int[] coins, int whichCoin, int numSpaces) {
      int playerNum = 1; // current player

      if (isValidMove(coins, whichCoin, numSpaces)== true) {
        return true;

        while(isValidMove(coins, whichCoin, numSpaces)) {
	    playerNum = flipPlayer(playerNum);
	}
	playerNum = flipPlayer(playerNum);

	System.out.println("Player " + playerNum + " wins!");
        } return false;
      }


  public static int flipPlayer(int n) {
	   if (n == 1) {
	    return 2;
	} else {
	    return 1;
	}
    }

    /**
    * Returns true if the game is over.
    * @param coins holds the set of coins
    * @return True if the game is over, false otherwise.
    */
    public static boolean isGameOver(int[] coins) {
      for(int i=0; i<=coins-1; i++){
        if (coins[i] == false){
            return false;
        }
      }
    }

    /**
     * Returns the number of coins on the CoinStrip gameboard.
     * @param coins holds the set of coins
     * @return the number of coints on the CoinStrip gameboard.
     */
    public static int getNumCoins(int[] coins) {
              int coins;
              return coins;
    }

    /**
     * Returns the 0-indexed location of a specific coin. Coins are
     * also zero-indexed. So, if the CoinStrip had 3 coins, the coins
     * would be indexed 0, 1, or 2.
     * @param coins holds the set of coins
     * @param coinNum the 0-indexed coin number
     * @return the 0-indexed location of the coin on the CoinStrip
     */
    public static int getCoinPosition(int[] coins, int whichCoin) {

      return coin[whichCoin];
    }


    /**
     * `public static void main(String[] args)` is a program's entry point.
     * This main method implements the functionality to play the Coinstrip
     * game.
     *
     * @param Command-line arguments are ignored.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Silver Dollar Game!");
    }
}
