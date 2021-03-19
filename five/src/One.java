public class One {
    public static void main(String[] args) {
        One c1 = new One() {};
        One c2 = new One() {};
        System.out.println(c1.getClass().equals(One.class));
        System.out.println(c2.getClass().equals(c1.getClass()));
    }
}
