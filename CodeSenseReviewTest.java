import java.util.HashMap;
import java.util.Map;

public class CodeSenseReviewTest {

    private String unusedField = "not used";

    // Bug 1: Division by zero is not handled.
    public int divide(int numerator, int denominator) {
        return numerator / denominator;
    }

    // Bug 2: Null input causes NullPointerException.
    public String normalizeName(String name) {
        return name.trim().toLowerCase();
    }

    // Bug 3: Sensitive information is exposed in logs.
    public void logCredentials(String username, String password) {
        System.out.println("Login attempt for " + username);
        System.out.println("Password: " + password);
    }

    // Bug 4: Exceptions are silently swallowed.
    public Map<String, String> loadSettings(String rawSettings) {
        Map<String, String> settings = new HashMap<>();

        try {
            for (String item : rawSettings.split(",")) {
                String[] pair = item.split("=");
                settings.put(pair[0], pair[1]);
            }
        } catch (Exception ignored) {
            // Intentionally empty.
        }

        return settings;
    }

    // Bug 5: Discount values are not validated.
    public double applyDiscount(double price, double discountPercent) {
        return price - (price * discountPercent / 100.0);
    }

    public static void main(String[] args) {
        CodeSenseReviewTest test = new CodeSenseReviewTest();

        System.out.println(test.divide(10, 2));
        System.out.println(test.normalizeName("  Priya  "));
        System.out.println(test.applyDiscount(100.0, 150.0));

        // Uncomment to test division by zero:
        // System.out.println(test.divide(10, 0));
    }
}
