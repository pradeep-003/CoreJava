package Inheritance;
import java.util.*;
class Rectangle
{
    float length ;
    float breadth ;
    float area ;
    public void input()
    {
        System.out.println("Calculation of Rectangle app : ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of Rectangle");
        length = scan.nextFloat();
        System.out.println("Please enter breadth of Rectangle");
        breadth = scan.nextFloat();
    }
    public void compute()
    {
        area = length * breadth ;
    }
    public void disp()
    {
        System.out.println("The area of rectangle is : " + area);
        System.out.println("-------------------------------------------");
    }

}

class Square
{
    float length ;
    float area ;
    public void input()
    {
        System.out.println("Calculation of Square app : ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of Square");
        length = scan.nextFloat();
    }
    public void compute()
    {
        area = length * length ;
    }
    public void disp()
    {
        System.out.println("The area of Square is : " + area);
        System.out.println("-------------------------------------------");
    }

}
class Circle
{
    float radius ;
    float area ;
    final float pi = 3.14f;

    public void input()
    {
        System.out.println("Calculation of circle app : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius of circle ");
        radius = sc.nextFloat();
    }
    public void compute()
    {
        area = pi*radius*radius;
    }
    public void disp()
    {
        System.out.println("The area of circle is " + area);
        System.out.println("-------------------------------------------");
    }
}
public class LaunchApp {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        rec.input();
        rec.compute();
        rec.disp();

        Square sq = new Square();
        sq.input();
        sq.compute();
        sq.disp();

        Circle c = new Circle();
        c.input();
        c.compute();
        c.disp();

    }
}
