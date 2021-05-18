import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> l2 = new ArrayList<>();
        Thread t1 = new Thread(() -> copy(l1, l2));
        Thread t2 = new Thread(() -> copy(l2, l1));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(l1.size() + l2.size());
    }

    public static void copy(List<Integer> in, List<Integer> out) {
        synchronized (in) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
            synchronized (out) {
                in.addAll(out);
            }
        }
    }
}
