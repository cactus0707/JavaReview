package section6_SharedDigit;

import java.util.HashSet;

public class Main {

  public static boolean hasSharedDigit(int numberA,
                                       int numberB) {
    if (!(((numberA >= 10) && (numberA <= 99)) && ((numberB >= 10) && (numberB <= 99)))) {
      return false;
    }
    HashSet<Integer> hashSet = new HashSet<>();
    while (numberA != 0) {
      hashSet.add(numberA % 10);
      numberA = numberA / 10;
    }

    boolean contains;
    while (numberB != 0) {
      contains = hashSet.contains(numberB % 10);
      numberB = numberB / 10;
      if (contains) {
        return true;
      }
    }
    return false;
  }
}
