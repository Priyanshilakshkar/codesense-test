import java.util.ArrayList;
import java.util.List;

public class UserService {

    public static void main(String[] args) {

        List<String> users = new ArrayList<>();

        String firstUser = users.get(0);

        String email = null;

        if (email.equals("test@gmail.com")) {
            System.out.println("Email matched");
        }

        System.out.println(firstUser);
    }
}
