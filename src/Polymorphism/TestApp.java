package Polymorphism;

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

        c.methodOne();//inherited method

        c.methodTwo();//Specialized method


        Parent p1=new Child();

        p1.methodOne();

     //   p1.methodTwo();//CE: can't find the symbol methodTwo in Parent

    }

}