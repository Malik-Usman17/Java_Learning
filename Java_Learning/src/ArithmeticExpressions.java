public class ArithmeticExpressions {
    public static void main(String[] args) {
        int res = 10 / 3;
        double res1 = (double)10 / (double)3;
        System.out.println(res);
        System.out.println(res1);

        int x = 1;
        int y = 1;
        x++;
        ++y;
        System.out.println(x);
        System.out.println(y);

        int a = 1;
        int b = a++;  //post-increment (Use the value, then increment)
        System.out.println(a);
        System.out.println(b);

        int c = 2;
        int d = ++c; //pre-increment (increment first, then use the value)
        System.out.println(c);
        System.out.println(d);

        int i = 1;
        i += 2;  //augmented assignment operator
        System.out.println(i);

    }
}
