import java.util.HashSet;
import java.util.Set;

public class Three {

    private static class User {
        private final String name;

        private User(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User("Peter"));
        users.add(new User("Lois"));
        System.out.println(users.size());
    }
}
