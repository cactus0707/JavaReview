package section6_AllFactors;

public class Main {

  public static void printFactors(int number) {
    if (number < 1) {
      System.out.println("Invalid Value");
      return;
    }
    for (int factor = 1; factor <= number; factor++) {
      if (number % factor == 0) {
        System.out.println(factor);
      }
    }
  }
}
