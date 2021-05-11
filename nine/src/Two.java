public class Two {

    @FunctionalInterface
    interface I {

        void doSmth(int num);

        public default void doOther() {
            System.out.println("other");
        }
    }

    public static void main(String[] args) {
        I i = num -> System.out.println(num);
    }
}


