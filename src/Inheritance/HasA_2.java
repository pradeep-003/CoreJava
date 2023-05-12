package Inheritance;

class Car
{
    private Engine e;
    public Car(Engine e)
    {
        this.e=e ;
    }

    public void setE(Engine e) {
        this.e = e;
    }

    public void start()
    {
        e.engineStart();
    }
}
class Engine
{
    public void engineStart()
    {
        System.out.println("Car Started");
    }
}
public class HasA_2 {
    public static void main(String[] args) {
        Engine e = new Engine();
        Car c = new Car(e); // Constructor injection
        c.setE(e); // Setter injection
        c.start();
    }
}
