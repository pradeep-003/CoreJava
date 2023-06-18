package Interface;
interface Help
        {
            int a = 10;
            void help();
        }
class Hp implements Help
{

    @Override
    public void help() {
        System.out.println("Helping");
    }
}
public class Example {
    public static void main(String[] args) {
      //  new Help();  can't initialized
        Help h = new Hp();
        h.help();
    }
}
