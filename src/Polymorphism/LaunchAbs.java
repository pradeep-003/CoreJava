package Polymorphism;
abstract class AeroPlane2
{
    // abstract int age;  abstract can't given to a variable
  //  abstract Constructor doesn't exist because it has boby super();
    // if class consist even a single method as abstract then you must declare the class as abstract .
    abstract public void takeOff();
    abstract public void fly();

    public void landing(){
        System.out.println("Aeroplane is landing");
    }
}
class CargoPlane2 extends AeroPlane2
{
    public void fly()
    {
        System.out.println("CargoPlane flies at lower height");
    }

    public void takeOff()
    {
        System.out.println("CargoPlane require longer Runway ");
    }

    public void alert()
    {
        System.out.println("Alert..");
    }
}
class PassengerPlane2 extends AeroPlane2
{
    public void fly() // Overriding Method
    {
        System.out.println("PassengerPlane flies at medium height");
    }

    public void takeOff()
    {
        System.out.println("PassengerPlane requires medium size runway");
    }
}



public class LaunchAbs {
    public static void main(String[] args) {

       AeroPlane2 cp = new CargoPlane2();
        cp.takeOff();
        cp.fly();
        cp.landing();
      //  cp.alert();   // error can't call because cp has type is parent class and it's specialized method if you want to call then you can do downcasting
        ((CargoPlane2)cp).alert(); //downcasting

        PassengerPlane2 pp = new PassengerPlane2();
        pp.fly();
        pp.takeOff();
        pp.landing();

        // AeroPlane2 ref = new AeroPlane2() ;
           // can't create object of abstract method .

    }
}

