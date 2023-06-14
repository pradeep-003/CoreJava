package Interface;
import java.util.Scanner;
class PersonDetails
{
    Scanner scan = new Scanner(System.in);

    int age = scan.nextInt();
    Address add ;
    class Address
    {

        String city = scan.next();

        String state = scan.next();
        int pinCode = scan.nextInt();
        void display()
        {
            System.out.println(city + " " + state + " " + pinCode);
        }

    }

}

public class Aditya {
    public static void main(String[] args) {
        PersonDetails p = new PersonDetails();
       PersonDetails.Address a = p.new Address();
       a.display();
    }
}
