package section05_ExpressionsStatements;

public class PlayingCat {

  /*
   * playing between 25 and 35 temperature(inclusive)
   * playing between 25 and 45 temperature(inclusive) - summer
   * */
  public static boolean isCatPlaying(boolean summer,
                             int temperature) {
    if (summer) {
      return (temperature >= 25) && (temperature <= 45);
    } else {
      return (temperature >= 25) && (temperature <= 35);
    }
  }

}
