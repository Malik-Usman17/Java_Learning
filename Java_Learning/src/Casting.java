public class Casting {
    public static void main(String[] args) {
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        double a = 1.1;
        double b = a + 2;
        System.out.println(b);

        double c = 1.6;
        int d = (int)c + 2;  //explicit casting
        System.out.println("Value of d: " +d);

        String i = "10";
        int j = Integer.parseInt(i) + 2;
        System.out.println(j);

        String u = "1.4";
        double t = Double.parseDouble(u) + 4.6;
        System.out.println(t);

        int result = (int) Math.round(Math.random() * 100);
        System.out.println(result);
    }
}


//implicit casting (automatically type conversion, means the value can be converted/ casting to bigger value data type)
//byte can be converted to short to int to long to float to double
//byte > short > int > long > float > double