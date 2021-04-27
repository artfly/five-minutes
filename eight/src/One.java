import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class One {

    public static void addToList(List<Integer> list) {
        list.add(42);
    }

    public static void main(String[] args) {
        List<Integer> i1 = Arrays.asList(1);
        List<Integer> i2 = new ArrayList<>(1);
        addToList(i1);
        System.out.println(i1);
        addToList(i2);
        System.out.println(i2);
    }
}
