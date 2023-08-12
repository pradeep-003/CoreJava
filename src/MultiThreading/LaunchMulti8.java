package MultiThreading;

class Printing implements Runnable
{
    @Override
    public void run() {
        try{
            for(int i=0;i<3;i++){
            System.out.println("Focus is important");
            Thread.sleep(3000);
            }
        }catch (Exception e){
            System.out.println("Some Problem");
        }
    }
}
public class LaunchMulti8  {
    public static void main(String[] args) throws Exception {
        System.out.println("Main Thread Started");

        Printing p = new Printing();

        Thread t = new Thread(p);
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
       // t.join();
         Thread.currentThread().sleep(3000);
        System.out.println("Main Thread finished the work");
    }
}
