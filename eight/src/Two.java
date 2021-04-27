import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Two {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(42);
        set.add(42);
        System.out.println(set.size());
    }
}
