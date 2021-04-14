import java.util.ArrayList;
import java.util.List;

public class Two {

    public static void main(String[] args) {
        doSmth();
    }

    private static void doSmth() {
        try {
            throw new Error("Error");
        } catch (Throwable e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("after finally");
    }
}
