package Inheritance;

// Multilevel Inheritance
class Demo1
{
    void disp(){
        System.out.println("Disp written in demo1 class");
    }
}
class Demo2 extends Demo1
{

}
class Demo3 extends Demo2
{

}
public class Inheritance4 {
    public static void main(String[] args) {
         Demo3 d = new Demo3();
         d.disp();
    }
}
