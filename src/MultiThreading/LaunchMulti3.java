package MultiThreading;

class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("Child Thread");
    }
}
public class LaunchMulti3 {
    public static void main(String[] args) {
        System.out.println("main Thread");

        MyThread t =new MyThread();
        t.start();
    }
}
