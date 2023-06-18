package ExceptionHandling;

// Latest version

import java.util.Scanner;

class TryWithResource {
    public static void main(String[] args) {

        int num = 0;
        // Try with resource
        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
        }
        // when try block over Automatically resource will be closed!!
        System.out.println(num);
    }
}