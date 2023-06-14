package Interface;
interface A3
{
    void show();
    default void config()
    {
        System.out.println("In config");
    }
    static void abc()
    {
        System.out.println("In abc");
    }
}

class B3 implements A3
{
    public void show()
    {
        System.out.println("In show");
    }
}
public class Java8Fe {
    public static void main(String[] args) {
        A3.abc();
     //   A3.config();       Non-static method 'config()' cannot be referenced from a static context
        A3 obj = new B3();
        obj.config();
        obj.show();
       //  obj.abc();        Static method may be invoked on containing interface class only
    }
}
