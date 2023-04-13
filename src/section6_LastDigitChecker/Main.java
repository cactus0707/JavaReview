package section6_LastDigitChecker;

public class Main {

  public static boolean hasSameLastDigit(int numberA,
                                         int numberB,
                                         int numberC) {
    if (!(isValid(numberA) && isValid(numberB) && isValid(numberC))) {
      return false;
    }

    int rightmostNumberA = numberA % 10;
    int rightmostNumberB = numberB % 10;
    int rightmostNumberC = numberC % 10;

    return rightmostNumberA == rightmostNumberB || rightmostNumberA == rightmostNumberC
        || rightmostNumberB == rightmostNumberC;
  }

  public static boolean isValid(int number) {
    return number >= 10 && number <= 1000;
  }
}
