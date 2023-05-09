package Inheritance;
/* To override super class method with subclass method,sub class method must ha<e either the same scope
        of the super class method or more scope when compared with super class method scope otherwise the
        compiler will raise an error. */

class A{

    protected void m1(){

        System.out.println("m1-A");

    }

}

class B extends A{

    public void m1(){

        System.out.println("m1-B");

    }

}

public class Test{

    public static void main(String args[]){

        A a=new A();

        a.m1();

    }

}

// access ( public > protected > default > private )