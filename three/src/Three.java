public class Three {
    private static class Parent {
        int num = 0;
    }

    private static class Child extends Parent {
        private class Inner {
            void changeNumber() {
                Child.this.num = 42;
            }
        }
    }

    public static void main(String[] args) {
        Child child = new Child();
        Child.Inner inner = child.new Inner();
        inner.changeNumber();
        System.out.println(child.num);
    }
}
