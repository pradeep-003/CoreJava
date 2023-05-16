package Interface;
interface Computer
{
    void compileCode();

}
class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got 6 errors");
    }
}
class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got 5 errors");
    }
}
class Developer
{
    public void buildApp(Computer obj)
    {
        System.out.println("Building App");
        obj.compileCode();
    }
}
public class Main {
    public static void main(String[] args) {
        Computer obj = new Laptop();
     //   Computer obj = new Desktop();
        Developer dev = new Developer();
        dev.buildApp(obj);
    }
}
