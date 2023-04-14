package section6_NumberPalindrome;

public class Main {

  public static void main(String[] args) {
  }

  public static boolean isPalindrome(int number) {
    int reverse = 0;
    int lastDigit = 0;
    int numberToRevers = number;

    while (numberToRevers !=0) {
      lastDigit = numberToRevers % 10;
      reverse = reverse * 10 + lastDigit;
      numberToRevers = numberToRevers / 10;
    }
    return reverse == number;
  }
}
