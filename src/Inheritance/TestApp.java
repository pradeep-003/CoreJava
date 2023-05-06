package Inheritance;

class Parent{

    public void methodOne(){System.out.println("methodOne from parent");}

}

class Child extends Parent{

    public void methodTwo(){System.out.println("methodTwo from child");}

}

public class TestApp{

    public static void main(String... args){

        Parent p=new Parent();

        p.methodOne();


        Child c=new Child();

        c.methodOne();

        c.methodTwo();


    }

}