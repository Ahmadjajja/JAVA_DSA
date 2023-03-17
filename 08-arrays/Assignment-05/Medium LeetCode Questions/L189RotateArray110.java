// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.




// Not efficient solution for larger inputs (Time limits will occur)



import java.util.Arrays;

public class L189RotateArray110 {
        public static int[] rotate(int[] nums, int k) {
            // Approach #01      // Not efficient solution for larger inputs (Time limits will occur)

            // if (k > nums.length) {
            //     k = k % nums.length;
            // }
            // int count = 0;
            // while(count < k){
            //     int temp = 0;
            //     for(int i = nums.length - 1; i >= 0; i--){
            //         if(i == nums.length - 1){
            //             temp = nums[i];
            //         }
            //         if(i == 0){
            //             nums[i] = temp;
            //         } else {
            //             nums[i] = nums[i - 1];
            //         }
            //     }
            //     count++;
            // }
            // return nums;

            // Approach #02   // Not efficient solution for larger inputs (Time limits will occur)


            if (k > nums.length) {
                k = k % nums.length;
            }
            int[] res = new int[nums.length];
            for(int i = 0; i < nums.length; i++){
                if((i + k) < nums.length){
                    res[i + k] = nums[i];
                } else {
                    res[(i + k) - nums.length] = nums[i];
                }
            }
    
            for(int i = 0; i < nums.length; i++){
                nums[i] = res[i];
            }

            return nums;
        }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[]{-1,-100,3,99}, (10 * 10 * 10 * 10 * 10))));
    }
}
