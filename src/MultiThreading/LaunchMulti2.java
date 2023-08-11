package MultiThreading;

public class LaunchMulti2 {
    public static void main(String[] args) {
        System.out.println("Main Thread");

        System.out.println("Before changing");

        String name = Thread.currentThread().getName();
        System.out.println("The name of default thread is '" + name +"'");
        System.out.println("The priority of main thread is " + Thread.currentThread().getPriority());

        System.out.println("After Changing");

        Thread t = Thread.currentThread();
        t.setName("pw");
        t.setPriority(1);

        String name1 = Thread.currentThread().getName();
        System.out.println("The name of  thread is '" + name1 +"'");
        System.out.println("The priority of pw thread is " + Thread.currentThread().getPriority());


    }
}
