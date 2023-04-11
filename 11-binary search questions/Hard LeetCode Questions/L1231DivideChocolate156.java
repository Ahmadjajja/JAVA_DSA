import java.util.Arrays;

public class L1231DivideChocolate156{
    public static int sweetness(int[] nums, int m){
        if (nums.length < m) {
            return -1;
        }
        m++;
        int min = Arrays.stream(nums).min().getAsInt();
        int sum = Arrays.stream(nums).sum();
        long start = min, end = sum;
        long result = start;
        while (start <= end) {
            long mid = start + (end - start);
            if (isSplit(nums, m, mid)) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) result;

    }

    private static boolean isSplit(int[] nums, int m, long mid) {
        int sum = 0, countCheck = 0;
        for (int i : nums) {
            if (sum + i >= mid) {
                countCheck++;
                sum = 0;
            } else {
                sum += i;
            }
        }
        return countCheck >= m;
    }

    public static void main(String[] args) {
        System.out.println(sweetness(new int[]{1,2,3,4,5,6,7,8,9}, 5));
        System.out.println(sweetness(new int[]{1,2,2,1,2,2,1,2,2}, 8));
        System.out.println(sweetness(new int[]{1,2,2,1,2,2,1,2,2}, 2));
    }
}