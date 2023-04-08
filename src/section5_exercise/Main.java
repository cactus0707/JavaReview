package section5_exercise;

public class Main {

  public static void main(String[] args) {
    PositiveNegativeZero.checkNumber(-1);
    SpeedConverter.printConversion(75.114);
    MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    System.out.println(BarkingDog.shouldWakeUp(true, 23));
    System.out.println(LeapYearCalculator.isLeapYear(2000));
    System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.1416345, 3.14167456));
    System.out.println(EqualSumChecker.hasEqualSum(1,1,2));
    System.out.println(TeenNumberChecker.hasTeen(18,23,22));
    System.out.println(AreaCalculator.area(5));
    System.out.println(AreaCalculator.area(5, 5));
    System.out.println(AreaCalculator.area(-1));

  }
}
