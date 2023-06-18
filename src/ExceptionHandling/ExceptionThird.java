package ExceptionHandling;
import java.util.*;

public class ExceptionThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        try
        {
            num = sc.nextInt();
        }
    /*    catch (InputMismatchException e)
        {
            System.out.println("Enter a number");
        }    */
        finally
        {
            sc.close();
            System.out.println("Resource closed");
        }
        System.out.println(num);
    }
}

// DRY - Do not repeat yourself
