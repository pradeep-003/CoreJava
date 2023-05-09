package Inheritance;
abstract class A1
{
    void m1()
    {
        System.out.println("m1-A");
    }
    abstract void m2();
    abstract void m3();
}
class B1 extends A1
{
    @Override
    void m2() {
        System.out.println("m2-B");
    }

    @Override
    void m3() {
        System.out.println("m3-B");
    }
    void m4()
    {
        System.out.println("m4-B");
    }
}
public class Test3 {
    public static void main(String[] args) {
        A1 a = new B1();
        a.m1();
        a.m2();
        a.m3();
       // a.m4(); ---error

        B1 b = new B1();
        b.m1();
        b.m2();
        b.m3();
        b.m4();
    }
}


