package Interface;

// We can use Static at inner class

// inner - member, static and Anonymous
class A4
{
    void show()
    {
        System.out.println("In show");
    }
     class B4
    {
      void display()
        {
            System.out.println("In display");
        }
    }
}
 class InnerDemo {
    public static void main(String[] args) {
        A4 obj = new A4();
        obj.show();
       // obj.display();       Cannot resolve method 'display' in 'A4'
        // B4 obj1 = new B4();   Cannot resolve symbol 'B4'
      A4.B4 obj1 = obj.new B4();
       // A4.B4 obj1 = new A4.B4(); If inner class is static
        obj1.display();


    }
}
