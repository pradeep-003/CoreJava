package Interface;

public class University {
    class Department {
        void disp() {
            System.out.println("Inner class disp");
        }
    }
        public static void main(String[] args) {
            System.out.println("Main method outer class");

          //  Department D = new Department();  CE

           University u = new University();

           /*  University.Department d = u.new Department();
            d.disp();  */

            u.new Department().disp();  // anonymous
            // not a good practice because with giving a Reference name you have to create everytime new object...

            University.Department Dp = new University().new Department();
            Dp.disp();
    }
}