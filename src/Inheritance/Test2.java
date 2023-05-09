package Inheritance;
abstract class DB_Driver1
{
    public abstract void getDriver();
}
class New_DB_Driver1 extends DB_Driver1
{
    @Override
    public void getDriver() {
        System.out.println("Type-4 Driver");
    }
}
public class Test2 {
    public static void main(String[] args) {
        DB_Driver1 d = new New_DB_Driver1();
        d.getDriver();
    }
}
