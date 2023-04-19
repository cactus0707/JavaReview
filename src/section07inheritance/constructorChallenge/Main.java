package section07inheritance.constructorChallenge;

public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer("flynn", 1000, "flynn@email.com");
    System.out.println(customer.getName());
    System.out.println(customer.getCreditLimit());
    System.out.println(customer.getEmail());

    Customer secondeCustomer = new Customer();
    System.out.println(secondeCustomer.getName());
    System.out.println(secondeCustomer.getCreditLimit());
    System.out.println(secondeCustomer.getEmail());

    Customer thirdCustomer = new Customer("Joe", "joe@email.com");
    System.out.println(thirdCustomer.getName());
    System.out.println(thirdCustomer.getCreditLimit());
    System.out.println(thirdCustomer.getEmail());
  }

}
