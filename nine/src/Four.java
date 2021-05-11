import java.util.Arrays;

public class Four {

    public static void main(String[] args) {
        String[] names = new String[]{"Bob", "Alice"};
        Integer len = Arrays.stream(names)
                .map(String::length)
                .filter(i -> i > 3)
                .findFirst()
                .orElse(null);
        System.out.println(len);
    }
}


