public class One {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(printHello());
        Thread t2 = new Thread(printHello());
        t1.start();
        t2.start();
        System.out.println("Bye!");
    }

    private static Runnable printHello() {
        return () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {}
            System.out.println("Hello");
        };
    }
}
