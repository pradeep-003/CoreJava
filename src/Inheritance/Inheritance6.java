package Inheritance;
class Aeroplane
{
    public void takeOff() // Inherited Method
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()  // Overridden Method
    {
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane extends Aeroplane
{
    public void fly() // Overriding Method
    {
        System.out.println("CargoPlane is flying");
    }
    public void carryGoods() // Specialized Method
    {
        System.out.println("CargoPlane carries goods");
    }
}
class PassengerPlane extends Aeroplane
{
    public void carryPassenger() // Specialized Method
    {
        System.out.println("PassengerPlane carries passenger");
    }
}
public class Inheritance6 {
    public static void main(String[] args) {
      CargoPlane cp = new CargoPlane();
      cp.takeOff();
      cp.fly();
      PassengerPlane pp = new PassengerPlane();
      pp.takeOff();
      pp.fly();
    }
}
