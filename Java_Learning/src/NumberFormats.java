import java.text.NumberFormat;

public class NumberFormats {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String res = currency.format(1234567.891);
        System.out.println(res);

        NumberFormat per = NumberFormat.getPercentInstance();
        System.out.println(per.format(0.47));

        //Method Chaining
        System.out.println("Direct Conversion:" + NumberFormat.getPercentInstance().format(0.93));
    }
}
