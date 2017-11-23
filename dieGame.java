import java.io.*;
import java.util.*;

public class dieGame implements gameInterface {
  public static HashSet<Integer> numbersRolled=new HashSet<Integer>();
  public static RandomInterface r=new LinearCongruentialGenerator();
  public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  public void playGame() {
    // The main game:

    // Let the user roll the die twice
      System.out.println("Hit <RETURN> to roll the die");
      try {
      br.readLine();
    }
    catch (Exception e) {
      System.out.println("Error " + e);
    }

      int dieRoll=(int)(r.next() * 6) + 1;

      System.out.println("You rolled " + dieRoll);
      numbersRolled.add(new Integer(dieRoll));

    // Display the numbers rolled
    System.out.println("Numbers rolled: " + numbersRolled);
  }

  public void decideWinner() {
    // Declare the winner:

    // User wins if at least one of the die rolls is a 1
    if (numbersRolled.contains(new Integer(1))) {
      System.out.println("You won!");
    }
    else System.out.println("You lost!");
  }
}
