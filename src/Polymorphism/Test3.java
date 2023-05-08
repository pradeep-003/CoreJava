package Polymorphism;

class A2{

    int m1(){

        System.out.println("m1-A2");

        return 10;

    }

}

class B2 extends A2{

  /*  long m1(){          // overridden method must have same data type

        System.out.println("m1-B2");

    } */

}

public class Test3{

    public static void main(String args[]){

        A2 a=new B2();

        a.m1();

    }

}
