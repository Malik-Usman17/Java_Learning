public class MathClassConcept {
    public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result);

        int result2 = (int)Math.ceil(1.1F);
        System.out.println(result2);

        int result3 = (int)Math.floor(1.6F);
        System.out.println(result3);

        float myMin = Math.min(4, 10);
        int myMax = Math.max(7, 12);
        System.out.println(myMin);
        System.out.println(myMax);

        double number = Math.random(); //returns number between 0 and 1
        System.out.println(number);

        int randNumbers = (int) (Math.random() * 100);
        System.out.println("Result of randNumbers: " +randNumbers);
    }
}
