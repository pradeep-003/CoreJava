package Inheritance;

class Student2
{
    private Heart h;
    public Student2(Heart h)
    {
        this.h = h ;
    }

    public void setH(Heart h) {
        this.h = h;
    }

    public void call()
    {
        h.heartBeat();
    }
}
class Heart
{
    public void heartBeat()
    {
        System.out.println("Heart is important");
    }

}
public class HasA {
    public static void main(String[] args) {
        Heart h = new Heart();
        Student2 s = new Student2(h);
       // s.setH(h);
        s.call();
    }
}
