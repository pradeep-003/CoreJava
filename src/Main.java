class Car
{
    private Engine e;


    public void setE(Engine e)
        {
            this.e = e ;
        }
    public void call()
    {
        e.start();
    }
}
class Engine
{
    public void start()
    {
        System.out.println("Car started");

    }
}

class Main{
    public static void main(String[] args) {
        Engine e = new Engine();
        Car c = new Car();
        c.setE(e);
        c.call();
    }
}
