import java.io.*;
import java.util.*;

public class gameFactory {
  public gameInterface newGame(String gameArg) {
    if ( gameArg.equals("c") ) {
      return new cardGame();
    }
    else if ( gameArg.equals("d") ) {
      return new dieGame();
    }
    else {
      return null;
    }
  }
}
