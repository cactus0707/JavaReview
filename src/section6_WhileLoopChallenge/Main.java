package section6_WhileLoopChallenge;

public class Main {

  public static void main(String[] args) {
    printEvenNumberWithRange(5, 20);
  }

  public static void printEvenNumberWithRange(int start,
                                              int end) {

    if(!((start<=end) &&(start >0) && (end > 0))) {
      return;
    }

    int evenCount = 0;
    int oddCount = 0;

    while (start<=end) {
      if (isEvenNumber(start)) {
        evenCount++;
        System.out.println(start);
      } else {
        oddCount++;
      }
      if (evenCount >= 5) {
        break;
      }
      start++;
    }
    System.out.println("Total odd numbers found = " + oddCount);
    System.out.println("Total even numbers found = " + evenCount);

  }

  public static boolean isEvenNumber(int number) {
    return number % 2 == 0;
  }

}
