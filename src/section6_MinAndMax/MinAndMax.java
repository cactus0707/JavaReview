package section6_MinAndMax;

import java.util.Scanner;

public class MinAndMax {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double maximum = 0;
    double minimum = 0;
    int loopCount = 0;
    while (true) {
      System.out.println("Enter a number, or any character to exit:");
      String nextEntry = scanner.nextLine();
      try {
        double validNum = Double.parseDouble(nextEntry);
        if (loopCount == 0 || validNum < minimum) {
          minimum = validNum;
        }
        if (loopCount == 0 || validNum > maximum) {
          maximum = validNum;
        }
        loopCount++;
      } catch (NumberFormatException numberFormatException) {
        break;
      }
      if (loopCount > 0) {
        System.out.println("min = " + minimum + ", max" + maximum);
      } else {
        System.out.println("No valid data entered");
      }
    }
  }

}
