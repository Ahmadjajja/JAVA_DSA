import java.util.Arrays;

public class MajorityElement164 {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
    }

    public static int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            return nums[mid];
        }
        return nums[start];
    }
}
