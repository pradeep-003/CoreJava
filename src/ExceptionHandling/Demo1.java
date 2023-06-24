package ExceptionHandling;

// Default Exception handling


class Demo1{

    public static void main(String[] args){

        System.out.println("Entering main");

        doStuff();

        System.out.println("Exiting main");

    }

    public static void doStuff(){

        System.out.println("Entering doStuff");

        doMoreStuff();

        System.out.println("Exiting doStuff");

    }

    public static void doMoreStuff(){

        System.out.println("Entering doMoreStuff");

        System.out.println(10/0);

        System.out.println("Exiting doMoreStuff");

    }

}
