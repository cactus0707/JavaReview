package section6_DiagonalStar;

public class DiagonalStar {

  public static void main(String[] args) {
    printSquareStar(2);
  }

  public static void printSquareStar(int number) {
    if (number < 5) {
      System.out.println("Invalid Value");
      return;
    }

    for (int i = 0; i < number; i++) {
      for (int j = 0; j < number; j++) {
        if (i == 0 || i == number - 1 || j == 0 || j == number - 1 || i == j
            || number == i + j + 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
