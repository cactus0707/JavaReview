package section04;

public class Hello {

  public static void main(String[] args) {
    System.out.println("Hello, Kim");
    System.out.println("Hello, World");
    boolean isAlian = false;
    if (!isAlian) {
      System.out.println("It is not an alien!");
    }

    int topScore = 80;
    if (topScore < 100) {
      System.out.println("You got the high score!");
    }
    int secondTopScore = 60;
    if (topScore > secondTopScore && topScore < 100) {
      System.out.println("Greater than second top score and less than 100");
    }

    if ((topScore > 90) || (secondTopScore <= 90)) {
      System.out.println("Either or both of the conditions are true");
    }

    String makeCar = "Volkswagen";
    boolean isDomestic = makeCar == "Volkswagen" ? false : true;

    if (isDomestic) {
      System.out.println("This car is domestic to our country");
    }

    String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
    System.out.println(s);
  }

}