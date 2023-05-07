package Polymorphism;

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
    public void fly()
    {
        System.out.println("CargoPlane is flying");
    }
    public void carryGoods() // Specialized Method
    {
        System.out.println("CargoPlane carries goods");
    }
    public void takeOff()
    {
        System.out.println("CargoPlane is taking off");
    }
}
class PassengerPlane extends Aeroplane
{
    public void fly() // Overriding Method
    {
        System.out.println("PassengerPlane is flying");
    }
    public void carryPassenger() // Specialized Method
    {
        System.out.println("PassengerPlane carries passenger");
    }
    public void takeOff()
    {
        System.out.println("PassengerPlane is taking off");
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
          Aeroplane cp = new CargoPlane(); // object reference type must be same as its class or Parent class .

        PassengerPlane pp = new PassengerPlane();

        Aeroplane ref ;

     //   cp = pp ;  cp won't be able to hold the address of pp.
        ref = cp ; // but parent class reference has capacity to hold child class address .

        /*
         * Polymorphism ("Method override")
         */
        ref.fly();
        ref.takeOff();
        System.out.println("--------------------------");
        ref = pp ;
        ref.takeOff();
        ref.fly();
    }
}
