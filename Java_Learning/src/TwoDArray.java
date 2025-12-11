import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] nums = new int[2][3];
        nums[0][0] = 1;
        nums[1][2] = 9;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.deepToString(nums));

        int [][] numbers = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(numbers));
    }
}
