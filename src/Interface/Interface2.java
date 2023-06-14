package Interface;
interface A2
{
    void show();
}
interface X2
{
    void abc();
}
class B2 implements A2,X2
{
   public void show(){
        System.out.println("In show");
    }
    public void abc(){
        System.out.println("In abc");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        A2 obj = new B2();
        obj.show();
    }
}
