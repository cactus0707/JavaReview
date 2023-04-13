package section6_NumberPalindrome;

import java.util.Stack;

public class Main {

  public static boolean isPalindrome(int number) {
    int reverseNumber = 0;
    Stack<Integer> palidromeNumber = new Stack<Integer>();

    while (number!=0) {
      palidromeNumber.push((Integer) number % 10);
      number /= 10;
    }
    while (palidromeNumber.capacity()!=0) {
      reverseNumber += (int) palidromeNumber.pop() + palidromeNumber.capacity();
    }
    reverseNumber += palidromeNumber.pop();
    return reverseNumber - number == 0;
  }
}
