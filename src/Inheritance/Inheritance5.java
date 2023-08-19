package Inheritance;
// Hierarchical inheritance

class Beast // by default extends object class
    // ObjectClass consist methods like  equals() , hashCode() , toString() , etc ...
{
     void sleep()
     {
         System.out.println("Beast need sleep");
     }
}
class Lion extends Beast
{

}
class Deer extends Beast
{

}
class Monkey extends Beast
{

}
public class Inheritance5 {
    public static void main(String[] args) {
        Lion l = new Lion();
        Deer d = new Deer();
        Deer d1 = new Deer();
        Monkey m = new Monkey();
        Beast b = new Beast();
        l.sleep();
        m.sleep();
        d.sleep();
        System.out.println(d.equals(m));
        System.out.println(d.equals(b));
        System.out.println(d.equals(d1));
    }
}

// Multiple inheritance is not allowed in java
