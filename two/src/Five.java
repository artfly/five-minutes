public class Five {

    public static void main(String[] args) {
        Parent1 parent = new Child1();
        System.out.println(parent.name());
    }
}

class Parent1 {
    static String name() {
        return "Parent";
    }
}

class Child1 extends Parent1 {
    static String name() {
        return "Child";
    }
}