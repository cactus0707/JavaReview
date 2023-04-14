package section6_NumberToWords;

public class Main {

  public static void main(String[] args) {
    numberToWords(10002);
  }

  public static void numberToWords(int number) {
    if (number < 0) {
      System.out.println("Invalid Value");
    }
    number = reverse(number);
    int remainder = 0;

    for (int i = 0; i < getDigitCount(number); i++) {
      remainder = number % 10;
      switch (remainder) {
        case 0:
          System.out.println("Zero");
          break;
        case 1:
          System.out.println("One");
          break;
        case 2:
          System.out.println("Two");
          break;
        case 3:
          System.out.println("Three");
          break;
        case 4:
          System.out.println("Four");
          break;
        case 5:
          System.out.println("Five");
          break;
        case 6:
          System.out.println("Six");
          break;
        case 7:
          System.out.println("Seven");
          break;
        case 8:
          System.out.println("Eight");
          break;
        case 9:
          System.out.println("Nine");
          break;
        default:
          System.out.println("Invalid Value");
          break;
      }
      number = number / 10;
    }
  }

  public static int reverse(int number) {
    int numberToReverse = number;
    int reverseNumber = 0;
    int mostRightNumber = 0;

    while (numberToReverse != 0) {
      mostRightNumber = numberToReverse % 10;
      reverseNumber = reverseNumber * 10 + mostRightNumber;
      numberToReverse = numberToReverse / 10;
    }
    return reverseNumber;
  }

  public static int getDigitCount(int number) {
    if (number < 0) {
      return -1;
    }

    int count = 0;

    do {
      number = number / 10;
      count++;
    } while (number != 0);

    return count;
  }
}
