package section6_ControlFlow;

public class Main {

  public static void main(String[] args) {
    //traditional switch statement
    char charValue = 'A';
    switch (charValue) {
      case 'A':
        System.out.println("A is able");
        break;
      case 'B':
        System.out.println("B is baker");
        break;
      case 'C':
        System.out.println("C is charlie");
        break;
      case 'D':
        System.out.println("D is dog");
        break;
      case 'E':
        System.out.println("E is easy");
        break;
      default:
        System.out.println("Letter " + charValue + " was not found in the switch");
        break;
    }

    //enhanced switch statement
    int day = 5;
    printDayOfWeek(5);

  }

  public static void printDayOfWeek(int day) {
    String dayOfWeek = switch (day) {
      case 0 -> {
        yield "Sunday";
      }
      case 1 -> "Monday";
      case 2 -> "Tuesday";
      case 3 -> "Wednesday";
      case 4 -> "Thursday";
      case 5 -> "Friday";
      case 6 -> "Saturday";
      default -> "Invalid Day";
    };
    System.out.println(day + " stands for " + dayOfWeek);

  }

  public static void printWeekDay(int day) {
    String dayOfWeek = "Invalid Day";
    if (day == 0) {
      dayOfWeek = "Sunday";
    } else if (day == 1) {
      dayOfWeek = "Monday";
    } else if (day == 2) {
      dayOfWeek = "Tuesday";
    } else if (day == 3) {
      dayOfWeek = "Wednessday";
    } else if (day == 4) {
      dayOfWeek = "Thursday";
    } else if (day == 5) {
      dayOfWeek = "Friday";
    } else if (day == 6) {
      dayOfWeek = "Saturday";
    } else {
      System.out.println(day + " stands for " + dayOfWeek);
    }
  }
}


