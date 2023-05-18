package Inheritance;

// Constructor injection
// Setter injection
import java.util.Set;

class Company
{
    private Employee em ;
    public Company(Employee em){
        this.em = em ;
    }

    public void SetE(Employee em){
        this.em = em ;
    }
    void call(){
        em.workStatus();
    }


}
class Employee
{
    void workStatus(){
        System.out.println("File checking is in process!");
    }
}
public class HasA3 {
    public static void main(String[] args) {
        Employee em = new Employee();
        Company c = new Company(em);
        c.call();
    }
}
