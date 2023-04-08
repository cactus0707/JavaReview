package section5_ExpressionsStatements;

public class EqualityPrinter {

  public static void printEqual(int numberA,
                                int numberB,
                                int numberC) {

    if (numberA < 0 || numberB < 0 || numberC < 0) {
      System.out.println("Invalid Value");
      return;
    }

    if (numberA - numberB != 0 && numberB - numberC != 0 && numberC - numberA != 0) {
      System.out.println("All numbers are different");
    } else if (numberA - numberB != 0 || numberB - numberC != 0 || numberC - numberA != 0) {
      System.out.println("Neither all are equal or different");
    } else if (numberA - numberB == 0 && numberB - numberC == 0 && numberC - numberA == 0) {
      System.out.println("All numbers are equal");
    }
  }


}
