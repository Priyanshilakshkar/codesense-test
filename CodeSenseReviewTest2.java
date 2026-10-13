public class CodeSenseReviewTest {

    public static void main(String[] args) {
        String username = null;
        int total = 100;
        int quantity = 0;

        // Issue 1: NullPointerException
        System.out.println(username.length());

        // Issue 2: Division by zero
        int pricePerItem = total / quantity;
        System.out.println(pricePerItem);

        // Issue 3: Hardcoded password
        String password = "admin123";
        System.out.println("Login password: " + password);

        // Issue 4: Missing input validation
        int age = -5;
        System.out.println("Age: " + age);
    }
}
