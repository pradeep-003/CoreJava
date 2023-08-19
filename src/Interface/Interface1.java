package Interface;
interface A1
{
    int num = 9 ;
    void show();
}
public class Interface1 {
    public static void main(String[] args) {
        System.out.println(A1.num);
      // A1 a = new A1();    'A1' is abstract; cannot be instantiated
      //  A1.num = 8 ;       Cannot assign a value to final variable 'num'
        A1 a  = new A1(){
                public void show(){
                    System.out.println("In-Show");
        }
        };
        a.show();
    }
}
