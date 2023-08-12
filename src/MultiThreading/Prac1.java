package MultiThreading;

import java.util.Scanner;
class Calc1 extends Thread{
    public void run()
    {
        System.out.println("Calculation Task Started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter 1st number");
        int num1 = sc.nextInt();

        System.out.println("Plz enter 2nd number");
        int num2 = sc.nextInt();

        int res = num1 + num2;

        System.out.println(res);
        System.out.println("Calculation Task Ended");
    }
}

class Message1 extends Thread {
    @Override
    public void run() {
        System.out.println("Display Important message Task started");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Focus is important to master skills");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("some Problem");
        }
        System.out.println("Display Important message Task Ended");


    }
}

class Stars extends Thread{
    @Override
    public void run() {
       for(int i=0;i<4;i++){
           for(int j=0;j<4;j++){
               System.out.print("@");
           }
           System.out.println();
       }
    }
}

public class Prac1 {
    public static void main(String[] args) {
        System.out.println("main Thread started");

        Calc1 t1 = new Calc1();
        Message1 t2 = new Message1();
        Stars t3 = new Stars();

        t1.start();
        t2.start();
        t3.start();
    }
}

