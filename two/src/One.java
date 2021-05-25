public class One {
    public static void main(String[] args) {
        String s1 = "13";
        String s2 = "42";
        swap(s1, s2);
        System.out.println(s1);
    }

    private static void swap(String s1, String s2) {
        String tmp = s1;
        s1 = s2;
        s2 = tmp;
    }
}
