 @FunctionalInterface
 interface Animal{
    void safe(String a, String b);
}

class Main{
    public static void main(String[] args) {
       Animal k =( String a, String b )-> System.out.println(a + b);
       k.safe("pra","deep");
    }
}
