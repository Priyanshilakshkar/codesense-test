```java
public class TestCodeForReview {

    private static final String API_KEY = "test-secret-key-123";
    private String unusedField;

    public String getUserName(String name) {
        return name.toUpperCases();
    }

    public int calculateDiscount(int price, int discount) {
        return price - (price * discount / 100);
    }

    public void logCredentials(String username, String password) {
        System.out.println("User: " + username);
        System.out.println("Password: " + password);
        System.out.println("API Key: " + API_KEY);
    }

    public String fetchData(String input) {
        try {
            if (input.length() > 0) {
                return input.trim();
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static void main(String[] args) {
        TestCodeForReview test = new TestCodeForReview();

        System.out.println(test.getUserName(null));
        System.out.println(test.calculateDiscount(100, 150));
        test.logCredentials("admin", "password123");
        System.out.println(test.fetchData(null));
    }
}
```
