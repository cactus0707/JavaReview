package section6_EvenDigitSum;

public class Main {

  public static int getEvenDigitSum(int number) {

    if (number < 0) {
      return -1;
    }

    int sumOfEvenDigit = 0;
    int remainder = 0;
    while (true) {
      remainder = number % 10;
      if (remainder % 2 == 0) {
        sumOfEvenDigit += remainder;
      }
      if (number == 0) {
        break;
      }
      number = number / 10;
    }
    return sumOfEvenDigit;
  }

}
