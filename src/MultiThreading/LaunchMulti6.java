package MultiThreading;

import java.util.Scanner;

class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        String tName = Thread.currentThread().getName();
        if(tName == "CALC"){
            Calc();
        }else{
            importantMessage();
        }
    }

    public void Calc()
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

    public void importantMessage()
    {
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
public class LaunchMulti6 {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2 = new MyThread1();

        thread1.setName("CALC");
        thread2.setName("PRINT");

        thread1.start();
        thread2.start();

    }
}
