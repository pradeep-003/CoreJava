package ExceptionHandling;

public class ThrowsKeyword2 {

        public static void main(String... args) {

            try{
            doWork();}catch(ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }

        }

        public static void doWork() throws ArithmeticException{

            doMoreWork();

        }

        public static void doMoreWork() throws ArithmeticException{

            System.out.println(10/0);


    }
}
