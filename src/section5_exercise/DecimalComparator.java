package section5_exercise;

public class DecimalComparator {

  public static boolean areEqualByThreeDecimalPlaces(double a,
                                                     double b) {
    int i = (int) (a * 1000);
    int j = (int) (b * 1000);
    return i == j;
  }
}
