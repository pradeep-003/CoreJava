package Inheritance;
// Single-level Inheritance / Simple Inheritance

class Animal{
    void sleep()
    {
        System.out.println("Animal need sleep");
    }
}
class Tiger extends Animal
{

}
public class Inheritance3 {
    public static void main(String[] args) {
      Tiger t = new Tiger();
      t.sleep();
    }
}
