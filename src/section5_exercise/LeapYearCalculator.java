package section5_exercise;

public class LeapYearCalculator {

  public static boolean isLeapYear(int year) {
    if (!(year>1 && year<9999)) {
      return false;
    }
    if ((year % 4 != 0)) {
      return false;
    } else {
      return year % 100 != 0 || year % 400 == 0;
    }
  }

}
