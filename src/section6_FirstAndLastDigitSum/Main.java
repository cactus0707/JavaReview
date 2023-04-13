package section6_FirstAndLastDigitSum;

public class Main {

  public static void main(String[] args) {
  }

  public static int sumFirstAndLastDigit(int number) {
    if (number < 0) {
      return -1;
    }
    int sum = 0;
    sum += number % 10;

    while (true) {
      if (number / 10 == 0) {
        sum += number;
        break;
      }
      if (number == 0) {
        sum += number;
        break;
      }
      number = number / 10;
    }
    return sum;
  }
}
