import java.io.*;
import java.util.*;

public class updatedGame {
  public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


  public static void main(String[] args) throws Exception {

    // Ask whether to play a card game or a die game
    System.out.println("Card (c) or Die (d) game? ");
    String ans=br.readLine();

    gameFactory factory = new gameFactory();

    try {
      gameInterface game = factory.newGame(ans);

      for (int x = 0; x < 2; x++) {
        game.playGame();
      }

      game.decideWinner();
    }
    catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }
}
