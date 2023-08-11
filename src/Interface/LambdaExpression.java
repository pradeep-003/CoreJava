package Interface;
@FunctionalInterface
interface Animal
{
    void Eat();
}

@FunctionalInterface
interface Game
{
    void play(boolean goodPlayer);
}
public class LambdaExpression {
    public static void main(String[] args) {

        Animal a = () -> System.out.println("Eating...");
        a.Eat();
        Game g = (goodPlayer) -> System.out.println(goodPlayer);
        g.play(true);
    }
}
