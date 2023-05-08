package Polymorphism;

final class A3{

    void m1(){

        System.out.println("m1-A3");

    }

}

// Super class method must not be declared as final .

/* class B3 extends A3{

    final void m1(){

        System.out.println("m1-B3");

    }

} */

public class Test4{

    public static void main(String[] args){

      /*  A3 a=new B3();

       a.m1(); */

    }

}
