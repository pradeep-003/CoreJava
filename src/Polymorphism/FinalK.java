package Polymorphism;

//final class can't participate in inheritance
  /* final class Animal
{
    void sleep()
    {
        System.out.println("Animal is sleeping");
    }
} */
 class Animal
{
   final int age = 19 ;
   final void sleep() // final method participate in inheritance , but you can't override it in child class .
    {  // age = 20 ; Cannot assign a value to final variable 'age'.
        System.out.println("Animal is sleeping");
    }
}
class Tiger extends Animal
{
     // void sleep() {}  final method we can't modify in child class
}
public class FinalK {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();
    }
}
