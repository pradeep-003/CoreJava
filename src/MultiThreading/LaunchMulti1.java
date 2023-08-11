package MultiThreading;

import java.util.Scanner;

public class LaunchMulti1 {
    public static void main(String[] args) {
        System.out.println("Calculation Task Started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter 1st number");
        int num1 = sc.nextInt();

        System.out.println("Plz enter 2nd number");
        int num2 = sc.nextInt();

        int res = num1 + num2 ;

        System.out.println(res);
        System.out.println("Calculation Task Ended");

        System.out.println("***************************************");

        System.out.println("Printing * Task Started");

        for(int i=0;i<4;i++){
            System.out.println("*");
        }

        System.out.println("Printing * Task Ended");

        System.out.println("***************************************");

        System.out.println("Display Important message Task started");
        for(int i=0;i<3;i++){
            System.out.println("Focus is important to master skills");
        }
        System.out.println("Display Important message Task Ended");

        System.out.println("***************************************");
    }
}
