package section07inheritance.classchallenge;

public class Main {

  public static void main(String[] args) {

    Account bobsAccount = new Account(
        "12345",
        1000.0,
        "Bob brown",
        "myemail@bob.com",
        "(087) 123-4567");

    bobsAccount.withdrawFunds(100.0);
    bobsAccount.depositFunds(250);
    bobsAccount.withdrawFunds(50);
    bobsAccount.withdrawFunds(200);

    bobsAccount.depositFunds(100);
    bobsAccount.withdrawFunds(45.55);
    bobsAccount.withdrawFunds(54.46);
    bobsAccount.withdrawFunds(54.45);
    Account flynnAccount = new Account("flynn", "flynn@email.com", "12345");
    System.out.println("Account number : " + flynnAccount.getNumber() + "; name " + flynnAccount.getCustomerName());
  }
}
