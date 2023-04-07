package section5_exercise;

public class TeenNumberChecker {

  public static boolean hasTeen(int ageA,
                                int ageB,
                                int ageC) {
    return isTeen(ageA) || isTeen(ageB) || isTeen(ageC);
  }

  public static boolean isTeen(int age) {
    return (age <= 19) && (age >= 13);
  }
}
