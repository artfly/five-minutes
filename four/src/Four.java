import java.io.IOException;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

abstract class MyParent {
    void m() throws Exception {
        throw new MyException("MyException");
    }
}

public class Four extends MyParent {
    @Override
    void m() throws IOException {
        throw new IOException("IOException");
    }

    public static void main(String[] args) {
        Four four = new Four();
        try {
            four.m();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
