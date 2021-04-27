import java.util.*;

public class Four {

    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        for (Iterator<String> iterator = numbers.iterator(); iterator.hasNext(); ) {
            String number = iterator.next();
            if (number.equals("two")) {
                numbers.add("four");
            }
            System.out.println(number);
        }
    }
}
