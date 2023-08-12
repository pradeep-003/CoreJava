package MultiThreading;

import java.util.Scanner;
class Demo
{

}
class Calc2 extends Demo implements Runnable {
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

class Message2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Display Important message Task started");
        try { for (int i = 0; i < 3; i++) {
            System.out.println("Focus is important to master skills");
            Thread.sleep(2000);
        }
        }
        catch(Exception e){
            System.out.println("some Problem");
        }
        System.out.println("Display Important message Task Ended");


    }
}

public class LaunchMulti5 {
    public static void main(String[] args) {
        System.out.println("main Thread started");

        Calc2 c1 = new Calc2();
        Message2 m2 = new Message2();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();
    }
}
