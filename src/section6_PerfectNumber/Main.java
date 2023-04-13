package section6_PerfectNumber;

public class Main {
  public static boolean isPerfectNumber(int number) {
    if (number < 1) {
      return false;
    }
    int sumOfFactor = 0;
    for (int factor = 1; factor <= number; factor++) {
      if (number % factor == 0 && factor !=number) {
        sumOfFactor += factor;
      }
    }
    return sumOfFactor == number;
  }

}
