package section05_ExpressionsStatements;

public class PositiveNegativeZero {
  private PositiveNegativeZero(){
    throw new IllegalStateException("Utility Class");
  }

  public static void checkNumber(int number) {
    if (number > 0) {
      System.out.println("positive");
    } else if (number < 0) {
      System.out.println("negative");
    } else {
      System.out.println("zero");
    }
  }
}
