package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiJava7 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
        }catch (ArithmeticException | NullPointerException | InputMismatchException e)
        {
           e.printStackTrace();
        }
    }
}
