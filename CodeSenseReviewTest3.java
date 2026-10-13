```java
import java.util.ArrayList;
import java.util.List;

public class CodeSenseReviewTest2 {

    private static final List<String> users = new ArrayList<>();

    public static void main(String[] args) {

        // Issue 1: Possible NullPointerException
        String email = getEmail();
        System.out.println(email.toLowerCase());

        // Issue 2: Unsafe list access
        List<Integer> numbers = new ArrayList<>();
        System.out.println(numbers.get(0));

        // Issue 3: Resource leak
        try {
            java.io.FileInputStream input =
                    new java.io.FileInputStream("data.txt");
            System.out.println(input.read());
        } catch (java.io.IOException e) {
            System.out.println("File error");
        }

        // Issue 4: Incorrect comparison for strings
        String role = new String("ADMIN");
        if (role == "ADMIN") {
            System.out.println("Administrator");
        }

        // Issue 5: Unused collection
        users.add("test@example.com");
    }

    private static String getEmail() {
        return null;
    }
}
```
