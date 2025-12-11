import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scan.nextByte();
        System.out.println("Your Age is: " +age);
    }
}
