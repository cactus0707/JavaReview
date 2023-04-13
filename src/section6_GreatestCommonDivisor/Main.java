package section6_GreatestCommonDivisor;

public class Main {

  public static int getGreatestCommonDivisor(int numberA,
                                             int numberB) {
    if (!((numberA>=10) && (numberB>=10))) {
      return -1;
    }
    int temp = 0;
    while (numberB - numberA !=0) {
      if (numberA > numberB) {
        temp = numberA;
        numberA = numberB;
        numberB = temp;
      }
      numberB = numberB - numberA;
    }
    return numberB;
  }
}
