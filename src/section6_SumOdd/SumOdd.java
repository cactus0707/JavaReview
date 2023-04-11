package section6_SumOdd;

public class SumOdd {

  public static boolean isOdd(int number) {
    if (number <= 0) {
      return false;
    } else if (number % 2 != 0) {
      return true;
    } else {
      return false;
    }
  }

  public static int sumOdd(int start,
                           int end) {
    if (!((end >= start) && (start >= 0) && (end >= 0))) {
      return -1;
    }
    int sumOfOddNumber = 0;
    for (int loopNumber= start; loopNumber <= end; loopNumber++) {
      if (isOdd(loopNumber)) {
        sumOfOddNumber += loopNumber;
      }
    }
    return sumOfOddNumber;
  }
}
