package ExceptionHandling;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// unchecked exception and checked exception
public class HierarchyOfException {
    public static void main(String[] args) {
       int result = 0;
           result = 7/2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(result);
    }
}
