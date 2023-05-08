package Polymorphism;
class A
{
    void m1()
    {
        System.out.println("m1-A");
    }
}
class B extends A
{
    @Override
    void m1() {
        System.out.println("m1-B");
    }
}
public class Test1 {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
        A b = new A();
        b.m1();
    }
}
