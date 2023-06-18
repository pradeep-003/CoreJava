package Interface;
// Functional interface with a single abstract method
interface MyInterface {
    void myMethod();
}

class Stu {
    // Method that accepts MyInterface as a parameter
    public void doSomething(MyInterface myInterface) {
        // Call the method in the functional interface
        myInterface.myMethod();
    }
}
class PassingLambda {
    public static void main(String[] args) {
        // Pass a lambda expression to the method
        Stu s = new Stu();
        s.doSomething(() -> System.out.println("Hello, lambda!"));
    }
}