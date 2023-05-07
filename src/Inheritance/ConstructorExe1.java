package Inheritance;

class Demo6
{
    int a,b ;

    public Demo6()
    {
        System.out.println("Parent class Constructor");
    }
    public Demo6(int x , int y )
    {
        System.out.println("Parameterized parent class Constructor");

        a = x ; b = y ;
    }

}

class Demo7 extends Demo6
{
    int m,n ;

    public Demo7()
    {
        this(10,20); // this method calls in same class
        System.out.println("Child class constructor");
    }
    public Demo7(int x , int y )
    {
        //super();
        System.out.println("Parameterized child class Constructor");

        m = x ; n = y ;
    }

}
public class ConstructorExe1 {
    public static void main(String[] args) {
        Demo7 d = new Demo7();
    }
}