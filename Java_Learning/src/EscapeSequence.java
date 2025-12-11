public class EscapeSequence {
    public static void main(String[] args) {
        String msg = "Hello \"Test User\"";
        String msg2 = "c:\tWindows\\...";
        String msg3 = "c:\nWindows\\...";
        System.out.println(msg);
        System.out.println(msg2);
        System.out.println(msg3);
    }
}
