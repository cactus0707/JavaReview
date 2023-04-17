package section07inheritance.introductionToClassesAndObject;

public class Main {

  public static void main(String[] args) {
    Car car = new Car();
    car.setMake("Porsche");
    car.setModel("Carrera");
    car.setColor("Black");
    car.setDoors(2);
    System.out.println("make = " + car.getMake());
    System.out.println("model = " + car.getModel());
    car.descriveCar();

    Car targa = new Car();
    targa.setMake("Porsche");
    targa.setModel("Targa");
    targa.setDoors(2);
    targa.setConvertible(false);
    targa.setColor("red");
    targa.descriveCar();
  }
}
