import java.awt.*;
import java.util.Date;

public class Types {
    public static void main(String[] args) {
        byte age = 25;
        Date now = new Date();
        System.out.println(now);

        //primitive type
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        //Reference type
        Point p1 = new Point(1, 1);
        Point p2 = p1;
        p1.x = 2;
        System.out.println(p2);
    }
}
