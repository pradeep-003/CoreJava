package Inheritance;

class Human // Super class / Base class / Parent class
{
    int age ;
    void sleep(){
        age = 18 ;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student extends Human // Child class / Sub class / derived class
{

}
public class Inheritance1 {
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();
    }
}
