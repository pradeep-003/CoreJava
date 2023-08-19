package Polymorphism;

class A1{

    private void m1(){

        System.out.println("m1-A1");

    }

}

class B1 extends A1{

    void m1(){

        System.out.println("m1-B1");

    }

}


public class Test2{

    public static void main(String args[]){

        A1 a=new A1();
       // a.m1(); ( error ) to override super class method with subclass , then superclass method must not be declared as private .
        // can't decrease visibility

    }

}
