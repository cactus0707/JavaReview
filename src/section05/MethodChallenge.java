package section05;

public class MethodChallenge {

  public static void main(String[] args) {
    String name = "Flynn";
    int score = 200;
    int calculatedPosition = calculateHighScorePosition(score);
    displayHighScorePosition(name, calculatedPosition);

  }

  public static void displayHighScorePosition(String playerName,
                                              int highScorePosition) {
    System.out.println(playerName + " managed to get into " + highScorePosition + " score list");
  }

  public static int calculateHighScorePosition(int score) {
    int position = 4;

    if (score >= 1000) {
      position = 1;
    } else if (score >= 500) {
      position = 2;
    } else if (score >= 100) {
      position = 3;
    }

    return position;
  }
}
