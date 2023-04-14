package section6_LargestPrime;

public class LargestPrime {


  /**
   * Write a method named getLargestPrime with one parameter of type int named number.
   * If the number is negative or does not have any prime numbers,
   * the method should return -1 to indicate an invalid value.
   * The method should calculate the largest prime factor of a given number and return it.
   */
  public static int getLargestPrime(int number) {
    if (number <= 0) {
      return -1;
    }
    if (number == 1) {
      return -1;
    }
    //TO-DO : does not have prime number return -1
    //TO-DO : return the largest prime factor of given number and return it.
    int largestPrimeNumber = 2;
    int factor = 0;
    for (int i = 2; i <= number; i++) {
      if (number % i == 0 && i % factor != 0) {
        factor = i;
      }
    }
    return factor;
  }
}
