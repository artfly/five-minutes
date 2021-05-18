public class Four {

    public static void main(String[] args) throws InterruptedException {
        Doer doer = new Doer();
        Thread t1 = new Thread(() -> doer.printAndWait());
        Thread t2 = new Thread(() -> doer.sleapAndNotify());
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("main");
    }

    private static class Doer {

        private final Object object = new Object();

        void printAndWait() {
            synchronized (object) {
                System.out.println("wait for object");
                try {
                    object.wait();
                } catch (InterruptedException ignored) {}
                System.out.println("finished");
            }
        }

        void sleapAndNotify() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {}
            synchronized (object) {
                System.out.println("woken up");
                object.notify();
            }
        }

    }
}
