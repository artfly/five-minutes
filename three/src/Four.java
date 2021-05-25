public class Four {
    private static class Parent {
        Parent() {
            System.out.println("Parent");
        }

        Parent(int i) {
            System.out.println("Parent" + i);
        }
    }

    private static class Child extends Parent {
        Child() {
            this(42);
            System.out.println("Child");
        }

        Child(int i) {
            super(i);
            System.out.println("Child" + i);
        }
    }

    public static void main(String[] args) {
        Parent parent = new Child();
    }
}
