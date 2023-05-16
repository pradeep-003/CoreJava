package Interface;
interface A
{
    void show();
}
interface X
{
    void abc();
}
class B implements A,X
{
    @Override
    public void show() {
        System.out.println("In show");
    }

    @Override
    public void abc() {
        System.out.println("In abc");
    }
}
public class Demo {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
