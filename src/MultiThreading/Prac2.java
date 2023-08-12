package MultiThreading;
class MultiRun implements Runnable
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
class off implements Runnable
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public void run(String s) {
        System.out.println(Thread.currentThread().getName());
    }

}

public class Prac2 {
    public static void main(String[] args) {

        MultiRun m = new MultiRun();
        off o = new off();
        Thread t = new Thread(m);
        Thread t1 = new Thread(o);
        t.start();
        t1.start();
        o.run("off");
    }
}
