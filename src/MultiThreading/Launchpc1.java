package MultiThreading;

class Queue1
{
    int x;
    boolean valueInX = false;

    synchronized public void  put(int j)
    {
        try
        {
            if (valueInX==true)
            {
                wait();
            }else
            {
                x = j;
                System.out.println("I have produced value x = " + x);
                valueInX = true;

                notify();
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    synchronized public void  get()
    {
        try
        {
            if(valueInX == false)
            {
                wait();
            }
            else
            {
                System.out.println("I have consumed value  " + x);
                valueInX = false;

                        notify();
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
class Producer1 extends Thread
{
    Queue1 q;
    Producer1(Queue1 b)
    {
        q = b;
    }
    @Override
    public void run() {
        int i = 1;
        while(true)
        {
            q.put(i++);
        }
    }
}

class Consumer1 extends Thread
{
    Queue1 q;
    Consumer1 (Queue1 a)
    {
        q = a;
    }
    @Override
    public void run()
    {
        while(true)
        {
            q.get();
        }
    }
}
public class Launchpc1
{
    public static void main(String[] args)
    {
        Queue1 q = new Queue1();

        Producer1 p = new Producer1(q);
        Consumer1 c = new Consumer1(q);

        p.start();
        c.start();
    }
}
