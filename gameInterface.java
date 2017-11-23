import java.io.*;
import java.util.*;

public interface gameInterface {
  public static RandomInterface r=new LinearCongruentialGenerator();
  public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  public void playGame() throws Exception;
  public void decideWinner();
}
