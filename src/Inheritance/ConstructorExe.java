package Inheritance;

class Demo4
{
    int a,b ;

    public Demo4()
    {
        System.out.println("Parent class Constructor");
    }
    public Demo4(int x , int y)
    {
        System.out.println("Parameterized parent class Constructor");

        a = x ; b = y ;
    }

}

class Demo5 extends Demo4
{
    int m,n ;

    public Demo5()
    {
       super(10,20);
        System.out.println("Child class constructor");
    }
    public Demo5(int x , int y)
    {
        System.out.println("Parameterized child class Constructor");

        m = x ; n = y ;
    }

}
public class ConstructorExe {
    public static void main(String[] args) {
        Demo5 d = new Demo5();
       // Demo5 d1 = new Demo5(10,20);
    }
}
