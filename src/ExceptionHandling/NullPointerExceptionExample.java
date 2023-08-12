package ExceptionHandling;

public class NullPointerExceptionExample {
    private static void printLength(String str){
       try {
           System.out.println(str.length());
           }catch (NullPointerException e){
           System.out.println(e.getMessage());
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }

    public static void main(String[] args) {
        printLength(null);
    }
}
