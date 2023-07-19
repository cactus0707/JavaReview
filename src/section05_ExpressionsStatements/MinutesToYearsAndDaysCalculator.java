package section5_exercise;

public class MinutesToYearsAndDaysCalculator {

  public static void printYearsAndDays(long minutes) {
    if (minutes < 0) {
      System.out.println("Invalid Value");
      return;
    }

    long hours = minutes / 60;
    long days = hours / 24;
    long daysRemaining = days % 365;
    long years = days/ 365;
    System.out.println(minutes + " min = " + years + " y and "+ daysRemaining + " d");
  }

}
