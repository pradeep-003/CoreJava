package Inheritance;
class Parent1{

    public void methodOne(){System.out.println("methodOne from parent1");}

}

class Child1 extends Parent{

    @Override

    public void methodOne(){System.out.println("methodOne from child1");}

}

public class OverriddenMethod{

    public static void main(String... args){

        Parent1 p=new Parent1();

        p.methodOne();//methodOne from parent


        Child1 c=new Child1();

        c.methodOne();//methodOne from child

    }

}
