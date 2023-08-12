package MultiThreading;
class Example implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Focus is important");
            try{Thread.sleep(3000);}catch(Exception e) {
                System.out.println("Thread is interrupted");
            }
        }
    }
}

public class LaunchMulti9 {
    public static void main(String[] args) {
        Example ex = new Example();

        Thread t1 = new Thread(ex);
        t1.start();
        t1.interrupt();
    }
}
