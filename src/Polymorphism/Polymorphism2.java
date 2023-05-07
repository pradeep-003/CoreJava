package Polymorphism;

class AeroPlane1
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
class CargoPlane1 extends AeroPlane1
{
    public void fly()
    {
        System.out.println("CargoPlane flies at lower height");
    }
    public void carryGoods() // Specialized Method
    {
        System.out.println("CargoPlane carries goods");
    }
    public void takeOff()
    {
        System.out.println("CargoPlane require longer Runway ");
    }
}
class PassengerPlane1 extends AeroPlane1
{
    public void fly() // Overriding Method
    {
        System.out.println("PassengerPlane flies at medium height");
    }
    public void carryPassenger() // Specialized Method
    {
        System.out.println("PassengerPlane carries passenger");
    }
    public void takeOff()
    {
        System.out.println("PassengerPlane requires medium size runway");
    }
}
class FighterPlane1 extends AeroPlane1
{
    @Override
    public void takeOff() {
        System.out.println("FighterPlane requires small size runway ");
    }

    @Override
    public void fly() {
        System.out.println("FighterPlane flies at high height");
    }
}

class Airport
{
    public void poly(AeroPlane1 ref)
    {
        System.out.println("----------------------");
       ref.takeOff();
       ref.fly();
        System.out.println("----------------------");
    }
}
public class Polymorphism2 {
    public static void main(String[] args) {

        CargoPlane1 cp = new CargoPlane1();

        PassengerPlane1 pp = new PassengerPlane1();

        FighterPlane1 fp = new FighterPlane1();

        /*
         * cp.takeOff();
         * cp.fly();
         * pp.takeOff();
         * pp.fly();
         * fp.takeOff();
         * fp.fly();
         */

        Airport ap = new Airport();
        ap.poly(cp);

        ap.poly(pp);

        ap.poly(fp);

    }
}
