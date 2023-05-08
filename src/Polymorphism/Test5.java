package Polymorphism;

/* To override superclass method with subclass method either super class method or subclass method as
    static then compiler will rise an error.If we declare both super and subclass method as static in method
    overriding compiler will not rise any error,JVM will provide output from the super class
    Method
     NOTE: If we are trying to override superclass static method with subclass static method then super class static
method will override subclass static method,where JVM will generate output from super class static method.
     */

class A4{

    static void m1(){

        System.out.println("m1-A4");

    }

}

class B4 extends A4{

    static void m1(){

        System.out.println("m1-B4");

    }

}

public class Test5 {
    public static void main(String[] args) {
        A4 a=new B4();

        a.m1();
    }
}
