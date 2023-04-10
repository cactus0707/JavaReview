package section6_ControlFlow;

public class NumberOfDaysInMonth {

  public static boolean isLeapYear(int year) {
    if (!(year >= 1 && year <= 9999)) {
      return false;
    }
    return (((year % 4) == 0) && ((year % 100) != 0)) || (year % 400 == 0);
  }

  public static int getDaysInMonth(int month,
                                   int year) {
    if (!(month >= 1 && month <= 12) || !(year >= 1 && year <= 9999)) {
      return -1;
    } else {
      return switch (month) {
        case 1, 3, 5, 8, 7, 10, 12 -> 31;
        case 2 -> {
          if (isLeapYear(year)) {
            yield 29;
          } else {
            yield 28;
          }
        }
        case 4, 6, 9, 11 -> 30;


        default -> throw new IllegalStateException("Unexpected value: " + month);
      };
    }
  }

}
