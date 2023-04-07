package SectionFive;

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
    if (score >= 1000) {
      return 1;
    } else if ((score < 1000) && (score >= 500)) {
      return 2;
    } else if ((score < 500) && (score >= 100)) {
      return 3;
    } else {
      return 4;
    }
  }
}
