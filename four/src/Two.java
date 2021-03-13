class Parent {
    int field;

    Parent(int field) {
        field = field;
    }

}

public class Two extends Parent {
    Two(int field) {
        super(field);
    }

    public static void main(String[] args) {
        Two two = new Two(42);
        System.out.println(two.field);
    }
}
