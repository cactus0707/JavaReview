package section6_DigitSum;

public class Main {

  public static void main(String[] args) {
    System.out.println(sumDigit(10));
  }

  public static int sumDigit(int number) {
    int sum = 0;
    int remainder = 0;
    int quotient = number;

    if (number < 0) {
      return -1;
    }
    while (quotient > 9) {
      remainder = quotient % 10;
      quotient = quotient / 10;
      sum += remainder;
      if (sum > 9) {
        quotient = sum;
        sum = 0;
      }
    }
    sum += quotient;

    return sum;
  }

}
