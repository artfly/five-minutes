public class Four {

    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println(parent.name());
    }
}

class Parent {
    String name() {
        return "Parent";
    }
}

class Child extends Parent {
    String name() {
        return "Child";
    }
}