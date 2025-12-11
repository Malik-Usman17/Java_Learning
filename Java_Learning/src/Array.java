import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        System.out.println(Arrays.toString(fruits));

        System.out.println(fruits[3]);
        fruits[3] = "kiwi";
        System.out.println(fruits[3]);

        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);
    }
}
